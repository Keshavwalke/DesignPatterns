package Decorator;

public class VanillaScoop implements Icecream{

    // VanillaScoop can only act like addon, so we cannot provide default constructor

    private Icecream iceCream;
    public VanillaScoop(Icecream iceCream){
        this.iceCream=iceCream;
    }
    @Override
    public int getCost() {          //Always check for Null pointer exception
        if(iceCream!=null) {
            return iceCream.getCost() + 15;
        }
        throw new RuntimeException("Please add a Cone first");
    }

    @Override
    public String getDescription() {
        if(iceCream!=null) {
            return iceCream.getDescription() + " + Vanilla Scoop";
        }
        throw new RuntimeException("Please add a Cone first");
    }
}
