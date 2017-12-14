import java.util.ArrayList;

public class TaskCollector {
    ArrayList<Task> tasks;

    public TaskCollector() {
        this.tasks = new ArrayList<>();
    }

    public void addTask (Task toAdd){
        tasks.add(toAdd);
    }

    public void listAll (){
        for (int i =0; i <tasks.size() ; i++) {
            System.out.println(tasks.get(i));
        }
    }
    public void removeTask(int i) {
        tasks.remove(i);
    }
}
