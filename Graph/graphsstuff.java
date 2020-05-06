import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class graphsstuff {

	/*
	 * 
	 * 0: <> 1: <3, 4>
	 * 
	 * n, m m lines: u, v, where u is start, and v is end, 0-indexed
	 * 
	 * 6 6 1 3 3 2 2 4 1 4 3 0 2 1
	 */
	static ArrayList<Integer>[] graph;
	static boolean[] visited;

	static ArrayList<Integer> component;

	static void dfs(int cur) {
		System.out.println("We are at " + cur);
		component.add(cur);
		visited[cur] = true;
		for (int x : graph[cur]) {
			if (visited[x])
				continue;
			dfs(x);
		}
	}

	static int n;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		FS s = new FS();
		n = s.nextInt();
		int m = s.nextInt();

		graph = new ArrayList[n];
		visited = new boolean[n];

		for (int i = 0; i < n; i++)
			graph[i] = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			int u = s.nextInt();
			int v = s.nextInt();

			graph[u].add(v);
		}
		component = new ArrayList<>();
		dfs(5);
		System.out.println(component);
		// ArrayDeque<Integer> search = new ArrayDeque<>();
		// search.add(1);
		// visited[1] = true;
		// while (!search.isEmpty()) {
		// int cur = search.pollFirst();

		// System.out.println("We are at " + cur);

		// for (int next : graph[cur]) {
		// if (visited[next])
		// continue;
		// visited[next] = true;
		// search.add(next);
		// }

		// }

	}

	static class FS {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
