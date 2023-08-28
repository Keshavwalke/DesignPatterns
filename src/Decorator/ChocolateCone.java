package Decorator;

public class ChocolateCone implements Icecream{
    // Chocolate Cone can behave like a base as well as Addon

    private  Icecream icecream;
    public ChocolateCone(){
        // Default constructor
    }

    public ChocolateCone(Icecream icecream){
        this.icecream=icecream;
    }
    @Override
    public int getCost() {
        if(icecream!=null){
            return icecream.getCost() +30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if(icecream!=null){
            return icecream.getDescription()+" + Chocolate Cone ";
        }
        return "Chocolate Cone";
    }
}
