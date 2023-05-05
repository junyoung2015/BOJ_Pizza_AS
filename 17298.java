import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Stack;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int nums = Integer.parseInt(br.readLine());
		int[] arr = new int[nums];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Stack<Integer> answer = new Stack<>();
		Stack<Integer> temp = new Stack<>();

		for (int i = 0; i < nums; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		for (int i = nums - 1; 0 <= i; i--) {
			while (!temp.isEmpty() && (arr[i] >= temp.peek()))
				temp.pop();
			if (temp.isEmpty())
				answer.push(-1);
			else
				answer.push(temp.peek());
			temp.push(arr[i]);
		}
		while (!answer.isEmpty())
			sb.append(answer.pop() + " ");
		System.out.println(sb);
	}
}