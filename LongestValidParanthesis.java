class LongestValidParanthesis{
    static int maxLength(String S){
		Stack<Integer> st = new Stack<Integer>();
		st.push(-1);
		int count = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(')
				st.push(i);
			else {
				if (!st.isEmpty()) {

					st.pop();
				}

				if (!st.isEmpty()) {
					count = Math.max(count, i - st.peek());
				} else
					st.push(i);
			}

		}

		return count;
    }
}
