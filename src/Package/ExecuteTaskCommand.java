package Package;

class ExecuteTaskCommand implements Command {
    private String taskName;

    public ExecuteTaskCommand(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void execute() {
        System.out.println("Executing task: " + taskName);
    }
}
