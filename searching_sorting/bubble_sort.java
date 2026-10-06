public class bubble_sort {
    public static void main(String[] args) {
          int wow []={2,8,1,9,54,29};
          for (int i = 0; i < wow.length; i++) {
            for (int j = i+1; j < wow.length; j++) {
                if(wow[i]>wow[j])
                {
                    int temp=wow[j];
                    wow[j]=wow[i];
                    wow[i]=temp;
                }
            } 
          }
          System.out.println("bubble sorted array is:-");
          for (int i = 0; i < wow.length; i++) {
              System.out.print(wow[i]+" ");
          }
    }
}
