class ReverseFirstKElementsQ
{
    //Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
     Queue<Integer> qt = new LinkedList<Integer>();
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < k; i++) {
			st.push(q.poll());
		}
		while (!st.isEmpty()) {
			qt.add(st.pop());
		}
		qt.addAll(q);
		return qt;
    }
}
