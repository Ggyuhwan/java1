package practice.submit01;

public class Account {
	public static void main(String[] args) {

	}

	public String name;
	public String number;
	public int value;

	public Account() {
	}

	public Account(String name, String number, int value) {
		super();
		this.name = name;
		this.number = number;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
