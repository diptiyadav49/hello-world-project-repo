package com.sapient.asde.ui;

/**
 * @author dip
 * @version 1.0
 *
 *
 */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //System.out.println("Hi, " + args[0]);

        int sum = 0;
        double avg = 0;
        for(int i=0;i<args.length;i++){
            sum += Integer.parseInt(args[i]);
        }
        avg = (double)sum/args.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
