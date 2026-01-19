import java.util.*;
public class MergeSort {
    static void mergeSort(int l,int r,int[] arr){
        if(l<r){
            int mid=l+(r-l)/2;
            mergeSort(l,mid,arr);
            mergeSort(mid+1,r,arr);
            merge(l,mid,r,arr);
        }
    }
    static void merge(int l,int mid,int r,int[] arr){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[l+i];
        
        for(int j=0;j<n2;j++) 
            right[j]=arr[mid+1+j];
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(left[i]<=right[j])
                 arr[k++]=left[i++];
            else 
                arr[k++]=right[j++];
        }
        while(i<n1)
             arr[k++]=left[i++];
        while(j<n2)
             arr[k++]=right[j++];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter the "+i+1+" Element");
            arr[i]=sc.nextInt();
        }
        mergeSort(0,n-1,arr);
        System.out.println(Arrays.toString(arr));
    }
}
