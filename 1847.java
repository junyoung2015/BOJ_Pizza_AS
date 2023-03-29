import java.util.Scanner;
import java.util.Stack;

class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
	
		int n = sc.nextInt();			// 1 <= N <= 100000
		int idx, asc, val, num;			// idx = index, asc = key to keep ascending order, val = next input
		idx = asc = val = num = 0;
		while (idx < n)
		{
			val = sc.nextInt();
			if (asc < val)
			{
				num = asc + 1;
				while (num <= val)
				{
					stack.push(num);
					sb.append("+\n");
					num++;
				}
				asc = val;
			}
			else if (stack.peek() != val)
			{
				System.out.println("NO");
				return ;
			}
			stack.pop();
			sb.append("-\n");
			idx++;
		}
		System.out.println(sb);
	}
}