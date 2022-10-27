import java.util.List;
import java.util.Random;
public class Speak{
    List<Animal> animallist;
    public Speak(List<Animal> animallist) {

        this.animallist = animallist;
        while (true) {
            Random random = new Random();
            animallist.get(random.nextInt(animallist.size())).speak();
        }
    }

}
