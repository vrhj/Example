package hx.game;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzGameTest {

	@Test
	public void play_with_number_1_should_return_1() {
		FizzBuzzGame game = new FizzBuzzGame();
		assertEquals("Expected 1","1", game.play(1));
	}
	
	@Test
	public void play_with_number_2_should_return_2() {
		FizzBuzzGame game = new FizzBuzzGame();
		assertEquals("Expected 2","2", game.play(2));
	}
	
	@Test
	public void play_with_number_3_should_return_Fizz() {
		FizzBuzzGame game = new FizzBuzzGame();
		assertEquals("Expected Fizz","Fizz", game.play(3));
	}
	
	@Test
	public void play_with_number_4_should_return_4() {
		FizzBuzzGame game = new FizzBuzzGame();
		assertEquals("Expected 4","4", game.play(4));
	}
	

	@Test
	public void play_with_number_5_should_return_Buzz() {
		FizzBuzzGame game = new FizzBuzzGame();
		assertEquals("Expected Buzz","Buzz", game.play(5));
	}
	
	@Test
	public void play_with_number_15_should_return_FizzBuzz() {
		FizzBuzzGame game = new FizzBuzzGame();
		assertEquals("Expected FizzBuzz","FizzBuzz", game.play(15));
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void play_with_number_less_than_1_should_return_an_exception() {
		FizzBuzzGame game = new FizzBuzzGame();
		game.play(0);
		fail("Should throw an exception");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void play_with_number_greater_than_100_should_return_an_exception() {
		FizzBuzzGame game = new FizzBuzzGame();
		game.play(101);
		fail("Should throw an exception");
	}
}
