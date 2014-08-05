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
		if("����".equals(originlan))
			partten = "([\u4E00-\u9FA5]|[\u2E80-\u2FDF]|[\u3400-\u4DBF]){1}";
		else if("����".equals(originlan))
			partten = "([\u3040-\u30FF]|[\u31F0-\u31FF]){1}";
		else if("����".equals(originlan))
			partten = "([\u1100-\u11FF]|[\u3130-\u318f]|[\uAC00-\uD7AF]){1}";
		else if("����".equals(originlan))
			partten = "[\u0400-\u052F]";
		else if("Ӣ��".equals(originlan))
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
		
		if("����".equals(origin))
		{
			if("Ӣ��".equals(object))
				factor = 1F;
			else if("����".equals(object))
				factor = 1.2F;
			else if("����".equals(object))
				factor = 1.3F;
			else if("����".equals(object))
				factor = 1.5F;
		}
		else if("Ӣ��".equals(origin))
		{
			if("����".equals(object))
				factor = 1.5F;
			else if("����".equals(object))
				factor = 1.6F;
			else if("����".equals(object))
				factor = 1.7F;
		}
		return cost * factor;
	}
	//����Ψһ������
	public static String getOrderIdByUUId()
	{
		int machineId = 1;//��Ⱥ�������
		int hashCodeV = UUID.randomUUID().toString().hashCode();
		if(hashCodeV < 0)
			hashCodeV = -hashCodeV;
		return machineId+String.format("%015d", hashCodeV);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
