package Sort;

    public class mergeSort {
    public static int[] merge(int[] a1, int[] a2){
        int n = a1.length +a2.length;
        int[] ketQua = new int[n];
        int i=0, i1=0, i2=0;
        while(i<n){
            if(i1<a1.length && i2<a2.length){
                if(a1[i1]<=a2[i2]){
                    ketQua[i]=a1[i1];
                    i++;
                    i1++;
                }else if(a2[i2]<a1[i1]){
                    ketQua[i]=a2[i2];
                    i++;
                    i2++;
                }
            }else if(i1<a1.length){
                ketQua[i]=a1[i1];
                i++;
                i1++;
            }else if(i2<a2.length){
                ketQua[i]=a2[i2];
                i++;
                i2++;
            }
        }
        return ketQua;
    }
    public static int[] mSort(int[] a, int L, int R) {
        if (L > R) {
            return new int[0];
        }
        if (L == R) {
            int[] mangDon = {a[L]};
            return mangDon;
        }//TH DB
        int k = (L + R) / 2;
        int[] a1= mSort(a,L,k);
        int[] a2= mSort(a,k+1,R);
        // chia ra o tren
        // duoi la tron vao
        /*int n = a1.length +a2.length;
        int[] ketQua = new int[n];
        int i=0, i1=0, i2=0;
        while(i<n){
            if(i1<a1.length && i2<a2.length){
                if(a1[i1]<=a2[i2]){
                    ketQua[i]=a1[i1];
                    i++;
                    i1++;
                }else if(a2[i2]<a1[i1]){
                    ketQua[i]=a2[i2];
                    i++;
                    i2++;
                }
            }else if(i1<a1.length){
                ketQua[i]=a1[i1];
                i++;
                i1++;
            }else if(i2<a2.length){
                ketQua[i]=a2[i2];
                i++;
                i2++;
            }
        }
        return ketQua; */
        int [] ketQua = merge(a1,a2);
        return ketQua;
    }
        public static int[] mSort(int[] a){
            int n = a.length;
            return mSort(a, 0, n - 1);
        }

    public static void main(String[] args) {
    mergeSort s= new mergeSort();
    int[] a ={1,3,5,7,9};
    int[] b ={2,4,6,8,10};
        System.out.println(merge(a,b));
    }
    }

