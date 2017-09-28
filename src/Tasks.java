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
    }

    public void TaskAdd(String[] newTask) {
        StringBuilder inputToList = new StringBuilder();
        for (int i = 1; i < newTask.length; i++) {
            inputToList.append(newTask[i] + " ");
        }
        String resultString = inputToList.toString();

        if (!resultString.isEmpty()) {
            try {
                Path filePath = Paths
                    .get("C:\\Users\\bekob\\greenfox\\bekobarna-todo-app/tasks.txt");
                List<String> myListOriginal = Files.readAllLines(filePath);
                myListOriginal.add(myListOriginal.size(), resultString);
                Files.write(filePath, myListOriginal);
            } catch (Exception e) {
                System.out.println("error");
            }
        } else {
            System.out.println("");
            System.out.println("Unable to add: no task provided");
        }
    }

    public void TaskRemove (int number) {


    }


}

