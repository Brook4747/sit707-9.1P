package model;

public class Task {
    private String id;
    private String studentId;
    private String title;
    private String status;

    public Task(String id, String studentId, String title, String status) {
        this.id = id;
        this.studentId = studentId;
        this.title = title;
        this.status = status;
    }

    public String getId() { return id; }
    public String getStudentId() { return studentId; }
    public String getTitle() { return title; }
    public String getStatus() { return status; }
}
