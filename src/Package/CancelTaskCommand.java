package Package;
class CancelTaskCommand implements Command {
    private String taskName;

    public CancelTaskCommand(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void execute() {
        System.out.println("Cancelling task: " + taskName);
    }
}
