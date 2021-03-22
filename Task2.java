
public class Task2 {
	public static void main(String[] args) {

		int[][] m1 = { 	{ 14, 11, 13, 12 }, 
							{ 18, 15, 13, 13 },
							{ 19, 16, 15, 17 } };

		int[][] m2 = { 	{ 54, 53, 51, 52 }, 
							{ 51, 59, 52, 56 },
							{ 53, 54, 52, 58 } };

		System.out.println("First array:"); 
		displayArray(m1);
        System.out.println("First array after shuffling its rows: ");
        shuffle(m1);
        displayArray(m1);
	}

public static void shuffle(int[][] m) {

        int row1; 
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                do {
                    row1 = (int)(Math.random() * m.length);
                } while (row1 == i);
                int[] temp = m[i];
                m[i] = m[row1];
                m[row1] = temp;
            }
        }

    }

	public static void displayArray(int[][] m) {

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++)
				System.out.print(m[r][c] + " ");
			System.out.println();
		}
	}
}
