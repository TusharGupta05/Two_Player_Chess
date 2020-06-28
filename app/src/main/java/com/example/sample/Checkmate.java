package com.example.sample;

import android.content.Context;
import android.media.Image;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.HashMap;

import static com.example.sample.LegalMove.isLegalMove;
import static com.example.sample.MainActivity.*;
import static com.example.sample.SquaresControl.updateSquaresControlledByBlack;
import static com.example.sample.SquaresControl.updateSquaresControlledByWhite;

public class Checkmate {

    public static boolean isWhiteCheckmated() {
        WK.setWhiteKingsSquaresControlled();
        for (int x : WK.squaresControlled)
        {
            String otag2 = img[x / 10 - 1][x % 10 - 1].getTag().toString();
            int x1 = WK.Position / 10 - 1, y1 = WK.Position % 10 - 1;
            if (isLegalMove(img[x1][y1], img[x / 10 - 1][x % 10 - 1])) {
                img[x1][y1].setTag("1");
                img[x / 10 - 1][x % 10 - 1].setTag(otag2);
                WK.Position = (x1 + 1) * 10 + y1 + 1;
                if (!otag2.equals("0"))
                    switch (otag2) {
                        case "b2":
                            BQ.isActive = true;
                            BQ.Position = x;
                            break;
                        case "b31":
                            BR1.isActive = true;
                            BR1.Position = x;
                            break;
                        case "b32":
                            BR2.Position = x;
                            BR2.isActive = true;
                            break;
                        case "b41":
                            BB1.Position = x;
                            BB1.isActive = true;
                            break;
                        case "b42":
                            BB2.Position = x;
                            BB2.isActive = true;
                            break;
                        case "b51":
                            BN1.Position = x;
                            BN1.isActive = true;
                            break;
                        case "b52":
                            BN2.Position = x;
                            BN2.isActive = true;
                            break;
                        default:
                            blackPawn[otag2.charAt(2) - 49].isActive = true;
                            blackPawn[otag2.charAt(2) - 49].Position = x;
                            break;
                    }
                return false;
            }
        }
        if (WQ.isActive) {
            WQ.setWhiteQueenSquaresControlled();
            for (int x : WQ.squaresControlled) {

                String otag2 = img[x / 10 - 1][x % 10 - 1].getTag().toString();
                int x1 = WQ.Position / 10 - 1, y1 = WQ.Position % 10 - 1;

                if (isLegalMove(img[WQ.Position / 10 - 1][WQ.Position % 10 - 1], img[x / 10 - 1][x % 10 - 1])) {

                    img[x1][y1].setTag("2");
                    img[x / 10 - 1][x % 10 - 1].setTag(otag2);
                    WQ.Position = (x1 + 1) * 10 + y1 + 1;
                    if (!otag2.equals("0"))
                        switch (otag2) {
                            case "b2":
                                BQ.isActive = true;
                                BQ.Position = x;
                                break;
                            case "b31":
                                BR1.isActive = true;
                                BR1.Position = x;
                                break;
                            case "b32":
                                BR2.Position = x;
                                BR2.isActive = true;
                                break;
                            case "b41":
                                BB1.Position = x;
                                BB1.isActive = true;
                                break;
                            case "b42":
                                BB2.Position = x;
                                BB2.isActive = true;
                                break;
                            case "b51":
                                BN1.Position = x;
                                BN1.isActive = true;
                                break;
                            case "b52":
                                BN2.Position = x;
                                BN2.isActive = true;
                                break;
                            default:
                                blackPawn[otag2.charAt(2) - 49].isActive = true;
                                blackPawn[otag2.charAt(2) - 49].Position = x;
                                break;
                        }
                    return false;
                }
            }
        }
        if (WR1.isActive) {
            WR1.setWhiteRookSquaresControlled();
            for (int x : WR1.squaresControlled) {

                String otag2 = img[x / 10 - 1][x % 10 - 1].getTag().toString();
                int x1 = WR1.Position / 10 - 1, y1 = WR1.Position % 10 - 1;

                if (isLegalMove(img[WR1.Position / 10 - 1][WR1.Position % 10 - 1], img[x / 10 - 1][x % 10 - 1])) {

                    img[x1][y1].setTag("31");
                    img[x / 10 - 1][x % 10 - 1].setTag(otag2);
                    WR1.Position = (x1 + 1) * 10 + y1 + 1;
                    if (!otag2.equals("0"))
                        switch (otag2) {
                            case "b2":
                                BQ.isActive = true;
                                BQ.Position = x;
                                break;
                            case "b31":
                                BR1.isActive = true;
                                BR1.Position = x;
                                break;
                            case "b32":
                                BR2.Position = x;
                                BR2.isActive = true;
                                break;
                            case "b41":
                                BB1.Position = x;
                                BB1.isActive = true;
                                break;
                            case "b42":
                                BB2.Position = x;
                                BB2.isActive = true;
                                break;
                            case "b51":
                                BN1.Position = x;
                                BN1.isActive = true;
                                break;
                            case "b52":
                                BN2.Position = x;
                                BN2.isActive = true;
                                break;
                            default:
                                blackPawn[otag2.charAt(2) - 49].isActive = true;
                                blackPawn[otag2.charAt(2) - 49].Position = x;
                                break;
                        }
                    return false;

                }
            }
        }
        if (WR2.isActive) {
            WR2.setWhiteRookSquaresControlled();
            for (int x : WR2.squaresControlled) {

                String otag2 = img[x / 10 - 1][x % 10 - 1].getTag().toString();

                int x1 = WR2.Position / 10 - 1, y1 = WR2.Position % 10 - 1;

                if (isLegalMove(img[WR2.Position / 10 - 1][WR2.Position % 10 - 1], img[x / 10 - 1][x % 10 - 1])) {
                    img[x1][y1].setTag("32");
                    img[x / 10 - 1][x % 10 - 1].setTag(otag2);
                    WR2.Position = (x1 + 1) * 10 + y1 + 1;
                    if (!otag2.equals("0"))
                        switch (otag2) {
                            case "b2":
                                BQ.isActive = true;
                                BQ.Position = x;
                                break;
                            case "b31":
                                BR1.isActive = true;
                                BR1.Position = x;
                                break;
                            case "b32":
                                BR2.Position = x;
                                BR2.isActive = true;
                                break;
                            case "b41":
                                BB1.Position = x;
                                BB1.isActive = true;
                                break;
                            case "b42":
                                BB2.Position = x;
                                BB2.isActive = true;
                                break;
                            case "b51":
                                BN1.Position = x;
                                BN1.isActive = true;
                                break;
                            case "b52":
                                BN2.Position = x;
                                BN2.isActive = true;
                                break;
                            default:
                                blackPawn[otag2.charAt(2) - 49].isActive = true;
                                blackPawn[otag2.charAt(2) - 49].Position = x;
                                break;
                        }
                    return false;
                }
            }
        }
        if (WB1.isActive) {
            WB1.setWhiteBishopSquaresControlled();
            for (int x : WB1.squaresControlled) {

                String otag2 = img[x / 10 - 1][x % 10 - 1].getTag().toString();
                int x1 = WB1.Position / 10 - 1, y1 = WB1.Position % 10 - 1;
                if (isLegalMove(img[WB1.Position / 10 - 1][WB1.Position % 10 - 1], img[x / 10 - 1][x % 10 - 1])) {

                    img[x1][y1].setTag("41");
                    img[x / 10 - 1][x % 10 - 1].setTag(otag2);
                    WB1.Position = (x1 + 1) * 10 + y1 + 1;
                    if (!otag2.equals("0"))
                        switch (otag2) {
                            case "b2":
                                BQ.isActive = true;
                                BQ.Position = x;
                                break;
                            case "b31":
                                BR1.isActive = true;
                                BR1.Position = x;
                                break;
                            case "b32":
                                BR2.Position = x;
                                BR2.isActive = true;
                                break;
                            case "b41":
                                BB1.Position = x;
                                BB1.isActive = true;
                                break;
                            case "b42":
                                BB2.Position = x;
                                BB2.isActive = true;
                                break;
                            case "b51":
                                BN1.Position = x;
                                BN1.isActive = true;
                                break;
                            case "b52":
                                BN2.Position = x;
                                BN2.isActive = true;
                                break;
                            default:
                                blackPawn[otag2.charAt(2) - 49].isActive = true;
                                blackPawn[otag2.charAt(2) - 49].Position = x;
                                break;
                        }
                    return false;

                }
            }
        }
        if (WB2.isActive) {

            WB2.setWhiteBishopSquaresControlled();

            for (int x : WB2.squaresControlled) {

                String otag2 = img[x / 10 - 1][x % 10 - 1].getTag().toString();
                int x1 = WB2.Position / 10 - 1, y1 = WB2.Position % 10 - 1;

                if (isLegalMove(img[WB2.Position / 10 - 1][WB2.Position % 10 - 1], img[x / 10 - 1][x % 10 - 1])) {

                    img[x1][y1].setTag("42");
                    img[x / 10 - 1][x % 10 - 1].setTag(otag2);
                    WB2.Position = (x1 + 1) * 10 + y1 + 1;
                    if (!otag2.equals("0"))
                        switch (otag2) {
                            case "b2":
                                BQ.isActive = true;
                                BQ.Position = x;
                                break;
                            case "b31":
                                BR1.isActive = true;
                                BR1.Position = x;
                                break;
                            case "b32":
                                BR2.Position = x;
                                BR2.isActive = true;
                                break;
                            case "b41":
                                BB1.Position = x;
                                BB1.isActive = true;
                                break;
                            case "b42":
                                BB2.Position = x;
                                BB2.isActive = true;
                                break;
                            case "b51":
                                BN1.Position = x;
                                BN1.isActive = true;
                                break;
                            case "b52":
                                BN2.Position = x;
                                BN2.isActive = true;
                                break;
                            default:
                                blackPawn[otag2.charAt(2) - 49].isActive = true;
                                blackPawn[otag2.charAt(2) - 49].Position = x;
                                break;
                        }
                    return false;

                }
            }
        }
        if (WN1.isActive) {
            WN1.setWhiteKnightSquaresControlled();
            for (int x : WN1.squaresControlled) {

                String otag2 = img[x / 10 - 1][x % 10 - 1].getTag().toString();
                int x1 = WN1.Position / 10 - 1, y1 = WN1.Position % 10 - 1;

                if (isLegalMove(img[WN1.Position / 10 - 1][WN1.Position % 10 - 1], img[x / 10 - 1][x % 10 - 1])) {

                    img[x1][y1].setTag("51");
                    img[x / 10 - 1][x % 10 - 1].setTag(otag2);
                    WN1.Position = (x1 + 1) * 10 + y1 + 1;
                    if (!otag2.equals("0"))
                        switch (otag2) {
                            case "b2":
                                BQ.isActive = true;
                                BQ.Position = x;
                                break;
                            case "b31":
                                BR1.isActive = true;
                                BR1.Position = x;
                                break;
                            case "b32":
                                BR2.Position = x;
                                BR2.isActive = true;
                                break;
                            case "b41":
                                BB1.Position = x;
                                BB1.isActive = true;
                                break;
                            case "b42":
                                BB2.Position = x;
                                BB2.isActive = true;
                                break;
                            case "b51":
                                BN1.Position = x;
                                BN1.isActive = true;
                                break;
                            case "b52":
                                BN2.Position = x;
                                BN2.isActive = true;
                                break;
                            default:
                                blackPawn[otag2.charAt(2) - 49].isActive = true;
                                blackPawn[otag2.charAt(2) - 49].Position = x;
                                break;
                        }
                    return false;

                }
            }
        }
        if (WN2.isActive) {

            WN2.setWhiteKnightSquaresControlled();
            for (int x : WN2.squaresControlled) {

                String otag2 = img[x / 10 - 1][x % 10 - 1].getTag().toString();
                int x1 = WN2.Position / 10 - 1, y1 = WN2.Position % 10 - 1;

                if (isLegalMove(img[WN2.Position / 10 - 1][WN2.Position % 10 - 1], img[x / 10 - 1][x % 10 - 1])) {

                    img[x1][y1].setTag("52");
                    img[x / 10 - 1][x % 10 - 1].setTag(otag2);
                    WN2.Position = (x1 + 1) * 10 + y1 + 1;
                    if (!otag2.equals("0"))
                        switch (otag2) {
                            case "b2":
                                BQ.isActive = true;
                                BQ.Position = x;
                                break;
                            case "b31":
                                BR1.isActive = true;
                                BR1.Position = x;
                                break;
                            case "b32":
                                BR2.Position = x;
                                BR2.isActive = true;
                                break;
                            case "b41":
                                BB1.Position = x;
                                BB1.isActive = true;
                                break;
                            case "b42":
                                BB2.Position = x;
                                BB2.isActive = true;
                                break;
                            case "b51":
                                BN1.Position = x;
                                BN1.isActive = true;
                                break;
                            case "b52":
                                BN2.Position = x;
                                BN2.isActive = true;
                                break;
                            default:
                                blackPawn[otag2.charAt(2) - 49].isActive = true;
                                blackPawn[otag2.charAt(2) - 49].Position = x;
                                break;
                        }
                    return false;

                }
            }
        }
        for (int k = 0; k < 8; k++)
            if (whitePawn[k].isActive) {
                whitePawn[k].setWhitePawnsSquaresControlled();
                for (int x : whitePawn[k].squaresControlled) {

                    String otag2 = img[x / 10 - 1][x % 10 - 1].getTag().toString();
                    int x1 = whitePawn[k].Position / 10 - 1, y1 = whitePawn[k].Position % 10 - 1;

                    if (isLegalMove(img[whitePawn[k].Position / 10 - 1][whitePawn[k].Position % 10 - 1], img[x / 10 - 1][x % 10 - 1])) {

                        img[x1][y1].setTag("6"+String.valueOf(k));
                        img[x / 10 - 1][x % 10 - 1].setTag(otag2);
                        whitePawn[k].Position = (x1 + 1) * 10 + y1 + 1;
                        if (!otag2.equals("0"))
                            switch (otag2) {
                                case "b2":
                                    BQ.isActive = true;
                                    BQ.Position = x;
                                    break;
                                case "b31":
                                    BR1.isActive = true;
                                    BR1.Position = x;
                                    break;
                                case "b32":
                                    BR2.Position = x;
                                    BR2.isActive = true;
                                    break;
                                case "b41":
                                    BB1.Position = x;
                                    BB1.isActive = true;
                                    break;
                                case "b42":
                                    BB2.Position = x;
                                    BB2.isActive = true;
                                    break;
                                case "b51":
                                    BN1.Position = x;
                                    BN1.isActive = true;
                                    break;
                                case "b52":
                                    BN2.Position = x;
                                    BN2.isActive = true;
                                    break;
                                default:
                                    blackPawn[otag2.charAt(2) - 49].isActive = true;
                                    blackPawn[otag2.charAt(2) - 49].Position = x;
                                    break;
                            }
                        return false;

                    }
                }
            }
        return true;
    }

