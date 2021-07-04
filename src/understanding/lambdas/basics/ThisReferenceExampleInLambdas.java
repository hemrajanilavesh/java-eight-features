package understanding.lambdas.basics;

import java.util.Arrays;

public class ThisReferenceExampleInLambdas {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ThisReferenceExampleInLambdas thisReferenceExampleInLambdas = new ThisReferenceExampleInLambdas();
		thisReferenceExampleInLambdas.doProcess(10, i -> {
			//System.out.println("Value of i:" + i);
			// lambdas treat this reference differently as compared to an anonymous inner class
			// its not allowed
			// System.out.println(this);
		});
		thisReferenceExampleInLambdas.execute();
	}
	
	public void doProcess(int i, Process process) {
		process.process(i);
	}
	
	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i:" + i);
			System.out.println(this);
		});
	}

	@Override
	public String toString() {
		return "ThisReferenceExampleInLambdas [Main class instance]";
	}
	
	

}

interface Process {
	public void process(int i);
}
