package Big_O;

public class Ex_03 {
	public static void minAndMax(int[] array) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int x : array) {
			if (x < min) min = x;
			if (x > max) max = x;
		}
		System.out.println(min + ", " + max);
	}
	
	
	public static void main(String[] args) {
		int[] array = {1, 2, 5, 2, 2, 5, -1, 9, 3};
		minAndMax(array);
	}		
}
