import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader	br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder	sb = new StringBuilder();
		StringTokenizer	st = new StringTokenizer(br.readLine());
		int				n = Integer.parseInt(st.nextToken());
		int				k = Integer.parseInt(st.nextToken());
		Queue<Integer>	queue = new LinkedList<>();

		for (int i = 1; i <= n; i++)
			queue.add(i);
		sb.append('<');
		for (; 1 < queue.size(); ) {
			for (int i = 1; i < k; i++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll()).append(", ");
		}
		sb.append(queue.poll());
		sb.append('>');
		System.out.println(sb);
	}
}