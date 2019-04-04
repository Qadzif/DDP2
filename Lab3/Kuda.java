import java.util.Scanner;

public class Kuda {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukan ukuran catur:");
		int n = Integer.parseInt(input.nextLine()); 
		
		System.out.println("Masukan papan catur:");
		int[] posKuda = new int[2];
		char[][] papan = new char[n][n];
		for (int i = 0; i < n; i++) {
			String inp = input.nextLine();
			for (int j = 0; j < n; j++) {
				char bidak = inp.charAt(j * 2);
				papan[j][i] = bidak;
				if (bidak == 'H') {
					posKuda[0] = i; posKuda[1] = j;
				}
			}
		}
		
		int res = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (papan[j][i] == 'P') {
					int dx = Math.abs(i - posKuda[0]);
					int dy = Math.abs(j - posKuda[1]);
					if (dx + dy == 3 && dx * dy == 2) res++;
				}
			}
		}
		
		System.out.println("Banyaknya bidak catur yang dapat dimakan kuda:\n" + res);
	}
}