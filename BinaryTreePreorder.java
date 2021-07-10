class BinaryTreePreorder
{
    //Function to return a list containing the preorder traversal of the tree.
   static ArrayList<Integer> preorder(Node root) {
    
        ArrayList<Integer> obj=new ArrayList<Integer>();
        preorder(root,obj);
        return obj;
    }
    
    public static void preorder(Node root,ArrayList<Integer> obj)
    {
        if(root==null) return;
        
        obj.add(root.data);
        preorder(root.left,obj);
        
        preorder(root.right,obj);
        
    }

}
