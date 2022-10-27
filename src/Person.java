public class Person {
    String name;
    Person father;
    Person mother;
    public Person(String name, Person father, Person mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    @Override
    public String toString() {
        String ans = "Имя: " + name + "\n" +
                "Отец: " + father.name + "\n" +
                "Мать: " + mother.name;
        return ans;
    }
}
