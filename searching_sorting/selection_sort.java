public class selection_sort {
    public static void main(String[] args) {
        int wow[] = { 8,3,1,5,2,6 };
        for (int i = 0; i < wow.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < wow.length; j++) {
              if (wow[smallest]>wow[j]) {
                smallest=j;
              }
        }
        int temp=wow[smallest];
        wow[smallest]=wow[i];
        wow[i]=temp;
    }

        System.out.println("selection sorted array is:-");
        for (int i = 0; i < wow.length; i++) {
            System.out.print(wow[i] + " ");
        }
    }
}
