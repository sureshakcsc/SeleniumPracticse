package javaProgramsExample;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "suresh";
		String rev= "";
		
		int lenst= str.length();
		for(int i=lenst-1;i>=0;i--)
		{
			rev= rev+ str.charAt(i);
		}

		System.out.println(" The revese number :"+ rev);
	}

}
