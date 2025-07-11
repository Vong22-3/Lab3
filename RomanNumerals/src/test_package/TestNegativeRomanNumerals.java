package test_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class TestNegativeRomanNumerals {
	
	//TS002 case 1 input = SQA, expect result = Input Error ,no result
	@Test
	void TestconvertRomanNumToIntTS002_1() {
		RomanNumerals RomanNumerals002_1 = new RomanNumerals();
		int result = RomanNumerals002_1.convertRomanNumToInt("SQA");
		
		assertEquals("Input Error ,no result", result);
	}
	
	//TS002 case 2 input = AA, expect result = Input Error ,no result
	@Test
	void TestconvertRomanNumToIntTS002_2() {
		RomanNumerals RomanNumerals002_2 = new RomanNumerals();
		int result = RomanNumerals002_2.convertRomanNumToInt("AA");
			
		assertEquals("Input Error ,no result", result);
	}
		
	//TS002 case 3 input = IIIIII, expect result = Input Error ,no result
	@Test
	void TestconvertRomanNumToIntTS002_3() {
		RomanNumerals RomanNumerals002_3 = new RomanNumerals();
		int result = RomanNumerals002_3.convertRomanNumToInt("IIIIII");
			
		assertEquals("Input Error ,no result", result);
	}
		
}