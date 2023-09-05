package Strategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getStrategy(Mode mode){
        if(mode.equals(Mode.Car)){
            return new CarPathCalculator();
        }
        else if(mode.equals(Mode.Bike)){
            return new BikePathCalculator();
        }
        else{
            return new WalkPathCalculator();
        }
    }
}
