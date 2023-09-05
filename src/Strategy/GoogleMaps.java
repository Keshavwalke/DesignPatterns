package Strategy;

public class GoogleMaps {
    public void findPath(String from, String to, Mode mode){
        PathCalculatorStrategy pathCalculatorStrategy=
                PathCalculatorFactory.getStrategy(mode);

        pathCalculatorStrategy.findPath(from, to);
    }
}
