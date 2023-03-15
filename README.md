# 03_09InClassAssignment

Question 1:

Write a method filterRange that accepts an ArrayList of integers and two integer values min and max as parameters and removes all elements whose 
values are in the range min through max (inclusive) from the list. For example, if a variable called list stores the values:

[4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7]
The call of filterRange(list, 5, 7); should remove all values between 5 and 7, therefore it should change the list to store [4, 9, 2, 3, 1, 8]. 
If no elements in range min-max are found in the list, the list's contents are unchanged. If an empty list is passed, the list remains empty. 
You may assume that the list is not null.

 

Question 2:

Write a method mirror that accepts an ArrayList of Strings as a parameter and produces a mirrored copy of the list as output, 
with the original values followed by those same values in the opposite order. For example, if an ArrayList variable called list contains the values 
["a", "b", "c"], after a call of mirror(list); it should contain ["a", "b", "c", "c", "b", "a"].

