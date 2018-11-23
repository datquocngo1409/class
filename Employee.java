//Abstract Class kế thừa User
public abstract class Employee extends User {
    int managerId, numTasks;
    String taskIn;

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getNumTasks() {
        return numTasks;
    }

    public void setNumTasks(int numTasks) {
        this.numTasks = numTasks;
    }

    public String getTaskIn() {
        return taskIn;
    }

    public void setTaskIn(String taskIn) {
        this.taskIn = taskIn;
    }
}
