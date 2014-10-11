package org.translate.min.util;

public class Test
{
	public int countStrLength(String str)
	{
		String tempstr= "";
		
		for(int i = 0; i < str.length(); ++i)
		{
			if((int)str.charAt(i) == 32 && (int)str.charAt(i + 1) == 32) continue;
			
			tempstr += str.charAt(i);
		}
		return tempstr.length();
	}
	
	public void removeIdenx3(int[] people)//数组people代表20个人，假设其数据和其下标一样
	{
		int count = people.length;//表示目前圈中还剩的人数
		int index = 0;//目前数到第几个人
		int circle = 1;
		while(count > 2)
		{
			index = index % people.length;
			if(circle % 3 == 0)
			{
				circle = 1;
				people[index] = -1;//出局的位置置-1
				--count;
			}
			else
			{
				++circle;
				++index;
			}
		}
		
		for(int i = 0; i < people.length; ++i)//输出剩下的两个人信息
		{
			if(people[i] !=-1)continue;
			
			System.out.println("剩下的人是第" + (i+1) + "个,在原来的位置是" + (i+1) + "。");
		}
		
	}
	
}














