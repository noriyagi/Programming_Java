package hayameguri;

public class ImprovedFibonacci {
	static final int MAX_INDEX = 9;
	
	public static void main(String[] args)
	{
		int lo = 1;
		int hi = 1;
		String mark;
		
		System.out.println("1: " + lo);
		for (int i = 2; i <= MAX_INDEX; i++){
			if (hi % 2 ==0)
				mark = " *";
			else
				mark = "";
			System.out.println(i + " :" + hi + mark);
			hi = lo + hi;
			lo = hi - lo;
		}
	}

}
