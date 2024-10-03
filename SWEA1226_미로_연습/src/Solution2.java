import java.util.Scanner;

public class Solution2 {
    static int w, h, island;
    static int[][] arr;
    static boolean[][] arr2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 1; tc++) {
            w = sc.nextInt();
            h = sc.nextInt();

            island = 0;

            // 미로판 받아오기
            arr = new int[w][h];
            for (int r = 0; r < w; r++) {
                for (int c = 0; c < h; c++) {
                    arr[r][c] = sc.nextInt();
                }
            }

            // 방문 체크할 배열 초기화
            arr2 = new boolean[w][h];

            // 모든 위치를 탐색하면서 섬을 찾음
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    if (arr[i][j] == 1 && !arr2[i][j]) {
                        // 새로운 섬 발견 -> 섬 개수 증가
                        island++;
                        dfs(i, j);
                    }
                }
            }

            System.out.println("#" + tc + " " + island);
        }
    }

    static void dfs(int r, int c) {
        // 기저조건: 범위를 벗어나거나 이미 방문했거나 바다인 경우
        if (r < 0 || r >= w || c < 0 || c >= h || arr2[r][c] || arr[r][c] == 0) {
            return; // 배열의 경계를 벗어나거나 이미 방문했거나 바다인 경우 종료
        }

        // 방문 표시
        arr2[r][c] = true;

        // 사방 탐색 (상, 하, 좌, 우, 대각선)
        int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dc = {0, 0, -1, 1, -1, 1, 1, -1};

        // 모든 방향에 대해 재귀적으로 DFS 호출
        for (int i = 0; i < 8; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            dfs(nr, nc);
        }
    }
}
