public class HelloWorld {
    public String getMessage() {
        return "Hellolo, World";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().getMessage());
    }
}
