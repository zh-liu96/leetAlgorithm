package chapter1;
import java.util.*;

public class BinarySearch{
	public static int rank(int key, int[] a){
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi){
			int mid = lo + (hi - lo) / 2;
			if (key > a[mid]) lo = mid + 1;
			else if (key < a[mid]) hi = mid - 1;
			else return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] whitelist = new int[10];
		for(int i = 0; i < 10; i++){
			System.out.println("请输入一个数字");
			whitelist[i] = in.nextInt();
		}
		
		Arrays.sort(whitelist);
		System.out.println(rank(4,whitelist));
		
	}
}