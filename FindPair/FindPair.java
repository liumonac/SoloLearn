/*
Prompt:

You have a collection of sorted numbers, where you want to find if there 
exists a pair whose sum is equal to the user's input.

For example, for the numbers [1, 2, 4, 4]:

Input: 8
Output: True
Input: 7
Output: False

Try to solve it in a linear time O(n)

Bonus: Solve the same problem in O(n) time with an unsorted list of numbers.
*/

class FindPair {
public static boolean findSum (int[] collection, int find) {
		boolean found = false;

		int left = 0;
		int right = collection.length - 1;
		int sum = 0;

		for (int i = 0; i < collection.length; i++) {
			sum = collection[left] + collection[right];

			if (sum == find) {
				found = true;
				break;
			} else if (sum < find) {
				left++;
			} else if (sum > find) {
				right--;
			}

		}

		return found;
	}

	public static void main (String[] args) {
		int[] collection = {1, 2, 4, 4};

		if (args.length != 1) {
			System.out.println ("Usage: FindPair [num]");
		} else {
			int find = Integer.parseInt (args[0]);

			boolean found = findSum (collection, find);

			if (found) {
				System.out.println ("True");
			} else {
				System.out.println ("False");
			}

		}
	}
}