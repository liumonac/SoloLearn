/*
Prompt:

Given two strings as input, write a program to find which numbers from the first 
string are present in the second string.  Print the result as a string 
containing the  matched numbers in ascending order.

For example:
Input:
"12, 13, 15, 19, 212, 556, 2146"
"13, 44, 432, 12, 788, 246, 2146, 46"
Output: "12, 13, 2146"

Hint: Hashtables may be a good use in terms of an efficient solution.

Bonus Task: try to solve the problem without using a Hashtable or any other data structure.
*/

import java.util.*;

public class NeighborNumbers {
	Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();

	public static void main (String[] args) {
		if (args.length < 2) {
			System.out.println("Usage: NeighborNumbers \"[x, y, z...]\" \"[x, y...]\"");
		} else {
			String[] input1 = args[0].split(",");

			//get rid of whitespace
			for (int i = 0; i < input1.length; i++) {
				input1[i] = intput1[i].trim();
			}
		}

	}
}