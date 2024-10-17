package Package;

class MediumPriorityHandler implements TaskHandler {
    private TaskHandler nextHandler;

    @Override
    public void setNextHandler(TaskHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleTask(Task task) {
        if (task.getTaskName().equalsIgnoreCase("medium")) {
            System.out.println("Processing medium priority task.");
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        }
    }
}
