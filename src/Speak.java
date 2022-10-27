import java.util.List;
import java.util.Random;
public class Speak{
    public Speak(List<Animal> animallist) {
        while (true) {
            Random random = new Random();
            animallist.get(random.nextInt(animallist.size())).speak();
        }
    }

}
