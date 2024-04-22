public class Hello{

    public static void main(String args []){
        System.out.println("Hello World.");
        Test test = new Test();
    }

    static {
        System.out.println("Static block in Hello Class");
    }
}