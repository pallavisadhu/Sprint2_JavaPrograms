package sptrint2_java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WellFargo_CommonPrefix {
	
	public String longestCommonPrefix(String str[]) {
		
		int n = str.length;
		char c;
		String result="";
		
		int minLen = minStr(str,n);
		System.out.println(minLen);
		
		for(int i=0;i<minLen;i++) {
			c = str[0].charAt(i);
			for(int j=1;j<n;j++) {
				if(str[j].charAt(i)!=c) {
					return result;
				}
			}
			result = result+c;
		}
		return result;
	}
	
	
	private int minStr(String[] str, int n) {
		
		int min = str[0].length();
		for(int i=1;i<n;i++) {
			if(str[i].length()<min) {
				min=str[i].length();
			}
		}
		return min;
	}


	@Test
	public void testCase1() {
		String str[] = {"flower","flow","flight"};
		String actual = longestCommonPrefix(str);
		Assert.assertEquals(actual, "fl");
	}
	
	@Test
	public void testCase2() {
		String str[] = {"dog","racecar","car"};
		String actual = longestCommonPrefix(str);
		Assert.assertEquals(actual, "");

	}

}
