public class Project {
    int id, ceoId, ManagerId;
    String name;

    //Hàm khởi tạo
    public Project() {
    }

    public Project(int id, String name, int ceoId, int managerId) {
        setId(id);
        setName(name);
        setCeoId(ceoId);
        setManagerId(managerId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCeoId() {
        return ceoId;
    }

    public void setCeoId(int ceoId) {
        this.ceoId = ceoId;
    }

    public int getManagerId() {
        return ManagerId;
    }

    public void setManagerId(int managerId) {
        ManagerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
