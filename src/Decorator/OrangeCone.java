package Decorator;

public class OrangeCone implements  Icecream{
    // Orange Cone will only behave like base
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
