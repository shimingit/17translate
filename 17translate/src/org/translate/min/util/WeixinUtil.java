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
	// ��ȡaccess_token�Ľӿڵ�ַ��GET�� ��200����/�죩  
	public final static String access_token_url = "https://api.weixin.qq.com/cgi-bin/token?" +
			"grant_type=client_credential&appid=APPID&secret=APPSECRET"; 
	
	// �˵�������POST�� ��100����/�죩  
	public static String menu_create_url = "https://api.weixin.qq.com/cgi-bin/menu/create?" +
			"access_token=ACCESS_TOKEN"; 
	
	/**
	 * �����˵�
	 * @param menu �˵�ʵ��
	 * @param accessToken ��Ч��access_token
	 * @return 0��ʾ�ɹ�������ֵ��ʾʧ��
	 */
	public static int createMenu(Menu menu, String accessToken)
	{
		int result = 0;
		// ƴװ�����˵���url  
	    String url = menu_create_url.replace("ACCESS_TOKEN", accessToken);
	    // ���˵�����ת����json�ַ���  
	    String jsonMenu = JSONObject.fromObject(menu).toString(); 
	    System.out.println(jsonMenu.toString());
	    // ���ýӿڴ����˵�  
	    JSONObject jsonObject = httpRequest(url, "POST", jsonMenu);  
	    System.out.println(jsonObject.toString());
	    if (null != jsonObject) {  
	        if (0 != jsonObject.getInt("errcode")) {  
	            result = jsonObject.getInt("errcode");  
	        }  
	    }  
	  
	    return result;  
	}
	/**
	 * ��ȡ�˵���Ϣ
	 */
	
	public static Menu getMenu()
	{
		/*CommonButton btn11 = new CommonButton();  
        btn11.setName("����Ԥ��");  
        btn11.setType("click");  
        btn11.setKey("11");  
  
        CommonButton btn12 = new CommonButton();  
        btn12.setName("������ѯ");  
        btn12.setType("click");  
        btn12.setKey("12");  
  
        CommonButton btn13 = new CommonButton();  
        btn13.setName("�ܱ�����");  
        btn13.setType("click");  
        btn13.setKey("13");  
  
        CommonButton btn14 = new CommonButton();  
        btn14.setName("��ʷ�ϵĽ���");  
        btn14.setType("click");  
        btn14.setKey("14");  
  
        CommonButton btn21 = new CommonButton();  
        btn21.setName("�����㲥");  
        btn21.setType("click");  
        btn21.setKey("21");  
  
        CommonButton btn22 = new CommonButton();  
        btn22.setName("������Ϸ");  
        btn22.setType("click");  
        btn22.setKey("22");  
  
        CommonButton btn23 = new CommonButton();  
        btn23.setName("��Ů��̨");  
        btn23.setType("click");  
        btn23.setKey("23");  
  
        CommonButton btn24 = new CommonButton();  
        btn24.setName("����ʶ��");  
        btn24.setType("click");  
        btn24.setKey("24");  
  
        CommonButton btn25 = new CommonButton();  
        btn25.setName("�������");  
        btn25.setType("click");  
        btn25.setKey("25");  
  
        CommonButton btn31 = new CommonButton();  
        btn31.setName("Q��Ȧ");  
        btn31.setType("click");  
        btn31.setKey("31");*/  
  
        ViewButton btn32 = new ViewButton();  
        btn32.setName("��Ҫ����");  
        btn32.setType("view");  
        btn32.setUrl("http://toshimin.com/17translate/fanyi");  
  
        CommonButton btn33 = new CommonButton();  
        btn33.setName("ע������");  
        btn33.setType("click");  
        btn33.setKey("33");  
        
        ViewButton btn34 = new ViewButton();  
        btn34.setName("ʹ�ð���");  
        btn34.setType("view");  
        btn34.setUrl("http://2.17translate.sinaapp.com/");  
  
//        ComplexButton mainBtn1 = new ComplexButton();  
//        mainBtn1.setName("��������");  
//        mainBtn1.setSub_button(new Button[] { btn11, btn12, btn13, btn14 });  
//   
//  
//        ComplexButton mainBtn2 = new ComplexButton();  
//        mainBtn2.setName("������վ");  
//        mainBtn2.setSub_button(new Button[] { btn21, btn22, btn23, btn24, btn25 });  
//  
//        ComplexButton mainBtn3 = new ComplexButton();  
//        mainBtn3.setName("��������");  
//        mainBtn3.setSub_button(new Button[] { btn31, btn32, btn33, btn34 });  
 
        Menu menu = new Menu();  
        menu.setButton(new Button[] { btn32, btn33, btn34 });  
  
        return menu;  
	}
	
	/**
	 * ��ȡaccess_token
	 * @param appid ƾ֤
	 * @param appsecret ��Կ
	 * @return
	 */
	public static AccessToken getAccessToken(String appid, String appsecret)
	{
		AccessToken accessToken = null;
		String requestUrl = access_token_url.replace("APPID", appid).replace("APPSECRET", appsecret);
		 JSONObject jsonObject = httpRequest(requestUrl, "GET", null);
		// �������ɹ�  
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
	 * ����https���󲢻�ȡ���
	 * 
	 * @param requestUrl �����ַ
	 * @param requestMethod ����ʽ��GET,POST��
	 * @param outputStr �ύ������
	 * @return JSONObject
	 */
	 public static JSONObject httpRequest(String requestUrl, String requestMethod, String outputStr)
	 {
		 JSONObject jsonObject = null;  
		 StringBuffer buffer = new StringBuffer();  
		
		 try
		 {
			 // ����SSLContext���󣬲�ʹ������ָ�������ι�������ʼ��  
	         TrustManager[] tm = { new MyX509TrustManager() };  
	         SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
	         sslContext.init(null, tm, new java.security.SecureRandom()); 
	         // ������SSLContext�����еõ�SSLSocketFactory����  
	         SSLSocketFactory ssf = sslContext.getSocketFactory();  
	         URL url = new URL(requestUrl);  
	         HttpsURLConnection httpUrlConn = (HttpsURLConnection) url.openConnection();  
	         httpUrlConn.setSSLSocketFactory(ssf);  
	         
	         httpUrlConn.setDoOutput(true);  
             httpUrlConn.setDoInput(true);  
             httpUrlConn.setUseCaches(false); 
             
             // ��������ʽ��GET/POST��  
             httpUrlConn.setRequestMethod(requestMethod);  
             
             if ("GET".equalsIgnoreCase(requestMethod))  
                 httpUrlConn.connect(); 
             
             // ����������Ҫ�ύʱ  
             if (null != outputStr) {  
                 OutputStream outputStream = httpUrlConn.getOutputStream();  
                 // ע������ʽ����ֹ��������  
                 outputStream.write(outputStr.getBytes("UTF-8"));  
                 outputStream.close();  
             }  
             // �����ص�������ת�����ַ���  
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
             // �ͷ���Դ  
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
