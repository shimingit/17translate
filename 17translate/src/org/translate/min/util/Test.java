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
	
	public void removeIdenx3(int[] people)//����people����20���ˣ����������ݺ����±�һ��
	{
		int count = people.length;//��ʾĿǰȦ�л�ʣ������
		int index = 0;//Ŀǰ�����ڼ�����
		int circle = 1;
		while(count > 2)
		{
			index = index % people.length;
			if(circle % 3 == 0)
			{
				circle = 1;
				people[index] = -1;//���ֵ�λ����-1
				--count;
			}
			else
			{
				++circle;
				++index;
			}
		}
		
		for(int i = 0; i < people.length; ++i)//���ʣ�µ���������Ϣ
		{
			if(people[i] !=-1)continue;
			
			System.out.println("ʣ�µ����ǵ�" + (i+1) + "��,��ԭ����λ����" + (i+1) + "��");
		}
		
	}
	
}














