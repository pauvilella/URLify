# URLify
Exercise related with Arrays and Strings.

## Exercise Challenge
Write a method to replace all spaces in a string with '%20'. You may assume the string has sufficient space at the end to holt the additional characters, and that you are given the "true" length of the string.

### Solution
I create another array of the total length of the input string, and I do the following:
Every time I see a character that is not a space I copy it as it is. 
When I see a space, I instead copy '%20' in the new array. I use an offset to keep track of the additional characters added to the new array. 
This approach takes O(N) runtime and O(N) of additional space. I do a tradeoff of time vs space.