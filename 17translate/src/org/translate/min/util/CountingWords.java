package org.translate.min.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingWords
{
	public static int count(String originlan,String content)
	{
		String partten = "";
		int count = 0;
		if("ÖĞÎÄ".equals(originlan))
			partten = "([\u4E00-\u9FA5]|[\u2E80-\u2FDF]|[\u3400-\u4DBF]){1}";
		else if("ÈÕÓï".equals(originlan))
			partten = "([\u3040-\u30FF]|[\u31F0-\u31FF]){1}";
		else if("º«Óï".equals(originlan))
			partten = "([\u1100-\u11FF]|[\u3130-\u318f]|[\uAC00-\uD7AF]){1}";
		else if("¶íÓï".equals(originlan))
			partten = "[\u0400-\u052F]";
		else if("Ó¢Óï".equals(originlan))
			partten = "([\u0041-\u005A]|[\u0061-\u007A]){1}";
		Matcher matcher = Pattern.compile(partten).matcher(content);
		while (matcher.find())
		{
		    count++;
		}
		return count;
	}
}
