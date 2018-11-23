//Kế thừa Class Employee
public class Developer extends Employee {

    //Hàm khởi tạo
    public Developer() {
    }

    public Developer(int id, String name, String username, String password, int managerId, int numTasks, String taskIn) {
        this.setId(id);
        this.setName(name);
        this.setUsername(username);
        this.setPassword(password);
        this.setManagerId(managerId);
        this.setNumTasks(numTasks);
        this.setTaskIn(taskIn);
    }


    //Hàm chuyển trạng thái của Task
    @Override
    public void nextStep(Task task, boolean want) {
        if (task.getStatus() == 2) {
            task.setStatus(3);
            System.out.println("Assigned -> Started");
            String s = getName() + ": Task ID = " + task.getId() + " Assigned -> Started";
            taskActionLogToText("/home/datquocngo/taskActionLog.txt", s);
        } else if (task.getStatus() == 3) {
            task.setStatus(4);
            System.out.println("Started -> Completed");
            String s = getName() + ": Task ID = " + task.getId() + " Started -> Completed";
            taskActionLogToText("/home/datquocngo/taskActionLog.txt", s);
        } else if (task.getStatus() == 6) {
            task.setStatus(3);
            System.out.println("Reject -> Started");
            String s = getName() + ": Task ID = " + task.getId() + " Reject -> Started";
            taskActionLogToText("/home/datquocngo/taskActionLog.txt", s);
        } else System.out.println("Developer không thể thực hiện thao tác này!");
    }
}
