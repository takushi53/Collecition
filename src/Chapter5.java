import java.time.LocalDate;
import java.io.IOException;
import java.util.TreeMap;

public class Chapter5 {
	public static void main(String[] args) throws IOException {
		Task task = new Task();
		TreeMap<LocalDate, String> taskList = new TreeMap<LocalDate, String>();
		taskList.put(task.day1, task.task1);
		taskList.put(task.day2, task.task2);
		taskList.put(task.day3, task.task3);
		taskList.put(task.day4, task.task4);
		taskList.put(task.day5, task.task5);
		
		for (LocalDate days : taskList.keySet()) {
			System.out.println(days + "：" + taskList.get(days));
			
		}
		
		
		
	}
}
