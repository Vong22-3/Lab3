package test_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class TestPositiveRomanNumerals {

	//TS001 case 1 input = V, expect result = 5
	@Test
	void TestconvertRomanNumToIntTS001_1() {
		RomanNumerals RomanNumerals001_1 = new RomanNumerals();
		int result = RomanNumerals001_1.convertRomanNumToInt("V");
		
		assertEquals(5, result);
	}
	
	//TS001 case 2 input = VL, expect result = no result
	@Test
	void TestconvertRomanNumToIntTS001_2() {
		RomanNumerals RomanNumerals001_2 = new RomanNumerals();
		int result = RomanNumerals001_2.convertRomanNumToInt("VL");
			
		assertEquals("No result", result);
		
	}
	
	//TS001 case 3 input = CL, expect result = 150
	@Test
	void TestconvertRomanNumToIntTS001_3() {
		RomanNumerals RomanNumerals001_3 = new RomanNumerals();
		int result = RomanNumerals001_3.convertRomanNumToInt("CL");
			
		assertEquals(150, result);
		
	}
	
	//TS001 case 4 input = DD, expect result = 1000
	@Test
	void TestconvertRomanNumToIntTS001_4() {
		RomanNumerals RomanNumerals001_4 = new RomanNumerals();
		int result = RomanNumerals001_4.convertRomanNumToInt("DD");
			
		assertEquals(1000, result);
		
	}
	
	//TS001 case 5 input = III, expect result = 3
	@Test
	void TestconvertRomanNumToIntTS001_5() {
		RomanNumerals RomanNumerals001_5 = new RomanNumerals();
		int result = RomanNumerals001_5.convertRomanNumToInt("III");
			
		assertEquals(3, result);
		
	}
	
	//TS001 case 6 input = MIV, expect result = 1004
	@Test
	void TestconvertRomanNumToIntTS001_6() {
		RomanNumerals RomanNumerals001_6 = new RomanNumerals();
		int result = RomanNumerals001_6.convertRomanNumToInt("MIV");
			
		assertEquals(1004, result);
		
	}
	
	//TS001 case 7 input = MVL, expect result = 1045
	@Test
	void TestconvertRomanNumToIntTS001_7() {
		RomanNumerals RomanNumerals001_7 = new RomanNumerals();
		int result = RomanNumerals001_7.convertRomanNumToInt("MLV");
			
		assertEquals(1055, result);
		
	}
	
}