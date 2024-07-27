package JavaExamplePracticse;

public class constructorExample {
	
	
	 public constructorExample() {
		System.out.println("Default constructor");
			 }

     public constructorExample(int i)
     {
    	 System.out.println("The value of i is"+ i);
     }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructorExample s = new constructorExample();
		constructorExample s1 = new constructorExample(5);
		
	}

}
