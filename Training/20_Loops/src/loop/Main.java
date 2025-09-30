package loop;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a + 5; //a -> 6 (new value), ++a -> 6 => 11

        a = 5;
        int c = a++ + 5; //a -> 6 (new value), a++ -> 5 => 10

        int d = c - b; //c -> 10, b -> 11, 10 - 11 => -1

        int MAX_NUMBER = 9_999;
        for (int i = 1; i < MAX_NUMBER; ++i) {
            if (i > 400 && i % 9 == 0) {
                System.out.println(i);
                //break;
                i = MAX_NUMBER * 2;
            }
            //++i; //i -> 2, ++i -> 2
        }

        int i = 1;
        while (i < MAX_NUMBER) {
            if (i > 400 && i % 9 == 0) {
                System.out.println(i);
                break;
            }
            ++i;
        }

        //Implement a loop that runs from 1 to 9999. Stop at the 10th number that is divisible by 9
        //and greater than 400.

        List<Integer> hits = new ArrayList<>(); //index -> ArrayList //PriorityQueue
        for (int j = 1; j < MAX_NUMBER; ++j) {
            if (j > 400 && j % 9 == 0) {
                hits.add(j);
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(hits.get(0));
        System.out.println(hits.get(9));


        System.out.println();
        System.out.println();
        System.out.println();
        int nrOfHits = 0;
        for (int j = 1; j < MAX_NUMBER; ++j) {
            if (j > 400 && j % 9 == 0 && nrOfHits < 10) {
                ++nrOfHits;
            }

            if (nrOfHits == 10) {
                System.out.println(j);
                break;
            }
        }


        int index = 0;
        int[] numbers = new int[MAX_NUMBER];
        for (int j = 1; j < MAX_NUMBER; ++j) {
            if (j > 400 && j % 9 == 0) {
                numbers[index] = j; //numbers[0] = 486 //numbers[index++] = j; !!
                index++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);

    }
}