#!/usr/bin/python

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


alist = [10, 20, 30]
printme(alist)
printme("hamish")
printme(fibonacci(10))
