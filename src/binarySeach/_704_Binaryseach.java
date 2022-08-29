package binarySeach;

public class _704_Binaryseach {
    public static int binarySeach(int a[], int key ){
        int n= a.length;
        int iL =0;// can trai
        int iR= n-1;// can phai
        while(iL<=iR){
            int iM = (iL+iR)/2;// index giua
            if(key == a[iM]){
                return iM;
            }else if(key<a[iM]){
                iR = iM-1 ;// dồn cận phải sang
            }else if(key>a[iM]){
                iL=iM+1;// dồn cận trai sang
            }
        }
        return -1;
    }
    public static int binarySeach2( int[] a, int key, int iL, int iR){
        int iM = (iL+iR)/2;
        if(key == a[iM]){
            return iM;
        } else if(key < a[iM]){
            return binarySeach2(a,key,iL,iM-1);
        } else if(key > a[iM]){
            return binarySeach2(a,key,iM+1,iR);
        }
        return -1;
    }
    public static int binarySeach2(int[] a, int key){
        int n= a.length;
        return binarySeach2(a, key,0, n-1);
    }
    public static void main(String[] args) {
        int a[]={1,2,4,6,7,19,32,39,71};
        System.out.println(binarySeach2(a,19 ));
    }
}
