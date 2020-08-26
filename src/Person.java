public class Person {

    public String name;
    public int age;
    public String personality; // AGGRESSIVE, PATIENT
    public boolean isTalking;
    public Robot robotOwned;

    public Person(String name, int age, String personality, boolean isTalking, Robot robotOwned) {
        this.name = name;
        this.age = age;
        this.personality = personality;
        this.isTalking = isTalking;
        this.robotOwned = robotOwned;
    }

    public Robot getRobotOwned() {
        return robotOwned;
    }

    public void setRobotOwned(Robot robot) {
        this.robotOwned = robot;
    }

    public void removeRobotOwned() {
        this.robotOwned = null;
    }

    public void talk() {
        this.isTalking = true;
    }

    public void stopTalking() {
        this.isTalking = false;
    }
}
