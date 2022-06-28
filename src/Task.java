
import java.time.LocalDate;

public class Task implements Comparable<Task> {
	private String task;
	private LocalDate day;
	
	public Task() {}
	
	public Task(String task, LocalDate day) {
		this.task = task;
		this.day = day;
	}
	
	String task1 = "牛乳を買う";
	LocalDate day1 = LocalDate.of(2021, 10, 21);
	
	String task2 = "○○社面談";
	LocalDate day2 = LocalDate.of(2021, 9, 15);
	
	String task3 = "手帳を買う";
	LocalDate day3 = LocalDate.of(2021, 12, 04);

	String task4 = "散髪に行く";
	LocalDate day4 = LocalDate.of(2021, 8, 10);
	
	String task5 = "スクールの課題を解く。";
	LocalDate day5 = LocalDate.of(2021, 11, 9);
	
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public LocalDate getDay() {
		return this.day;
	}
	public void setDay(LocalDate day) {
		this.day = day;
	}

	
	public int compareTo(Task obj) {
		return this.day.compareTo(obj.day);
	}
	
}
