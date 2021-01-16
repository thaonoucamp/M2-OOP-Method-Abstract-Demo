public class Extends_A extends Abstract_A {
    @Override
    public double rice() {
        return 1000;
    }

    public static void main(String[] args) {
        Extends_A a = new Extends_A();
        double s = a.rice();
        System.out.println(s);
    }
}
