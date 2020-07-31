public class ModifiersDemo {

    public static void main(String[] args) {
        Modifiers ob = new Modifiers();
        //ob.alpha = 10; Errado! atributo private

        // encapsulamento
        ob.setAlpha(10);
        System.out.println("ob.alpha is " + ob.getAlpha());

        ob.beta = 88;
        ob.gamma = 99;
    }
}