    public static boolean isBlackCheckmated(){
        BK.setBlackKingsSquaresControlled();
        for(int x:BK.squaresControlled) {
            String otag2 = img[x/10-1][x%10-1].getTag().toString();
            int x1 = BK.Position/10-1,y1 = BK.Position%10-1;
            if(isLegalMove(img[x1][y1],img[x/10-1][x%10-1])) {
                img[x1][y1].setTag("b1");
                img[x/10-1][x%10-1].setTag(otag2);
                BK.Position = (x1+1)*10+y1+1;
                if(!otag2.equals("0"))
                    switch(otag2)
                    {
                        case "2":
                            WQ.isActive = true;
                            WQ.Position = x;
                            break;
                        case "31":
                            WR1.isActive = true;
                            WR1.Position = x;
                            break;
                        case "32":
                            WR2.isActive = true;
                            WR2.Position = x;
                            break;
                        case "41":
                            WB1.isActive = true;
                            WB1.Position = x;
                            break;
                        case "42":
                            WB2.isActive = true;
                            WB2.Position = x;
                            break;
                        case "51":
                            WN1.isActive = true;
                            WN1.Position = x;
                            break;
                        case "52":
                            WN2.isActive = true;
                            WN2.Position = x;
                            break;
                        default:
                            whitePawn[otag2.charAt(1)-49].isActive = true;
                            whitePawn[otag2.charAt(1)-49].Position = x;
                            break;
                    }
                return false;
            }
        }
        if(BQ.isActive) {
            BQ.setBlackQueenSquaresControlled();
            for (int x : BQ.squaresControlled) {

                String otag2 = img[x/10-1][x%10-1].getTag().toString();
                int x1 = BQ.Position/10-1,y1 = BQ.Position%10-1;

                if (isLegalMove(img[BQ.Position / 10 - 1][BQ.Position % 10 - 1], img[x / 10 - 1][x % 10 - 1])) {

                    img[x1][y1].setTag("b2");
                    img[x/10-1][x%10-1].setTag(otag2);
                    BQ.Position = (x1+1)*10+y1+1;
                    if(!otag2.equals("0"))
                        switch(otag2)
                        {
                            case "2":
                                WQ.isActive = true;
                                WQ.Position = x;
                                break;
                            case "31":
                                WR1.isActive = true;
                                WR1.Position = x;
                                break;
                            case "32":
                                WR2.isActive = true;
                                WR2.Position = x;
                                break;
                            case "41":
                                WB1.isActive = true;
                                WB1.Position = x;
                                break;
                            case "42":
                                WB2.isActive = true;
                                WB2.Position = x;
                                break;
                            case "51":
                                WN1.isActive = true;
                                WN1.Position = x;
                                break;
                            case "52":
                                WN2.isActive = true;
                                WN2.Position = x;
                                break;
                            default:
                                whitePawn[otag2.charAt(1)-49].isActive = true;
                                whitePawn[otag2.charAt(1)-49].Position = x;
                                break;
                        }
                    return false;
                }
            }
        }
        if(BR1.isActive) {
            BR1.setBlackRookSquaresControlled();
            for (int x : BR1.squaresControlled) {

                String otag2 = img[x/10-1][x%10-1].getTag().toString();
                int x1 = BR1.Position/10-1,y1 = BR1.Position%10-1;

                if (isLegalMove(img[BR1.Position / 10 - 1][BR1.Position % 10 - 1], img[x / 10 - 1][x % 10 - 1])) {

                    img[x1][y1].setTag("b31");
                    img[x/10-1][x%10-1].setTag(otag2);
                    BR1.Position = (x1+1)*10+y1+1;
                    if(!otag2.equals("0"))
                        switch(otag2)
                        {
                            case "2":
                                WQ.isActive = true;
                                WQ.Position = x;
                                break;
                            case "31":
                                WR1.isActive = true;
                                WR1.Position = x;
                                break;
                            case "32":
                                WR2.isActive = true;
                                WR2.Position = x;
                                break;
                            case "41":
                                WB1.isActive = true;
                                WB1.Position = x;
                                break;
                            case "42":
                                WB2.isActive = true;
                                WB2.Position = x;
                                break;
                            case "51":
                                WN1.isActive = true;
                                WN1.Position = x;
                                break;
                            case "52":
                                WN2.isActive = true;
                                WN2.Position = x;
                                break;
                            default:
                                whitePawn[otag2.charAt(1)-49].isActive = true;
                                whitePawn[otag2.charAt(1)-49].Position = x;
                                break;
                        }
                    return false;

                }
            }
        }
        if(BR2.isActive) {
            BR2.setBlackRookSquaresControlled();
            for (int x : BR2.squaresControlled) {

                String otag2 = img[x/10-1][x%10-1].getTag().toString();
                int x1 = BR2.Position/10-1,y1 = BR2.Position%10-1;

                if (isLegalMove(img[x1][y1], img[x / 10 - 1][x % 10 - 1])) {
                    img[x1][y1].setTag("b32");
                    img[x/10-1][x%10-1].setTag(otag2);
                    BR2.Position = (x1+1)*10+y1+1;
                    if(!otag2.equals("0"))
                        switch(otag2)
                        {
                            case "2":
                                WQ.isActive = true;
                                WQ.Position = x;
                                break;
                            case "31":
                                WR1.isActive = true;
                                WR1.Position = x;
                                break;
                            case "32":
                                WR2.isActive = true;
                                WR2.Position = x;
                                break;
                            case "41":
                                WB1.isActive = true;
                                WB1.Position = x;
                                break;
                            case "42":
                                WB2.isActive = true;
                                WB2.Position = x;
                                break;
                            case "51":
                                WN1.isActive = true;
                                WN1.Position = x;
                                break;
                            case "52":
                                WN2.isActive = true;
                                WN2.Position = x;
                                break;
                            default:
                                whitePawn[otag2.charAt(1)-49].isActive = true;
                                whitePawn[otag2.charAt(1)-49].Position = x;
                                break;
                        }
                    return false;
                }
            }
        }
        if(BB1.isActive) {
            BB1.setBlackBishopSquaresControlled();
            for (int x : BB1.squaresControlled) {

                String otag2 = img[x/10-1][x%10-1].getTag().toString();
                int x1 = BB1.Position/10-1,y1 = BB1.Position%10-1;
                if (isLegalMove(img[x1][y1], img[x / 10 - 1][x % 10 - 1])) {

                    img[x1][y1].setTag("b41");
                    img[x/10-1][x%10-1].setTag(otag2);
                    BB1.Position = (x1+1)*10+y1+1;
                    if(!otag2.equals("0"))
                        switch(otag2)
                        {
                            case "2":
                                WQ.isActive = true;
                                WQ.Position = x;
                                break;
                            case "31":
                                WR1.isActive = true;
                                WR1.Position = x;
                                break;
                            case "32":
                                WR2.isActive = true;
                                WR2.Position = x;
                                break;
                            case "41":
                                WB1.isActive = true;
                                WB1.Position = x;
                                break;
                            case "42":
                                WB2.isActive = true;
                                WB2.Position = x;
                                break;
                            case "51":
                                WN1.isActive = true;
                                WN1.Position = x;
                                break;
                            case "52":
                                WN2.isActive = true;
                                WN2.Position = x;
                                break;
                            default:
                                whitePawn[otag2.charAt(1)-49].isActive = true;
                                whitePawn[otag2.charAt(1)-49].Position = x;
                                break;
                        }
                    return false;

                }
            }
        }
        if(BB2.isActive) {

            BB2.setBlackBishopSquaresControlled();

            for (int x : BB2.squaresControlled) {

                String otag2 = img[x/10-1][x%10-1].getTag().toString();
                int x1 = BB2.Position/10-1,y1 = BB2.Position%10-1;

                if (isLegalMove(img[x1][y1], img[x / 10 - 1][x % 10 - 1])) {

                    img[x1][y1].setTag("b42");
                    img[x/10-1][x%10-1].setTag(otag2);
                    BB2.Position = (x1+1)*10+y1+1;
                    if(!otag2.equals("0"))
                        switch(otag2)
                        {
                            case "2":
                                WQ.isActive = true;
                                WQ.Position = x;
                                break;
                            case "31":
                                WR1.isActive = true;
                                WR1.Position = x;
                                break;
                            case "32":
                                WR2.isActive = true;
                                WR2.Position = x;
                                break;
                            case "41":
                                WB1.isActive = true;
                                WB1.Position = x;
                                break;
                            case "42":
                                WB2.isActive = true;
                                WB2.Position = x;
                                break;
                            case "51":
                                WN1.isActive = true;
                                WN1.Position = x;
                                break;
                            case "52":
                                WN2.isActive = true;
                                WN2.Position = x;
                                break;
                            default:
                                whitePawn[otag2.charAt(1)-49].isActive = true;
                                whitePawn[otag2.charAt(1)-49].Position = x;
                                break;
                        }
                    return false;

                }
            }
        }
        if(BN1.isActive) {
            BN1.setBlackKnightSquaresControlled();
            for (int x : BN1.squaresControlled) {

                String otag2 = img[x/10-1][x%10-1].getTag().toString();
                int x1 = BN1.Position/10-1,y1 = BN1.Position%10-1;

                if (isLegalMove(img[x1][y1], img[x / 10 - 1][x % 10 - 1])) {

                    img[x1][y1].setTag("b51");
                    img[x/10-1][x%10-1].setTag(otag2);
                    BN1.Position = (x1+1)*10+y1+1;
                    if(!otag2.equals("0"))
                        switch(otag2)
                        {
                            case "2":
                                WQ.isActive = true;
                                WQ.Position = x;
                                break;
                            case "31":
                                WR1.isActive = true;
                                WR1.Position = x;
                                break;
                            case "32":
                                WR2.isActive = true;
                                WR2.Position = x;
                                break;
                            case "41":
                                WB1.isActive = true;
                                WB1.Position = x;
                                break;
                            case "42":
                                WB2.isActive = true;
                                WB2.Position = x;
                                break;
                            case "51":
                                WN1.isActive = true;
                                WN1.Position = x;
                                break;
                            case "52":
                                WN2.isActive = true;
                                WN2.Position = x;
                                break;
                            default:
                                whitePawn[otag2.charAt(1)-49].isActive = true;
                                whitePawn[otag2.charAt(1)-49].Position = x;
                                break;
                        }
                    return false;

                }
            }
        }
        if(BN2.isActive) {

            BN2.setBlackKnightSquaresControlled();
            for (int x : BN2.squaresControlled) {

                String otag2 = img[x/10-1][x%10-1].getTag().toString();
                int x1 = BN2.Position/10-1,y1 = BN2.Position%10-1;

                if (isLegalMove(img[x1][y1], img[x / 10 - 1][x % 10 - 1])) {

                    img[x1][y1].setTag("b52");
                    img[x/10-1][x%10-1].setTag(otag2);
                    BN2.Position = (x1+1)*10+y1+1;
                    if(!otag2.equals("0"))
                        switch(otag2)
                        {
                            case "2":
                                WQ.isActive = true;
                                WQ.Position = x;
                                break;
                            case "31":
                                WR1.isActive = true;
                                WR1.Position = x;
                                break;
                            case "32":
                                WR2.isActive = true;
                                WR2.Position = x;
                                break;
                            case "41":
                                WB1.isActive = true;
                                WB1.Position = x;
                                break;
                            case "42":
                                WB2.isActive = true;
                                WB2.Position = x;
                                break;
                            case "51":
                                WN1.isActive = true;
                                WN1.Position = x;
                                break;
                            case "52":
                                WN2.isActive = true;
                                WN2.Position = x;
                                break;
                            default:
                                whitePawn[otag2.charAt(1)-49].isActive = true;
                                whitePawn[otag2.charAt(1)-49].Position = x;
                                break;
                        }
                    return false;

                }
            }
        }
        for(int k=0;k<8;k++)
            if(blackPawn[k].isActive) {
                blackPawn[k].setBlackPawnsSquaresControlled();
                for (int x : blackPawn[k].squaresControlled) {

                    String otag2 = img[x/10-1][x%10-1].getTag().toString();
                    int x1 = blackPawn[k].Position/10-1,y1 = blackPawn[k].Position%10-1;

                    if (isLegalMove(img[x1][y1], img[x / 10 - 1][x % 10 - 1])) {

                        img[x1][y1].setTag("b6"+String.valueOf(k));
                        img[x/10-1][x%10-1].setTag(otag2);
                        blackPawn[k].Position = (x1+1)*10+y1+1;
                        if(!otag2.equals("0"))
                            switch(otag2)
                            {
                                case "2":
                                    WQ.isActive = true;
                                    WQ.Position = x;
                                    break;
                                case "31":
                                    WR1.isActive = true;
                                    WR1.Position = x;
                                    break;
                                case "32":
                                    WR2.isActive = true;
                                    WR2.Position = x;
                                    break;
                                case "41":
                                    WB1.isActive = true;
                                    WB1.Position = x;
                                    break;
                                case "42":
                                    WB2.isActive = true;
                                    WB2.Position = x;
                                    break;
                                case "51":
                                    WN1.isActive = true;
                                    WN1.Position = x;
                                    break;
                                case "52":
                                    WN2.isActive = true;
                                    WN2.Position = x;
                                    break;
                                default:
                                    whitePawn[otag2.charAt(1)-49].isActive = true;
                                    whitePawn[otag2.charAt(1)-49].Position = x;
                                    break;
                            }
                        return false;
                    }
                }
            }
        return true;
    }


}
