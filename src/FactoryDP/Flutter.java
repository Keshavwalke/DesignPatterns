package FactoryDP;

public class Flutter {
    public void setTheme(){ //Non factory method
        System.out.println("setting the theme");
    }

    public void setRefreshRate(){   //Non factory method
        System.out.println("Setting refresh rate....");
    }

    public UIFactory createUIFactory(SupportedPlatforms platform){
        //OCP is getting violating -> if-else conditions
//        if(platform.equals(SupportedPlatforms.Android)){
//            return new AndroidUIFactory();
//        }
//        else if(platform.equals((SupportedPlatforms.IOS))){
//            return new IOSUIFactory();
//        }
//        return null;

        return UIFactoryFactory.createUIFactoryForGivenPlatform(platform);
    }
}
