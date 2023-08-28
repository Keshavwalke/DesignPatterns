package BuilderDP;

public class Student {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }


    private Student(Builder bld){
        this.age=bld.age;
        this.name=bld.name;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private int age;
        private String name;

        public Builder setAge(int age){
            this.age=age;
            return this;
        }
        public Builder setName(String name){
            this.name=name;
            return this;
        }

        public Student build() throws IllegalArgumentException {
            if(age<=0 || age>=90) {
                throw new IllegalArgumentException("Age should be within 1 to 90 years");
            }
            if(name.length()>20 || name.isEmpty()) {
                throw new IllegalArgumentException("Please enter valid name");
            }

            return new Student(this);
        }

    }
}
