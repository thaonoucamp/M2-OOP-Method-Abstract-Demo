public class Thao1 extends Thao {
    @Override
    public double rice() {
        // super extends method cua thang Ong noi;
        System.out.println("$2000");
        return super.rice();
    }

    public static void main(String[] args) {
        Thao1 thao = new Thao1();
        Person thao1 = new Thao1();

        thao.rice();
        thao1.rice();
    }
}
