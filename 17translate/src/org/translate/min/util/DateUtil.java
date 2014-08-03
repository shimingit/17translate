package org.translate.min.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil
{
	public static String getCurrentDate()
	{
		Date current = new Date();
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return time.format(current);
	}
	public static Date creatDate()
	{
		return new Date();
	}
}
