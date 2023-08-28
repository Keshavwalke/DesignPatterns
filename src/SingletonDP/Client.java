package SingletonDP;

public class Client {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        DBConn obj=DBConn.getInstance(a,b);
    }
}
