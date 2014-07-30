package org.translate.min.biz.impl;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.translate.min.biz.IdentifyCode;

public class IdentifyCodeImpl implements IdentifyCode
{

	public Color getRandomColor(int min, int max)
	{
		Random random = new Random();
		int r = random.nextInt(max - min);
		int g = random.nextInt(max - min);
		int b = random.nextInt(max - min);
		return new Color(min + r, min + g, min + b);
	}
	public void creatIdentifyCode(HttpSession session, HttpServletResponse response) throws Exception, Exception
	{
		int width=60,height=20;
	    BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
	    Graphics g=image.getGraphics();
	    g.setColor(getRandomColor(200,250));
	    g.fillRect(0,0,width,height);
	    Random random=new Random();
	    
	    for(int i=0;i<155;i++){
	    int x1=random.nextInt(width);
	    int y1=random.nextInt(height);
	    int x2=random.nextInt(8);
	    int y2=random.nextInt(8);
	    g.setColor(getRandomColor(160,200));
	    
	    g.drawLine(x1,y1,x1+x2,y1+y2);
	    }
	    g.setFont(new Font("Times New Roman",Font.PLAIN,18));
	    String codeStr="",str;
	    for(int j=0;j<4;j++){
	    int intNum;
	    if(j==0||j==2){
	    intNum=random.nextInt(10);
	    str=String.valueOf(intNum);
	    }
	    else{
	    char ch;
	    intNum=97+random.nextInt(25);
	    ch=(char)intNum;
	    str=String.valueOf(ch);
	    }
	    codeStr+=str;
	    g.setColor(new Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt(110)));
	    g.drawString(str,13*j+6,16);
	    }
	    session.setAttribute("identifyCode",codeStr);
	    g.dispose();
	   // File file = new File("/shimin");
	   // System.out.println(file.getAbsolutePath());
//	    ImageIO.write(image,"JPEG",new File("E:/Workspaces/±à³ÌÎÄ¼þ¼Ð/myeclips/aviation/WebRoot/image/identifyCode.jpeg"));
	    ImageIO.write(image,"JPEG",response.getOutputStream());
	    response.getOutputStream().flush();  
	    response.getOutputStream().close();  
	}
	
	
}