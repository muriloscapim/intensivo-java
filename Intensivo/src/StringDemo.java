public class StringDemo {

    public static void main(String[] args) {

        String str = "abcde FGHIJ ABC abc DEFG    ";

        System.out.println(str.equals("abcde"));
        System.out.println("Tamanho do string: " + str.length());
        System.out.println("Caractere do índice: " + str.charAt(4));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,9));
        System.out.println(str.replace('a','x'));
        System.out.println(str.replace("abc","y"));
        System.out.println(str.indexOf("bc"));
        System.out.println(str.lastIndexOf("bc"));

        String s = "batata maçã limão";

        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
