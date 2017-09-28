import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Tasks {

    public void TaskPrint() {
        try {
            Path filePath = Paths.get("C:\\Users\\bekob\\greenfox\\bekobarna-todo-app/tasks.txt");
            List<String> myList = Files.readAllLines(filePath);
            if (myList.size() == 0) {
                System.out.println("No todos for today! :)");
            } else {
                for (int i = 0; i < myList.size(); i++) {
                    System.out.println((i+1) + " " + myList.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println("error");
        }
        /*try {
            Path filePath = Paths.get("C:\\Users\\bekob\\greenfox\\bekobarna-todo-app/tasks.txt");
            Files.write(filePath, listBasic);
        } catch (Exception e) {
            System.out.println("Uh-oh, could not write the file!");
        }*/
    }

    public void TaskAdd(String[] newTask) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < newTask.length; i++) {
            result.append(newTask[i] + " ");
        }
        String resultString= result.toString();
        try {
            Path filePath = Paths.get("C:\\Users\\bekob\\greenfox\\bekobarna-todo-app/tasks.txt");
            List<String> myListOriginal = Files.readAllLines(filePath);
            myListOriginal.add(myListOriginal.size(), resultString);
            Files.write(filePath, myListOriginal);
        } catch (Exception e) {
            System.out.println("error");
        }

    }
}
