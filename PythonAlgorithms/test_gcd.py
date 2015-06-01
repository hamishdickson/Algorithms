#!/usr/bin/python

import gcd

def test_gcd():
    """test greatest common divisor"""
    assert gcd(1, 1) == 1
    assert gcd(9, 12) == 3
    assert gcd(12, 9) == 3

