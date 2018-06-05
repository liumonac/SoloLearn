import java.util.Hashtable;
import java.util.Arrays;

public class NumberFinder {
	public static String compareNumbersHash (String[] input1, String[] input2) {
		Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
		String outputMsg = "\"";

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

		outputMsg = formatOutput (outputMsg);

		return outputMsg;
	}

	public static String compareNumbers (String[] input1, String[] input2) {
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

		outputMsg = formatOutput (outputMsg);

		return outputMsg;
	}

	/***************************
	 *
	 * helper functions
	 *
	 ***************************/

	//format numbers, get rid of non-numeric characters
	private static String[] formatNumbers (String strArr[]) {
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = strArr[i].replaceAll("\\D+","");
		}

		//make sure output will be ascending order
		Arrays.sort(strArr);

		return strArr;
	}

	private static String formatOutput (String str) {
		str = str.replaceAll(", $", "");
		str = str + "\"";

		return str;
	}

}