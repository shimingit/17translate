package org.translate.min.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import net.sf.json.JSONObject;

import org.translate.min.pojo.AccessToken;
import org.translate.min.pojo.Button;
import org.translate.min.pojo.CommonButton;
import org.translate.min.pojo.ComplexButton;
import org.translate.min.pojo.Menu;
import org.translate.min.pojo.ViewButton;


public class WeixinUtil
{
	// 获取access_token的接口地址（GET） 限200（次/天）  
	public final static String access_token_url = "https://api.weixin.qq.com/cgi-bin/token?" +
			"grant_type=client_credential&appid=APPID&secret=APPSECRET"; 
	
	// 菜单创建（POST） 限100（次/天）  
	public static String menu_create_url = "https://api.weixin.qq.com/cgi-bin/menu/create?" +
			"access_token=ACCESS_TOKEN"; 
	
	/**
	 * 创建菜单
	 * @param menu 菜单实例
	 * @param accessToken 有效的access_token
	 * @return 0表示成功，其他值表示失败
	 */
	public static int createMenu(Menu menu, String accessToken)
	{
		int result = 0;
		// 拼装创建菜单的url  
	    String url = menu_create_url.replace("ACCESS_TOKEN", accessToken);
	    // 将菜单对象转换成json字符串  
	    String jsonMenu = JSONObject.fromObject(menu).toString(); 
	    
	    // 调用接口创建菜单  
	    JSONObject jsonObject = httpRequest(url, "POST", jsonMenu);  
	    
	    if (null != jsonObject) {  
	        if (0 != jsonObject.getInt("errcode")) {  
	            result = jsonObject.getInt("errcode");  
	        }  
	    }  
	  
	    return result;  
	}
	/**
	 * 获取菜单信息
	 */
	
