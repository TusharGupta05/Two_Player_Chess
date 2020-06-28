package com.example.sample;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.example.sample.SquaresControl.*;
import static com.example.sample.Checkmate.*;
import static com.example.sample.LegalMove.*;
import static java.sql.Types.NULL;

public class MainActivity extends AppCompatActivity {

    static ImageView img[][];
    static ImageView temp2;
    static Pawn[] blackPawn;   //b6
    static Pawn[] whitePawn;   //6
    static Bishop WB1;         //41
    static Bishop WB2;         //42
    static Bishop BB1;         //b41
    static Bishop BB2;         //b42
    static Queen WQ;           //2
    static Queen BQ;           //b2
    static Knight WN1;         //51
    static Knight WN2;         //52
    static Knight BN1;         //b51
    static Knight BN2;         //b52
    static Rook WR1;           //31
    static Rook WR2;           //32
    static Rook BR1;           //b31
    static Rook BR2;           //b32
    static King WK;            //1
    static King BK;            //b1
    static int turn=1;         // 1 = White, 2 = Black
    static boolean CanWhiteKingEverCastle = true,CanBlackKingEverCastle = true,CanWhiteKingEverLongCastle = true,CanBlackKingEverLongCastle = true,CanWhiteKingEverShortCastle = true,CanBlackKingEverShortCastle = true;

    static Map<Integer,String> Tags = new HashMap<>();
    static Map<Integer,String> newTags;
    static Map<String,Integer> squares = new HashMap<>();
    float x,y,x1,y1,x2,y2;
    boolean clickedonce = false;
    static ImageView temp;
    static ArrayList<Integer> squaresControlledByBlack;
    static ArrayList<Integer> squaresControlledByWhite;
    static LinearLayout promotionLayoutBlack,promotionLayoutWhite;

