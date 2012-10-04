package hx.game;

import com.google.common.base.Preconditions;

public class FizzBuzzGame {

	public String play(int i) {
		Preconditions.checkArgument(i > 0, "The argument i should be greater than 0");
		Preconditions.checkArgument(i <= 100, "The argument i should be less than or equal 100");
		if( isMultipleOfThree(i) && isMultipleOfFive(i)){
			return "FizzBuzz";
		}
		if (isMultipleOfThree(i)){
			return "Fizz";
		}
		if (isMultipleOfFive(i)){
			return "Buzz";
		}
		return Integer.toString(i);
	}

	private boolean isMultipleOfFive(int i) {
		return i % 5 == 0;
	}

	private boolean isMultipleOfThree(int i) {
		return i % 3 == 0;
	}

}
