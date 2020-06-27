package com.example.sample;

import java.util.ArrayList;

public class Rook {

    int Position;
    Boolean isActive = true;
    ArrayList<Integer> squaresControlled;
    public void setWhiteRookSquaresControlled(){

        int temp = Position+1;
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
            temp++;
        }
        temp = Position-1;
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
            temp--;
        }
        temp = Position+10;
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
            temp+=10;
        }
        temp = Position-10;
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
            temp-=10;
        }

    }
    public void setBlackRookSquaresControlled(){

        int temp = Position+1;
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
            temp++;
        }
        temp = Position-1;
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
            temp--;
        }
        temp = Position+10;
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
            temp+=10;
        }
        temp = Position-10;
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
            temp-=10;
        }

    }

}
