package com.example.sample;

import android.animation.Animator;
import android.widget.ImageView;
import static com.example.sample.SquaresControl.*;
import static com.example.sample.MainActivity.*;
import static java.sql.Types.NULL;

public class LegalMove {

    static boolean isLegalMove(final ImageView temp, ImageView temp2){

        if(turn == 1)
        {
            if(temp.getTag().toString().equals("1") && squares.get(temp2.getResources().getResourceName(temp2.getId()).substring(22,24)) == 31 && img[4][0].getTag().toString().equals("1") )  //long
            {
                temp.setTag("0");
                temp2.setTag("1");
                img[3][0].setTag("31");
                img[0][0].setTag("0");
                WK.Position = 31;
                WR1.Position = 41;
                final float x1 = img[0][0].getX(),y1 = img[0][0].getY(),x2 = img[3][0].getX(),y2 = img[3][0].getY();
                img[0][0].animate().translationXBy(x2-x1).translationYBy(y2-y1).setDuration(500).setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        img[0][0].setImageResource(NULL);
                        img[3][0].setImageResource(R.drawable.whiterook);
                        img[0][0].setX(x1);
                        img[0][0].setY(y1);
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });
                CanWhiteKingEverCastle = false;
                CanWhiteKingEverShortCastle = false;
                CanWhiteKingEverLongCastle = false;
                return true;
            }
            if(temp.getTag().toString().equals("1") && squares.get(temp2.getResources().getResourceName(temp2.getId()).substring(22,24)) == 71 && img[4][0].getTag().toString().equals("1") )  //short
            {
                img[5][0].setTag("32");
                img[6][0].setTag("1");
                img[7][0].setTag("0");
                img[4][0].setTag("0");
                WK.Position = 71;
                WR2.Position = 61;
                final float x1 = img[7][0].getX(),y1 = img[7][0].getY(),x2 = img[5][0].getX(),y2 = img[5][0].getY();
                img[7][0].animate().translationXBy(x2-x1).translationYBy(y2-y1).setDuration(500).setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {

                        img[7][0].setImageResource(NULL);
                        img[5][0].setImageResource(R.drawable.whiterook);
                        img[7][0].setX(x1);
                        img[7][0].setY(y1);

                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });

