#!/usr/bin/python

def gcd(p, q):
    """greatest common divisor"""
    if q == 0:
        return p
    else:
        r = p % q
        return gcd(q, r)


print gcd(9, 12 )
