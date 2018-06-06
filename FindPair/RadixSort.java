class RadixSort {
	static int getMax(int arr[]) {
		int max = arr[0];
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}

		return max;
	}

    static int[] countSort (int arr[], int digit) {
    	int result[] = new int[arr.length];
    	int count[] = new int[10];

    	//Get number of occurences of each number
    	for (int i = 0; i < arr.length; i++) {
    		int num = (arr[i] / digit) % 10;
    		count[num]++;
    	}

    	//change count to be the index position
    	for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
    	}

    	//sorted the array based on specified digit
    	for (int i = arr.length - 1; i >= 0; i--) {
    		int num = (arr[i] / digit) % 10;
    		result[count[num] - 1] = arr[i];
    		count[num]--;
    	}

    	return result;
    }

	static int[] radixSort (int arr[]) {
		int max = getMax (arr);

		//each digit
		for (int digit = 1; max/digit > 0; digit*= 10) {
			arr = countSort (arr, digit);
		}

		return arr;
	}
}