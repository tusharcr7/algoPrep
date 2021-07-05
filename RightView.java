class RightView{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
       
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (node == null)
			return res;
		Queue<Node> q = new LinkedList<Node>();
		q.add(node);
		while (!q.isEmpty()) {
			int n = q.size();

			for (int i = 1; i <= n; i++) {
				Node e = q.poll();
				if (i == n)
					res.add(e.data);

				if (e.left != null)
					q.add(e.left);
				if (e.right != null)
					q.add(e.right);

			}

		}
		return res;
	
    }
}
