package 연습용.ch06;

public class StudenExample {
	public static void main(String[] args) {
		// Student 객체생성
		Student car1 = new Student();

		System.out.println("Car1.company : " + car1.company);

		Student car2 = new Student("자가용");
		{
			System.out.println("car2.company : " + car2.company);
			System.out.println("car2.model : " + car2.model);

			Student car3 = new Student("자가용");
			{
				System.out.println("car3.company : " + car3.company);
				System.out.println("car3.model : " + car3.model);
				System.out.println("car3.color : " + car3.color);

				Student car4 = new Student("자가용");
				{
					System.out.println("car4.company : " + car4.company);
					System.out.println("car4.model : " + car4.model);
					System.out.println("car4.color : " + car4.color);
					System.out.println("car4.maxSpeed : " + car4.maxSpeed);
				}
			}
		}
	}
}
