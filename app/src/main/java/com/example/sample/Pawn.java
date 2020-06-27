package com.example.sample;

import java.util.ArrayList;

public class Pawn {

    int Position;
    Boolean isActive = true;
    String id = "6",id1="b6";
    ArrayList<Integer> squaresControlled;
    public void setWhitePawnsSquaresControlled(){

        if(id.equals("6")) {
            int temp = Position;
            squaresControlled = new ArrayList<>();
            if (MainActivity.Tags.containsKey(temp + 1)) {
                if (MainActivity.Tags.get(temp + 1).equals("0")) {
                    squaresControlled.add(temp + 1);
                    if (MainActivity.Tags.containsKey(temp + 2) && MainActivity.Tags.get(temp + 2).equals("0"))
                        squaresControlled.add(temp + 2);
                }
            }
            if (MainActivity.Tags.containsKey(temp + 11)) {
                if (MainActivity.Tags.get(temp + 11).charAt(0)=='b')
                    squaresControlled.add(temp + 11);
            }
            if (MainActivity.Tags.containsKey(temp - 9)) {
                if (MainActivity.Tags.get(temp - 9).charAt(0)=='b')
                    squaresControlled.add(temp - 9);
            }
        }
        else if(id.equals("2")){
            int temp = Position+1;
            squaresControlled = new ArrayList<>();
            while(MainActivity.Tags.containsKey(temp)){

                if(MainActivity.Tags.get(temp).equals("0"))
                {
                    squaresControlled.add(temp);
                }
                else if(MainActivity.Tags.get(temp).charAt(0)=='b')
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
                else if(MainActivity.Tags.get(temp).charAt(0)=='b')
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
            temp = Position+11;
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
        else if(id.equals("3"))
        {
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
        else if(id.equals("4")){
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
        else if(id.equals("5")){
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
    }
    public void setBlackPawnsSquaresControlled(){

        if(id1.equals("b6"))
        {
            int temp = Position;
            squaresControlled = new ArrayList<>();
            if(MainActivity.Tags.containsKey(temp-1))
            {
                if(MainActivity.Tags.get(temp-1).equals("0"))
                {
                    squaresControlled.add(temp-1);
                    if(MainActivity.Tags.containsKey(temp-2) && MainActivity.Tags.get(temp-2).equals("0"))
                        squaresControlled.add(temp-2);
                }
            }
            if(MainActivity.Tags.containsKey(temp+9))
            {
                if(MainActivity.Tags.get(temp+9).charAt(0) != 'b' && !MainActivity.Tags.get(temp+9).equals("0"))
                    squaresControlled.add(temp+9);
            }
            if(MainActivity.Tags.containsKey(temp-11))
            {
                if(MainActivity.Tags.get(temp-11).charAt(0) != 'b' && !MainActivity.Tags.get(temp-11).equals("0"))
                    squaresControlled.add(temp-11);
            }
        }
        else if(id1.equals("b2"))
        {
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
            temp = Position+11;
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
        else if(id1.equals("b3"))
        {
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
        else if(id1.equals("4"))
        {
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
        else if(id1.equals("b5"))
        {
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

}
