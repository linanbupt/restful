package hello.lanmu1;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class lanmu1 {
	
	
	@Id private String id;
	
	
	@Field("site-code")
	private String site_code;
	
	private String name;
	private String code;
	private String type;
	
	
	
	
	@Field("parent-folder-code")
	private String parent_folder_code;
	
	private String url;
	@Field("with-content")
	private String with_content;
	
	
	
	@Field("sort-index")
	private String sort_index;



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getSite_code() {
		return site_code;
	}



	public void setSite_code(String site_code) {
		this.site_code = site_code;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}







	public String getParent_folder_code() {
		return parent_folder_code;
	}



	public void setParent_folder_code(String parent_folder_code) {
		this.parent_folder_code = parent_folder_code;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getWith_content() {
		return with_content;
	}



	public void setWith_content(String with_content) {
		this.with_content = with_content;
	}



	public String getSort_index() {
		return sort_index;
	}



	public void setSort_index(String sort_index) {
		this.sort_index = sort_index;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
