import java.util.*;
import java.lang.Integer;

public class NumberFinder {
	private Hashtable<String, Integer> numbers;

	public NumberFinder() {
		numbers = new Hashtable<String, Integer>();
	}

	public String compareNumbersHash (String[] input1, String[] input2) {
		String outputMsg = "\"";

		numbers.clear();

		input1 = formatNumbers(input1);
		input2 = formatNumbers(input2);

		for (String num : input1) {
			int extractNum = Integer.parseInt (num);
			numbers.put (num, extractNum);
		}
		for (String num : input2) {
			if (numbers.get (num) != null) {
				outputMsg = outputMsg + num + ", ";
			}
		}

		outputMsg = outputMsg.replaceAll(", $", "");
		outputMsg = outputMsg + "\"";

		return outputMsg;
	}

	public String compareNumbers (String[] input1, String[] input2) {
		String outputMsg = "\"";

		input1 = formatNumbers(input1);
		input2 = formatNumbers(input2);

		for (String str1 : input1) {
			for (String str2 : input2) {
				if (str1.equals (str2)) {
					outputMsg = outputMsg + str1 + ", ";
				}
			}
		}

		outputMsg = outputMsg.replaceAll(", $", "");
		outputMsg = outputMsg + "\"";

		return outputMsg;
	}

	/***************************
	 *
	 * helper functions
	 *
	 ***************************/

	//format numbers, get rid of non-numeric characters
	private String[] formatNumbers (String strArr[]) {
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = strArr[i].replaceAll("\\D+","");
		}

		//make sure output will be ascending order
		Arrays.sort(strArr);

		return strArr;
	}

}