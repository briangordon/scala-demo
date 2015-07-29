package name.brian_gordon.scalademo;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author Brian Gordon
 */
public class VarianceQuiz2 {
	public static void main(String[] args) {
		List<? extends List<? extends Number>> c = null;
		List<List<Integer>> d = null;
		c = d;
	}
}
