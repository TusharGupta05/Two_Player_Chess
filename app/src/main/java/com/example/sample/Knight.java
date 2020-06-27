package com.example.sample;

import java.util.ArrayList;

public class Knight {

    int Position;
    Boolean isActive = true;
    ArrayList<Integer> squaresControlled;
    public void setWhiteKnightSquaresControlled(){

        squaresControlled = new ArrayList<>();
        int temp = Position;
        if(MainActivity.Tags.containsKey(temp+12)){

            if(MainActivity.Tags.get(temp+12).charAt(0) == 'b'|| MainActivity.Tags.get(temp+12).equals("0"))
                squaresControlled.add(temp+12);

        }
        if(MainActivity.Tags.containsKey(temp-8)){

            if(MainActivity.Tags.get(temp-8).charAt(0) == 'b'|| MainActivity.Tags.get(temp-8).equals("0"))
                squaresControlled.add(temp-8);

        }
        if(MainActivity.Tags.containsKey(temp+21)){

            if(MainActivity.Tags.get(temp+21).charAt(0) == 'b'|| MainActivity.Tags.get(temp+21).equals("0"))
                squaresControlled.add(temp+21);

        }
        if(MainActivity.Tags.containsKey(temp+19)){

            if(MainActivity.Tags.get(temp+19).charAt(0) == 'b'|| MainActivity.Tags.get(temp+19).equals("0"))
                squaresControlled.add(temp+19);

        }
        if(MainActivity.Tags.containsKey(temp+8)){

            if(MainActivity.Tags.get(temp+8).charAt(0) == 'b'|| MainActivity.Tags.get(temp+8).equals("0"))
                squaresControlled.add(temp+8);

        }
        if(MainActivity.Tags.containsKey(temp-12)){

            if(MainActivity.Tags.get(temp-12).charAt(0) == 'b'|| MainActivity.Tags.get(temp-12).equals("0"))
                squaresControlled.add(temp-12);

        }
        if(MainActivity.Tags.containsKey(temp-19)){

            if(MainActivity.Tags.get(temp-19).charAt(0) == 'b'|| MainActivity.Tags.get(temp-19).equals("0"))
                squaresControlled.add(temp-19);

        }
        if(MainActivity.Tags.containsKey(temp-21)){

            if(MainActivity.Tags.get(temp-21).charAt(0) == 'b'|| MainActivity.Tags.get(temp-21).equals("0"))
                squaresControlled.add(temp-21);

        }

    }
    public void setBlackKnightSquaresControlled(){

        squaresControlled = new ArrayList<>();
        int temp = Position;
        if(MainActivity.Tags.containsKey(temp+12)){

            if(MainActivity.Tags.get(temp+12).charAt(0) != 'b')
                squaresControlled.add(temp+12);

        }
        if(MainActivity.Tags.containsKey(temp-8)){

            if(MainActivity.Tags.get(temp-8).charAt(0) != 'b')
                squaresControlled.add(temp-8);

        }
        if(MainActivity.Tags.containsKey(temp+21)){

            if(MainActivity.Tags.get(temp+21).charAt(0) != 'b')
                squaresControlled.add(temp+21);

        }
        if(MainActivity.Tags.containsKey(temp+19)){

            if(MainActivity.Tags.get(temp+19).charAt(0) != 'b')
                squaresControlled.add(temp+19);

        }
        if(MainActivity.Tags.containsKey(temp+8)){

            if(MainActivity.Tags.get(temp+8).charAt(0) != 'b')
                squaresControlled.add(temp+8);

        }
        if(MainActivity.Tags.containsKey(temp-12)){

            if(MainActivity.Tags.get(temp-12).charAt(0) != 'b')
                squaresControlled.add(temp-12);

        }
        if(MainActivity.Tags.containsKey(temp-19)){

            if(MainActivity.Tags.get(temp-19).charAt(0) != 'b')
                squaresControlled.add(temp-19);

        }
        if(MainActivity.Tags.containsKey(temp-21)){

            if(MainActivity.Tags.get(temp-21).charAt(0) != 'b')
                squaresControlled.add(temp-21);

        }

    }

}
