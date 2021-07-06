import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfBinaryTree {

	public static class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}

	}

	// Function to return list containing elements of right view of binary tree.
	ArrayList<Integer> rightView(Node node) {
       ArrayList<Integer> obj=new ArrayList<Integer>();
       if(node==null) return obj;
       Queue<Node> q=new LinkedList<Node>();
       q.add(node);
       while(!q.isEmpty())
       {
           int n=q.size();
           for(int i=1;i<=n;i++)
           {
        	   Node temp=q.poll();
        	   if(i==n)
        		   obj.add(temp.data);
        		   
        		   if(temp.left!=null)
        			   q.add(temp.left);
        	   if(temp.right!=null)
    			   q.add(temp.right);
           }
           
           
           
       }
	return obj;
       
    }

}
