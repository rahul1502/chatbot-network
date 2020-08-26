import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RobotPool {

    public List<Robot> robots;

    public RobotPool(List<Robot> robots) {
        this.robots = robots;
    }

    public void addRobot(Robot robot) {
        this.robots.add(robot);
    }

    public void removeRobot(Robot robot) {
        this.robots.remove(robot);
    }

    public Robot findRobot(Person person) {
        Robot robot = this.robots.stream()
                .filter(r -> !r.isBusy)
                .filter(r -> r.personality.equals(person.personality))
                .findFirst()
                .orElse(null);

        if(robot!=null) {
            robot.setBusy();
            person.setRobotOwned(robot);
        }
        return robot;
    }

    public void releaseRobot(Person person) {
        person.getRobotOwned().setFree();
        person.removeRobotOwned();
    }

    public void printStatus() {

        for(Robot robot: this.robots) {
            System.out.println("{ name: " + robot.name + " personality: " + robot.personality
                + " isBusy: " + robot.isBusy + " lookingAt: " +
                    Arrays.toString(robot.lookingAt.stream().map(Robot::getName).toArray()));
        }

    }
}
