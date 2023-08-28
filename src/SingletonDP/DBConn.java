package SingletonDP;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConn {
    int a;
    int b;
    private DBConn (int a, int b){
        this.a=a;
        this.b=b;
    }
    private static DBConn instance;
    private static Lock lock=new ReentrantLock();

    public static DBConn getInstance(int a, int b){
        if(instance==null){
            lock.lock();
            if(instance==null){
                instance=new DBConn(a,b);
            }
            lock.unlock();
        }
        return instance;
    }


}
