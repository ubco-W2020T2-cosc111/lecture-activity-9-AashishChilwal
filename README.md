# Lecture Activity 9 - Instructions

In lecture activity 9, we will practice writing and testing some code with arrays.

## General instructions for creating Java files

For each of the following Tasks, create a separate Java file called task1.java, task2.java, task3.java etc... 

Remember, to create a new file, first navigate to this directory locally using `cd path/to/this/repo` and then type: `code task1.java`.
This will open a new file called `task1.java` in Visual Studio Code.
You can also work in Geany, or Eclipse, it's your choice.


```
public class task1 {

	public static void main(String[] args) {
	  // Enter your code
	}
  
}
```

## Test your code

Use the following class to test the methods you develop in exercises Task 1, 2, and 3:

```
public class Test {
	public static void main(String[] args) {

		int[][] m1 = { 	{ 14, 11, 13, 12 }, 
							{ 18, 15, 13, 13 },
							{ 19, 16, 15, 17 } };

		int[][] m2 = { 	{ 54, 53, 51, 52 }, 
							{ 51, 59, 52, 56 },
							{ 53, 54, 52, 58 } };

		System.out.println("First array:"); 
		displayArray(m1);
		System.out.println("Second array:"); 
		displayArray(m2);

		/* write simple code to test your method and use
		   displayArray to display the result if applicable  */

	}

	//write your methods code here.

	public static void displayArray(int[][] m) {

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++)
				System.out.print(m[r][c] + " ");
			System.out.println();
		}
	}
}
```

Don't forget to change the name of the public class method for each file!

For all questions, assume that we use only rectangular arrays (i.e., all rows have the same length).

## Task 1: Check if Array is Identical

The 2-D arrays `m1` and `m2` are strictly identical if their corresponding elements are equal. Write a method that returns true if `m1` and `m2` are strictly identical, using the following header:

```
public static boolean equals(int[][] m1, int[][] m2)
```

### Sample Run

Test your program using the Test class listed at the beginning of this file. 

```
First array:
14 11 13 12
18 15 13 13
19 16 15 17
Second array:
54 53 51 52
51 59 52 56
53 54 52 58

The arrays aren't exactly identical.
```

## Task 2: Shuffle rows of an array

Write a method that shuffles the rows in a 2-D int array using the following header:

```
public static void shuffle(int[][] m)
```

**Hints:**

- In order to shuffle the rows of `m`, swap `each` frow with another randomly selected row.
- Remember that a 2-D array is actually an array in which each element is a 1-D array representing a row of elements. That is, m[0], m[1], etc. are references to 1-D arrays of which length is equal to the number of columns in m (refer to page # 8 in the lecture notes).

### Sample Run

Test your program using the Test class listed at the beginning of this document. 

```
First array:
14 11 13 12
18 15 13 13
19 16 15 17
Second array:
54 53 51 52
51 59 52 56
53 54 52 58

First array after shuffling its rows:
18 15 13 13
19 16 15 17
14 11 13 12
```
## Task 3: Sort elements in an array

Write a method to sort the elements in each row of a 2-D array in an ascending order. A new array is returned and the original array is intact. Use the following header:

```
public static int[][] sortRows(int[][] m)
```

**Hints:**

- You may use the Arrays.sort method for sorting each individual row.
- Remember that a 2-D array is actually an array in which each element is a 1-D array representing a row of elements. That is, m[0], m[1], etc. are references to 1-D arrays of which length is equal to the number of columns in m (refer to page # 8 in the lecture notes).

### Sample Run

```
First array:
14 11 13 12
18 15 13 13
19 16 15 17
Second array:
54 53 51 52
51 59 52 56
53 54 52 58

First array after sorting each row:
11 12 13 14
13 13 15 18
15 16 17 19
```

## Task 4: Update your README file 

If you named your files as suggested above, you do not have to do anything in this section.
If you named your files differently, please update the links below to make sure they work.

[Task 1 Java file](./Task1.java)

[Task 2 Java file](./Task2.java)

[Task 3 Java file](./Task3.java)
