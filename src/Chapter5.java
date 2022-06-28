import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Chapter5 {
	public static void main(String[] args) throws IOException {
		Task task = new Task();

		LocalDate day1 = LocalDate.of(2021, 10, 21);
		LocalDate day2 = LocalDate.of(2021, 9, 15);
		LocalDate day3 = LocalDate.of(2021, 12, 04);
		LocalDate day4 = LocalDate.of(2021, 8, 10);
		LocalDate day5 = LocalDate.of(2021, 11, 9);

		Task task1 = new Task("牛乳を買う", day1);
		Task task2 = new Task("○○社面談", day2);
		Task task3 = new Task("手帳を買う", day3);
		Task task4 = new Task("散髪に行く", day4);
		Task task5 = new Task("スクールの課題を解く。", day5);
				
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
