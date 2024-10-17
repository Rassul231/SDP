package Package;
import java.util.Arrays;
import java.util.List;

public class menu {
    public static void main(String[] args) {
        TaskHandler lowPriorityHandler = new LowPriorityHandler();
        TaskHandler mediumPriorityHandler = new MediumPriorityHandler();
        TaskHandler highPriorityHandler = new HighPriorityHandler();

        lowPriorityHandler.setNextHandler(mediumPriorityHandler);
        mediumPriorityHandler.setNextHandler(highPriorityHandler);

        Task task1 = new Task("low");
        Task task2 = new Task("medium");
        Task task3 = new Task("high");

        List<Task> taskList = Arrays.asList(task1, task2, task3);
        TaskIterator taskIterator = new TaskIterator(taskList);

        TaskProcessorMediator mediator = new TaskProcessorMediator(lowPriorityHandler);

        while (taskIterator.hasNext()) {
            Task task = taskIterator.next();

            Command command = new TaskCommand(task);
            command.execute();

            mediator.process(task);
        }
    }
}
