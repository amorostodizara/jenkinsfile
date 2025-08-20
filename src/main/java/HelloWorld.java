package main.java;
public class HelloWorld {
    public String getMessage() {
        return "Hello, World";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().getMessage());
    }
}
