package hello;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import hello.lanmu1.LanmuRepository;
import hello.lanmu1.lanmu1;
import hello.lanmu1.post_lanmu1;
import hello.list.ListRepository;
import hello.list.list;
import hello.list.post_list;
import hello.service.post;
import hello.url.UrlAction;
import hello.url.UrlRepository;
import hello.url.post_url;
import hello.url.url;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@EnableAutoConfiguration
public class RunApplication  {

	@Autowired
	private XiangqingRepository repository_xiangqiang;
	
	@Autowired
	private ListRepository repository_list;
	
	@Autowired
	private UrlRepository repository_url;
	
	@Autowired
	private LanmuRepository repository_lanmu;

	public static void main(String[] args) {
		SpringApplication.run(RunApplication.class, args);
	}
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    
    
    @Scheduled(cron ="30 41 8 ? * *")	
	public void run() throws Exception {
	
		
    	System.out.println("The time is now " + dateFormat.format(new Date()));
//		runinit();
//		
//		runLanmu();
//		runLanmu();
//		runLanmu();
//		runLanmu();
//		runList();
//		runURL();
		runXiangqing();	
		

		
//		for (list bean : repository_list.findAll()) {
//			String code="";
//			code=bean.getId();
//			String result="11";
//			result=post.post(code);
//			
//			if(result.contains("<result code=\"1\" description=\"ok\"/>")){
//          		 
//       	 	}else{
//       		 System.out.print("result error");
//       		 continue;
//       	 	}
//			
//			 Document doc=DocumentHelper.parseText(result);
//			 Element root = doc.getRootElement();
//			 Element body=root.element("body");			    
//			 Element contents=body.element("contents");
//			 Element content = contents.element("content");
//			 
//			 //组装javabean
//			 Element ccode=content.element("code");
//			 
//			 Element name=content.element("name");
//			 Element type=content.element("type");
//			 
//			 Element director=content.element("director");
//			 Element actors=content.element("actors");
//			 Element items=content.element("items");
//			 Element produced_year=content.element("produced-year");
//			 Element duration=content.element("duration");
//			 Element url=content.element("url");
//			 Element description=content.element("description");
//			 Element duber=content.element("duber");
//			 Element keywords=content.element("keywords");
//			 Element viewpoints=content.element("viewpoints");
//			 Element tags=content.element("tags");
//			 Xiangqing bean_xiangqing=new Xiangqing();
//			 bean_xiangqing.setId(ccode.getText());
//			 bean_xiangqing.setCode(ccode.getText());
//			 bean_xiangqing.setType(type.getText());
//			 bean_xiangqing.setDirector(director.getText());
//			 bean_xiangqing.setActors(actors.getText());
//			 bean_xiangqing.setItems(items.getText());
//			 bean_xiangqing.setProduced_year(produced_year.getText());
//			 bean_xiangqing.setDuration(duration.getText());
//			 bean_xiangqing.setUrl(url.getText());
//			 bean_xiangqing.setDescription(description.getText());
//			 bean_xiangqing.setDuber(duber.getText());
//			 bean_xiangqing.setKeywords(keywords.getText());
//			 bean_xiangqing.setViewpoints(viewpoints.getText());
//			 bean_xiangqing.setTags(tags.getText());
//			 
//			 repository_xiangqiang.save(bean_xiangqing);
//			
//			
//				
//			
//			System.out.println(ccode.getText());
//			
//			
//			
//			
//		}
//		System.out.println("111");

		

	}
	public  void runinit() throws Exception {
		
		repository_lanmu.deleteAll();
		repository_list.deleteAll();
		repository_url.deleteAll();
		repository_xiangqiang.deleteAll();
		String code="xinjiang_vsite";
		
		String result="11";
		result=post_lanmu1.post(code);
		if(result.contains("<result code=\"1\" description=\"ok\"/>")){
 		 
	 	}else{
		 System.out.println("result error"+code);
		
	 	}
	
	 Document doc=DocumentHelper.parseText(result);
	 Element root = doc.getRootElement();
	 Element body=root.element("body");
	 Element folders=body.element("folders");
	 
	 //遍历
		  List nodes = folders.elements("folder");   
		          for (Iterator it = nodes.iterator(); it.hasNext();) {     
		       Element folder = (Element) it.next(); 
		       
		       Element ccode=folder.element("code");
		       Element site_code=folder.element("site-code");
		       Element name=folder.element("name");
		       Element type=folder.element("type");
		       Element parent_folder_code=folder.element("parent-folder-code");
		       Element with_content=folder.element("with-content");
		       Element sort_index=folder.element("sort-index");
		       
		       lanmu1 bean=new lanmu1();
		       bean.setId(ccode.getText());
		       bean.setCode(ccode.getText());
		       bean.setSite_code(site_code.getText());
		       bean.setName(name.getText());
		       bean.setType(type.getText());
		       bean.setParent_folder_code(parent_folder_code.getText());
		       bean.setWith_content(with_content.getText());
		       bean.setSort_index(sort_index.getText());
		       
		       repository_lanmu.save(bean);
		       
		       
		       
		     // do something  
		  }  
		
		
		
		
	}
	
