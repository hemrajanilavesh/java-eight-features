package understanding.diamond.problem;

/**
 *
 * In Java, a class can implement multiple Interface.
 * Since Java 8, an interface can have default methods.
 * If a class implements two interfaces which have same default method then this will result in diamond problem.
 * The Class implementing two interfaces with same default method will not compile.
 * Solution : Override the method explicitly and call your super class method.
 *
 */
public class DiamondProblemClass implements MyInterfaceOne, MyInterfaceTwo {
    @Override
    public void myMethod() {
        MyInterfaceOne.super.myMethod();
    }
}
