package oops2;

// Singleton class -> Allows only one object or instance creation
public class SingletonClass {
    private SingletonClass() {}
    private static SingletonClass instance;

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
            System.out.println("Instance created");
        }
        return instance;
    }

    static void main(String[] args) {
        SingletonClass instance1 = SingletonClass.getInstance();
//        SingletonClass instance2 = SingletonClass.getInstance();
    }

}
