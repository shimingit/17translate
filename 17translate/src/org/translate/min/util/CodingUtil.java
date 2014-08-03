package org.translate.min.util;

import java.io.UnsupportedEncodingException;

public class CodingUtil
{
	public static String encode(String origin)
	{
		String current = null;
		try
		{
			current = new String(origin.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		return current;
	}
	
	public static String[] encode(String[] origins)
	{
		String[] currents = new String[origins.length];
		for(int i = 0; i < origins.length; i++)
			currents[i] = encode(origins[i]);
		return currents;
	}
}
