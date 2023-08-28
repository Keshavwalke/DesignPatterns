package Prototype_Registry;

public class Student {
    //This class has private attributes, getters, setters
    //Default constructor, copy constuctor, clone method
    private String name;
    private int age;
    private double psp;
    private String batch;
    private double avgBatchPSP;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAvgBatchPSP(double avgBatchPSP) {
        this.avgBatchPSP = avgBatchPSP;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public String getBatch() {
        return batch;
    }

    public double getAvgBatchPSP() {
        return avgBatchPSP;
    }

    public Student(){
        //Default constructor
    }

    public Student (Student st){
        this.name=st.name;
        this.age=st.age;
        this.psp=st.psp;
        this.batch=st.batch;
        this.avgBatchPSP=st.avgBatchPSP;
    }

    @Override
    public Student clone(){
        return new Student(this);
    }
}
