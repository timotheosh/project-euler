#!/usr/bin/env python2.7
# Euler 1 If we list all the natural numbers below 10 that are
# multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
# multiples is 23.


def checkNum(num):
    rtn = False
    if float(num) % 3.0 == 0 or float(num) % 5 == 0:
        rtn = True
    return rtn

sum = 0
for x in range(1000):
    if checkNum(x):
        sum += x
print "The sum of all multiples of 3 and 5 below 1000 is %s " % sum
