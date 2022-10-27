import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat());
        animalList.add(new Dog());
        Speak sp = new Speak(animalList);
    }
}
