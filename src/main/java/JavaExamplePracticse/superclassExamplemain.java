package JavaExamplePracticse;

public class superclassExamplemain extends Superexample{

	
	
	
	public void  firstMethod()
	{
		String colour ="white";
		System.out.println(super.color);
		super.firstMethod();
		System.out.println(" Child class is invoked");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		superclassExamplemain s = new superclassExamplemain();
		s.firstMethod();
	}

}
