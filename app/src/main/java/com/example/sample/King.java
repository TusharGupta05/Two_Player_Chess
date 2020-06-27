package com.example.sample;

import java.util.ArrayList;

public class King {

    int Position;
    ArrayList<Integer> squaresControlled;
    public void setWhiteKingsSquaresControlled(){

        squaresControlled = new ArrayList<>();

        int temp = Position;
        if(MainActivity.Tags.containsKey(temp-11))
        {
            if(MainActivity.Tags.get(temp-11).charAt(0) == 'b' || MainActivity.Tags.get(temp-11).charAt(0) == '0')
                squaresControlled.add(temp-11);
        }
        if(MainActivity.Tags.containsKey(temp-1))
        {
            if(MainActivity.Tags.get(temp-1).charAt(0) == 'b' ||  MainActivity.Tags.get(temp-1).charAt(0) == '0')
                squaresControlled.add(temp-1);
        }
        if(MainActivity.Tags.containsKey(temp+11))
        {
            if(MainActivity.Tags.get(temp+11).charAt(0) == 'b' ||  MainActivity.Tags.get(temp+11).charAt(0) == '0')
                squaresControlled.add(temp+11);
        }
        if(MainActivity.Tags.containsKey(temp-10))
        {
            if(MainActivity.Tags.get(temp-10).charAt(0) == 'b' ||  MainActivity.Tags.get(temp-10).charAt(0) == '0')
                squaresControlled.add(temp-10);
        }
        if(MainActivity.Tags.containsKey(temp-9))
        {
            if(MainActivity.Tags.get(temp-9).charAt(0) == 'b' ||  MainActivity.Tags.get(temp-9).charAt(0) == '0')
                squaresControlled.add(temp-9);
        }
        if(MainActivity.Tags.containsKey(temp+1))
        {
            if(MainActivity.Tags.get(temp+1).charAt(0) == 'b' ||  MainActivity.Tags.get(temp+1).charAt(0) == '0')
                squaresControlled.add(temp+1);
        }
        if(MainActivity.Tags.containsKey(temp+10))
        {
            if(MainActivity.Tags.get(temp+10).charAt(0) == 'b' ||  MainActivity.Tags.get(temp+10).charAt(0) == '0')
                squaresControlled.add(temp+10);
        }
        if(MainActivity.Tags.containsKey(temp+9))
        {
            if(MainActivity.Tags.get(temp+9).charAt(0) == 'b' ||  MainActivity.Tags.get(temp+9).charAt(0) == '0')
                squaresControlled.add(temp+9);
        }

    }
    public void setBlackKingsSquaresControlled(){

        squaresControlled = new ArrayList<>();

        int temp = Position;
        if(MainActivity.Tags.containsKey(temp-11))
        {
            if(MainActivity.Tags.get(temp-11).charAt(0) != 'b')
                squaresControlled.add(temp-11);
        }
        if(MainActivity.Tags.containsKey(temp-1))
        {
            if(MainActivity.Tags.get(temp-1).charAt(0) != 'b')
                squaresControlled.add(temp-1);
        }
        if(MainActivity.Tags.containsKey(temp+11))
        {
            if(MainActivity.Tags.get(temp+11).charAt(0) != 'b')
                squaresControlled.add(temp+11);
        }
        if(MainActivity.Tags.containsKey(temp-10))
        {
            if(MainActivity.Tags.get(temp-10).charAt(0) != 'b')
                squaresControlled.add(temp-10);
        }
        if(MainActivity.Tags.containsKey(temp-9))
        {
            if(MainActivity.Tags.get(temp-9).charAt(0) != 'b')
                squaresControlled.add(temp-9);
        }
        if(MainActivity.Tags.containsKey(temp+1))
        {
            if(MainActivity.Tags.get(temp+1).charAt(0) != 'b')
                squaresControlled.add(temp+1);
        }
        if(MainActivity.Tags.containsKey(temp+10))
        {
            if(MainActivity.Tags.get(temp+10).charAt(0) != 'b')
                squaresControlled.add(temp+10);
        }
        if(MainActivity.Tags.containsKey(temp+9))
        {
            if(MainActivity.Tags.get(temp+9).charAt(0) != 'b')
                squaresControlled.add(temp+9);
        }
    }


}