                CanWhiteKingEverCastle = false;
                CanWhiteKingEverShortCastle = false;
                CanWhiteKingEverLongCastle = false;
                return true;
            }
        }
        else
        {
            if(temp.getTag().toString().equals("b1") && squares.get(temp2.getResources().getResourceName(temp2.getId()).substring(22,24)) == 38 && img[4][7].getTag().toString().equals("b1") )
            {
                    temp.setTag("0");
                    temp2.setTag("b1");
                    img[3][7].setTag("b31");
                    img[0][7].setTag("0");
                    BK.Position = 31;
                    BR1.Position = 41;
                    final float x1 = img[0][7].getX(),y1 = img[0][7].getY(),x2 = img[3][7].getX(),y2 = img[3][7].getY();
                    img[0][7].animate().translationXBy(x2-x1).translationYBy(y2-y1).setDuration(500).setListener(new Animator.AnimatorListener() {
                        @Override
                        public void onAnimationStart(Animator animator) {

                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            img[0][7].setImageResource(NULL);
                            img[3][7].setImageResource(R.drawable.blackrook);
                            img[0][7].setX(x1);
                            img[0][7].setY(y1);
                        }

                        @Override
                        public void onAnimationCancel(Animator animator) {

                        }

                        @Override
                        public void onAnimationRepeat(Animator animator) {

                        }
                    });
                    CanBlackKingEverCastle = false;
                    CanBlackKingEverLongCastle = false;
                    CanBlackKingEverShortCastle = false;
                    return true;
            }
            if(temp.getTag().toString().equals("b1") && squares.get(temp2.getResources().getResourceName(temp2.getId()).substring(22,24)) == 78 && img[4][7].getTag().toString().equals("b1"))
            {
                img[5][7].setTag("b32");
                img[6][7].setTag("b1");
                img[7][7].setTag("0");
                img[4][7].setTag("0");
                BK.Position = 78;
                BR2.Position = 68;
                final float x1 = img[7][7].getX(),y1 = img[7][7].getY(),x2 = img[5][7].getX(),y2 = img[5][7].getY();
                img[7][7].animate().translationXBy(x2-x1).translationYBy(y2-y1).setDuration(500).setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {

                        img[7][7].setImageResource(NULL);
                        img[5][7].setImageResource(R.drawable.blackrook);
                        img[7][7].setX(x1);
                        img[7][7].setY(y1);

                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });

                CanBlackKingEverCastle = false;
                CanBlackKingEverLongCastle = false;
                CanBlackKingEverShortCastle = false;
                return true;
            }
        }

        String otag1 = temp.getTag().toString(),otag2 = temp2.getTag().toString();
        int pos2 = squares.get(temp2.getResources().getResourceName(temp2.getId()).substring(22,24)),pos1 = squares.get(temp.getResources().getResourceName(temp.getId()).substring(22,24));
        if(turn == 1)
        {
            temp.setTag("0");
            temp2.setTag(otag1);
            switch(otag1)
            {
                case "1":
                    WK.Position = pos2;
                    break;
                case "2":
                    WQ.Position = pos2;
                    break;
                case "31":
                    WR1.Position = pos2;
                    break;
                case "32":
                    WR2.Position = pos2;
                    break;
                case "41":
                    WB1.Position = pos2;
                    break;
                case "42":
                    WB2.Position = pos2;
                    break;
                case "51":
                    WN1.Position = pos2;
                    break;
                case "52":
                    WN2.Position = pos2;
                    break;
                default:
                    whitePawn[otag1.charAt(1)-49].Position = pos2;
                    break;
            }
            if(!otag2.equals("0"))
            {
                switch(otag2)
                {
                    case "b2":
                        BQ.isActive = false;
                        BQ.Position = -100;
                        break;
                    case "b31":
                        BR1.isActive = false;
                        BR1.Position = -100;
                        break;
                    case "b32":
                        BR2.isActive = false;
                        BR2.Position = -100;
                        break;
                    case "b41":
                        BB1.isActive = false;
                        BB1.Position = -100;
                        break;
                    case "b42":
                        BB2.isActive = false;
                        BB2.Position = -100;
                        break;
                    case "b51":
                        BN1.isActive = false;
                        BN1.Position = -100;
                        break;
                    case "b52":
                        BN2.isActive = false;
                        BN2.Position = -100;
                        break;
                    default:
                        blackPawn[otag2.charAt(2)-49].isActive = false;
                        blackPawn[otag2.charAt(2)-49].Position = -100;
                        break;
                }
            }
            getTags();
            updateSquaresControlledByBlack();
            for(int i:squaresControlledByBlack)
            {
                if(i == WK.Position)
                {
                    switch(otag1)
                    {
                        case "1":
                            WK.Position = pos1;
                            break;
                        case "2":
                            WQ.Position = pos1;
                            break;
                        case "31":
                            WR1.Position = pos1;
                            break;
                        case "32":
                            WR2.Position = pos1;
                            break;
                        case "41":
                            WB1.Position = pos1;
                            break;
                        case "42":
                            WB2.Position = pos1;
                            break;
                        case "51":
                            WN1.Position = pos1;
                            break;
                        case "52":
                            WN2.Position = pos1;
                            break;
                        default:
                            whitePawn[otag1.charAt(1)-49].Position = pos1;
                            break;
                    }
                    if(!otag2.equals("0"))
                    {
                        switch(otag2)
                        {
                            case "b2":
                                BQ.isActive = true;
                                BQ.Position = pos2;
                                break;
                            case "b31":
                                BR1.isActive = true;
                                BR1.Position = pos2;
                                break;
                            case "b32":
                                BR2.Position = pos2;
                                BR2.isActive = true;
                                break;
                            case "b41":
                                BB1.Position = pos2;
                                BB1.isActive = true;
                                break;
                            case "b42":
                                BB2.Position = pos2;
                                BB2.isActive = true;
                                break;
                            case "b51":
                                BN1.Position = pos2;
                                BN1.isActive = true;
                                break;
                            case "b52":
                                BN2.Position = pos2;
                                BN2.isActive = true;
                                break;
                            default:
                                blackPawn[otag2.charAt(2)-49].isActive = true;
                                blackPawn[otag2.charAt(2)-49].Position = pos2;
                                break;
                        }
                    }
                    temp.setTag(otag1);
                    temp2.setTag(otag2);
                    getTags();
                    return false;
                }
            }
            return true;
        }
        else
        {
            if(!otag2.equals("0"))
            {
                switch(otag2)
                {
                    case "2":
                        WQ.isActive = false;
                        WQ.Position = -100;
                        break;
                    case "31":
                        WR1.isActive = false;
                        WR1.Position = -100;
                        break;
                    case "32":
                        WR2.isActive = false;
                        WR2.Position = -100;
                        break;
                    case "41":
                        WB1.Position = -100;
                        WB1.isActive = false;
                        break;
                    case "42":
                        WB2.Position = -100;
                        WB2.isActive = false;
                        break;
                    case "51":
                        WN1.Position = -100;
                        WN1.isActive = false;
                        break;
                    case "52":
                        WN2.Position = -100;
                        WN2.isActive = false;
                        break;
                    default:
                        whitePawn[otag2.charAt(1)-49].Position = -100;
                        whitePawn[otag2.charAt(1)-49].isActive = false;
                        break;
                }
            }
            switch(otag1)
            {
                case "b1":
                    BK.Position = pos2;
                    break;
                case "b2":
                    BQ.Position = pos2;
                    break;
                case "b31":
                    BR1.Position = pos2;
                    break;
                case "b32":
                    BR2.Position = pos2;
                    break;
                case "b41":
                    BB1.Position = pos2;
                    break;
                case "b42":
                    BB2.Position = pos2;
                    break;
                case "b51":
                    BN1.Position = pos2;
                    break;
                case "b52":
                    BN2.Position = pos2;
                    break;
                default:
                    blackPawn[otag1.charAt(2)-49].Position = pos2;
                    break;
            }
            temp.setTag("0");
            temp2.setTag(otag1);
            getTags();
            updateSquaresControlledByWhite();
            for(int i:squaresControlledByWhite)
            {
                if(i == BK.Position)
                {
                    if(!otag2.equals("0"))
                    {
                        switch(otag2)
                        {
                            case "2":
                                WQ.isActive = true;
                                WQ.Position = pos2;
                                break;
                            case "31":
                                WR1.isActive = true;
                                WR1.Position = pos2;
                                break;
                            case "32":
                                WR2.isActive = true;
                                WR2.Position = pos2;
                                break;
                            case "41":
                                WB1.isActive = true;
                                WB1.Position = pos2;
                                break;
                            case "42":
                                WB2.isActive = true;
                                WB2.Position = pos2;
                                break;
                            case "51":
                                WN1.isActive = true;
                                WN1.Position = pos2;
                                break;
                            case "52":
                                WN2.isActive = true;
                                WN2.Position = pos2;
                                break;
                            default:
                                whitePawn[otag2.charAt(1)-49].isActive = true;
                                whitePawn[otag2.charAt(1)-49].Position = pos2;
                                break;
                        }
                    }
                    switch(otag1)
                    {
                        case "b1":
                            BK.Position = pos1;
                            break;
                        case "b2":
                            BQ.Position = pos1;
                            break;
                        case "b31":
                            BR1.Position = pos1;
                            break;
                        case "b32":
                            BR2.Position = pos1;
                            break;
                        case "b41":
                            BB1.Position = pos1;
                            break;
                        case "b42":
                            BB2.Position = pos1;
                            break;
                        case "b51":
                            BN1.Position = pos1;
                            break;
                        case "b52":
                            BN2.Position = pos1;
                            break;
                        default:
                            blackPawn[otag1.charAt(2)-49].Position = pos1;
                            break;
                    }
                    temp.setTag(otag1);
                    temp2.setTag(otag2);
                    getTags();
                    return false;
                }
            }
            return true;
        }

    }

}
