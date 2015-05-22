#!/usr/bin/python

import math

# sod it: c=e=1
c = 1

# some comment
def printme(str):
    "This prints a passed string"
    print str
    return


def fibonacci(n):
    "find the nth fib number"
    if n == 1 or n == 2:
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)


# this is a first attempt
def oneDimLorentzTransformation(x, t, v):
    """A boost in the x-dir only"""
    beta = v / c
    gamma = 1 / (1 - math.sqrt(beta))
    return gamma * ( x - v*t)


alist = [10, 20, 30]
printme(alist)
printme("hamish")
printme(fibonacci(10))
print oneDimLorentzTransformation(1, 1, 0.34)
