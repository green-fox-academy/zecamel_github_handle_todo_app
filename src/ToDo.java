import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class ToDo {
    private static TaskCollector taskCollector = new TaskCollector();


    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println(
                    "Command line arguments: \n"
                            + "========================\n"
                            + "-l   Lists all the tasks \n"
                            + "-a   Adds a new task\n"
                            + "-r   Removes an task \n"
                            + "-c   Completes an task" );

        } else if (Objects.equals( args[0], "-l" )) {
            taskCollector.listAll();
        } else if (Objects.equals( args[0], "-a" )) {
            try {
            } catch (Exception e) {
                System.out.println( "Unable to add: no task provided" );
            }
        }
    }
}

