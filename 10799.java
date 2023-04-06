import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader		br = new BufferedReader(new InputStreamReader(System.in));
		char[]				arr = br.readLine().toCharArray();
		Stack<Character>	stack = new Stack<Character>();
		int					result = 0;
		char				tmp = 0;

		for (char ch : arr) {
			if (ch == '(')
				stack.push(ch);
			else if (ch == ')') {
				stack.pop();
				if (tmp == '(')
					result += stack.size();
				else if (tmp == ')')
					result += 1;
			}
			tmp = ch;
		}
		System.out.println(result);
	}
}