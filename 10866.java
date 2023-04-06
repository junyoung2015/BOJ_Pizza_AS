import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

class Deque {
	private static int [] deque;
	private static int SIZE = 20001;
	private static int total;
	private static int idx_front;
	private static int idx_end;

	Deque() {
		deque = new int [SIZE];
		total = 0;
		idx_front = 10000;
		idx_end = 10000;
	}

	void push_front (int n) {
		deque[idx_front] = n;
		idx_front--;
		total++;
	}

	void push_back (int n) {
		idx_end++;
		total++;
		deque[idx_end] = n;
	}

	int pop_front() {
		int num;
		if (total == 0)
			return (-1);
		num = deque[idx_front + 1];
		idx_front++;
		total--;
		return (num);
	}

	int pop_back() {
		int num;
		if (total == 0)
			return (-1);
		num = deque[idx_end];
		idx_end--;
		total--;
		return (num);
	}

	int size() {
		return (total);
	}

	int empty() {
		if (total == 0)
			return (1);
		else
			return (0);
	}

	int front () {
		if (empty() == 1)
			return (-1);
		else
			return (deque[idx_front + 1]);
	}

	int back () {
		if (empty() == 1)
			return (-1);
		else
			return (deque[idx_end]);
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
		Deque			deque = new Deque();
	
		while (idx < n)
		{
			st = new StringTokenizer(br.readLine());
			str = st.nextToken();
			switch (str) {
				case "push_front" :
					deque.push_front(Integer.parseInt(st.nextToken()));
					break;
				case "push_back" :
					deque.push_back(Integer.parseInt(st.nextToken()));
					break;
				case "pop_front" :
					sb.append(deque.pop_front()).append('\n');
					break;
				case "pop_back" :
					sb.append(deque.pop_back()).append('\n');
					break;
				case "size" :
					sb.append(deque.size()).append('\n');
					break;
				case "empty" :
					sb.append(deque.empty()).append('\n');
					break;
				case "front" :
					sb.append(deque.front()).append('\n');
					break;
				case "back" :
					sb.append(deque.back()).append('\n');
			}
			idx++;
		}
		System.out.println(sb);
	}
}