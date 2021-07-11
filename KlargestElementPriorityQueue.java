class KlargestElementPriorityQueue
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
       

		PriorityQueue<Integer> q = new PriorityQueue<Integer>((t1, t2) -> {

			return t2 - t1;
		});
		for (int i = 0; i < n; i++) {
			q.add(arr[i]);
		}
		ArrayList<Integer> obj = new ArrayList<>();

		for (int i = 0; i < k; i++) {

			obj.add(q.poll());
		}

		return obj;
	
      
       
    
    }
}
