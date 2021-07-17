package understanding.diamond.problem;

public interface MyInterfaceOne {

    default void myMethod() {
        System.out.println("Inside MyInterfaceOne!");
    }

}
