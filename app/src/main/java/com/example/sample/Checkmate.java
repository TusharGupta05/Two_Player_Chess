package com.example.sample;

import android.content.Context;
import android.widget.Toast;

import java.util.HashMap;
import static com.example.sample.MainActivity.*;
import static com.example.sample.SquaresControl.updateSquaresControlledByBlack;
import static com.example.sample.SquaresControl.updateSquaresControlledByWhite;

public class Checkmate {
    
    public static boolean isWhiteCheckmated(){

        getTags();
        newTags = new HashMap<>(Tags);
        int saved = 0;
        WK.setWhiteKingsSquaresControlled();
        if(WQ.isActive)
            WQ.setWhiteQueenSquaresControlled();
        if(WR1.isActive)
            WR1.setWhiteRookSquaresControlled();
        if(WR2.isActive)
            WR2.setWhiteRookSquaresControlled();
        if(WN1.isActive)
            WN1.setWhiteKnightSquaresControlled();
        if(WN2.isActive)
            WN2.setWhiteKnightSquaresControlled();
        if(WB1.isActive)
            WB1.setWhiteBishopSquaresControlled();
        if(WB2.isActive)
            WB2.setWhiteBishopSquaresControlled();
        for(int i=0;i<8;i++)
            if(whitePawn[i].isActive)
                whitePawn[i].setWhitePawnsSquaresControlled();

        for(int i:WK.squaresControlled)
        {
            Tags = new HashMap<>(newTags);
            Tags.put(i,"1");
            updateSquaresControlledByBlack();
            for(int j : squaresControlledByBlack) {
                if(j == WK.Position) {
                    saved = 0;
                    break;
                }
                saved = 1;
            }
            if(saved == 1)
                return false;
        }
        if(WQ.isActive)
            for(int i:WQ.squaresControlled)
            {
                Tags = new HashMap<>(newTags);
                Tags.put(i,"2");
                updateSquaresControlledByBlack();
                for(int j : squaresControlledByBlack) {
                    if(j == WK.Position) {
                        saved = 0;
                        break;
                    }
                    saved = 1;
                }
                if(saved == 1)
                    return false;
            }
        if(WR1.isActive)
            for(int i:WR1.squaresControlled)
            {
                Tags = new HashMap<>(newTags);
                Tags.put(i,"31");
                updateSquaresControlledByWhite();
                updateSquaresControlledByBlack();
                for(int j : squaresControlledByBlack) {
                    if(j == WK.Position) {
                        saved = 0;
                        break;
                    }
                    saved = 1;
                }
                if(saved == 1)
                    return false;
            }
        if(WR2.isActive)
            for(int i:WR2.squaresControlled)
            {
                Tags = new HashMap<>(newTags);
                Tags.put(i,"32");
                updateSquaresControlledByWhite();
                updateSquaresControlledByBlack();
                for(int j : squaresControlledByBlack) {
                    if(j == WK.Position) {
                        saved = 0;
                        break;
                    }
                    saved = 1;
                }
                if(saved == 1)
                    return false;
            }
        if(WB1.isActive)
            for(int i:WB1.squaresControlled)
            {
                Tags = new HashMap<>(newTags);
                Tags.put(i,"41");
                updateSquaresControlledByWhite();
                updateSquaresControlledByBlack();
                for(int j : squaresControlledByBlack) {
                    if(j == WK.Position) {
                        saved = 0;
                        break;
                    }
                    saved = 1;
                }
                if(saved == 1)
                    return false;
            }
        if(WB2.isActive)
            for(int i:WB2.squaresControlled)
            {
                Tags = new HashMap<>(newTags);
                Tags.put(i,"42");
                updateSquaresControlledByWhite();
                updateSquaresControlledByBlack();
                for(int j : squaresControlledByBlack) {
                    if(j == WK.Position) {
                        saved = 0;
                        break;
                    }
                    saved = 1;
                }
                if(saved == 1)
                    return false;
            }
        if(WN1.isActive)
            for(int i:WN1.squaresControlled)
            {
                Tags = new HashMap<>(newTags);
                Tags.put(i,"51");
                updateSquaresControlledByWhite();
                updateSquaresControlledByBlack();
                for(int j : squaresControlledByBlack) {
                    if(j == WK.Position) {
                        saved = 0;
                        break;
                    }
                    saved = 1;
                }
                if(saved == 1)
                    return false;
            }
        if(WN2.isActive)
            for(int i:WN2.squaresControlled)
            {
                Tags = new HashMap<>(newTags);
                Tags.put(i,"52");
                updateSquaresControlledByWhite();
                updateSquaresControlledByBlack();
                for(int j : squaresControlledByBlack) {
                    if(j == WK.Position) {
                        saved = 0;
                        break;
                    }
                    saved = 1;
                }
                if(saved == 1)
                    return false;
            }
        for(int k=0;k<8;k++)
            if(whitePawn[k].isActive)
                for(int i:whitePawn[k].squaresControlled)
                {
                    Tags = new HashMap<>(newTags);
                    Tags.put(i,"6"+String.valueOf(k));
                    updateSquaresControlledByWhite();
                    updateSquaresControlledByBlack();
                    for(int j : squaresControlledByBlack) {
                        if(j == WK.Position) {
                            saved = 0;
                            break;
                        }
                        saved = 1;
                    }
                    if(saved == 1)
                        return false;
                }
        return true;
        
    }
    
