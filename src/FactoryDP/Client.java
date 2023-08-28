package FactoryDP;

public class Client {
    public static void main(String[] args) {

        Flutter flutter=new Flutter();
        UIFactory uiFactory= flutter.createUIFactory(SupportedPlatforms.Android);
        // UIFactory -->AndroidFactory

        Button button= uiFactory.createButton();
        button.showButton();

        Menu menu=uiFactory.createMenu();
        menu.showMenu();
    }
}
