import java.util.*;

public class UsageInformation {
    ArrayList<String> listBasic;

    public UsageInformation () {
        listBasic = new ArrayList<>();
        listBasic.add("Command Line Todo application");
        listBasic.add("=============================");
        listBasic.add("");
        listBasic.add("-l   Lists all the tasks");
        listBasic.add("-a   Adds a new task");
        listBasic.add("-r   Removes an task");
        listBasic.add("-c   Completes an task");
    }

    public void BasicInfo() {
        for (int i = 0; i < listBasic.size(); i++) {
            System.out.println(listBasic.get(i));
        }
    }

}
