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

        squaresControlledByWhite = new ArrayList<>();
        WK.setWhiteKingsSquaresControlled();
        for(int i:WK.squaresControlled)
            squaresControlledByWhite.add(i);
        if(WQ.isActive) {
            WQ.setWhiteQueenSquaresControlled();
            for(int i:WQ.squaresControlled)
                squaresControlledByWhite.add(i);
        }
        if(WR1.isActive) {
            WR1.setWhiteRookSquaresControlled();
            for(int i:WR1.squaresControlled)
                squaresControlledByWhite.add(i);
        }
        if(WR2.isActive) {
            WR2.setWhiteRookSquaresControlled();
            for(int i:WR2.squaresControlled)
                squaresControlledByWhite.add(i);
        }
        if(WB1.isActive) {
            WB1.setWhiteBishopSquaresControlled();
            for(int i:WB1.squaresControlled)
                squaresControlledByWhite.add(i);
        }
        if(WB2.isActive) {
            WB2.setWhiteBishopSquaresControlled();
            for(int i:WB2.squaresControlled)
                squaresControlledByWhite.add(i);
        }
        if(WN1.isActive) {
            WN1.setWhiteKnightSquaresControlled();
            for(int i:WN1.squaresControlled)
                squaresControlledByWhite.add(i);
        }
        if(WN2.isActive) {
            WN2.setWhiteKnightSquaresControlled();
            for(int i:WN2.squaresControlled)
                squaresControlledByWhite.add(i);
        }
        for(int i=0;i<8;i++) {
            if(whitePawn[i].isActive) {
                if(whitePawn[i].id.equals("6")) {
                    if (MainActivity.Tags.containsKey(whitePawn[i].Position + 11))
                        squaresControlledByWhite.add(whitePawn[i].Position + 11);
                    if (MainActivity.Tags.containsKey(whitePawn[i].Position - 9))
                        squaresControlledByWhite.add(whitePawn[i].Position - 9);
                }
                else {
                    whitePawn[i].setWhitePawnsSquaresControlled();
                    for(int k:whitePawn[i].squaresControlled)
                        squaresControlledByWhite.add(k);
                }
            }
        }

    }
    static void updateSquaresControlledByBlack(){

        squaresControlledByBlack = new ArrayList<>();

        BK.setBlackKingsSquaresControlled();
        for(int i:BK.squaresControlled)
            squaresControlledByBlack.add(i);
        if(BQ.isActive) {
            BQ.setBlackQueenSquaresControlled();
            for(int i:BQ.squaresControlled)
                squaresControlledByBlack.add(i);
        }
        if(BR1.isActive) {
            BR1.setBlackRookSquaresControlled();
            for(int i:BR1.squaresControlled)
                squaresControlledByBlack.add(i);
        }
        if(BR2.isActive) {
            BR2.setBlackRookSquaresControlled();
            for(int i:BR2.squaresControlled)
                squaresControlledByBlack.add(i);
        }
        if(BB1.isActive) {
            BB1.setBlackBishopSquaresControlled();
            for(int i:BB1.squaresControlled)
                squaresControlledByBlack.add(i);
        }
        if(BB2.isActive) {
            BB2.setBlackBishopSquaresControlled();
            for(int i:BB2.squaresControlled)
                squaresControlledByBlack.add(i);
        }
        if(BN1.isActive) {
            BN1.setBlackKnightSquaresControlled();
            for(int i:BN1.squaresControlled)
                squaresControlledByBlack.add(i);
        }
        if(BN2.isActive) {
            BN2.setBlackKnightSquaresControlled();
            for(int i:BN2.squaresControlled)
                squaresControlledByBlack.add(i);
        }
        for(int i=0;i<8;i++) {
            if(blackPawn[i].isActive) {
                if(blackPawn[i].id1.equals("b6")) {
                    if (MainActivity.Tags.containsKey(blackPawn[i].Position - 11))
                        squaresControlledByBlack.add(blackPawn[i].Position - 11);
                    if (MainActivity.Tags.containsKey(blackPawn[i].Position + 9))
                        squaresControlledByBlack.add(blackPawn[i].Position + 9);
                }
                else
                {
                    blackPawn[i].setBlackPawnsSquaresControlled();
                    for(int k:blackPawn[i].squaresControlled)
                        squaresControlledByBlack.add(k);
                }
            }
        }
    }

    
}
