import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TaskListTest {

    private TaskList taskList = new TaskList();

    @Test
    public void shouldAddTaskToTaskList() {

        // when
        taskList.addTask("Groceries");

        // then
        assertEquals(1, taskList.getTasks().size());
        assertThat(taskList.getTasks().get(0), is("Groceries"));
    }

    @Test
    public void shouldThrowExceptionWhenEmptyTask() {

        //when
        // then
        assertThrows(IllegalArgumentException.class, () -> taskList.addTask(""));
    }

    @Test
    public void shouldDeleteTaskFromTaskList() {

        // given
        taskList.addTask("Groceries");
        taskList.addTask("Laundry");
        taskList.addTask("Clean house");

        // when
        taskList.deleteTask(0);

        // then
        assertEquals(2, taskList.getTasks().size());
        assertThat(taskList.getTasks().get(0), containsString("Lau"));
    }

    @Test
    public void shouldDeleteAllTasksFromTaskList() {

        // given
        taskList.addTask("Groceries");
        taskList.addTask("Laundry");
        taskList.addTask("Clean house");

        // when
        taskList.deleteAllTasks();

        // then
        assertThat(taskList.getTasks().size(), is(0));
    }

    @Test
    public void shouldShowAllTasksInTaskList() {

        // given
        taskList.addTask("Groceries");
        taskList.addTask("Laundry");
        taskList.addTask("Clean house");

        // when
        taskList.showAllTasks();

        // then
        // verify that the tasks are displayed correctly in the console
        // (you can do this manually)
    }
}
