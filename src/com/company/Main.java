package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);

            int oneDigit = 0, twoDigit = 0, threeDigit = 0, moreDigit = 0;
            String inserted;

            System.out.print("Insert a number: ");
            inserted = sc.nextLine();

            while (!inserted.equals("end")) {
                int number = Integer.parseInt(inserted);

                if (number != 0) {
                    if (number / 10 == 0)
                    {
                        oneDigit++;
                    }
                    else if (number / 100 == 0)
                    {
                        twoDigit++;
                    }
                    else if (number / 1000 == 0)
                    {
                        threeDigit++;
                    }
                    else {
                        moreDigit++;
                    }
                }
                inserted = sc.nextLine();
            }
            System.out.println("One: " + oneDigit + " Two: " + twoDigit + " Three: " + threeDigit + " Four or More: " + moreDigit);
    }
}


