package 代理模式.I_单例;

/*      这个代码通过使用双端检锁来确保线程安全。 volatile 关键字确保 instance 变量对所有线程的可见性。
        然后，使用 synchronized 保证在同一时刻只会有一个线程访问 getInstance() 方法。 而且，由于 instance 被声明为静态和私有的，因此只能在类内部访问它。
        此外，构造函数也是私有的，因此实例化对象只能通过 public static 方法 getInstance()。 这样可以防止使用 new 关键字直接创建类的实例。
        因此，此实现确保只有一个实例在整个应用程序中创建，即使多个线程同时使用 getInstance() 方法也是安全的。
 */

public class Singleton {
    private static volatile Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    synchronized (Singleton.class){
                        instance = new Singleton();
                    }

                }
            }
        }
        return instance;
    }


    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2); // 输出为 true
    }
}