package understanding.diamond.problem;

public interface MyInterfaceTwo {

    default void myMethod() {
        System.out.println("Inside MyInterfaceTwo!");
    }
}
