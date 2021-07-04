package understanding.lambdas.basics;

import java.util.function.Consumer;

public class Greeter {
	
	
	public void performGreeting(Greeting greeting) {
		greeting.greet();
	}

	public void performGreeting(Greeter greeter, Consumer<Greeter> consumer) {
		consumer.accept(greeter);
	}

	public static void main(String[] args) {
		// assigning a lambda function to a functional interface
		Greeting myLambdaFunction = () -> System.out.println("Hello, World!");
		// the signature of the lambda expression should be same as the function inside the functional interface
		Greeting greeting = () -> System.out.println("Yo Buoy!");
		
		new Greeter().performGreeting(myLambdaFunction);
		new Greeter().performGreeting(greeting);
		
		MyAdd myAdd = (int a, int b) -> a+b;
		

	}

}

// this is a functional interface
interface Greeting {
	void greet();
}

//this is a functional interface
interface MyAdd {
	int add(int a, int b);
}

