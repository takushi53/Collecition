
import java.time.LocalDate;

public class Task implements Comparable<Task> {
	private String task;
	private LocalDate day;
	
	public Task() {}
	
	public Task(String task, LocalDate day) {
		this.task = task;
		this.day = day;
	}
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

	@Override
	public int compareTo(Task obj) {
		return this.day.compareTo(obj.day);
	}
	
}
