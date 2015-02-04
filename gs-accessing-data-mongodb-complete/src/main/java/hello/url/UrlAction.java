package hello.url;

import hello.RunApplication;
import hello.Xiangqing;
import hello.XiangqingRepository;
import hello.list.ListRepository;
import hello.list.list;
import hello.service.post;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;



public class UrlAction {

	@Autowired
	private XiangqingRepository repository_xiangqiang;
	
	@Autowired
	private ListRepository repository_list;
	
	@Autowired
	private UrlRepository repository_url;

	
	public  void run() throws Exception {

		
		for (list bean : repository_list.findAll()) {
			String code="";
			code=bean.getId();
			String result="11";
			result=post_url.post(code);
			
			if(result.contains("<result code=\"1\" description=\"ok\"/>")){
          		 
       	 	}else{
       		 System.out.println("result error"+code);
       		 continue;
       	 	}
			
			 Document doc=DocumentHelper.parseText(result);
			 Element root = doc.getRootElement();
			 Element body=root.element("body");			    
			 Element contents=body.element("contents");
			 Element content = contents.element("content");
			 
			 //组装javabean
			 Element ccode=content.element("code");
			 
			 Element file_index=content.element("file-index");
			 Element format=content.element("format");
			 
			 Element items_index=content.element("items-index");
			 Element url=content.element("url");
			 Element play_url=content.element("play-url");
			 Element auth_play_url=content.element("auth-play-url");
			 
			
			 url bean_url=new url();			
			 bean_url.setId(ccode.getText());
			 bean_url.setCode(ccode.getText());
			 bean_url.setFile_index(file_index.getText());
			 bean_url.setFormat(format.getText());
			 bean_url.setItems_index(items_index.getText());
			 bean_url.setUrl(url.getText());
			 bean_url.setPlay_url(play_url.getText());
			 bean_url.setAuth_play_url(auth_play_url.getText());
		
			 repository_url.save(bean_url);
			
	
			
		}
		System.out.println("111");
		
		

	}
	
	
	
	
	
	
	
}
