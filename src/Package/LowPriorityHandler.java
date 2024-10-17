package Package;

class LowPriorityHandler implements TaskHandler {
    private TaskHandler nextHandler;

    @Override
    public void setNextHandler(TaskHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleTask(Task task) {
        if (task.getTaskName().equalsIgnoreCase("low")) {
            System.out.println("Processing low priority task.");
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        }
    }
}
