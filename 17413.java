import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader 		br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder 		sb = new StringBuilder();
		boolean				flag = false;
		Stack<Character>	stack = new Stack<Character>();
		String				str = br.readLine();
		char[]				arr = str.toCharArray();
		
		for (char ch : arr) {
			// tags
			if (ch == '<') {
				flag = true;
				while (!stack.isEmpty())
					sb.append(stack.pop());
				sb.append(ch);
			}
			else if (ch == '>') {
				flag = false;
				sb.append(ch);
			}
			// words
			else if (flag == true)
				sb.append(ch);
			else if (flag == false) {
				if (ch == ' ')
				{
					while (!stack.isEmpty())
						sb.append(stack.pop());
					sb.append(' ');
				}
				else {
					stack.push(ch);
				}
			}
		}
		while (!stack.isEmpty())
			sb.append(stack.pop());
		System.out.println(sb);
	}
}