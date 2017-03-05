package salary;

public class WorkForHours implements Payment {

	@Override
	public void countSalary() {
		int days = 24;
		int perHour = 50;
		int hours = 8;
		System.out.println("human works for hour get sallary:"
				+ (perHour * hours) * days + " uah");
	}

}
