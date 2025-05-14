package service;

import java.util.ArrayList;
import java.util.List;
import model.Task;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasksByStudentId(String studentId) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getStudentId().equals(studentId)) {
                result.add(task);
            }
        }
        return result;
    }
}