    static boolean isBlackCheckmated(){

        MainActivity.getTags();
        newTags = new HashMap<>(Tags);
        int saved = 0;
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
        for(int i=0;i<8;i++)
            if(blackPawn[i].isActive)
                blackPawn[i].setBlackPawnsSquaresControlled();

        for(int i:BK.squaresControlled)
        {
            Tags = new HashMap<>(newTags);
            Tags.put(i,"b1");
            updateSquaresControlledByWhite();
            updateSquaresControlledByBlack();
            for(int j : squaresControlledByWhite) {
                if(j == BK.Position) {
                    saved = 0;
                    break;
                }
                saved = 1;
            }
            if(saved == 1)
                return false;
        }if(BQ.isActive)
            for(int i:BQ.squaresControlled)
            {
                Tags = new HashMap<>(newTags);
                Tags.put(i,"b2");
                updateSquaresControlledByWhite();
                updateSquaresControlledByBlack();
                for(int j : squaresControlledByWhite) {
                    if(j == BK.Position) {
                        saved = 0;
                        break;
                    }
                    saved = 1;
                }
                if(saved == 1)
                    return false;
            }
        if(BR1.isActive)
            for(int i:BR1.squaresControlled)
            {
                Tags = new HashMap<>(newTags);
                Tags.put(i,"b31");
                updateSquaresControlledByWhite();
                updateSquaresControlledByBlack();
                for(int j : squaresControlledByWhite) {
                    if(j == BK.Position) {
                        saved = 0;
                        break;
                    }
                    saved = 1;
                }
                if(saved == 1)
                    return false;
            }
        if(BR2.isActive)
            for(int i:BR2.squaresControlled)
            {
                Tags = new HashMap<>(newTags);
                Tags.put(i,"b32");
                updateSquaresControlledByWhite();
                updateSquaresControlledByBlack();
                for(int j : squaresControlledByWhite) {
                    if(j == BK.Position) {
                        saved = 0;
                        break;
                    }
                    saved = 1;
                }
                if(saved == 1)
                    return false;
            }
        if(BB1.isActive)
            for(int i:BB1.squaresControlled)
            {
                Tags = new HashMap<>(newTags);
                Tags.put(i,"b41");
                updateSquaresControlledByWhite();
                updateSquaresControlledByBlack();
                for(int j : squaresControlledByWhite) {
                    if(j == BK.Position) {
                        saved = 0;
                        break;
                    }
                    saved = 1;
                }
                if(saved == 1)
                    return false;
            }
        if(BB2.isActive)
            for(int i:BB2.squaresControlled)
            {
                Tags = new HashMap<>(newTags);
                Tags.put(i,"b42");
                updateSquaresControlledByWhite();
                updateSquaresControlledByBlack();
                for(int j : squaresControlledByWhite) {
                    if(j == BK.Position) {
                        saved = 0;
                        break;
                    }
                    saved = 1;
                }
                if(saved == 1)
                    return false;
            }
        if(BN1.isActive)
            for(int i:BN1.squaresControlled)
            {
                Tags = new HashMap<>(newTags);
                Tags.put(i,"b51");
                updateSquaresControlledByWhite();
                updateSquaresControlledByBlack();
                for(int j : squaresControlledByWhite) {
                    if(j == BK.Position) {
                        saved = 0;
                        break;
                    }
                    saved = 1;
                }
                if(saved == 1)
                    return false;
            }
        if(BN2.isActive)
            for(int i:BN2.squaresControlled)
            {
                Tags = new HashMap<>(newTags);
                Tags.put(i,"b52");
                updateSquaresControlledByWhite();
                updateSquaresControlledByBlack();
                for(int j : squaresControlledByWhite) {
                    if(j == BK.Position) {
                        saved = 0;
                        break;
                    }
                    saved = 1;
                }
                if(saved == 1)
                    return false;
            }
        for(int k=0;k<8;k++)
            if(blackPawn[k].isActive)
                for(int i:blackPawn[k].squaresControlled)
                {
                    Tags = new HashMap<>(newTags);
                    Tags.put(i,"b6"+String.valueOf(k));
                    System.out.println("b6"+String.valueOf(k));
                    updateSquaresControlledByWhite();
                    updateSquaresControlledByBlack();
                    for(int j : squaresControlledByWhite) {
                        if(j == BK.Position) {
                            saved = 0;
                            break;
                        }
                        saved = 1;
                    }
                    if(saved == 1)
                        return false;
                }
        return true;
        
    }
    
}
