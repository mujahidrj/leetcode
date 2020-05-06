import java.util.*;

class node {
  public int val;
  public List<node> children;

  public node() {
    val = 0;
    children = new ArrayList<node>();
  }

  public node(int data) {
    val = data;
    children = new ArrayList<node>();
  }

  }

  static boolean visited[] = new boolean[6];

@SuppressWarnings("unchecked")
public static class dfs {
  public static void DFS(ArrayList<Integer>[] list, int cur) {
    System.out.println("We are at " + cur);
		component.add(cur);
		visited[cur] = true;
		for (int x : graph[cur]) {
			if (visited[x])
				continue;
			dfs(x);
		}
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // n, m
    // m lines:
    // u, v, where u is start, and v is end, 0-indexed

    // 6 6
    // 1 3
    // 3 2
    // 2 4
    // 1 4
    // 3 0
    // 2 1

    int n = in.nextInt();
    ArrayList[] adjList = new ArrayList[n];
    for (int i = 0; i < n; i++)
      adjList[i] = new ArrayList<Integer>();

    for (int i = 0; i < in.nextInt(); i++) {
      int from = in.nextInt();
      int to = in.nextInt();
      adjList[from].add(to);
    }
    DFS(adjList, 0);
  }
}