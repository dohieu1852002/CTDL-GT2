import java.util.Scanner;

public class _selectionSort {
    public static void selectionSort( int[] a){
        int n= a.length;
        for(int i=1; i<n-1; i++){
            int minIndex=i;
            for(int j=i+1; j<n-1; j++){
                if( a[j] < a[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex !=i){
                int t=a[i];
                a[i]=a[minIndex];
                a[minIndex]=t;
            }
        }
    }
    public static void main(String[] args){
        int n;
        System.out.println("Nhap do dai mang");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] a= new int[n];
        for( int i=0;i<n;i++){
            System.out.println("nhap phan tu thu "+ i );
            a[i] = scanner.nextInt();
        }
        selectionSort(a);
        for(int x=0; x<n; x++){
            System.out.println(a[x]+ " ");
        }
    }
}
