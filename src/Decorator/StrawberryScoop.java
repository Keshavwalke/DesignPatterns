package Decorator;

public class StrawberryScoop implements Icecream{

    //StrawberryScoop can only act like addon, so we cannot provide default constructor

    private Icecream iceCream;
    public StrawberryScoop(Icecream iceCream){
        this.iceCream=iceCream;
    }
    @Override
    public int getCost() {          //Always check for Null pointer exception
        if(iceCream!=null) {
            return iceCream.getCost() + 10;
        }
        throw new RuntimeException("Please add a Cone first");
    }

    @Override
    public String getDescription() {
        if(iceCream!=null) {
            return iceCream.getDescription() + " + Strawberry Scoop";
        }
        throw new RuntimeException("Please add a Cone first");
    }
}
