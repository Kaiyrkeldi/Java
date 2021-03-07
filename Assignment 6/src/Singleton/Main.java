package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s[] = new Singleton[100];
        for (int i = 0; i < 100 ; i++) {
            s[i] = Singleton.getInstance();
        }
        System.out.println(Singleton.counter);
        for (int j = 0; j < 100; j++){
            System.out.println(s[j]);
        }
    }

}

class Singleton {
    public static int counter = 0;
    private static Singleton instance;
    private Singleton(){
    }
    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
            counter++;
        }
        return instance;
    }
}
