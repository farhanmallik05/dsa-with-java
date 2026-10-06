public class right_angle_rotation {
    public static void main(String[] args) {
        int[][] wow = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] go = new int[3][3];
        for (int i = 0; i < wow.length; i++) {
            for (int j = 0; j < wow[0].length; j++) {
                go[i][j] = wow[j][i];
                System.out.print(go[i][j] + " ");
            }
            System.out.println();
        }
        int p = 0;
        for (int i = 0; i < wow.length; i++) {
            p=0;
            for (int j = wow[0].length-1; j > 0; j--) {
                wow[i][p] = go[j][i];
                System.out.print(wow[i][p] + " ");
                p++;
            }
            System.out.println();
        }
        for (int i = 0; i < wow.length; i++) {
            for (int j = 0; j < wow[0].length; j++) {
                System.out.print(wow[i][j] + " ");
            }
            System.out.println();
        }
    }
}
