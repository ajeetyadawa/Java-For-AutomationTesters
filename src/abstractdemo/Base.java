package abstractdemo;

public abstract class Base {
    abstract void sum(int a, int b);

    abstract void subtract(int a, int b);

    public void displayMessage() {
        System.out.println("This is non abstract method");
    }

}
