package sptrint2_java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hcl_CharCount {

	public String countingChars(String s) {
		int count = 0;
		int i = 0;
		StringBuffer sb = new StringBuffer();
		
		if(s.length()==0) {
			return s;
		}
		char temp = s.charAt(0);
		for (char alpha : s.toCharArray()) {

			if (alpha == temp) {
				count = count + 1;
			} else {
				sb.append(count);
				sb.append(temp);
				temp = alpha;
				count = 1;
			}

		}
		sb.append(count);
		sb.append(temp);

		System.out.println(sb);
		return sb.toString();
	}

	@Test
	public void testCase1() {
		String s = "aaabbcaacccbbb";
		String actual = countingChars(s);
		Assert.assertEquals(actual, "3a2b1c2a3c3b");
	}
	
	@Test
	public void testCase2() {
		String s = "e8486744";
		String actual = countingChars(s);
		Assert.assertEquals(actual, "1e181418161724");
		
	}
	
	@Test
	public void testCase3() {
		String s = "";
		String actual = countingChars(s);
		Assert.assertEquals(actual, "");

	}
}
