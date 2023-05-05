import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lineNum = Integer.parseInt(br.readLine());
		char[] formula = br.readLine().toCharArray();
		int idx = 0;
		int len = formula.length;
		double result = 0;
		Stack <Double> postfix = new Stack <>();
		Map <Character, Double> nums = new HashMap<>();

		for (int i = 0, key = 'A'; i < lineNum; i++, key++ )
			nums.put((char) key, Double.parseDouble(br.readLine()));
		for (int i = 0; i < len; i++) {
			if (Character.isAlphabetic(formula[i]))
				postfix.push(nums.get(formula[i]));
			else {
				double second = postfix.pop();
				double first = postfix.pop();
				switch(formula[i]) {
					case '+':
						postfix.push(first + second);
						break;
					case '-':
						postfix.push(first - second);
						break;
					case '*':
						postfix.push(first * second);
						break;
					case '/':
						postfix.push(first / second);
				}
			}
		}
		System.out.printf("%.2f", postfix.pop());
	}
}