import java.util.Arrays;

public class MergeSort{
    public static void concure(int arr[],int si, int ei, int mid){
        int marged[] = new int[ei-si+1];

        int ind1= si;
        int ind2 = mid+1;
        int x =0;

        while (ind1<=mid&&ind2<=ei) {
            if(arr[ind1]<=arr[ind2]){
                marged[x++]=arr[ind1++];
            }else{
                marged[x++]=arr[ind2++];
            }
        }

        while (ind1<=mid) {
             marged[x++]=arr[ind1++];
        }

        while (ind2<=ei) {
             marged[x++]=arr[ind2++];
        }

        for(int i =0,j=si;i<marged.length;i++,j++){
            arr[j]=marged[i];
        }
    }
    public static void divide(int arr[],int si, int ei){
         if(si>=ei){
            return;
         }

         int mid = si +(ei-si)/2;
         divide(arr, si, mid);
         divide(arr, mid+1, ei);
         concure(arr,si,ei,mid);
    }
    public static void main(String arge[]){
        int arr[] = {3,2,5,6,4,88,44};
        int n = arr.length;
     
        divide(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

}