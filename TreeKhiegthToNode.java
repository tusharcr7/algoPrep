class TreeKhiegthToNode
{
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          ArrayList<Integer> d=new  ArrayList<Integer>();
         
         
          
          Kd(root,k,d,0);
          return d;
          
     }
     void Kd(Node root, int k,ArrayList<Integer> obj,int h)
     {
          if(root==null)
          return;
          
          if(h==k)
          obj.add(root.data);
          
          Kd(root.left,k,obj,h+1);
          Kd(root.right,k,obj,h+1);
     }
}
