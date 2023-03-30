import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader		br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer		st;
		Stack<Character> 	parenthesis = new Stack<Character>();
		String[]			strarr;
		String				str;
		int					n = Integer.parseInt(br.readLine());
		int					count;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			str = st.nextToken();
			strarr = str.split("");
			for (String ch : strarr) {
				if (ch.charAt(0) == '(')
					parenthesis.push(ch.charAt(0));
				else {
					if (parenthesis.isEmpty()) {
						parenthesis.push(ch.charAt(0));
						parenthesis.pop();
						break;
					}
					else {
						parenthesis.push(ch.charAt(0));
						parenthesis.pop();
					}
				}
			}
			if (parenthesis.isEmpty())
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}

/*
 * Method 1
 * Using count
 */
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;
// import java.util.Stack;

// class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader		br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer		st;
// 		Stack<Character> 	parenthesis = new Stack<Character>();
// 		String[]			strarr;
// 		String				str;
// 		int					n = Integer.parseInt(br.readLine());
// 		int					count;

// 		for (int i = 0; i < n; i++) {
// 			count = 0;
// 			st = new StringTokenizer(br.readLine());
// 			str = st.nextToken();
// 			strarr = str.split("");
// 			for (String ch : strarr) {
// 				if (ch.charAt(0) == '(')
// 					count++;
// 				else {
// 					count--;
// 					if (count < 0)
// 						break;
// 				}
// 			}
// 			if (count == 0)
// 				System.out.println("YES");
// 			else
// 				System.out.println("NO");
// 		}
// 	}
// }


/*
 * Method 2
 * Using Stack
 */