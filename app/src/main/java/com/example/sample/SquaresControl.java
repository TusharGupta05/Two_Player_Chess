package com.example.sample;

import java.util.ArrayList;

import static com.example.sample.MainActivity.BB1;
import static com.example.sample.MainActivity.BB2;
import static com.example.sample.MainActivity.BK;
import static com.example.sample.MainActivity.BN1;
import static com.example.sample.MainActivity.BN2;
import static com.example.sample.MainActivity.BQ;
import static com.example.sample.MainActivity.BR1;
import static com.example.sample.MainActivity.BR2;
import static com.example.sample.MainActivity.WB1;
import static com.example.sample.MainActivity.WB2;
import static com.example.sample.MainActivity.WK;
import static com.example.sample.MainActivity.WN1;
import static com.example.sample.MainActivity.WN2;
import static com.example.sample.MainActivity.WQ;
import static com.example.sample.MainActivity.WR1;
import static com.example.sample.MainActivity.WR2;
import static com.example.sample.MainActivity.blackPawn;
import static com.example.sample.MainActivity.squaresControlledByBlack;
import static com.example.sample.MainActivity.squaresControlledByWhite;
import static com.example.sample.MainActivity.whitePawn;

public class SquaresControl {

    static void updateSquaresControlledByWhite(){

        WK.setWhiteKingsSquaresControlled();
        if(WQ.isActive)
            WQ.setWhiteQueenSquaresControlled();
        if(WR1.isActive)
            WR1.setWhiteRookSquaresControlled();
        if(WR2.isActive)
            WR2.setWhiteRookSquaresControlled();
        if(WB1.isActive)
            WB1.setWhiteBishopSquaresControlled();
        if(WB2.isActive)
            WB2.setWhiteBishopSquaresControlled();
        if(WN1.isActive)
            WN1.setWhiteKnightSquaresControlled();
        if(WN2.isActive)
            WN2.setWhiteKnightSquaresControlled();
        squaresControlledByWhite = new ArrayList<>();
        for(int i=0;i<WK.squaresControlled.size();i++)
            squaresControlledByWhite.add(WK.squaresControlled.get(i));
        for(int i=0;i<WQ.squaresControlled.size() && WQ.isActive;i++)
            squaresControlledByWhite.add(WQ.squaresControlled.get(i));
        for(int i=0;i<WR1.squaresControlled.size() && WR1.isActive;i++)
            squaresControlledByWhite.add(WR1.squaresControlled.get(i));
        for(int i=0;i<WR2.squaresControlled.size() && WR2.isActive;i++)
            squaresControlledByWhite.add(WR2.squaresControlled.get(i));
        for(int i=0;i<WB1.squaresControlled.size() && WB1.isActive;i++)
            squaresControlledByWhite.add(WB1.squaresControlled.get(i));
        for(int i=0;i<WB2.squaresControlled.size() && WB2.isActive;i++)
            squaresControlledByWhite.add(WB2.squaresControlled.get(i));
        for(int i=0;i<WN1.squaresControlled.size() && WN1.isActive;i++)
            squaresControlledByWhite.add(WN1.squaresControlled.get(i));
        for(int i=0;i<WN2.squaresControlled.size() && WN2.isActive;i++)
            squaresControlledByWhite.add(WN2.squaresControlled.get(i));
        for(int i=0;i<8;i++)
        {
            if(whitePawn[i].isActive)
            {
                if(MainActivity.Tags.containsKey(whitePawn[i].Position+11))
                    squaresControlledByWhite.add(whitePawn[i].Position+11);
                if(MainActivity.Tags.containsKey(whitePawn[i].Position-9))
                    squaresControlledByWhite.add(whitePawn[i].Position-9);
            }
        }

    }
    static void updateSquaresControlledByBlack(){

        BK.setBlackKingsSquaresControlled();
        if(BQ.isActive)
            BQ.setBlackQueenSquaresControlled();
        if(BR1.isActive)
            BR1.setBlackRookSquaresControlled();
        if(BR2.isActive)
            BR2.setBlackRookSquaresControlled();
        if(BB1.isActive)
            BB1.setBlackBishopSquaresControlled();
        if(BB2.isActive)
            BB2.setBlackBishopSquaresControlled();
        if(BN1.isActive)
            BN1.setBlackKnightSquaresControlled();
        if(BN2.isActive)
            BN2.setBlackKnightSquaresControlled();
        squaresControlledByBlack = new ArrayList<>();
        for(int i=0;i<BK.squaresControlled.size();i++)
            squaresControlledByBlack.add(BK.squaresControlled.get(i));
        for(int i=0;i<BQ.squaresControlled.size() && BQ.isActive;i++)
            squaresControlledByBlack.add(BQ.squaresControlled.get(i));
        for(int i=0;i<BR1.squaresControlled.size() && BR1.isActive;i++)
            squaresControlledByBlack.add(BR1.squaresControlled.get(i));
        for(int i=0;i<BR2.squaresControlled.size() && BR2.isActive;i++)
            squaresControlledByBlack.add(BR2.squaresControlled.get(i));
        for(int i=0;i<BB1.squaresControlled.size() && BB1.isActive;i++)
            squaresControlledByBlack.add(BB1.squaresControlled.get(i));
        for(int i=0;i<BB2.squaresControlled.size() && BB2.isActive;i++)
            squaresControlledByBlack.add(BB2.squaresControlled.get(i));
        for(int i=0;i<BN1.squaresControlled.size() && BN1.isActive;i++)
            squaresControlledByBlack.add(BN1.squaresControlled.get(i));
        for(int i=0;i<BN2.squaresControlled.size() && BN2.isActive;i++)
            squaresControlledByBlack.add(BN2.squaresControlled.get(i));
        for(int i=0;i<8;i++)
        {
            if(blackPawn[i].isActive)
            {
                if(MainActivity.Tags.containsKey(blackPawn[i].Position+11))
                    squaresControlledByBlack.add(blackPawn[i].Position-11);
                if(MainActivity.Tags.containsKey(blackPawn[i].Position-9))
                    squaresControlledByBlack.add(blackPawn[i].Position+9);
            }
        }
    }

    
}
