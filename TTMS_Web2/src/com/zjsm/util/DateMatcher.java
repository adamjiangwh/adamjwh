﻿package com.zjsm.util;

import java.util.regex.Pattern;

public class DateMatcher {
	
	public boolean matchDate(String input){
		
		//判断是否匹配 YYYY/MM/DD YYYY/M/D YYYY/MM/D YYYY/M/DD 以及闰年
		Pattern p1 = Pattern.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\/\\/\\s]?((((0?"
						+ "[13578])|(1[02]))[\\/\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))"
						+ "|(((0?[469])|(11))[\\/\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|"
						+ "(0?2[\\/\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][12"
						+ "35679])|([13579][01345789]))[\\/\\/\\s]?((((0?[13578])|(1[02]))"
						+ "[\\/\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))"
						+ "[\\/\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\/\\/\\s]?((0?["
						+ "1-9])|(1[0-9])|(2[0-8]))))))");		
		
		boolean match1 = p1.matcher(input).matches();
		
		
		//判断是否匹配 YYYY-MM-DD YYYY-M-D YYYY-MM-D YYYY-M-DD 以及闰年
		Pattern p2 = Pattern.compile("^(?:([0-9]{4}-(?:(?:0?[1,3-9]|1[0-2])-(?:29|30)|"
                + "((?:0?[13578]|1[02])-31)))|"
                + "([0-9]{4}-(?:0?[1-9]|1[0-2])-(?:0?[1-9]|1\\d|2[0-8]))|"
                + "(((?:(\\d\\d(?:0[48]|[2468][048]|[13579][26]))|"
                + "(?:0[48]00|[2468][048]00|[13579][26]00))-0?2-29)))$");
		
		boolean match2 = p2.matcher(input).matches();
		
		//与其中之一匹配就返回真
		if(match1||match2){
			return true;
		}else{
			return false;
		}
				
	}

}
