package Array;

public class bai3 {
    public static int removeElement(int[] a, int val) {
    int n= a.length;
    for(int i=0;i<n; ){
        if(a[i]== val){
            // xoa phan tu

            for(int j =i; j<(n-1); j++){
                a[j]=a[j+1];
            }
            n--;
        }else{
            i++;
        }
    }

        return n;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,8,6,4};
        System.out.println(removeElement(a,6));
        System.out.println("done");
    }
}
