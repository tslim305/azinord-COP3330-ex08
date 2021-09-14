
/*
 *  UCF COP3330 Fall 2021 Exercise 8 Solution
 *  Copyright 2021 Timothy Azinord
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many people?");
        int people = scan.nextInt();

        System.out.println("How many pizzas do you have?");
        int pizza_cnt = scan.nextInt();

        System.out.println("How many slices per pizza? ");
        int slices_cnt = scan.nextInt();

        int total_slice = pizza_cnt*slices_cnt;

        System.out.println(people+ " with " +pizza_cnt+ " pizzas (" +total_slice+ " pieces of pizza)");

        int ppl_slice = total_slice / people;
        int left_slice = total_slice%people;

        System.out.println("Each person gets " +ppl_slice+  " pieces of pizza.");
        System.out.println("There are " +left_slice+ " leftover pieces.");







    }
}
