package Package;
interface TaskHandler {
    void setNextHandler(TaskHandler handler);
    void handleTask(Task task);
}
