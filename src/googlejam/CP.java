package googlejam;

import java.util.*;

public class CP {
	
	static int res;
	static char[][] map;
	static int C, F;
	
	static void backtracking(int x, int y, int n) {
		if (x >= C || y >= F)
			return;
		if (map[y][x] == '#')
			return;
		
		if (map[y][x] == 'X')
			++n;
		if (x == C - 1 && y == F - 1) {
			res = Math.max(res, n);
			return;
		}
		backtracking(x, y + 1, n);
		backtracking(x + 1, y, n);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = Integer.parseInt(in.nextLine());
		in.nextLine();
		while (T-- > 0) {
			String[] parts = in.nextLine().split("[ ]");
			C = Integer.parseInt(parts[0]);
			F = Integer.parseInt(parts[1]);
			
			map = new char[F][C];
			for (int i = 0; i < F; ++i)
				map[i] = in.nextLine().toCharArray();
			
			// matriz donde cada elemento representa el numero maximo de tesoros recogidos
			// desde (0, 0)
			int[][] dp = new int[F][C];
			// matriz que dice si una posicion es un punto valido, donde valido se
			// entiende a un punto al que se llego desde (0, 0)
			boolean[][] valid = new boolean[F][C];
			dp[0][0] = map[0][0] == 'X' ? 1 : 0;
			valid[0][0] = true;

			for (int i = 0; i < F; ++i)
				for (int j = 0; j < C; ++j) {
					if (map[i][j] == '#' || !valid[i][j])
						continue;
					if (i + 1 < F && map[i + 1][j] != '#') {
						dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j] + (map[i + 1][j] == 'X' ? 1 : 0));
						valid[i + 1][j] = true;
					}
					if (j + 1 < C && map[i][j + 1] != '#') {
						dp[i][j + 1] = Math.max(dp[i][j + 1], dp[i][j] + (map[i][j + 1] == 'X' ? 1 : 0));
						valid[i][j + 1] = true;
					}
				}
			//for (int i = 0; i < F; ++i)
			//	System.out.println(Arrays.toString(dp[i]));
			int res = valid[F - 1][C - 1] ? dp[F - 1][C - 1] : -1;
			
			//res = -1;
			//backtracking(0, 0, 0);
                        for (int i = 0; i < F; ++i)
                        {
                            for (int j = 0; j < C; ++j)
                                System.out.print(dp[i][j]+"\t");

                            System.out.println();

                    }

			System.out.println(res);
			
			in.nextLine();
		}
	}
}
