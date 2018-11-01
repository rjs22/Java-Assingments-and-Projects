
public class repeatEx {


	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		repeat1('a', 10000);
		long endTime = System.currentTimeMillis();
		long elapsed = endTime - startTime;
		
		long startTime2 = System.currentTimeMillis();
		repeat2('a', 10000);
		long endTime2 = System.currentTimeMillis();
		long elapsed2 = endTime2 - startTime2;
		
		System.out.println(elapsed);
		System.out.println(elapsed2);
		

	}
	
	public static String repeat1(char c, int n){
		String answer = "";
		for (int j=0; j < n; j++)
			answer += c;
		return answer;
	}
	
	public static String repeat2(char c, int n){
		StringBuilder sb = new StringBuilder();
		for (int j=0; j < n; j++)
			sb.append(c);
		return sb.toString();
	}

}
