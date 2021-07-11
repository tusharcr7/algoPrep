class RotateBy90
{
    static void rotate(int a[][]) 
    {
     
	
		int N = a[0].length;

		for (int x = 0; x < N / 2; x++) {
			for (int y = x; y < N - x - 1; y++) {
				int temp = a[x][y];
				a[x][y] = a[y][N - 1 - x];

				a[y][N - 1 - x] = a[N - 1 - x][N - 1 - y];

				a[N - 1 - x][N - 1 - y] = a[N - 1 - y][x];

				a[N - 1 - y][x] = temp;
			}

		}

	



	   
    }
}
