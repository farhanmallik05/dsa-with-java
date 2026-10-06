public class linear_search {
    public static void main(String[] args) {
        int wow []={1,2,3,4,5,6,77,8,9};
        int x=7;
        for(int i=0;i<wow.length;i++)
        {
            if(wow[i]==x)
                System.out.println("index is "+ i);
        }
        System.out.println("element not exist");
    }
}
