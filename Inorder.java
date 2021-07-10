class Inorder {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
    
        ArrayList<Integer> obj=new ArrayList<Integer>();
        inOrder(root,obj);
        return obj;
    }
    
    public void inOrder(Node root,ArrayList<Integer> obj)
    {
        if(root==null) return;
        
        inOrder(root.left,obj);
        obj.add(root.data);
        inOrder(root.right,obj);
        
    }
}
