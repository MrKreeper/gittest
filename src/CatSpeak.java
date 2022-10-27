public class CatSpeak extends Thread{
    Cat cat;
    public CatSpeak() {
        cat = new Cat();
    }

    @Override
    public void run() {
        while (true) {
            cat.speak();
        }
    }
}
