package org.translate.min.thread;

import org.translate.min.pojo.AccessToken;
import org.translate.min.util.WeixinUtil;


public class TokenThread implements Runnable
{
	// 第三方用户唯一凭证  
    public static String appid = "#";  
    // 第三方用户唯一凭证密钥  
    public static String appsecret = "#";  
    public static AccessToken accessToken = null;  
  
    public void run() {  
        while (true) {  
            try {  
                accessToken = WeixinUtil.getAccessToken(appid, appsecret);  
                WeixinUtil.createMenu(WeixinUtil.getMenu(), accessToken.getToken());
                
                if (null != accessToken) 
                {  
                    // 休眠7000秒  
                    Thread.sleep((accessToken.getExpiresIn() - 200) * 1000);  
                } 
                else
                {  
                    // 如果access_token为null，60秒后再获取  
                    Thread.sleep(60 * 1000);  
                }  
            } 
            catch (InterruptedException e)
            {  
                try 
                {  
                    Thread.sleep(60 * 1000);  
                } 
                catch (Exception e1)
                {  
                }  
            }  
        }  
    }
}
