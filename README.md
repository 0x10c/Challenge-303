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
  #### Example:
  ````
  [x][y] - For last [x] and first [y] value is 1. For penultimate [x] and second [y] value is 1. For all other elements is 0
  ````
  - 012 - Multiplication table with two for loops.
  - 013 - Multiplication table with do while loop.
  - 014 - Two dimension array - print two columns (starting from position [0][0]. Multiply the first value (from first column) by yourself and print her in second column.
  - 015 - Calculate the sum of the digits of the given number.
  #### Example
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
  
  #### Example
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
  
  #### Example
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
  
  #### Example
  ````
1 1 1 1 0 
1 0 0 0 1 
1 0 0 1 1 
1 1 1 1 1 
1 1 0 0 1 
````
  - 047 - This is exactly the same exercise as 046 but now print grid (n) x (m) with 0 and 1 only.
  
  #### Example
  ````
1 0 0 0 1 1 0 
1 0 1 1 1 1 1 
1 0 1 0 0 1 1 
1 1 0 0 0 1 0 
````
  - 048 - Prime numbers between 0 and 500.
  - 049 - Simple random number generator. Generate 10 numbers from 0 - 100.
  - (...)
  - 055 - Calculate area of rectangle - User can enter a values from keyboard - Create three methods to: getting values, calculate and print result.

  #### Example
  ````java
class RectangleArea {
    private void readValues() {}
    private void calculateValues() {}
    private void printResult() {}
}
````
  - 056 - Quadratic Function calc - User can enter a values from keyboard - Create three methods to: getting values, calculate and print result.
  #### Example
  ```` java 
  class QuadraticFunction {
      private void readValues() {}
      private void calculateValues() {}
      private void printResult() {}
  }
  ```` 
  - 057 - Two dimension array - print the diagonally (start from last array index) random values. Use 
  ``` java.util.random```
  - (...)
  - 060 - [PA] - Pascal triangle
  #### Tasks from Codingbat.com
  - 061 - 
  - 080 - Password checker. Dependencies: minimum 10 characters. Only letters and minimum 3 digits values
   
   
[decimal]: <https://en.wikipedia.org/wiki/Decimal>
[binary]: <https://en.wikipedia.org/wiki/Binary_number>
[octal]: <https://en.wikipedia.org/wiki/Octal> 
[hexadecimal]: <https://en.wikipedia.org/wiki/Hexadecimal>
[FizzBuzz]: <https://en.wikipedia.org/wiki/Fizz_buzz>
[PA]: <http://www.mathsisfun.com/pascals-triangle.html>