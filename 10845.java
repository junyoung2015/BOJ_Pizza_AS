import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Queue {
	private static int [] queue;
	private static int SIZE = 10000;
	// private int capacity;
	private static int total;
	private static int idx_front;
	private static int idx_end;

	Queue() {
		queue = new int [SIZE];
		// capacity = SIZE;
		total = 0;
		idx_front = -1;
		idx_end = -1;
	}
	
	public void push(int n) {
		if (idx_front == -1)
			idx_front = 0;
		idx_end++;
		queue[idx_end] = n;
		total++;
	}
	public int pop() {
		int num;
		if (idx_front == -1) {
			return (-1);
		}
		else {
			num = queue[idx_front];
			if (idx_front >= idx_end) {
				idx_front = idx_end = -1;
			}
			else {
				idx_front++;
			}
			total--;
			return (num);
		}
	}
	public int size() {
		return (total);
	}
	public int empty() {
		if (idx_front == -1){
			return (1);
		}
		else {
			return (0);
		}
	}
	public int front() {
		if (idx_front == -1) {
			return (-1);
		}
		else {
			return(queue[idx_front]);
		}
	}
	public int back() {
		if (idx_front == -1) {
			return (-1);
		}
		else {
			return (queue[idx_end]);
		}
	}
}

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader 	br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder 	sb = new StringBuilder();
		int 			n = Integer.parseInt(br.readLine());
		int				idx = 0;
		StringTokenizer st;
		String			str;
		Queue			queue = new Queue();
		
		while (idx < n)
		{
			st = new StringTokenizer(br.readLine());
			str = st.nextToken();
			switch (str) {
				case "push":
					queue.push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					sb.append(queue.pop()).append('\n');
					break;
				case "size":
					sb.append(queue.size()).append('\n');
					break;
				case "empty":
					sb.append(queue.empty()).append('\n');
					break;
				case "front":
					sb.append(queue.front()).append('\n');
					break;
				case "back":
					sb.append(queue.back()).append('\n');
			}
			idx++;
		}
		System.out.println(sb);
	}
}