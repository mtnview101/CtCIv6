package Big_O;

public class Ex_01 {
	public static int sum(int n) {
		int sum=0;
/*		if (n <= 0) {return 0;}
		return n + sum(n-1);}*/
		for(int i=0;i<=n;i++){sum=sum+i;}
		return sum;}
	
	public static void main(String[] args) {
		int s = sum(100);
		System.out.println(s);
	}
}
