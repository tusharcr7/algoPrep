class IdenticalTree
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	    if(root1==null && root2!=null)
	    return false;
	    if(root2==null && root1!=null)
	    return false;
	    
	    if(root1==null && root2==null)
	    return true;
	    else
	    {
	       if(root1.data==root2.data)
	       {
	        return isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right); 
	       }
	       else
	       return false;
	    }
	        
	 
	}
	
}
