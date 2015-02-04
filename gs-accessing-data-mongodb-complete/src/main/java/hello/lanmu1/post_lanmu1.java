package hello.lanmu1;

import java.io.IOException;
import java.nio.charset.UnsupportedCharsetException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.util.EntityUtils;



public class post_lanmu1 {
//	public static void main( String args[] ){
//		//测试
//		post_lanmu1.post("xinjiang");
//	}
	public static String post(String code){
		 String result="11";
		// TODO Auto-generated method stub
				 try {
					HttpClient httpclient = new DefaultHttpClient(); 
					
					//String url="<?xml version='1.0' encoding='UTF-8'?><message module='CATALOG_SERVICE' version='1.0'><header action='REQUEST' command='CONTENT_URL_QUERY' sequence='10000000001' component-id='SYSTEM1' component-type='THIRD_PARTY_SYSTEM'/><body><contents><content><site-code>f_1</site-code><folder-code>f_1_11</folder-code><code>"+code+"</code><items-index>1</items-index><format>-1</format></content></contents></body></message>";

					httpclient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT,60000);

					//读取超时：
					httpclient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT,60000);
					
					 HttpPost httppost = new HttpPost("http://10.240.12.131/catalog"); 
					 //StringEntity myEntity = new StringEntity(url, "UTF-8");
					 StringEntity myEntity = new StringEntity("<message module='CATALOG_SERVICE' version='2.0'><header action='REQUEST' command='RELATIVE_FOLDER_QUERY' sequence='10000000001' component-id='CATALOG_SERVER1' component-type='CATALOG_SERVER'/><body><folders><folder><code>"+code+"</code><site-code>xinjiang_vsite</site-code><page-items>500000</page-items><page-index>1</page-index></folder></folders></body></message>", "UTF-8"); 
						
					 httppost.addHeader("Content-Type", "text/xml"); 
					 httppost.setEntity(myEntity); 
					 HttpResponse response = httpclient.execute(httppost); 
					 HttpEntity resEntity = response.getEntity(); 
					
					 if (resEntity != null) { 
						//System.out.println(EntityUtils.toString(resEntity));
						 result=EntityUtils.toString(resEntity);
				 					   return result;
					                      
					                  //EntityUtils.consume(resEntity);  
					  } 
					 httpclient.getConnectionManager().shutdown();
				} catch (UnsupportedCharsetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					return result;
				}

	}
		
}
