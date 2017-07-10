package chapter1;

public class staticMethodTest{
	//calculate absolute value
	public static double abs(double a){
		if ( a < 0 ) return -a;
		else		 return a;	
	}

	//prime number judgement(找到该数以下，最大的平方数，然后其根去整除该数，17 最大平方数16，用17除以4)
	public static boolean isPrime(int n){
		if (n < 2) return false;
		for (int i = 2; i*i < n ; i++ ) 
			if (n % i == 0) return false;
		return true;
	}

	//radicals square root
	public static double sqrt(double c){
		if (c < 0) return Double.NaN;
		double t = c;
		double err = 1e-15;
		while(Math.abs(t - c/t) > err*t)
			t = (c/t + t)/2.0;
		return t;
	}



	//achievement
	public static void main(String[] args){
		double x = -1;
		System.out.println(x);
		x = abs(x);
//		System.out.println(abs(x));
		System.out.println(x);

		int isP = 17;
		
		System.out.println(isPrime(isP));


		//
		double sX = 17;
		System.out.println(sqrt(sX));
		
		
	}
}