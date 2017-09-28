public class Main {

    public static void main(String[] args) {
        Help help = new Help();
        Tasks taskList = new Tasks();

        if (args.length == 0) {                                                                                            //print usage
            System.out.println("");
            help.PrintHelp();
        }
        if (args.length != 0 && (!(args[0]).equals("-l")) && (!(args[0]).equals("-a")) && (!(args[0]).equals("-r"))) {    //argument error handling
            System.out.println("");
            System.out.println("Unsupported argument");
            System.out.println("");
            help.PrintHelp();
        }
        if ((args.length != 0) && ((args[0]).equals("-l"))) {                                                            //print to list and empty list error handling
            System.out.println("");
            taskList.TaskPrint();
        }
        if ((args.length != 0) && ((args[0]).equals("-a"))) {                                                            //add new task and new task error handling
            System.out.println("");
            taskList.TaskAdd(args);
        }
        if ((args.length != 0) && ((args[0]).equals("-r"))) {                                                            //add new task and new task error handling
            System.out.println("");
            taskList.TaskRemove(args);
        }




    }
}
