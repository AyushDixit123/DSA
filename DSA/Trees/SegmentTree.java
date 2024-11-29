import java.util.Scanner;

public class SegmentTree {
  public static void main(String[] args) {
    int[] arr = {3,8,7,6,-2,-8,4,9};

  }

  private class Node{
    int startInterval;
    int endInterval;
    int data;
    Node left;
    Node right;

    public Node(int s, int e, int data){
      this.startInterval = s;
      this.endInterval = e;
      this.data = data;
    }

    public Node(int s, int e){
      this.startInterval = s;
      this.endInterval = e;
    }
  }
  Node root;

  public SegmentTree(int[] arr){
    //create a tree using this arr

    this.root = constructTree(arr,0,arr.length-1);
  }

  private constructTree(int[] arr, int start, int end){
    if(start == end){
      //leaf node i.e. base condition
      Node leaf = new Node(start, end);
      leaf.data = arr[start];
      return leaf;
    }

    Node node = new Node(start, end);

    int mid = (start + end)/2;

    node.left = this.constructTree(arr,start,mid);
    node.right = this.constructTree(arr,mid+1,end);

    node.data = node.left.data + node.right.data;

    return node;
  }

  //creatin query
  // 4 cases
  public int query(int qsi , int qei){
    return this.query(qsi, qei, this.root);
  }

  private int query(int qsi , int qei , Node node){

    if(node.startInterval >= qsi && node.endInterval <=qei){
      // node is completely lying inside query

      return node.data;
    }else if(node.startInterval > qei || node.endInterval < qsi){
      return 0;
    }else{
      return this.query(qsi, qei, node.left) + this.query(qsi, qei,node.right);
    }

  }

}

