public class Main {

    public static void main(String[] args) {
        Help help = new Help();
        Tasks taskList = new Tasks();

        if (args.length == 0) {                                                                         //print usage
            System.out.println("");
            help.printHelp();
        } else if ((!args[0].equals("-l")) && (!args[0].equals("-a")) && (!args[0].equals("-r"))) {    //argument error handling
            System.out.println("\nUnsupported argument\n");
            help.printHelp();
        } else if ((args[0].equals("-l"))) {                                                           //print to list and empty list error handling
            System.out.println("");
            taskList.taskPrint();
        } else if ((args[0].equals("-a"))) {                                                           //add new task and new task error handling
            System.out.println("");
            taskList.taskAdd(args);
        } else if ((args[0].equals("-r")) && (args[1].equals("2"))) {                                  //add new task and new task error handling
            System.out.println("");
            taskList.taskRemove(args);
        }



    }
}
