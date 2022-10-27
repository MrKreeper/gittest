public class DogSpeak extends Thread{
    Dog dog;
    public DogSpeak() {
        dog = new Dog();
    }

    @Override
    public void run() {
        while (true) {
            dog.speak();
        }
    }
}
