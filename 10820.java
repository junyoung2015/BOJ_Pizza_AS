import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	final public static int lowerCase = 0;
	final public static int upperCase = 1;
	final public static int number = 2;
	final public static int whiteSpace = 3;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		char[] arr;
		int[] counts = new int[4];
		while ((str = br.readLine()) != null) {
			arr = str.toCharArray();
			Arrays.fill(counts, 0);
			for (int i = 0; i < arr.length; i++) {
				if ('a' <= arr[i] && arr[i] <= 'z')
					counts[lowerCase]++;
				else if ('A' <= arr[i] && arr[i] <= 'Z')
					counts[upperCase]++;
				else if ('0' <= arr[i] && arr[i] <= '9')
					counts[number]++;
				else
					counts[whiteSpace]++;
			}
			System.out.println(counts[lowerCase] + " " + counts[upperCase] + " " + counts[number] + " " + counts[whiteSpace]);
		}
	}
}