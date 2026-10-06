public class column_arr {
    public static void main(String[] args) {
        int [][] wow={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < wow.length; i++) {
            for (int j = 0; j < wow[0].length; j++) {
                System.out.print(wow[j][i]+" ");
            }
        }
    }
}

