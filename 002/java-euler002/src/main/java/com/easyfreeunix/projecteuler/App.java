package com.easyfreeunix.projecteuler;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        long curr = 1;
        long prev = 1;
        long sum = 0;
        long max = 4000001;
        while (curr < max) {
            long c = curr;
            if (curr % 2 == 0)
                sum += curr;
            curr = prev + c;
            prev = c;
        }
        System.out.println(String.valueOf(sum));
    }
}
