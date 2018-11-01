
public class RecussionFibonacci { // returning the n-th Fibonacci number
	public static int recFib (int n) {
		if (n==1 || n==2)
			return 1;
		return recFib(n-1) + recFib(n-2);
	}
	
	
	public static int nonRecFib (int n/*4 bytes*/) { // returning the n-th Fibonacci number
		if (n==1 || n==2) return 1;
		int prev = 1;// 4 bytes
		int pprev = 1;// 4 bytes
		int temp = 0;// 4 bytes
		for(int i/*4 bytes*/=3; i <=n; i++){
			temp = prev + pprev;
			pprev = prev;
			prev = temp; // T(n) O(n)
		}
		return temp;
	}// space complexity = 20 bytes
}	// operational complexity = loop runs n-3 times: theta (n)
