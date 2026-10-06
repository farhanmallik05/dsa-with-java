public class wave_array {
    public static void main(String[] args) {
        int [][]wow={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < wow.length; i++) {
            if (i%2==0) {   
                for (int j = 0; j < wow[i].length; j++) {
                    System.out.print(wow[i][j]+" ");
                }
            }
            else{
                for (int j = wow.length-1; j >= 0; j--) {
                    System.out.print(wow[i][j]+" ");
                }
            }
            System.out.println(" ");
        }
    }
}
