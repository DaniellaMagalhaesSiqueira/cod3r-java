package generics;

import java.util.TreeSet;

public class ComparableTest {
	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>();
		nums.add(10);
		nums.add(1);
		nums.add(6);
		nums.add(6);//n�o ser� impresso o repetido
		nums.add(9);
		nums.add(3);
		nums.add(8);
		nums.add(123);
		nums.add(-13);
		for (Integer n: nums) {
			System.out.println(n);//imprir� com a ordena��o pois a classe Integer j� tem o comparable
		}
	}
}
