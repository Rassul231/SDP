package Package;

class TaskProcessorMediator implements TaskMediator {
    private TaskHandler handler;

    public TaskProcessorMediator(TaskHandler handler) {
        this.handler = handler;
    }

    @Override
    public void process(Task task) {
        handler.handleTask(task);
    }
}
