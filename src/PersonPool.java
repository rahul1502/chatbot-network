import java.util.List;

public class PersonPool {

    public List<Person> people;

    public PersonPool(List<Person> people) {
        this.people = people;
    }

    public void printStatus() {

        for(Person person: this.people) {

            System.out.println("{ name: " + person.name + " age: " + person.age
                            + " personality: " + person.personality + " isTalking: " + person.isTalking
                            + " robotOwned: " + person.robotOwned.name);
        }
    }
}
