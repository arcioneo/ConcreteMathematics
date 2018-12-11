package chapter1;

public class HanoiTowers {

	public long getNumberOfMovements(int numberOfDisks) {
		return (long) (Math.pow(2, numberOfDisks) - 1);
	}

}
