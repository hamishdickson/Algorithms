def gcd(p, q):
    """greatest common divisor"""
    if q == 0:
        return p
    else:
        r = p % q
        return gcd(q, r)
