package Sort;

public class sapXep {
     /*public static  p(int no, int[] a){
        System.out.println(no);
        for(int i=0; i< a.length; i++){
            System.out.println(a[i]);
            System.out.println();*/
    /* public static void printArr(long[] arr)
     {
         for (int i = 0; i < arr.length; i++) {
             System.out.printf("%d, ", arr[i]);
         }
         System.out.println(); */


    public static void bubbleSort(int[] a){
        int n= a.length;
        for(int i=0; i<n; i++){
            boolean isSorted = true;
            for(int j=0; j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    isSorted= false;
                    int t= a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }

            }
            if( isSorted= true){
                break;
            }
        }

    }
    public static void inlecsionSort(int[] a){
        int n= a.length;
        for( int i=1;i<n; i++){
            int ai=a[i];
            int j=i-1;
            while(j>=0 && a[j]>ai){
                a[j+1]= a[j];
                j--;
            }
            a[j+1]=ai;
        }
    }
    public static void selecsionSort( int[] a){
        int n= a.length;
        for(int i=0; i<n ; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(a[j]< a[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex !=i ){
                int t= a[i];
                a[i]=a[minIndex];
                a[minIndex]=t;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = { 1,2,4,9,8,6,10};
        inlecsionSort(a);
        for(int x=0; x<a.length;x++){
            System.out.print(a[x]+ " ");
        }
    }
}
