package chapter1;
/**
 * 欧几里得算法，求两个数的最大公约数
 */
public class gcd{
	public static int gcd(int p, int q){
		if (q == 0) return p;
		int r = p % q ;
		return gcd(q, r);
	}

	public static void main(String[] args) {
		int a = 4;
		System.out.println(gcd(11, 6));
	}
}