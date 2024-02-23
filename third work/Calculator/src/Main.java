public class Main {
    public static void main(String[] args) {
        Computer c1 = new plus();
        Computer c2 = new abatement();
        Computer c3 = new multiplied();
        Computer c4 = new divide();
        System.out.println(c1.computer(9,9));
        System.out.println(c2.computer(9,9));
        System.out.println(c3.computer(9,9));
        System.out.println(c4.computer(9,9));
    }
}