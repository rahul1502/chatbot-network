import java.util.List;

public class Robot {

    public String name;
    public String personality; // AGGRESSIVE, PATIENT
    public boolean isBusy;
    public List<Robot> lookingAt;

    public Robot(String name, String personality, boolean isBusy, List<Robot> lookingAt) {
        this.name = name;
        this.personality = personality;
        this.isBusy = isBusy;
        this.lookingAt = lookingAt;
    }

    public String getName() {
        return name;
    }

    public void setBusy() {
        this.isBusy = true;
    }

    public void setFree() {
        this.isBusy = false;
    }

    public void addLookingAt(Robot robot) {
        this.lookingAt.add(robot);
    }

    public void removeLookingAt(Robot robot) {
        this.lookingAt.remove(robot);
    }

}
