import java.util.ArrayList;

public class Network {

    public static void main(String[] args) {

        Robot r1 = new Robot("R1", "PATIENT", false, new ArrayList<>());
        Robot r2 = new Robot("R2", "PATIENT", false, new ArrayList<>());
        Robot r3 = new Robot("R3", "AGGRESSIVE", false, new ArrayList<>());
        Robot r4 = new Robot("R4", "PATIENT", false, new ArrayList<>());
        Robot r5 = new Robot("R5", "AGGRESSIVE", false, new ArrayList<>());
        Robot r6 = new Robot("R6", "PATIENT", false, new ArrayList<>());
        Robot r7 = new Robot("R7", "AGGRESSIVE", false, new ArrayList<>());

        RobotPool robotPool = new RobotPool(new ArrayList<Robot>() {{
            add(r1); add(r2); add(r3); add(r4); add(r5); add(r6); add(r7);
        }});

        Person p1 = new Person("P1", 21 ,"AGGRESSIVE", false, null);
        Person p2 = new Person("P2", 24 ,"AGGRESSIVE", false, null);
        Person p3 = new Person("P3", 27 ,"PATIENT", false, null);
        Person p4 = new Person("P4", 24 ,"AGGRESSIVE", false, null);

        PersonPool personPool = new PersonPool(new ArrayList<Person>() {{
            add(p1); add(p2); add(p3); add(p4);
        }});

        // find available robot for p1
        robotPool.findRobot(p1);
        // find available robot for p2
        robotPool.findRobot(p2);
        // find available robot for p3
        robotPool.findRobot(p3);
        // find available robot for p4
        robotPool.findRobot(p4);

        // print status
        System.out.println("Person Pool");
        personPool.printStatus();
        System.out.println("Robot Pool");
        robotPool.printStatus();

        System.out.println("------------------------------");

        // create robot graph
        r1.addLookingAt(r2); r1.addLookingAt(r3); r1.addLookingAt(r7);
        r2.addLookingAt(r6);
        r4.addLookingAt(r2); r4.addLookingAt(r5); r4.addLookingAt(r7);
        r5.addLookingAt(r7);
        r7.addLookingAt(r6);

        System.out.println("Robot Pool");
        robotPool.printStatus();
    }
}
