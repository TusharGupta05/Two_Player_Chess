package com.example.sample;

import java.util.ArrayList;

public class Bishop {

    int Position;
    Boolean isActive = true;
    ArrayList<Integer> squaresControlled;
    public void setWhiteBishopSquaresControlled(){

        int temp = Position+11;
        squaresControlled = new ArrayList<>();
        while(MainActivity.Tags.containsKey(temp)){

            if(MainActivity.Tags.get(temp).equals("0"))
            {
                squaresControlled.add(temp);
            }
            else if(MainActivity.Tags.get(temp).charAt(0) == 'b')
            {
                squaresControlled.add(temp);
                break;
            }
            else
                break;
            temp+=11;
        }
        temp = Position-11;
        while(MainActivity.Tags.containsKey(temp)){

            if(MainActivity.Tags.get(temp).equals("0"))
            {
                squaresControlled.add(temp);
            }
            else if(MainActivity.Tags.get(temp).charAt(0) == 'b')
            {
                squaresControlled.add(temp);
                break;
            }
            else
                break;
            temp-=11;
        }
        temp = Position-9;
        while(MainActivity.Tags.containsKey(temp)){

            if(MainActivity.Tags.get(temp).equals("0"))
            {
                squaresControlled.add(temp);
            }
            else if(MainActivity.Tags.get(temp).charAt(0) == 'b')
            {
                squaresControlled.add(temp);
                break;
            }
            else
                break;
            temp-=9;
        }
        temp = Position+9;
        while(MainActivity.Tags.containsKey(temp)){

            if(MainActivity.Tags.get(temp).equals("0"))
            {
                squaresControlled.add(temp);
            }
            else if(MainActivity.Tags.get(temp).charAt(0) == 'b')
            {
                squaresControlled.add(temp);
                break;
            }
            else
                break;
            temp+=9;
        }

    }

    public void setBlackBishopSquaresControlled(){

        int temp = Position+11;
        squaresControlled = new ArrayList<>();
        while(MainActivity.Tags.containsKey(temp)){

            if(MainActivity.Tags.get(temp).equals("0"))
            {
                squaresControlled.add(temp);
            }
            else if(MainActivity.Tags.get(temp).charAt(0) != 'b')
            {
                squaresControlled.add(temp);
                break;
            }
            else
                break;
            temp+=11;
        }
        temp = Position-11;
        while(MainActivity.Tags.containsKey(temp)){

            if(MainActivity.Tags.get(temp).equals("0"))
            {
                squaresControlled.add(temp);
            }
            else if(MainActivity.Tags.get(temp).charAt(0) != 'b')
            {
                squaresControlled.add(temp);
                break;
            }
            else
                break;
            temp-=11;
        }
        temp = Position+9;
        while(MainActivity.Tags.containsKey(temp)){

            if(MainActivity.Tags.get(temp).equals("0"))
            {
                squaresControlled.add(temp);
            }
            else if(MainActivity.Tags.get(temp).charAt(0) != 'b')
            {
                squaresControlled.add(temp);
                break;
            }
            else
                break;
            temp+=9;
        }
        temp = Position-9;
        while(MainActivity.Tags.containsKey(temp)){

            if(MainActivity.Tags.get(temp).equals("0"))
            {
                squaresControlled.add(temp);
            }
            else if(MainActivity.Tags.get(temp).charAt(0) != 'b')
            {
                squaresControlled.add(temp);
                break;
            }
            else
                break;
            temp-=9;
        }

    }

}