	public  void runList() throws Exception {
		for (lanmu1 beans : repository_lanmu.findAll()) {
			String code="";
			code=beans.getId();
			String result="11";
			result=post_list.post(code);
			if(result.contains("<result code=\"1\" description=\"ok\"/>")){
	 		 
		 	}else{
			 System.out.println("result error="+code);
			 continue;
		 	}
		
		 Document doc=DocumentHelper.parseText(result);
		 Element root = doc.getRootElement();
		 Element body=root.element("body");
		 Element contents=body.element("contents");
		 
		 //遍历
			  List nodes = contents.elements("content");   
			          for (Iterator it = nodes.iterator(); it.hasNext();) {     
			       Element folder = (Element) it.next(); 
			       
			       Element ccode=folder.element("code");
			       
			       Element name=folder.element("name");
			       Element type=folder.element("type");
			       
			      
			       Element creat_time=folder.element("creat-time");
			       Element sort_index=folder.element("sort-index");
			       Element director=folder.element("director");
			       Element actors=folder.element("actors");
			      
			       Element url=folder.element("url");
			       Element description=folder.element("description");
			     
			      
			       Element viewpoints=folder.element("viewpoints");
			       Element tags=folder.element("tags");
			     
			       
			       
			       list bean=new list();
			       bean.setId(ccode.getText());
			       bean.setCode(ccode.getText());
			       
			       bean.setName(name.getText());
			       bean.setType(type.getText());
			       
			       
			       bean.setCreat_time(creat_time.getText());
			       bean.setSort_index(sort_index.getText());
			       bean.setDirector(director.getText());
			       bean.setActors(actors.getText());
			       bean.setLanmu_name(code);
			       bean.setUrl(url.getText());
			       bean.setDescription(description.getText());
			      
			       bean.setViewpoints(viewpoints.getText());
			       bean.setTags(tags.getText());
			       
			       repository_list.save(bean);
			       
			       
			       
			     // do something  
			  }  
			
		}
		
		
	}
	public  void runLanmu() throws Exception {
		
		for (lanmu1 beans : repository_lanmu.findAll()) {
			String code="";
			code=beans.getId();
			String result="11";
			result=post_lanmu1.post(code);
			if(result.contains("<result code=\"1\" description=\"ok\"/>")){
	 		 
		 	}else{
			 System.out.println("result error"+code);
			 continue;
		 	}
		
		 Document doc=DocumentHelper.parseText(result);
		 Element root = doc.getRootElement();
		 Element body=root.element("body");
		 Element folders=body.element("folders");
		 
		 //遍历
			  List nodes = folders.elements("folder");   
			          for (Iterator it = nodes.iterator(); it.hasNext();) {     
			       Element folder = (Element) it.next(); 
			       
			       Element ccode=folder.element("code");
			       Element site_code=folder.element("site-code");
			       Element name=folder.element("name");
			       Element type=folder.element("type");
			       Element parent_folder_code=folder.element("parent-folder-code");
			       Element with_content=folder.element("with-content");
			       Element sort_index=folder.element("sort-index");
			       
			       lanmu1 bean=new lanmu1();
			       bean.setId(ccode.getText());
			       bean.setCode(ccode.getText());
			       bean.setSite_code(site_code.getText());
			       bean.setName(name.getText());
			       bean.setType(type.getText());
			       bean.setParent_folder_code(parent_folder_code.getText());
			       bean.setWith_content(with_content.getText());
			       bean.setSort_index(sort_index.getText());
			       
			       repository_lanmu.save(bean);
			       
			       
			       
			     // do something  
			  }  
			
		}
	}	
public  void runURL() throws Exception {

		
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
		
		
		

	}


public  void runXiangqing() throws Exception {
	
	for (list bean : repository_list.findAll()) {
	String code="";
	code=bean.getId();
	String lanmun="";
	lanmun=bean.getLanmu_name();
	String result="11";
	result=post.post(code);
	
	if(result.contains("<result code=\"1\" description=\"ok\"/>")){
  		 
	 	}else{
		 System.out.print("result error");
		 continue;
	 	}
	
	 Document doc=DocumentHelper.parseText(result);
	// System.out.print(result);
	 Element root = doc.getRootElement();
	 Element body=root.element("body");			    
	 Element contents=body.element("contents");
	 Element content = contents.element("content");
 
	 //组装javabean
	 Element ccode=content.element("code");
	 System.out.println(ccode.getText());
	 
	 Element name=content.element("name");
	 Element type=content.element("type");
	 
	 Element director=content.element("director");
	 Element actors=content.element("actors");
	 Element items=content.element("items");
	 Element produced_year=content.element("produced-year");
	 Element duration=content.element("duration");
	 Element url=content.element("url");
	 Element description=content.element("description");
	 Element duber=content.element("duber");
	 Element keywords=content.element("keywords");
	 Element viewpoints=content.element("viewpoints");
	 Element tags=content.element("tags");
	 Element document_folder_url=content.element("document-folder-url");
	 Element preview_entity_url=content.element("preview-entity-url");
	 Element still_entity_url=content.element("still-entity-url");
	 Element poster_entity_url=content.element("poster-entity-url");
	 Element feature_entity_url=content.element("feature-entity-url");
	 Element sitcom_entity_url=content.element("sitcom-entity-url");
	 
	 
	 
	 
	 Xiangqing bean_xiangqing=new Xiangqing();
	 bean_xiangqing.setName(name.getText());
	 bean_xiangqing.setId(ccode.getText());
	 bean_xiangqing.setCode(ccode.getText());
	 bean_xiangqing.setType(type.getText());
	 bean_xiangqing.setDirector(director.getText());
	 bean_xiangqing.setActors(actors.getText());
	 bean_xiangqing.setItems(items.getText());
	 bean_xiangqing.setProduced_year(produced_year.getText());
	 bean_xiangqing.setDuration(duration.getText());
	 bean_xiangqing.setUrl(url.getText());
	 bean_xiangqing.setDescription(description.getText());
	 bean_xiangqing.setDuber(duber.getText());
	 bean_xiangqing.setKeywords(keywords.getText());
	 bean_xiangqing.setViewpoints(viewpoints.getText());
	 bean_xiangqing.setTags(tags.getText());
	 bean_xiangqing.setDocument_folder_url(document_folder_url.getText());
	 bean_xiangqing.setPreview_entity_url(preview_entity_url.getText());
	 bean_xiangqing.setStill_entity_url(still_entity_url.getText());
	 bean_xiangqing.setPoster_entity_url(poster_entity_url.getText());
	 bean_xiangqing.setFeature_entity_url(feature_entity_url.getText());
	 bean_xiangqing.setSitcom_entity_url(sitcom_entity_url.getText());
	
	 
	 //判断是否有子节点
		List list = content.selectNodes("image-files");
		if(list.size()>0){
			 Element image_files=content.element("image-files");

			 Element image_file=image_files.element("image-file");
		
			 Element image_url=image_file.element("url");
			 bean_xiangqing.setImage_url(image_url.getText());
			 
			
		}else{
			System.out.print("meiyou images_files");
		}
	
	String pingying4j=pingying_util.spell(name.getText());
	
	bean_xiangqing.setPingying(pingying4j);
	 bean_xiangqing.setLanmu_name(lanmun);
	 repository_xiangqiang.save(bean_xiangqing);
	
}



	
	
}
	

}
