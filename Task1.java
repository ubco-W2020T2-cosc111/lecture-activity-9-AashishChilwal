public class Main {
	public static void main(String[] args) {

		int[][] m1 = { 	{ 14, 11, 13, 12 }, 
							{ 18, 15, 13, 13 },
							{ 19, 16, 15, 17 } };

		int[][] m2 = { 	{ 54, 53, 51, 52 }, 
							{ 51, 59, 52, 56 },
							{ 53, 54, 52, 58 } };

		System.out.println("First array:"); 
		displayArray(m1);
		System.out.println("Second array:"); 
		displayArray(m2);
        if (equals(m1,m2) == true)
            System.out.println("The two arrays are strictly identical");
        else 
            System.out.println("The two arrays aren't strictly identical");

	}

	public static boolean equals(int[][] m1, int[][] m2){
	    String str = "The arrays aren't exactly equal"; 
	    String str1 = "The arrays are identical";
	    for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}
		return true;
	
	}

	public static void displayArray(int[][] m) {

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++)
				System.out.print(m[r][c] + " ");
			System.out.println();
		}
	}
}
