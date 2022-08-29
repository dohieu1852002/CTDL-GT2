package Graph;

public class _200_Number_of_land {
    boolean daDuyet[][] = new boolean[300][300];
    int sohang;
    int socot;
    public boolean isValid(int i, int j){
        return i >=0 && j>=0 && i< sohang && j<socot;
    }
    public void DFS(char[][] a, int i, int j ){
    // dieu kien dung || bai toan co so
        if(isValid(i,j)==false) return;
        if(a[i][j]==0 || daDuyet[i][j]==true) return;
    // De quy
        daDuyet[i][j]=true; // danh dau la da duyet
        DFS(a,i,j+1);
        DFS(a,i,j-1);
        DFS(a, i+1,j);
        DFS(a,i-1,j);
    }

    public int numIslands(char[][] a) {
        sohang = a.length;
        socot = a[0].length;
        int count = 0;
        for (int i = 0;i < sohang; i++) {
            for (int j = 0; j < socot ; j++) {
                if(a[i][j]=='1'&& daDuyet[i][j]==false){
                    DFS(a, i, j);
                    count ++;
                }
            }
        }
        return  count;
    }

    public static void main(String[] args) {

    }
}
