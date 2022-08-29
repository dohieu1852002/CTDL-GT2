package Graph;


import java.util.HashSet;
import java.util.Set;

public class sampleDFSbyrecursion {
    public static void DFS(int u, int[][] graph, Set<Integer> daduyet) {
        System.out.print(u +" ");

        for (int v =graph.length-1; v>=0 ; v--) {
            if (daduyet.contains(v)==false && graph[u][v]==1){
                daduyet.add(v);
                DFS(v,graph,daduyet);
            }
        }
    }

    public static void main(String[] args) {



        int[][] graph = {{0, 1, 0, 0, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0, 1, 1},
                {0, 1, 0, 0, 0, 0, 1},
                {0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0}
        };
        Set<Integer> daduyet = new HashSet<>();
        daduyet.add(0);
        DFS(0, graph,daduyet);
    }
}
