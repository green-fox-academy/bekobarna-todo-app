import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Help {

    ArrayList<String> listBasic;

    public Help() {
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
        /*try {
            Path filePath = Paths.get("C:\\Users\\bekob\\greenfox\\bekobarna-todo-app/basic.txt");
            Files.write(filePath, listBasic);
        } catch (Exception e) {
            System.out.println("Uh-oh, could not write the file!");
        }

        try {
            Path filePath = Paths.get("basic.txt");
            List<String> myList = Files.readAllLines(filePath);
            for (String i : myList) {
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }*/

        for (int i = 0; i < listBasic.size(); i++) {
                System.out.println(listBasic.get(i));
        }
    }
}