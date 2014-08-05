package org.translate.min.util;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArticleUtil
{
	public static int countwords(String originlan,String content)
	{
		String partten = "";
		int count = 0;
		if("中文".equals(originlan))
			partten = "([\u4E00-\u9FA5]|[\u2E80-\u2FDF]|[\u3400-\u4DBF]){1}";
		else if("日语".equals(originlan))
			partten = "([\u3040-\u30FF]|[\u31F0-\u31FF]){1}";
		else if("韩语".equals(originlan))
			partten = "([\u1100-\u11FF]|[\u3130-\u318f]|[\uAC00-\uD7AF]){1}";
		else if("俄语".equals(originlan))
			partten = "[\u0400-\u052F]";
		else if("英语".equals(originlan))
			partten = "([\u0041-\u005A]|[\u0061-\u007A]){1}";
		Matcher matcher = Pattern.compile(partten).matcher(content);
		while (matcher.find())
		{
		    count++;
		}
		return count;
	}
	
	public static float conutcost(int wordscount,String origin,String object)
	{
		float cost = 50F;
		float factor = 1F;
		
		if("中文".equals(origin))
		{
			if("英语".equals(object))
				factor = 1F;
			else if("日语".equals(object))
				factor = 1.2F;
			else if("韩语".equals(object))
				factor = 1.3F;
			else if("德语".equals(object))
				factor = 1.5F;
		}
		else if("英语".equals(origin))
		{
			if("中文".equals(object))
				factor = 1.5F;
			else if("日语".equals(object))
				factor = 1.6F;
			else if("德语".equals(object))
				factor = 1.7F;
		}
		return cost * factor;
	}
	//生成唯一订单号
	public static String getOrderIdByUUId()
	{
		int machineId = 1;//集群机器编号
		int hashCodeV = UUID.randomUUID().toString().hashCode();
		if(hashCodeV < 0)
			hashCodeV = -hashCodeV;
		return machineId+String.format("%015d", hashCodeV);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
