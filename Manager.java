import java.util.Scanner;

//Kế thừa User
public class Manager extends User {

    //Các hàm khởi tạo
    public Manager() {
    }

    public Manager(int id, String name, String username, String password) {
        super(id, name, username, password);
    }


    //Hàm chuyển trạng thái của Task
    @Override
    public void nextStep(Task task, boolean want) {
        Scanner sc = new Scanner(System.in);
        if (task.getStatus() == 0) {
            task.setStatus(1);
            System.out.println("Nhập ngày tạo Task: ");
            String createdDate = sc.next();
            task.setCreatedDate(createdDate);
            System.out.println("Task đã được tạo");
            String s = getName() + ": created a Task";
            taskActionLogToText("/home/datquocngo/taskActionLog.txt", s);
        } else if (task.getStatus() == 1) {
            task.setStatus(2);
            System.out.println("Created -> Assigned");
            String s = getName() + ": Task ID = " + task.getId() + " Created -> Assigned";
            taskActionLogToText("/home/datquocngo/taskActionLog.txt", s);
        } else if (task.getStatus() == 5) {
            task.setStatus(7);
            System.out.println("Nhập ngày kết thúc: ");
            String endDate = sc.next();
            task.setEndDate(endDate);
            System.out.println("Done -> Close");
            String s = getName() + ": Task ID = " + task.getId() + " Done -> Close";
            taskActionLogToText("/home/datquocngo/taskActionLog.txt", s);
        } else System.out.println("Manager không thể thực hiện thao tác này!");
    }
}
