
public class SumEx {

	public static void main(String[] args) {
		System.out.println(sum(7));

	}
	
	public static int sum(int i){
		if(i == 1)
			return 2;
		else
			return i*2 + sum(--i);
	}

}
