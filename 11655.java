import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		String result = "";
		for (char ch : arr) {
			if ('a' <= ch && ch <= 'm' || 'A' <= ch && ch <= 'M')
				result += Character.toString(ch + 13);
			else if ('n' <= ch && ch <= 'z' || 'N' <= ch && ch <= 'Z')
				result += Character.toString(((ch - ((ch / 32) * 32 + 1) + 13) % 26) + ((ch / 32) * 32 + 1));
			else
				result += Character.toString(ch);
		}
		System.out.println(result);
	}
}

// class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		char[] arr = br.readLine().toCharArray();
// 		String result = "";
// 		for (char ch : arr) {
// 			if ('a' <= ch && ch <= 'm' || 'A' <= ch && ch <= 'M')
// 				result += Character.toString(ch + 13);
// 			else if ('n' <= ch && ch <= 'z' || 'N' <= ch && ch <= 'Z')
// 				result += Character.toString(ch - 13);
// 			else
// 				result += Character.toString(ch);
// 		}
// 		System.out.println(result);
// 	}
// }