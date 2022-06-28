import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Chapter5 {
	public static void main(String[] args) throws IOException {
		Task task = new Task();
		
		Task task1 = new Task(task.task1, task.day1);
		Task task2 = new Task(task.task2, task.day2);
		Task task3 = new Task(task.task3, task.day3);
		Task task4 = new Task(task.task4, task.day4);
		Task task5 = new Task(task.task5, task.day5);
				
		List<Task> taskList = new ArrayList<>();
		taskList.add(task1);
		taskList.add(task2);
		taskList.add(task3);
		taskList.add(task4);
		taskList.add(task5);
		
		
		Collections.sort(taskList);
		for (int i = 0; i < taskList.size(); i++) {
			System.out.println(taskList.get(i).getDay() + ":" + taskList.get(i).getTask());
		}

	}
}
