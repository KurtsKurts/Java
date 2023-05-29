package OOP.HW_7.singleton;

public class Program {
    

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton = Singleton.getInstance();

    }

}
