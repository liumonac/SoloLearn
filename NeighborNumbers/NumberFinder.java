import java.util.*;
import java.lang.Integer;

public class NumberFinder {
	private Hashtable<String, Integer> numbers;
	private ArrayList<String> outputList;

	public NumberFinder() {
		numbers = new Hashtable<String, Integer>();
		outputList = new ArrayList<String>();
	}

	public String compareNumbersHash (String[] input1, String[] input2) {
		numbers.clear();
		outputList.clear();

		for (String num : input1) {
			//get rid of non-numeric characters
			num = num.replaceAll("\\D+","");
			int extractNum = Integer.parseInt (num);
			numbers.put (num, extractNum);
		}

		for (String num : input2) {
			//get rid of non-numeric characters
			num = num.replaceAll("\\D+","");

			if (numbers.get (num) != null) {
				outputList.add (num);
			}
		}

		Collections.sort(outputList);

		String outputMsg = "\"";
		for (String num : outputList) {
			outputMsg = outputMsg + num + ", ";
		}

		outputMsg = outputMsg.replaceAll(", $", "");
		outputMsg = outputMsg + "\"";

		return outputMsg;
	}

	public String compareNumbers (String[] input1, String[] input2) {
		String outputMsg = "\"";
		for (String str1 : input1) {
			for (String str2 : intput2) {
				if (str1.equals (str2)) {
					outputMsg = outputMsg + str1 + ", ";
				}
			}
		}

		outputMsg = outputMsg.replaceAll(", $", "");
		outputMsg = outputMsg + "\"";

		return outputMsg;
	}

}