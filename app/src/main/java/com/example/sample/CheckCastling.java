package com.example.sample;

import static com.example.sample.MainActivity.BK;
import static com.example.sample.MainActivity.CanBlackKingEverCastle;
import static com.example.sample.MainActivity.CanBlackKingEverLongCastle;
import static com.example.sample.MainActivity.CanBlackKingEverShortCastle;
import static com.example.sample.MainActivity.CanWhiteKingEverCastle;
import static com.example.sample.MainActivity.CanWhiteKingEverLongCastle;
import static com.example.sample.MainActivity.CanWhiteKingEverShortCastle;
import static com.example.sample.MainActivity.Tags;
import static com.example.sample.MainActivity.WK;
import static com.example.sample.MainActivity.getTags;
import static com.example.sample.MainActivity.img;
import static com.example.sample.MainActivity.squaresControlledByBlack;
import static com.example.sample.MainActivity.squaresControlledByWhite;
import static com.example.sample.SquaresControl.updateSquaresControlledByBlack;
import static com.example.sample.SquaresControl.updateSquaresControlledByWhite;

public class CheckCastling {

    public static void CheckWhiteCastling(){

        if(CanWhiteKingEverCastle == true)
        {
            if(CanWhiteKingEverLongCastle == true)
            {
                updateSquaresControlledByBlack();
                boolean isLongCastlingPossible = true;
                for(int i:squaresControlledByBlack)
                {
                    if(i == 51 || i == 41 || i == 31 || !img[4][0].getTag().toString().equals("1") || !img[3][0].getTag().toString().equals("0") || !img[2][0].getTag().toString().equals("0") || !img[1][0].getTag().toString().equals("0") || !img[0][0].getTag().toString().equals("31"))
                    {
                        isLongCastlingPossible = false;
                        break;
                    }
                }
                if(isLongCastlingPossible)
                WK.squaresControlled.add(31);
            }
            if(CanWhiteKingEverShortCastle)
            {
                updateSquaresControlledByBlack();
                boolean isShortCastlingPossible = true;
                for(int i:squaresControlledByBlack)
                {
                    if(i == 51 || i == 61 || i == 71 ||!img[4][0].getTag().toString().equals("1") || !img[5][0].getTag().toString().equals("0") || !img[6][0].getTag().toString().equals("0") || !img[7][0].getTag().toString().equals("32"))
                    {
                        isShortCastlingPossible = false;
                        break;
                    }
                }
                if(isShortCastlingPossible)
                    WK.squaresControlled.add(71);
            }
        }

    }
    public static void CheckBlackCastling(){

            if(CanBlackKingEverCastle)
            {
                if(CanBlackKingEverLongCastle)
                {
                    updateSquaresControlledByWhite();
                    boolean isLongCastlingPossible = true;
                    for(int i:squaresControlledByWhite)
                    {
                        if(i == 58 || i == 48 || i == 38 || !img[4][7].getTag().toString().equals("b1") || !img[3][7].getTag().toString().equals("0") || !img[2][7].getTag().toString().equals("0") || !img[1][7].getTag().toString().equals("0") || !img[0][7].getTag().toString().equals("b31"))
                        {
                            isLongCastlingPossible = false;
                            break;
                        }
                    }
                    if(isLongCastlingPossible)
                        BK.squaresControlled.add(38);
                }
                if(CanBlackKingEverShortCastle)
                {
                    updateSquaresControlledByWhite();
                    boolean isShortCastlingPossible = true;
                    for(int i:squaresControlledByWhite)
                    {
                        if(i == 58 || i == 68 || i == 78 || !img[4][7].getTag().toString().equals("b1") || !img[5][7].getTag().toString().equals("0") || !img[6][7].getTag().toString().equals("0") || !img[7][7].getTag().toString().equals("b32"))
                        {
                            isShortCastlingPossible = false;
                            break;
                        }
                    }
                    if(isShortCastlingPossible)
                        BK.squaresControlled.add(78);
                }
            }

    }

}
