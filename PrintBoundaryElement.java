class PrintBoundaryElement
{
		ArrayList<Integer> printBoundary(Node node) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			pd(node, al);
			return al;
		}

		void pd(Node root, ArrayList<Integer> al) {
			if (root == null)
				return;
			al.add(root.data);

			leftBoundary(root.left, al);
			leaf(root.left, al);
			leaf(root.right, al);
			rightBoundary(root.right, al);

		}

		void leaf(Node node, ArrayList<Integer> al) {
			if (null == node)
				return;

			leaf(node.left, al);
			if (node.left == null && node.right == null) {
				al.add(node.data);
			}
			leaf(node.right, al);

		}

		void leftBoundary(Node node, ArrayList<Integer> al) {
			if (null == node)
				return;

			if (node.left != null) {
				al.add(node.data);
				leftBoundary(node.left, al);

			} else if (node.right != null) {
				al.add(node.data);
				leftBoundary(node.right, al);
			}
		}

		void rightBoundary(Node node, ArrayList<Integer> al) {
			if (null == node)
				return;

			if (node.right != null) {

				rightBoundary(node.right, al);
				al.add(node.data);

			} else if (node.left != null) {

				rightBoundary(node.left, al);
				al.add(node.data);
			}
		}
}