	public static Menu getMenu()
	{
		CommonButton btn11 = new CommonButton();  
        btn11.setName("天气预报");  
        btn11.setType("click");  
        btn11.setKey("11");  
  
        CommonButton btn12 = new CommonButton();  
        btn12.setName("公交查询");  
        btn12.setType("click");  
        btn12.setKey("12");  
  
        CommonButton btn13 = new CommonButton();  
        btn13.setName("周边搜索");  
        btn13.setType("click");  
        btn13.setKey("13");  
  
        CommonButton btn14 = new CommonButton();  
        btn14.setName("历史上的今天");  
        btn14.setType("click");  
        btn14.setKey("14");  
  
        CommonButton btn21 = new CommonButton();  
        btn21.setName("歌曲点播");  
        btn21.setType("click");  
        btn21.setKey("21");  
  
        CommonButton btn22 = new CommonButton();  
        btn22.setName("经典游戏");  
        btn22.setType("click");  
        btn22.setKey("22");  
  
        CommonButton btn23 = new CommonButton();  
        btn23.setName("美女电台");  
        btn23.setType("click");  
        btn23.setKey("23");  
  
        CommonButton btn24 = new CommonButton();  
        btn24.setName("人脸识别");  
        btn24.setType("click");  
        btn24.setKey("24");  
  
        CommonButton btn25 = new CommonButton();  
        btn25.setName("聊天唠嗑");  
        btn25.setType("click");  
        btn25.setKey("25");  
  
        CommonButton btn31 = new CommonButton();  
        btn31.setName("Q友圈");  
        btn31.setType("click");  
        btn31.setKey("31");  
  
        CommonButton btn32 = new CommonButton();  
        btn32.setName("电影排行榜");  
        btn32.setType("click");  
        btn32.setKey("32");  
  
        CommonButton btn33 = new CommonButton();  
        btn33.setName("幽默笑话");  
        btn33.setType("click");  
        btn33.setKey("33");  
        
        ViewButton btn34 = new ViewButton();  
        btn34.setName("使用帮助");  
        btn34.setType("view");  
        btn34.setUrl("http://liufeng.gotoip2.com/xiaoqrobot/help.jsp");  
  
        ComplexButton mainBtn1 = new ComplexButton();  
        mainBtn1.setName("生活助手");  
        mainBtn1.setSub_button(new Button[] { btn11, btn12, btn13, btn14 });  
  
        ComplexButton mainBtn2 = new ComplexButton();  
        mainBtn2.setName("休闲驿站");  
        mainBtn2.setSub_button(new Button[] { btn21, btn22, btn23, btn24, btn25 });  
  
        ComplexButton mainBtn3 = new ComplexButton();  
        mainBtn3.setName("更多体验");  
        mainBtn3.setSub_button(new Button[] { btn31, btn32, btn33, btn34 });  
 
        Menu menu = new Menu();  
        menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });  
  
        return menu;  
	}
	
	/**
	 * 获取access_token
	 * @param appid 凭证
	 * @param appsecret 密钥
	 * @return
	 */
	public static AccessToken getAccessToken(String appid, String appsecret)
	{
		AccessToken accessToken = null;
		String requestUrl = access_token_url.replace("APPID", appid).replace("APPSECRET", appsecret);
		 JSONObject jsonObject = httpRequest(requestUrl, "GET", null);
		// 如果请求成功  
	    if (null != jsonObject)
	    {  
	        try 
	        {  
	            accessToken = new AccessToken();  
	            accessToken.setToken(jsonObject.getString("access_token"));  
	            accessToken.setExpiresIn(jsonObject.getInt("expires_in"));  
	        } 
	        catch (Exception e)
	        {  
	            accessToken = null;  
	        }
	    }
		return accessToken;
	}
	
	
	/**
	 * 发起https请求并获取结果
	 * 
	 * @param requestUrl 请求地址
	 * @param requestMethod 请求方式（GET,POST）
	 * @param outputStr 提交的数据
	 * @return JSONObject
	 */
	 public static JSONObject httpRequest(String requestUrl, String requestMethod, String outputStr)
	 {
		 JSONObject jsonObject = null;  
		 StringBuffer buffer = new StringBuffer();  
		
		 try
		 {
			 // 创建SSLContext对象，并使用我们指定的信任管理器初始化  
	         TrustManager[] tm = { new MyX509TrustManager() };  
	         SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
	         sslContext.init(null, tm, new java.security.SecureRandom()); 
	         // 从上述SSLContext对象中得到SSLSocketFactory对象  
	         SSLSocketFactory ssf = sslContext.getSocketFactory();  
	         URL url = new URL(requestUrl);  
	         HttpsURLConnection httpUrlConn = (HttpsURLConnection) url.openConnection();  
	         httpUrlConn.setSSLSocketFactory(ssf);  
	         
	         httpUrlConn.setDoOutput(true);  
             httpUrlConn.setDoInput(true);  
             httpUrlConn.setUseCaches(false); 
             
             // 设置请求方式（GET/POST）  
             httpUrlConn.setRequestMethod(requestMethod);  
             
             if ("GET".equalsIgnoreCase(requestMethod))  
                 httpUrlConn.connect(); 
             
             // 当有数据需要提交时  
             if (null != outputStr) {  
                 OutputStream outputStream = httpUrlConn.getOutputStream();  
                 // 注意编码格式，防止中文乱码  
                 outputStream.write(outputStr.getBytes("UTF-8"));  
                 outputStream.close();  
             }  
             // 将返回的输入流转换成字符串  
             InputStream inputStream = httpUrlConn.getInputStream();  
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");  
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  
             
             String str = null;  
             while ((str = bufferedReader.readLine()) != null) 
             {  
                 buffer.append(str);  
             }  
             bufferedReader.close();  
             inputStreamReader.close(); 
             // 释放资源  
             inputStream.close();  
             inputStream = null;  
             httpUrlConn.disconnect();  
             jsonObject = JSONObject.fromObject(buffer.toString());  
        
		} catch (Exception e)
		{
			e.printStackTrace();
         
	    }
		 return jsonObject;
	 }
}
