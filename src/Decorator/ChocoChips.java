package Decorator;

public class ChocoChips implements Icecream{

    //ChocoChips can only act like addon, so we cannot provide default constructor

    private Icecream iceCream;
    public ChocoChips(Icecream iceCream){
        this.iceCream=iceCream;
    }
    @Override
    public int getCost() {          //Always check for Null pointer exception
        if(iceCream!=null) {
            return iceCream.getCost() + 5;
        }
        throw new RuntimeException("Please add a Cone first");
    }

    @Override
    public String getDescription() {
        if(iceCream!=null) {
            return iceCream.getDescription() + " + Choco Chips";
        }
        throw new RuntimeException("Please add a Cone first");
    }
}
