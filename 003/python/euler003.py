#!/usr/bin/env python2.7

from math import sqrt

def primeFactors(n):
    pf = []

    # Add the number of 2's that divide n
    while n % 2 == 0:
        pf.append(n)
        n = n/2

    # n must be odd at this point, So we can skip one element.
    i = 3
    while i <= sqrt(n):
        while (n%i == 0):
            pf.append(i)
            n = n/i
        i = i + 2

    # This condition is to handle the case when n is a prime number
    # greater than 2
    if n > 2:
        pf.append(n)

    return pf

l = primeFactors(600851475143)
print  l[len(l) -1]
