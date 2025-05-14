package test;

import static org.junit.Assert.*;
import java.util.List;
import model.Task;
import service.TaskService;
import org.junit.Before;
import org.junit.Test;

public class TaskServiceTest {
    private TaskService taskService;

    @Before
    public void setUp() {
        taskService = new TaskService();
        taskService.addTask(new Task("1", "stu123", "Submit Assignment 1", "Submitted"));
        taskService.addTask(new Task("2", "stu123", "Quiz 1", "Completed"));
        taskService.addTask(new Task("3", "stu999", "Group Project", "In Progress"));
    }

    @Test
    public void testGetTasksByStudentId() {
        List<Task> tasks = taskService.getTasksByStudentId("stu123");
        assertEquals(2, tasks.size());
    }

    @Test
    public void testFailureIntentional() {
        fail("Intentional failure to test CI build failure");
    }
}
