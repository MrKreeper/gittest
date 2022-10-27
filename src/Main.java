import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat());
        animalList.add(new Dog());
        Speak csp = new Speak(animalList);
        Speak dsp = new Speak(animalList);
        csp.start();
        dsp.start();
        /*Person me = new Person("Tima", new Person("Sergey", new Person("Alexandr", null, null), null), new Person("Natalia", null, new Person("Ludmila", null, null)));
        System.out.println(me);

        Product product = new Product(49.99, "Вкус0чка");
        System.out.println(product);
        System.out.println(product.getCost());
        WMachine mach = new WMachine(100);
        System.out.println(mach);
        mach.setProduct(0, product);
        System.out.println(mach.getProduct(1));
        System.out.println(mach);
        System.out.println(mach.productList[0]);
        throw new NumberFormatException();
         */

    }
}
