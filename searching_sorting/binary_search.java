public class binary_search {
    public static void main(String[] args) {
        int wow[]={1,7,8,12,13,19,26,50};
        int k=8,left=0,right=wow.length;
        while(left<right)
        {
           int mid=(left+right)/2;
            if(wow[mid]==k)
                {
                System.out.println("find k at index:-  "+ mid);
                break;
            }
            if(wow[mid]<k)
                {
                    left=mid;
                }
            else{
                right=mid;
            }
            }
        }

    }

