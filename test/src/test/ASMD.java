package test;

public class ASMD {
	public int cre(int a,int b)
	{
        int d = a-b;
		return d;
	}
	public static void main(String args[])
	{
		ASMD x = new ASMD();
		int c = x.cre(30,4);
		System.out.println("Subtraction : "+c);
		
	}

}
