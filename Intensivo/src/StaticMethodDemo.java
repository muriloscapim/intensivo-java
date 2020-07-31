public class StaticMethodDemo {

    public static void main(String[] args) {

        StaticMethod.myStaticMethod();

        StaticMethod myObj = new StaticMethod();
        myObj.myPublicMethod();

        Math.sqrt(81);
    }
}
