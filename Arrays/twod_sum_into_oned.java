public class twod_sum_into_oned {
    public static void main(String[] args) {
        int [] oned=new int[9];
        int [][] wow={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < wow.length; i++) {
            int sum=0;
            for (int j = 0; j < wow[0].length; j++) {
                sum+=wow[i][j];
            }
            System.out.print("sum is:-" +sum +" row :-"+i);
            System.out.println("");
        }
    }
}

