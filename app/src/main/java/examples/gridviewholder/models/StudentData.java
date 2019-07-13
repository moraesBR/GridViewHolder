package examples.gridviewholder.models;

public class StudentData {
    private String name;
    private int age;
    public StudentData(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
