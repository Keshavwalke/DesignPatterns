package Decorator;

public class Client {
    public static void main(String[] args) {
      Icecream icecream=
              new ChocoChips(
                      new VanillaScoop(
                              new StrawberryScoop(
                                      new ChocolateCone(
                                              new OrangeCone()
                                      )
                              )
                      )
              );

        System.out.println(icecream.getCost());
        System.out.println(icecream.getDescription());
    }
}
