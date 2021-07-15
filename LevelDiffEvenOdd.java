class LevelDiffEvenOdd
{
	int getLevelDiff(Node root)
	{
	    HashMap<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("e",0);
	hm.put("o",0);
	gL(root,0,hm);
	return hm.get("e")-hm.get("o");
	    
	}
	void gL(Node root,int h,HashMap<String,Integer> hm)
	{
	    if(root==null) return;
	    
	    if(h%2==0)
	    hm.put("e",(hm.get("e")+root.data));
	    else
	    hm.put("o",(hm.get("o")+root.data));
	    
	    gL(root.left,h+1,hm);
	    gL(root.right,h+1,hm);
	}
	
}
