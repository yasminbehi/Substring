package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String text = "";
        Scanner input = new Scanner(System.in);
        System.out.println("The lenght of my word is" + text.length());
        System.out.println("Until  which part of the sentence would you like to print?");
        int indexNum = input.nextInt();
        input.nextLine();
        //input validation loop
        boolean loopValidate = true;
        while (loopValidate) {
            //exit condition

            if (indexNum <text.length()) {
                loopValidate = false;
                System.out.println("good input");
                System.out.println("word from indexNum 0 to specified indexNum of" + indexNum + "is" + text.substring(0, indexNum));
            }
            else{
                System.out.println("Index is beyond my limit! Enter a valid indexNum number");
                indexNum = input.nextInt();
            }
            //test print statements for word :-word (computer)
            System.out.println(text.substring(0));
            // prints text starting from index 0 until index number specified :- comp
            System.out.println(text.substring(0,indexNum));
            //prints text starting from index number untill text.length :- uter
            System.out.println(text.substring(indexNum));
            }
            }


        }
