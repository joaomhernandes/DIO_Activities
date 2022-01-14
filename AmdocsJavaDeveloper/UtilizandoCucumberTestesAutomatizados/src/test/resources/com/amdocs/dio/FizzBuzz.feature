#Author: https://github.com/joaomhernandes
#Keywords Summary :
#Feature: FizzBuzz A Number and FizzBuzz Sequence
#Scenario Outline: FizzBuzz A Number
#Given: the user wnat to FizzBuzz the number <Number>
#When: the user clicked the FizzBuzz button
#Then: the program prints <Result>
#Examples:
#    | Number  | Result 		|
#    | 2			 | 2					|
#    | 3			 | Fizz				|
#    | 6			 | Fizz				|
#    | 5			 | Buzz				|
#    | 10		   | Buzz				|
#    | 15		   | FizzBuzz		| 
#Scenario: FizzBuzz sequence
#Given: the user wnat to FizzBuzz the number <Number>
#When: the user whants a sequence of 15 numbers
#Then: the program printed:
#    | 1				|
#    | 2				|
#    | Fizz			|
#    | 4	 			|
#    | Buzz			|
#    | Fizz		 	|
#    | 7				|
#    | 8		 		|
#    | Fizz			|
#    | Buzz			|
#    | 11				|
#    | Fizz			|
#    | 13				|
#    | 14				|
#    | FizzBuzz	|

@FizzBuzz
Feature: FizzBuzz
  Print a sequence of N numbers,
  but for multiples of 3 print Fizz
  and for multiples of 5 print Buzz
  and for multiples of 3 and 5 print FizzBuzz
	
	Background: run in all scenarios
		Given the backgroud flag is set
		And other flag is set
		
	@SingleNumber
  Scenario Outline: FizzBuzz a number
    Given the user wnat to FizzBuzz the number <Number>
    When the user clicked the FizzBuzz button
    Then the program prints <Result>
    And validate background flags
    Examples:
    | Number | Result 		|
    | 2			 | 2					|
    | 3			 | Fizz				|
    | 6			 | Fizz				|
    | 5			 | Buzz				|
    | 10		 | Buzz				|
    | 15		 | FizzBuzz		|
       
   @Sequence 
   Scenario: FizzBuzz sequence
   	Given the user whants a sequence of 15 numbers
   	When the user clicked the FizzBuzz Sequence button
   	Then the program printed:
    | 1					|
    | 2					|
    | Fizz			|
    | 4	 			 	|
    | Buzz			|
    | Fizz		 	|
    | 7					|
    | 8		 			|
    | Fizz			|
    |	Buzz			|
    | 11				|
    | Fizz			|
    | 13				|
    | 14				|
    | FizzBuzz	|
    
    And validate background flags

	Scenario: Table Advanced
		Then the table must be converted:
		| Test0 | Adress0 | test0@test.com | 23 |
		| Test1 | Adress1 | test1@test.com | 41 |
		| Test2 | Adress2 | test2@test.com | 30 |
		| Test3 | Adress3 | test3@test.com | 18 |
		
    And validate background flags
    
    

 