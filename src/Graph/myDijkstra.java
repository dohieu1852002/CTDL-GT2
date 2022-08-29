package Graph;

import java.util.HashSet;
import java.util.Set;

public class myDijkstra {
    public static void main(String[] args) {
        int n=5;
        int[][] a = {{0,6,0,1,0},
                     {6,0,5,2,2},
                     {0,5,0,0,5},
                     {1,2,0,0,1},
                     {0,2,5,1,0}};
        Set<Integer> visited = new HashSet<>(); // da duyet
        int[] distance = new int[n]; // khoang cach tu dinh dau tois i
        int[] previous = new int[n]; // dinh ngay phia trc cua i
        int start =0;
        int finish =4;
    // khOI TAO KHOANG CACH
         int oo = Integer.MAX_VALUE;
        for (int i = 0; i <n; i++) {
                distance[i] = oo;
        }
        distance[start]=0;
        while (visited.size()<n){
            // Buoc 2 chon  dinh chua duyet vaf co khoang cach ngan nhat toi dinh  xuat phat lam dinh dang xet
            int dangxet = 0;
            int minDist = oo; // khoi tao khoang cach ngan nhat bang vo cung
            for (int i = 0; i < n; i++) {
                if(visited.contains(i)==false && distance[i]<minDist){
                    minDist = distance[i];
                    dangxet=i;
                }
            }
            // Buoc 3 tu dinh dang xet, duyet cac dinh ke chua duyet, update khoang cach va dinh truoc cuar cacs dinhr do
            for (int i = 0; i <n ; i++) {
                if(visited.contains(i)==false && a[dangxet][i]!=0)
                {
                    int newDistance = distance[dangxet] + a[dangxet][i];
                    if(newDistance<distance[i])
                    {
                        distance[i]=newDistance;
                        previous[i]=dangxet;
                    }
                }
            }
            visited.add(dangxet);
        }
        System.out.println("Done");
    }
}
