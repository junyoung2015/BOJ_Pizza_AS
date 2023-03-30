import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader	br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder	sb = new StringBuilder();
		StringTokenizer	st = new StringTokenizer(br.readLine());
		String			str = st.nextToken();
		String[]		arr = str.split("");
		String			cmd;
		Stack<String>	origin = new Stack<String>();
		Stack<String>	result = new Stack<String>();
		int				n;
		
		st = new StringTokenizer(br.readLine());
		for (String ch : arr)
			origin.push(ch);
		n = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			cmd = st.nextToken();
			switch (cmd) {
				case "L":
					if (!origin.isEmpty())
						result.push(origin.pop());
					break;
				case "D":
					if (!result.isEmpty())
						origin.push(result.pop());
					break;
				case "B":
					if (!origin.isEmpty())
						origin.pop();
					break;
				case "P":
					cmd = st.nextToken();
					origin.push(cmd);
			}
		}
		while (!origin.isEmpty())
			result.push(origin.pop());
		while (!result.isEmpty())
			sb.append(result.pop());
		System.out.println(sb);
	}
}