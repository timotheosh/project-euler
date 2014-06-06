package com.easyfreeunix.projecteuler;
import java.util.ArrayList;
import java.util.List;
/**
 * Hello world!
 *
 */
public class App 
{

    public static List<Long> primeFactors(Long n) {
        List<Long> rtn = new ArrayList<Long>();

        // Step 1. Find the divisors of 2 for n
        while (n%2 == 0) {
            rtn.add(n);
            n = n/2;
        }

        // Step 2. n must be odd at this point. So we can skip one element (Note i = i + 2)
        for(int i = 3; i <= Math.sqrt(n); i = i + 2) {
            while(n%i == 0) {
                rtn.add(n);
                n = n/i;
            }
        }

        // Step 3. This condition is to handle the case when n is a prime number.
        if (n > 2) {
            rtn.add(n);
        }

        return rtn;
    }
    
    public static void main( String[] args )
    {
        List<Long> pf = new ArrayList<Long>();
        Long v = 600851475143L;
        pf = primeFactors(v);
        System.out.println( String.format("%d", pf.get(pf.size() - 1) ));
    }
}
