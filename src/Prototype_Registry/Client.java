package Prototype_Registry;

public class Client {
    private static void fillRegistry(StudentRegistry registry){
        Student apr22Batch=new Student();
        apr22Batch.setBatch("APR22 Intermediate");
        apr22Batch.setAvgBatchPSP(75.0);

        registry.register("apr22Batch", apr22Batch);

        IntelligentStudent apr22IntelligentStudent= new IntelligentStudent();
        apr22IntelligentStudent.setBatch("APR22 Intermediate");
        apr22IntelligentStudent.setAvgBatchPSP(95.0);
        apr22IntelligentStudent.setIQ(150);

        registry.register("apr22IntelligentStudent", apr22IntelligentStudent);
    }


    public static void main(String[] args) {
        StudentRegistry registry =new StudentRegistry();
        fillRegistry(registry);

        Student Raj = registry.get("APR22Batch").clone();
        Raj.setName("Raj");
        Raj.setAge(24);
        Raj.setPsp(90.0);

        Student Veer= registry.get("APR22Batch").clone();
        Veer.setName("Veer");
        Veer.setAge(23);
        Veer.setPsp(84);

        Student Karan =registry.get("apr22IntelligentStudent");
        Karan.setName("Karan");
        Karan.setAge(22);
        Karan.setPsp(95);


        System.out.println("debug");

    }
}
