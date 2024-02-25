package dev.codeonce.mt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		Integer[] nums = new Integer[] { 10, 15, 45, 65, 85 };
		List<Integer> list = Arrays.asList(nums);
		List<Integer> descList = list.stream().sorted((num1, num2) -> num2.compareTo(num1))
				.collect(Collectors.toList());
		System.out.println("Second Largest Number Is : " + descList.get(1));
	}
}
