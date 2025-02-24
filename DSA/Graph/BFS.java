import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

public static void main(String[] args) {
  ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);


        ArrayList<Integer> ans = bfsGraph(adj.size(),adj);
        int n = ans.size();
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" ");
        }

}
public static ArrayList<Integer> bfsGraph(int v, ArrayList<ArrayList<Integer>> adj){

  ArrayList<Integer> bfs = new ArrayList<>();

  boolean[] vis = new boolean[v];

  Queue<Integer> queue = new LinkedList<>();

  queue.add(0); //taking 0 at starting index
  vis[0] = true;
  while(!queue.isEmpty()){
    Integer node = queue.poll();
    bfs.add(node);

    //get all the adjacent vertices of the node making sure they havent been visited before

    for(Integer it : adj.get(node)){  //adg.get(node) means it on {1,2}
      if(vis[it] == false){
        vis[it] = true;
        queue.add(it);
      }

    }
  }
  return bfs;
}
}


