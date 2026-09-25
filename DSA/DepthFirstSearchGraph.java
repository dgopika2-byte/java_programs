/*
        0
       / \
      1   2
      |
      3
      
graph
index:-
  0        1        2        3
  ↓        ↓        ↓        ↓
┌─────┐  ┌─────┐  ┌─────┐  ┌─────┐
│[1,2]│  │[0,3]│  │ [0] │  │ [1] │
└─────┘  └─────┘  └─────┘  └─────┘ */



package DSA;
import java.util.*;
public class DepthFirstSearchGraph {
    static void dfs(int node,ArrayList<ArrayList<Integer>> graph,boolean[] visited){
        visited[node]=true;
        System.out.println(node+" ");
        for(int neightbour:graph.get(node)){
            if(!visited[neightbour]){
                dfs(neightbour, graph, visited);
            }
        }
    }
    public static void main(String args[]){
        int n=4;
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(2).add(0);
        graph.get(3).add(1);
        boolean[] visited=new boolean[n];
        dfs(0,graph,visited);

    }
}
