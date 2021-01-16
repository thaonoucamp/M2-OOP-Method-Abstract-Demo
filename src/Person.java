public abstract class Person {
    private String name;

    // method abstract ko chua body nen bo {} va ket thuc Ham bang (;)
    public abstract double rice();


    Person() {

    }

    Person(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // Person p = new Person(); Lop abstract ko tao Obj truc tiep;
    }
}

