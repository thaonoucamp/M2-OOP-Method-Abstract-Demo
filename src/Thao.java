public abstract class Thao extends Person{
    @Override
    // khi extends class abstract thi tu mat key abstract trong method;
    public double rice() {
        // khi extends method abstract thi phai Override va phai co body;
        System.out.println("$1000");
        return 0;
    }
// Khi extends abstract thi phai tao 1 class sub de tao Obj;
    // Thao thao = new Thao();
   // Person p = new Thao();
}
