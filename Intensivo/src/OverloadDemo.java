public class OverloadDemo {
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.ovlDemo();
        obj.ovlDemo(2);
        System.out.println("Result " + obj.ovlDemo(1, 2));
        System.out.println("Result " + obj.ovlDemo(2.0, 3.0));
    }
}
