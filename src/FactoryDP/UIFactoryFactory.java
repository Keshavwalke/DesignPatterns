package FactoryDP;

public  class UIFactoryFactory {

    //SRP for creating UIFactory
    //This is called Practical Factory design pattern
    public static UIFactory createUIFactoryForGivenPlatform(SupportedPlatforms platform){
        if(platform.equals(SupportedPlatforms.Android)){
            return new AndroidUIFactory();
        }
        else if(platform.equals((SupportedPlatforms.IOS))){
            return new IOSUIFactory();
        }
        return null;
    }
}