    public void promoted(View view)
    {
        ImageView imageView = (ImageView) view;
        String tag = imageView.getTag().toString();
        if(tag.charAt(0) == 'b')
        {
            blackPawn[temp2.getTag().toString().charAt(2)-49].id1 = tag;
            promotionLayoutBlack.setVisibility(View.INVISIBLE);
            switch (tag) {
                case "b2":
                    temp2.setImageResource(R.drawable.blackqueen);
                    break;
                case "b3":
                    temp2.setImageResource(R.drawable.blackrook);
                    break;
                case "b4":
                    temp2.setImageResource(R.drawable.blackbishop);
                    break;
                case "b5":
                    temp2.setImageResource(R.drawable.blacknight);
                    break;
            }
            if(Checkmate.isWhiteCheckmated())
                return;
            getTags();
        }
        else
        {
            whitePawn[temp2.getTag().toString().charAt(1)-49].id = tag;
            promotionLayoutWhite.setVisibility(View.INVISIBLE);
            switch (tag) {
                case "2":
                    temp2.setImageResource(R.drawable.whitequeen);
                    break;
                case "3":
                    temp2.setImageResource(R.drawable.whiterook);
                    break;
                case "4":
                    temp2.setImageResource(R.drawable.whitebishop);
                    break;
                case "5":
                    temp2.setImageResource(R.drawable.whitenight);
                    break;
            }
            if(Checkmate.isBlackCheckmated())
                return;

            getTags();
        }

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void Clicked(final View view){

        getTags();

        if(clickedonce == false)
        {
            clickedonce = true;
            temp = (ImageView)view;
            temp.setBackgroundColor(Color.parseColor("#FF73B35C"));
            x1 = Float.valueOf(view.getX());
            y1 = Float.valueOf(view.getY());
            if(turn == 1)
            {
                String tag = view.getTag().toString();
                if(tag.equals("1"))
                {
                    WK.setWhiteKingsSquaresControlled();
                    CheckCastling.CheckWhiteCastling();
                    for(int i:WK.squaresControlled)
                        img[i/10-1][i%10-1].setClickable(true);
                    //System.out.println(WK.squaresControlled.size());
                }
                if(tag.equals("2"))
                {
                    WQ.setWhiteQueenSquaresControlled();
                    for(int i:WQ.squaresControlled)
                        img[i/10-1][i%10-1].setClickable(true);
                    //System.out.println(WQ.squaresControlled.size());
                }
                if(tag.equals("31"))
                {
                    WR1.setWhiteRookSquaresControlled();
                    for(int i:WR1.squaresControlled)
                        img[i/10-1][i%10-1].setClickable(true);
                    //System.out.println(WR1.squaresControlled.size());
                }
                if(tag.equals("32"))
                {
                    WR2.setWhiteRookSquaresControlled();
                    for(int i:WR2.squaresControlled)
                        img[i/10-1][i%10-1].setClickable(true);
                    //System.out.println(WR2.squaresControlled.size());
                }
                if(tag.equals("41"))
                {
                    WB1.setWhiteBishopSquaresControlled();
                    for(int i:WB1.squaresControlled)
                        img[i/10-1][i%10-1].setClickable(true);
                    //System.out.println(WB1.squaresControlled.size());
                }
                if(tag.equals("42"))
                {
                    WB2.setWhiteBishopSquaresControlled();
                    for(int i:WB2.squaresControlled)
                        img[i/10-1][i%10-1].setClickable(true);
                    //System.out.println(WB2.squaresControlled.size());
                }
                if(tag.equals("51"))
                {
                    WN1.setWhiteKnightSquaresControlled();
                    for(int i:WN1.squaresControlled) {
                        img[i / 10 - 1][i % 10 - 1].setClickable(true);
                    }
                    //System.out.println(WN1.squaresControlled.size());
                }
                if(tag.equals("52"))
                {
                    WN2.setWhiteKnightSquaresControlled();
                    for(int i:WN2.squaresControlled)
                        img[i/10-1][i%10-1].setClickable(true);
                    //System.out.println(WN2.squaresControlled.size());
                }
                if(tag.charAt(0) == '6')
                {
                    whitePawn[tag.charAt(1)-49].setWhitePawnsSquaresControlled();
                    for(int i:whitePawn[tag.charAt(1)-49].squaresControlled) {
                        img[i / 10 - 1][i % 10 - 1].setClickable(true);
                    }
                }
            }
            else  if(turn == 2)
            {
                String tag = view.getTag().toString();
                if(tag.equals("b1"))
                {
                    BK.setBlackKingsSquaresControlled();
                    CheckCastling.CheckBlackCastling();
                    for(int i:BK.squaresControlled)
                        img[i/10-1][i%10-1].setClickable(true);
                    //System.out.println(BK.squaresControlled.size());
                }
                if(tag.equals("b2"))
                {
                    BQ.setBlackQueenSquaresControlled();
                    for(int i:BQ.squaresControlled)
                        img[i/10-1][i%10-1].setClickable(true);
                    //System.out.println(BQ.squaresControlled.size());
                }
                if(tag.equals("b31"))
                {
                    BR1.setBlackRookSquaresControlled();
                    for(int i:BR1.squaresControlled)
                        img[i/10-1][i%10-1].setClickable(true);
                    //System.out.println(BR1.squaresControlled.size());
                }
                if(tag.equals("b32"))
                {
                    BR2.setBlackRookSquaresControlled();
                    for(int i:BR2.squaresControlled)
                        img[i/10-1][i%10-1].setClickable(true);
                    //System.out.println(BR2.squaresControlled.size());
                }
                if(tag.equals("b41"))
                {
                    BB1.setBlackBishopSquaresControlled();
                    for(int i:BB1.squaresControlled)
                        img[i/10-1][i%10-1].setClickable(true);
                    //System.out.println(BB1.squaresControlled.size());
                }
                if(tag.equals("b42"))
                {
                    BB2.setBlackBishopSquaresControlled();
                    for(int i:BB2.squaresControlled)
                        img[i/10-1][i%10-1].setClickable(true);
                    //System.out.println(BB2.squaresControlled.size());
                }
                if(tag.equals("b51"))
                {
                    BN1.setBlackKnightSquaresControlled();
                    for(int i:BN1.squaresControlled) {
                        img[i / 10 - 1][i % 10 - 1].setClickable(true);
                    }// System.out.println(BN1.squaresControlled.size());
                }
                if(tag.equals("b52"))
                {
                    BN2.setBlackKnightSquaresControlled();
                    for(int i:BN2.squaresControlled)
                        img[i/10-1][i%10-1].setClickable(true);
                    //System.out.println(BN2.squaresControlled.size());
                }
                if(tag.charAt(1) == '6')
                {
                    blackPawn[tag.charAt(2)-49].setBlackPawnsSquaresControlled();
                    for(int i:blackPawn[tag.charAt(2)-49].squaresControlled) {
                        img[i / 10 - 1][i % 10 - 1].setClickable(true);
                    }
                }

            }
        }
        else
        {
            clickedonce = false;
            DisableClickAll();
            temp.setBackgroundColor(NULL);
            x2 = Float.valueOf(view.getX());
            y2 = Float.valueOf(view.getY());
            temp2 = (ImageView) view;
            String tag = temp.getTag().toString(),tag1 = temp.getTag().toString(),tag2 = temp2.getTag().toString();
            if (tag.charAt(0) == 'b')
                tag = tag.substring(0, 2);
            else
                tag = tag.substring(0, 1);
            if (turn == 1 && temp2.getTag().toString().charAt(0) != 'b' && temp2.getTag().toString().charAt(0) != '0') {
                promotionLayoutWhite.setVisibility(View.INVISIBLE);
                EnableWhitePiecesClickable();
                return;
            } else if (turn == 2 && temp2.getTag().toString().charAt(0) == 'b') {
                promotionLayoutBlack.setVisibility(View.INVISIBLE);
                EnableBlackPiecesClickable();
                return;
            }
            if(isLegalMove(temp,temp2))
            {
                if(tag.equals("1") || (CanWhiteKingEverShortCastle == false && CanWhiteKingEverLongCastle == false))
                    CanWhiteKingEverCastle = false;
                if(tag.equals("b1") || (CanBlackKingEverShortCastle == false && CanBlackKingEverLongCastle == false))
                    CanBlackKingEverCastle = false;
                if(tag.equals("31") || tag2.equals("31"))
                    CanWhiteKingEverLongCastle = false;
                if(tag.equals("32") || tag2.equals("32"))
                    CanWhiteKingEverShortCastle = false;
                if(tag.equals("b31") || tag2.equals("b31"))
                    CanBlackKingEverLongCastle = false;
                if(tag.equals("b32") || tag2.equals("b32"))
                    CanBlackKingEverShortCastle = false;
                final String finalTag = tag,finalTag1 = tag1;
                temp.animate().translationXBy(x2 - x1).translationYBy(y2 - y1).setDuration(500).setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {

                        if(turn == 1 && finalTag.charAt(0) == '6' && whitePawn[finalTag1.charAt(1)-49].id.equals("6"))
                        {
                            String prom = temp2.getResources().getResourceName(temp2.getId()).substring(22,24);
                            if(prom.charAt(1) == '8')
                            {
                                int f = squares.get(prom);
                                float temp_X = img[f/10-1][f%10-1].getX(),temp_Y = img[f/10-1][f%10-1].getY();
                                promotionLayoutWhite.setX(temp_X);
                                promotionLayoutWhite.setY(temp_Y);
                                promotionLayoutWhite.setVisibility(View.VISIBLE);

                            }
                        }
                        if(turn == 2 && finalTag.charAt(1) == '6' && blackPawn[finalTag1.charAt(2)-49].id1.equals("b6"))
                        {
                            String prom = temp2.getResources().getResourceName(temp2.getId()).substring(22,24);
                            if(prom.charAt(1) == '1')
                            {
                                int f = squares.get(prom.substring(0,1)+"5");
                                float temp_X = img[f/10-1][f%10-1].getX(),temp_Y = img[f/10-1][f%10-1].getY();
                                promotionLayoutBlack.setX(temp_X);
                                promotionLayoutBlack.setY(temp_Y);
                                promotionLayoutBlack.setVisibility(View.VISIBLE);

                            }
                        }

                        switch (finalTag) {
                            case "b1":
                                temp2.setImageResource(R.drawable.blackking);
                                break;
                            case "b2":
                                temp2.setImageResource(R.drawable.blackqueen);
                                break;
                            case "b3":
                                temp2.setImageResource(R.drawable.blackrook);
                                break;
                            case "b4":
                                temp2.setImageResource(R.drawable.blackbishop);
                                break;
                            case "b5":
                                temp2.setImageResource(R.drawable.blacknight);
                                break;
                            case "b6":
                                int pos1 = squares.get(temp2.getResources().getResourceName(temp2.getId()).substring(22,24));
                                for(int i=0;i<8;i++) {
                                    int p=blackPawn[i].Position;
                                    if(blackPawn[i].isActive && p == pos1) {
                                        String id = blackPawn[i].id1;
                                        switch (id) {
                                            case "b2":
                                                temp2.setImageResource(R.drawable.blackqueen);
                                                break;
                                            case "b3":
                                                temp2.setImageResource(R.drawable.blackrook);
                                                break;
                                            case "b4":
                                                temp2.setImageResource(R.drawable.blackbishop);
                                                break;
                                            case "b5":
                                                temp2.setImageResource(R.drawable.blacknight);
                                                break;
                                            case "b6":
                                                temp2.setImageResource(R.drawable.blackpawn);
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                }
                                break;
                            case "1":
                                temp2.setImageResource(R.drawable.whiteking);
                                break;
                            case "2":
                                temp2.setImageResource(R.drawable.whitequeen);
                                break;
                            case "3":
                                temp2.setImageResource(R.drawable.whiterook);
                                break;
                            case "4":
                                temp2.setImageResource(R.drawable.whitebishop);
                                break;
                            case "5":
                                temp2.setImageResource(R.drawable.whitenight);
                                break;
                            case "6":
                                int pos2 = squares.get(temp2.getResources().getResourceName(temp2.getId()).substring(22,24));
                                for(int i=0;i<8;i++)
                                {
                                    int p=whitePawn[i].Position;
                                    if(whitePawn[i].isActive && p == pos2) {

                                        String id = whitePawn[i].id;
                                        switch (id) {
                                            case "2":
                                                temp2.setImageResource(R.drawable.whitequeen);
                                                break;
                                            case "3":
                                                temp2.setImageResource(R.drawable.whiterook);
                                                break;
                                            case "4":
                                                temp2.setImageResource(R.drawable.whitebishop);
                                                break;
                                            case "5":
                                                temp2.setImageResource(R.drawable.whitenight);
                                                break;
                                            case "6":
                                                temp2.setImageResource(R.drawable.whitepawn);
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                        temp.setX(x1);
                        temp.setY(y1);
                        temp.setImageResource(NULL);
                        getTags();
                        gameControl();
                        if(turn == 2) {
                            updateSquaresControlledByWhite();
                            for(int i:squaresControlledByWhite) {
                                if(i == BK.Position) {
                                    if(isBlackCheckmated()) {
                                        Toast.makeText(MainActivity.this, "White checkmated Black!!", Toast.LENGTH_SHORT).show();
                                        return;
                                    }
                                    break;
                                }
                            }
                        }
                        else {
                            updateSquaresControlledByBlack();
                            for(int i:squaresControlledByBlack) {
                                if(i == WK.Position) {
                                    if(isWhiteCheckmated()) {
                                        Toast.makeText(MainActivity.this, "Black checkmated white!!", Toast.LENGTH_SHORT).show();
                                        return;
                                    }
                                    break;
                                }
                            }
                        }
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });
            }

            else
            {
                Toast.makeText(MainActivity.this, "Illegal move!!",Toast.LENGTH_LONG).show();
                if(turn == 1)
                    EnableWhitePiecesClickable();
                else
                    EnableBlackPiecesClickable();
            }


        }

    }

    void DisableClickAll(){
        for (int i = 0; i < 8; i++) {
            for(int j=0;j<8;j++)
            img[i][j].setClickable(false);
        }
    }

    public void EnableBlackPiecesClickable(){
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                String tag = img[i][j].getTag().toString();
                if(tag.charAt(0) == 'b')
                {
                    img[i][j].setClickable(true);
                }
            }
        }
    }

    public void EnableWhitePiecesClickable(){
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                String tag = img[i][j].getTag().toString();
                if(tag.charAt(0) != 'b' && tag.charAt(0) != '0')
                {
                    img[i][j].setClickable(true);
                }
            }
        }
    }

    public void gameControl(){

        if(turn == 2)
        {
            turn = 1;
            DisableClickAll();
            EnableWhitePiecesClickable();
        }
        else
        {
            turn = 2;
            DisableClickAll();
            EnableBlackPiecesClickable();
        }

    }

    public static void getTags(){

        int t;
        Tags = new HashMap<>();
        for(int i=0;i<8;i++)
        {
            t = i+1;
            for(int j=0;j<8;j++)
            {
                Tags.put(t*10+j+1,img[i][j].getTag().toString());
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackPawn = new Pawn[8];
        whitePawn = new Pawn[8];
        WB1 = new Bishop();
        WB2 = new Bishop();
        BB1 = new Bishop();
        BB2 = new Bishop();
        WQ = new Queen();
        BQ = new Queen();
        WN1 = new Knight();
        WN2 = new Knight();
        BN1 = new Knight();
        BN2 = new Knight();
        WR1 = new Rook();
        WR2 = new Rook();
        BR1 = new Rook();
        BR2 = new Rook();
        WK = new King();
        BK = new King();
        WK.Position = 51;
        BK.Position = 58;
        WR1.Position = 11;
        WR2.Position = 81;
        BR1.Position = 18;
        BR2.Position = 88;
        WN1.Position = 21;
        WN2.Position = 71;
        BN1.Position = 28;
        BN2.Position = 78;
        BQ.Position = 48;
        WQ.Position = 41;
        WB1.Position = 31;
        WB2.Position = 61;
        BB1.Position = 38;
        BB2.Position = 68;
        int t=7;
        for(int i=0;i<8;i++)
        {
            t+=10;
            blackPawn[i] = new Pawn();
            blackPawn[i].Position = t;
        }
        t=2;
        for(int i=0;i<8;i++)
        {
            t+=10;
            whitePawn[i] = new Pawn();
            whitePawn[i].Position = t;
        }
        String s[] = new String[]{"a","b","c","d","e","f","g","h"},s1[] = new String[]{"1","2","3","4","5","6","7","8"};
        for(int i=0;i<8;i++)
        {
            int key = (i+1)*10;
            for(int j=0;j<8;j++) {
                squares.put(s[i] + s1[j], key + j + 1);
            }
        }



        GridLayout chessGrid = findViewById(R.id.chessGrid);
        promotionLayoutBlack = findViewById(R.id.promotionLayoutBlack);
        promotionLayoutWhite = findViewById(R.id.promotionLayoutWhite);
        img = new ImageView[][]{{findViewById(R.id.a1),findViewById(R.id.a2), findViewById(R.id.a3), findViewById(R.id.a4), findViewById(R.id.a5), findViewById(R.id.a6), findViewById(R.id.a7), findViewById(R.id.a8)},
                                { findViewById(R.id.b1), findViewById(R.id.b2), findViewById(R.id.b3), findViewById(R.id.b4), findViewById(R.id.b5), findViewById(R.id.b6), findViewById(R.id.b7), findViewById(R.id.b8)},
                                { findViewById(R.id.c1), findViewById(R.id.c2), findViewById(R.id.c3), findViewById(R.id.c4), findViewById(R.id.c5), findViewById(R.id.c6), findViewById(R.id.c7), findViewById(R.id.c8)},
                                { findViewById(R.id.d1), findViewById(R.id.d2), findViewById(R.id.d3), findViewById(R.id.d4), findViewById(R.id.d5), findViewById(R.id.d6), findViewById(R.id.d7), findViewById(R.id.d8)},
                                { findViewById(R.id.e1), findViewById(R.id.e2), findViewById(R.id.e3), findViewById(R.id.e4), findViewById(R.id.e5), findViewById(R.id.e6), findViewById(R.id.e7), findViewById(R.id.e8)},
                                { findViewById(R.id.f1), findViewById(R.id.f2), findViewById(R.id.f3), findViewById(R.id.f4), findViewById(R.id.f5), findViewById(R.id.f6), findViewById(R.id.f7), findViewById(R.id.f8)},
                                { findViewById(R.id.g1), findViewById(R.id.g2), findViewById(R.id.g3), findViewById(R.id.g4), findViewById(R.id.g5), findViewById(R.id.g6), findViewById(R.id.g7), findViewById(R.id.g8)},
                                { findViewById(R.id.h1), findViewById(R.id.h2), findViewById(R.id.h3), findViewById(R.id.h4), findViewById(R.id.h5), findViewById(R.id.h6), findViewById(R.id.h7), findViewById(R.id.h8)}};
        getTags();
        DisableClickAll();
        EnableWhitePiecesClickable();
        updateSquaresControlledByBlack();
        updateSquaresControlledByWhite();
    }
}