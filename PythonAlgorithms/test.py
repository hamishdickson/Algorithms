#!/usr/bin/python

import math

# sod it: c=e=1
c = 1

# some comment
def printme(str):
    """This prints a passed string"""
    print str
    return


def fibonacci(n):
    """find the nth fib number"""
    if n == 1 or n == 2:
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)


# this is a first attempt
def _gamma(v):
    return 1 / (1 - math.sqrt(v))


def space_component(x, t, v):
    """A boost in the x-dir only"""
    return _gamma(v) * (x - v*t)


def time_component(x, t, v):
    """The time component"""
    return _gamma(v) * (t - v*x)



alist = [10, 20, 30]
printme(alist)
printme("hamish")
printme(fibonacci(10))

print space_component(1, 1, 0.34)
print time_component(1, 1, 0.34)
