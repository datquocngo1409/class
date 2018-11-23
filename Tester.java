//Kế thừa Class Employee
public class Tester extends Employee {

    //Hàm khởi tạo
    public Tester() {
    }

    public Tester(int id, String name, String username, String password, int managerId, int numTasks, String taskIn) {
        this.setId(id);
        this.setName(name);
        this.setUsername(username);
        this.setPassword(password);
        this.setManagerId(managerId);
        this.setNumTasks(numTasks);
        this.setTaskIn(taskIn);
    }

    //Hàm chuyển đổi trạng thái của Task
    @Override
    public void nextStep(Task task, boolean want) {
        if (task.getStatus() == 4 && want == true) {
            task.setStatus(5);
            System.out.println("Complete -> Done");
            String s = getName() + ": Task ID = " + task.getId() + " Complete -> Done";
            taskActionLogToText("/home/datquocngo/taskActionLog.txt", s);
        } else if (task.getStatus() == 4 && want == false) {
            task.setStatus(6);
            System.out.println("Complete -> Reject");
            String s = getName() + ": Task ID = " + task.getId() + " Complete -> Reject";
            taskActionLogToText("/home/datquocngo/taskActionLog.txt", s);
        } else System.out.println("Tester không thể thực hiện thao tác này!");
    }
}
