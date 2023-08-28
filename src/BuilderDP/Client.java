package BuilderDP;

public class Client {
    public static void main(String[] args) {
        Student st=Student.getBuilder()
                .setAge(22)
                .setName("Raj").build();
    }
}
