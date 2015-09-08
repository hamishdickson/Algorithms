# Mergesorts

The idea here is to combine two ordered arrays into one larger ordered one.

Doing this repeatedly leads to merge sort -> to sort an array:
 
* divide it in two
* sort the two halves (recursively)
* merge the results

Pros: Sorts in N log N
Cons: Uses extra space ~N