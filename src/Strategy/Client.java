package Strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps=new GoogleMaps();
        googleMaps.findPath("from", "to", Mode.Car);
        googleMaps.findPath("from", "to", Mode.Bike);
    }
}
