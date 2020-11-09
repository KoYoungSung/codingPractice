package koys.java8to11.staticMethod;

public interface Foo {
    void printName();

    default void printNameUpperCase(){
        System.out.println("FOO");
    }
}
