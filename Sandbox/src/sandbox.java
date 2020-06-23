/*
 * hackerrank link: https://www.hackerrank.com/contests/cst370-su20-hw0/challenges/370-hw0-1/submissions/code/1323055201
 * Title: hw0_1.java
 * Abstract: This program reads the user's input data and conducts sum and difference operations, depending on the command key
 * Name: Roger Terrill
 * ID: 1337
 * Date: 4/24/2020
 */

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class sandbox
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Create single array holding all other arrays
        ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < 3; i++)
        {
            // Push in new arrays
            aList.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < 3; i++)
        {
            // For whatever "from", add the "to" to it
            aList.get(input.nextInt()).add(input.nextInt());
        }

        for(int i = 0; i < 3; i++)
        {
            // Sort each subarray
            Collections.sort(aList.get(i));

            // Print out the first num
            System.out.print(i);

            // CHeck the size of the subarray for the length
            for(int j = 0; j < aList.get(i).size();j++)
            {
                if(aList.get(i).size() > 0)
                {
                    System.out.print("->");
                }
                System.out.print(aList.get(i).get(j));
            }
            System.out.println();
        }
    }
}
