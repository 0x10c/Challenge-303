# About 'Challenge-303'
'Challenge-303' is a personal project of 303 different mini projects. Originally in Java but you can feel free to rewrite to any language as you want.

## Structure
* Each topic is in a separate folder. The folder number corresponds to the topic nubmer. For example: 
```
The folder named '3' contains a theme project with the number '3'.
```
* Folder with number of project contain a package with challenge name. For example:
```
Folder named '3' contains a package named Challenge3
```
* Each package contains files for one exercise. 

## Challenge-303 list:

  - 000 - Calculate area of rectangle - User can enter a values from keyboard.
  - 001 - Mod division of two values- User can enter a values from keyboard.
  - 002 - A+B - Sum of two integers. Example input: 5 5 Output: 10.
  - 003 - "Guess the number" - Generate numbers from 0 to 100.
  - 004 - Using for loop, while and do while calculate y = 9x for 10 values starting from 0.
  - 005 - Using for loop, while and do while - print numbers from 0 to 50. In while loop put sum of numbers from this loop.
  - 006 - Generate 5 random values. Print minimum and maximum value. Calculate sum of generated numbers.
  - 007 - Multiplication table in the range of 10,000 (100x100).
  - 008 - Create array with 10 elements. Put value 9 for array index 0. Value 8 for index 1, value 7 for index 2 etc.
  - 009 - Create two dimmension array - 10x10. For [0][0] the value is 1. For [1][1] the value is 1. For [2][2] the value is 1 etc.
  - 010 - Two dimension array - print the diagonally (start from first array index 0) numbers from 0 to 10. For [0][0] the value is 1. For [1][2] the value is 2 etc.
  - 011 - Two dimension array - print the diagonally (start from last array index) numbers from 0 to 10.
  ##### Example:
  ````
  [x][y] - For last [x] and first [y] value is 1. For penultimate [x] and second [y] value is 1. For all other elements is 0
  ````
  - 012 - Multiplication table with two for loops.
  - 013 - Multiplication table with do while loop.
  - 014 - Two dimension array - print two columns (starting from position [0][0]. Multiply the first value (from first column) by yourself and print her in second column.
  - 015 - Calculate the sum of the digits of the given number.
  ##### Example
  ```` For 30 sum is 3. For 75 sum is 12. For 129 sum is 12 (..)````
  - 016 - Converter [decimal] to [binary]. User can enter a values from keyboard.
  - 017 - Converter [decimal] to [hexadecimal]. User can enter a values from keyboard.
  - 018 - Converter [decimal] to [octal]. User can enter a values from keyboard.
  - 019 - Converter [binary] to [octal]. User can enter a values from keyboard.
  - 020 - Enter two numbers (int). Compare them by displaying: 
            ````
          " > " if a is greater than b.
          " < " If a is less than b.
          " = " If both values are equal.
          ````
  - 021 - Enter two numbers (Integer) and compare them - like as in 020.
  - 022 - Create three loops. In the first loop display numbers from 0 to 100 divided only by 3. In the second loop divided only by 5 and in third loop divided only by 3 and 5.
  - 023 - Create boolean method ````ex. result```` which checks if the sum of a and b (entered from the keyboard) is equal to c (entered from the keyboard). Return true if it's and false if it's not.
  - 024 - Create array with random values. Check two conditions. 
       - First condition: if first and last elements are equals 10 return true. If first or last elment isn't equals to 10 = false.
       - Second codition: first or last elements must be equals to 10 then return true. If first and last elements are not eqials to 10 return false.
  - 025 - Create two arays with random (int) elements. Create method which returns one random int from these two arrays.
  - 026 - Get the largest value between first and last element of an array of numbers (int).
  - 027 - Measure the time taken to generate 10 numbers (0 - 10)
  - 028 - Put to array some numbers. Read value from user and check if it's in array.
  - 029 - Compare the enteredvalue (1 to 7) by day of the week. If you put 1 on input on the output print: Monday. For 3 - Wednesday, 4 - Thursday (...). Remember about 0 and values greater than 7.
  - 030 - [FizzBuzz]
  - 031 - Check if the year is a leap year. Year 2016 is a leap year but 2011 isn't.
  - 032 - Print 10x10 grid. For getting this pattern use ````System.out.printf("%1dX")````.
  
  ##### Example
  ````
  0X0X0X0X0X0X0X0X0X0X
  0X0X0X0X0X0X0X0X0X0X
  0X0X0X0X0X0X0X0X0X0X
  0X0X0X0X0X0X0X0X0X0X
  0X0X0X0X0X0X0X0X0X0X
  0X0X0X0X0X0X0X0X0X0X
  0X0X0X0X0X0X0X0X0X0X
  0X0X0X0X0X0X0X0X0X0X
  0X0X0X0X0X0X0X0X0X0X
  0X0X0X0X0X0X0X0X0X0X
  ````
  - 033 Print 10x10 grid. For getting this pattern use ````System.out.printf("%1dX")````.
  
  ##### Example
  ````
0X000000000X
00X0000000X0
000X00000X00
0000X000X000
00000X0X0000
00000X0X0000
0000X000X000
000X00000X00
00X0000000X0
0X000000000X
````
  - 034 - Convert array to ArrayList
  - 035 - Check if first array(int) is equals to second array(int). Arrays are the same when they have the same elements.
  - 036 - Find largest element in array(int).
  - 037 - Get minimum and maximu value from array(int).
  - 038 - Display year, month, day of the week, hour, minutes and seconds.
  - 039 - Get current date and time in New York, Moscow and Ho Chi Minh.
  - 040 - Get name of the first and last day of current month.
  - 041 - Get a difference between today and random date.
  - 042 - Print date for 15 days from today. And 15 days ago starting from today.
  - 043 - Convert String to date.
  - 044 - Display the number of vowels in the String. User can enter String from keyboard.
  - 045 - Count and display all words in the input String.
  - 046 - Take numeric value (n) and (m) from user and print grid (n) x (n) with 0 and 1 only.
  
  ##### Example
  ````
1 1 1 1 0 
1 0 0 0 1 
1 0 0 1 1 
1 1 1 1 1 
1 1 0 0 1 
````
  - 047 - This is exactly the same exercise as 046 but now print grid (n) x (m) with 0 and 1 only.
  
  ##### Example
  ````
1 0 0 0 1 1 0 
1 0 1 1 1 1 1 
1 0 1 0 0 1 1 
1 1 0 0 0 1 0 
````
  - 048 - Prime numbers between 0 and 500.
  - 049 - Simple random number generator. Generate 10 numbers from 0 - 100.
  - 050 - Compare two (hardcoded) dates.
  - 051 - Count the occurrences of the values in the array.
  - 052 - 
  - 053 - 
  - 054 - 
  - 055 - Calculate area of rectangle - User can enter a values from keyboard - Create three methods to: getting values, calculate and print result.

  ##### Example
  ````java
class RectangleArea {
    private void readValues() {}
    private void calculateValues() {}
    private void printResult() {}
}
````
  - 056 - Quadratic Function calc - User can enter a values from keyboard - Create three methods to: getting values, calculate and print result.
  ##### Example
  ```` java 
  class QuadraticFunction {
      private void readValues() {}
      private void calculateValues() {}
      private void printResult() {}
  }
  ```` 
  - 057 - Two dimension array - print the diagonally (start from last array index) random values. Use 
  ``` java.util.random```
  - 058 -
  - 059 - Generate a random number value between two entered values.
 ##### Example
  ````
  Starting value: 10
  Ending value: 50
  Random number between these two values: 23
  ````
  - 060 - [PA] - Pascal triangle
  - 061 - List files from any directory.
  - 062 - List files with some extension from any directory.
  - 063 - Check  if file or directory exist in specified location.
  - 064 - Get last modified time of a file.
  - 065 - Get filesize in bytes, kilobytes and megabytes.
  - 066 - Read content from txt file and print in console.
  - 067 - Read txt file line by line.
  - 068 - Add text to existing file.
  - 069 - Read content from file and write to array.
  - {...)
  - 080 - Password checker. Dependencies: minimum 10 characters. Only letters and minimum 3 digits values.
  - (...)
  ##### ArrayList
  - 100 - Create ArrayList, add some elements and print them.
  - 101 - Create ArrayList, iterate all elements of array list and print them.
  - 102 - Add and remove some element from ArrayList, sort and print (before and after sorting).
  - 103 - Check if element exists on the list.
  - 104 - Copy ArrayList to other ArrayList.
  - 105 - Reverse ArrayList elements.
  - 106 - Shuffle elements in ArrayList.
  - 107 - Extract some elements from ArrayList.
  - 108 - Compare two ArrayLists.
  - 109 - Clone one ArrayList to another ArrayList.
  - 110 - Join two ArrayLists.
  - 111 - Check if ArrayList is empty.
  - 112 - Add new element on the specified position to ArrayList.
  - 113 - Replace some element on ArrayList with other (new) element.
 ##### LinkedList
  - 114 - Create LinkedList, add some elements and print them.
  - 115 - Create LinkedList, iterate all elements of array list and print them.
  - 116 - Reverse LinkedList.
  - 117 - Add element to the LinkedList on the first, last and some random position.
  - 118 - Get first, last and some random element from LinkedList.
  - 119 - Display positions and elements from LinkedList.
  - 120 - Remove first, last and random value from LinkedList.
  - 121 - Swap two elements on LinkedList.
  - 122 - Shuffle all elements from LinkedList.
  - 123 - Clone LinkedList to other.
  - 124 - Retrieve first and last element of LinkedList.
  - 125 - Check if the given item is on the list LinkedList.
  - 126 - Convert LinkedList to ArrayList.
  - 127 - Compare two LinkedList.
  - 128 - Check if LinkedList is empty.
  - 129 - Replace element on LinkedList.
  ##### HashSet
  - 130 - Create HashSet, add some elements and print them.
  - 131 - Create HashSet, iterate all elements of array list and print them.
  - 132 - Get the number of elements from HashSet.
  - 133 - Create method to check is HashSet is empty. If it's not empty - print values. and number of elements (size).
  - 134 - Clone HashSet to another.
  - 135 - Display the same elements from two HashSets.
  - 136 - Convert HashSet to array.
  - 137 - Compare two HashSet.
  - 138 - Convert HashSet to ArrayList.
  - 139 - List all common elements from two HashSets.
  - 140 - Remove all elements from HashSet and check if it's empty.
  ##### TreeSet
  - 141 - Create TreeSet, add some elements and print them.
  - 142 - Iterate all elements of TreeSet list and print them
  - 143 - Get the number of elements from TreeSet.
  - 144 - Move all elements from one TreeSet to other and print all them.
  - 145 - Reverse elements in TreeSet.
  - 146 - Get first and last element from TreeSet.
  - 147 - Clone all one TreeSet to another.
  - 148 - Compare elements from two TreeSets
  - 149 - Create Integer TreeSet with values from 1 to 10. Print values less than 5 (without 5).
  - 150 - Remove first and last element in TreeSet.
  ##### HashMap
  - 151 - Create HashMap, add values and keys, iterate all elements and print them.
  - 152 - Count elements in HashMap.
  - 153 - Copy all elements from one HashMap to another (new) Map.
  - 154 - Clone HashMap.
  - 155 - Check if HashMap contains specified key.
  - 156 - Check if HashMap contains specified value.
  - 157 - Get the values of  keys and get a set of values contained in map.
  ##### TreeMap
  - 158 - Create TreeMap, add some elements and print them.
  - 159 - Get a specified key and value from TreeMap.
  - 160 - Put all elements from one TreeMap to other.
  - 161 - Get all keys from TreeMap.
  - 162 - Sort by key values from highest to lowest.
  - 163 - Sort by value.
  - 164 - Get lowest and highest key value.
  - 165 - Get the greatest key less than or equal to the given key.
  - 166 - Print values with keys less than a given key value.
  - 167 - Return null if given key is not in TreeMap.
  - 168 - Get the next (bigger) key after the given from TreeMap.
  - 169 - Print values within the given keys Example: From 2 to 4.
  ##### PriorityQueue
  - 170 - Create PriorityQueue, add some elements and print them.
  - 171 - Iterate all elements in priority queue and print them all.
  - 172 - Create two priority queues and add all elements from first queue to second.
  - 173 - Insert element to queue.
  - 174 - Count elements in queue.
  - 175 - Compare elements in two priority queues.
  - 176 - Print head element from first list. Remove head element from second list and print before and after.
  - 177 - Convert priority queue to array list.
  - 178 - 
  - 179 - 
 


[decimal]: <https://en.wikipedia.org/wiki/Decimal>
[binary]: <https://en.wikipedia.org/wiki/Binary_number>
[octal]: <https://en.wikipedia.org/wiki/Octal> 
[hexadecimal]: <https://en.wikipedia.org/wiki/Hexadecimal>
[FizzBuzz]: <https://en.wikipedia.org/wiki/Fizz_buzz>
[PA]: <http://www.mathsisfun.com/pascals-triangle.html>