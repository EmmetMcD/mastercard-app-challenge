# Mastercard App Challenge

## modeFinder
Finds the mode of a set of random integers. This is achieved by finding the max and min of that set (via the extremes function),  
establishing a count array (of length (max-min)), and updating that count array as the array is processed.

The mode returned is then the index (+min) of the count's max value. (It will return the lowest value mode if the original array is polymodal).

## stringReverser
Reverses strings by 2 methods: \
**reverseIterative** turns the String into a char[], and creates another char[] *reversed*, before iterating through the original and filling in *reversed* as appropriate.
(*reversed*[len] = *original*[0], etc.), before converting the char[] back into a String. \
**reverseRecursive** turns the string into a char[], and passes it to *recursiveStep*, which swaps the first and last values, and passes the middle to *recursiveStep*, etc.
This result is returned back to *stringRecursive* before being converted back into a String.
