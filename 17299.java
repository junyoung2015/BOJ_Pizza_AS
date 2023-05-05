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
		int[] arr = new int[nums + 1];
		int[] cnt = new int [1000001];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Stack<Integer> answer = new Stack<>();
		Stack<Integer> temp = new Stack<>();

		for (int i = 0; i < nums; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			cnt[arr[i]]++;
		}
		for (int i = nums - 1; 0 <= i; i--) {
			while (!temp.isEmpty() && cnt[temp.peek()]] <= cnt[arr[i]])
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