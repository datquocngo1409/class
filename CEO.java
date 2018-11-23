import java.util.Scanner;

public class CEO extends User {
    public CEO() {
    }

    public CEO(int id, String name, String username, String password) {
        super(id, name, username, password);
    }

    public Project creatProject() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tạo mới một Project!");
        System.out.println("Nhập ID của Project mới: ");
        int id = sc.nextInt();
        System.out.println("Nhập tên của Project mới: ");
        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.println("Nhập ID của Manager của Project mới: ");
        int managerId = sc.nextInt();
        Project project = new Project(id, name, getId(), managerId);
        return project;
    }

    public CEO creatCEO() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tạo mới một CEO!");
        System.out.println("Nhập ID của CEO mới: ");
        int id = sc.nextInt();
        System.out.println("Nhập tên của CEO mới: ");
        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.println("Nhập user-name của CEO mới: ");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();

        CEO ceo = new CEO(id, name, username, password);
        return ceo;
    }

    public Manager creatManager() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mới một Manager!");
        System.out.println("Nhập ID của Manager mới: ");
        int id = sc.nextInt();
        System.out.println("Nhập tên của Manager mới: ");
        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.println("Nhập user-name của Manager mới: ");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();

        Manager manager = new Manager(id, name, username, password);
        return manager;
    }

    public Developer creatDeveloper() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tạo mới một Developer!");
        System.out.println("Nhập ID của Developer mới: ");
        int id = sc.nextInt();
        System.out.println("Nhập tên của Developer mới: ");
        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.println("Nhập user-name của Developer mới: ");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();
        System.out.println("Nhập ID của Manager của Developer: ");
        int managerId = sc.nextInt();
        System.out.println("Nhập số Task tham gia: ");
        int numTasks = sc.nextInt();
        System.out.println("Nhập danh sách Task đang tham gia: ");
        String taskIn = sc.nextLine();
        taskIn = sc.nextLine();

        Developer developer = new Developer(id, name, username, password, managerId, numTasks, taskIn);
        return developer;
    }

    public Tester creatTester() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tạo mới một Tester!");
        System.out.println("Nhập ID của Tester mới: ");
        int id = sc.nextInt();
        System.out.println("Nhập tên của Tester mới: ");
        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.println("Nhập user-name của Tester mới: ");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();
        System.out.println("Nhập ID của Manager của Tester mới: ");
        int managerId = sc.nextInt();
        System.out.println("Nhập số lượng Task đang tham gia: ");
        int numTasks = sc.nextInt();
        System.out.println("Nhập danh sách Task tham gia: ");
        String taskIn = sc.nextLine();
        taskIn = sc.nextLine();

        Tester tester = new Tester(id, name, username, password, managerId, numTasks, taskIn);
        return tester;
    }


}
