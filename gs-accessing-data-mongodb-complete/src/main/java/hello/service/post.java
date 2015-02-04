package hello.service;

import hello.Xiangqing;

import java.io.IOException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.List;

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
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;



public class post {
	public static void main( String args[] ){
		//测试
		String result=post.post("CP23010020140927033100");
		System.out.print(result);
		
		try {
			Document doc=DocumentHelper.parseText(result);
			// System.out.print(result);
			 Element root = doc.getRootElement();
			 Element body=root.element("body");			    
			 Element contents=body.element("contents");
			 Element content = contents.element("content");
			

			 //组装javabean
			 Element ccode=content.element("code");
			 
			System.out.println(ccode.getText());
			
			 
			 //获取图片地址
//			if(content.selectSingleNode("image-files")==null){
//				 System.out.println("hascontent");
//			 }
			List list = content.selectNodes("image-files");
			if(list.size()>0){
				
			}else{
				System.out.print("aaaa");
			}
			
//			 System.out.println(image_files.getText());
//			 Element image_file=image_files.element("image-file");
//			System.out.println(image_file.getText());
//			 Element image_url=image_file.element("url");
//			 System.out.println(image_url.getText());
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	

	
	
	}
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
					 StringEntity myEntity = new StringEntity("<message module='CATALOG_SERVICE' version='2.0'><header action='REQUEST' command='CONTENT_QUERY' sequence='10000000001' component-id='CATALOG_SERVER1' component-type='CATALOG_SERVER'/><body><contents><content><code>"+code+"</code><items-index>1</items-index><site-code>f_1</site-code><folder-code>f_1_11</folder-code></content></contents></body></message>", "UTF-8"); 
						
					 httppost.addHeader("Content-Type", "text/xml"); 
					 httppost.setEntity(myEntity); 
					 HttpResponse response = httpclient.execute(httppost); 
					 HttpEntity resEntity = response.getEntity(); 
					
					 if (resEntity != null) { 
						 
						 result=EntityUtils.toString(resEntity);
				 					   return result;
					                    //System.out.println(EntityUtils.toString(resEntity));  
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
