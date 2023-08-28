package Prototype_Registry;

public class IntelligentStudent extends  Student{
    int IQ;

    public IntelligentStudent(){
        //Default constructor
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }
    public int getIQ() {
        return IQ;
    }

    private IntelligentStudent(IntelligentStudent IS){
        super(IS);
        this.IQ=IS.IQ;
    }

    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
