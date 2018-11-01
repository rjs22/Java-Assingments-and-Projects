
public class ArrayProblem {

	public static double[] prefixAverage1(double[] x) { // Quadratic-Time Algorithm
		int n = x.length;
		double[] a = new double[n];
		for (int j=0; j < n; j++){
			double total = 0;
			for (int i=0; i <= j; i++)
				total += x[i];
			a[j] = total / (j+1);
		}
		return a;
	}

	public static double[] prefixAverage2(double[] x) { // Linear-Time Algorithm 
		int n = x.length;
		double[] a = new double[n];
		double total = 0;
		for (int j=0; j < n; j++) {
			total += x[j];
			a[j] = total / (j+1);
		}
		return a;
	}
	
	public static boolean hasDuplicate(int[] a) { // comparing variables between two arrays
		for(int i=0; i < a.length; i++){
			for(int j=i+1; j < a.length; j++){
				if(a[i] == a[j])
					return true;
			}
		}
		return false;
	}
}
