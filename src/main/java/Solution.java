import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by hhndez on 30/03/16.
 */
public class Solution {

	static String FizzBuzz(int untilVal) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= untilVal; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sb.append("FizzBuzz").append(System.getProperty("line.separator"));
			} else if (i % 3 == 0) {
				sb.append("Fizz").append(System.getProperty("line.separator"));
			} else if (i % 5 == 0) {
				sb.append("Buzz").append(System.getProperty("line.separator"));
			} else {
				sb.append(i).append(System.getProperty("line.separator"));
			}
		}
		return sb.toString();
	}

	public static void main (String []args)  throws IOException{
		Scanner in = new Scanner(System.in);
		final String fileName = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		String res;
		int _untilVal;
		_untilVal = Integer.parseInt(in.nextLine().trim());

		res = FizzBuzz(_untilVal);
		bw.write(res);
		bw.newLine();

		bw.close();
	}
}
