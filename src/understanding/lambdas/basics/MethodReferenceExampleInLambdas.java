package understanding.lambdas.basics;

public class MethodReferenceExampleInLambdas {

	public static void main(String[] args) {
		
		// below is equivalent to passing () -> doProcess() lambda expression to Thread constructor
		Thread t = new Thread(MethodReferenceExampleInLambdas::doProcess);
		t.start();

	}
	
	// no-args static method
	public static void doProcess() {
		System.out.println("Hello, World");
	}

}
