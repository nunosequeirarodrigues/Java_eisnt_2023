package Aula03;

import java.util.Arrays;

public class Aula03 {
    public static void main(String[] args) {
        System.out.println("Aula 03 >");

        Aula03 ref = new Aula03();

        ref.java_ifelse();

        ref.java_loops();

        ref.java_arrays();

        ref.java_exceptions();

        System.out.printf("Aula 03 <");
    }

    public void java_ifelse(){
/*
Insert the missing parts to complete the following "short hand if...else statement" (ternary operator):
 */
        int time = 20;
        String result =(time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

    }


    public void java_loops() {
/*
    Print j as long as j is less than 6.
*/
        int j = 1;
        while (j < 6) {
            System.out.println(j);
            j++;
        }

        String[] cars = {"Volvo", "BMW", "Ford"};

        for (String item : cars) {
            System.out.println(item);
        }

/*
       Use the do/while loop to print k as long as k is less than 6.
*/
        int k = 1;
        do {
            System.out.println(k);
            k++;
        }
        while (k < 6);

/*
    Stop the loop if i is 5.
 */
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

/*
    In the loop, when the value is "4", jump directly to the next value.
*/
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

    }

    public void java_arrays() {

        String[] cars = {"Volvo", "BMW", "Ford"};

/*
    Print the second item in the cars array.
 */
        System.out.println(cars[1]);

/*
    Change the value from "Volvo" to "Opel", in the cars array.
 */
        cars[0] = "Opel";
        System.out.println(cars[0]);

/*
    find index of an element in N elements
 */
        System.out.println("Index position of \"Opel\" is: "
                + findIndex(cars, "Opel")
        );
    }

    public void java_exceptions() {

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch
        (Exception e) {
            System.out.println("Something went wrong.");
            System.out.println(e.getMessage());
        }


        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally
        {
            System.out.println("The 'try catch' is finished.");
        }

    }


    /*
        Arrays.binarySearch
        https://www.geeksforgeeks.org/find-the-index-of-an-array-element-in-java/
    */
    int findIndex(String arr[], String find_value) {
        int index = Arrays.binarySearch(arr, find_value);
        return (index < 0) ? -1 : index;
    }

}

