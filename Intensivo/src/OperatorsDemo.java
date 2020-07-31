public class OperatorsDemo {

    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);


        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 & b2);
        System.out.println(b1 | b2);
        System.out.println(b1 ^ b2);

        System.out.println(x > 3 && x < 10);
        System.out.println(x > 3 || x < 4);
        System.out.println(!(x > 3 && x < 10));
    }
}
