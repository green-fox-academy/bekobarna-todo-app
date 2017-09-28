public class Main {

    public static void main(String[] args) {
        Help help = new Help();
        Tasks taskList = new Tasks();

        if (args.length == 0) {
            System.out.println("");
            help.PrintHelp();
        }
        if ((args.length != 0) && ((args[0]).equals("-l"))) {
            System.out.println("");
            taskList.TaskPrint();
        }
        if ((args.length != 0) && ((args[0]).equals("-a")) && (args.length == 1)) {
            System.out.println("");
            System.out.println("Unable to add: no task provided");
        }
        if ((args.length != 0) && ((args[0]).equals("-a")) && (!args[1].isEmpty())) {
            System.out.println("");
            taskList.TaskAdd(args);
        }



    }
}
