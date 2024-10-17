package Package;
class HighPriorityHandler implements TaskHandler {
    private TaskHandler nextHandler;

    @Override
    public void setNextHandler(TaskHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleTask(Task task) {
        if (task.getTaskName().equalsIgnoreCase("high")) {
            System.out.println("Processing high priority task.");
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        }
    }
}
