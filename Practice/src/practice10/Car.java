package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;

	int run() {
		this.gasoline -= 1;
		int num = new java.util.Random().nextInt(15) + 1;

		if (this.gasoline < 0) {
			return -1;
		}

		return num;


	}
}
