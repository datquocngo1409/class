public class Task {
    int id, projectId, status;
    String name, developerId, testerId, createdDate, endDate;

    //Hàm khởi tạo
    public Task() {
    }

    public Task(int id, String name, int projectId, String developerId, String testerId, String createdDate, String endDate, int status) {
        setId(id);
        setName(name);
        setProjectId(projectId);
        setDeveloperId(developerId);
        setTesterId(testerId);
        setCreatedDate(createdDate);
        setEndDate(endDate);
        setStatus(status);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(String developerId) {
        this.developerId = developerId;
    }

    public String getTesterId() {
        return testerId;
    }

    public void setTesterId(String testerId) {
        this.testerId = testerId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
