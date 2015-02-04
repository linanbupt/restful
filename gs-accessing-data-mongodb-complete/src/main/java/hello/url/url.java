package hello.url;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class url {
	
	
	@Id private String id;
	
	
	@Field("file-index")
	private String file_index;
	
	private String format;
	private String code;
	
	@Field("items-index")
	private String items_index;
	
	private String url;
	@Field("play-url")
	private String play_url;
	@Field("auth-play-url")
	private String auth_play_url;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFile_index() {
		return file_index;
	}
	public void setFile_index(String file_index) {
		this.file_index = file_index;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getItems_index() {
		return items_index;
	}
	public void setItems_index(String items_index) {
		this.items_index = items_index;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPlay_url() {
		return play_url;
	}
	public void setPlay_url(String play_url) {
		this.play_url = play_url;
	}
	public String getAuth_play_url() {
		return auth_play_url;
	}
	public void setAuth_play_url(String auth_play_url) {
		this.auth_play_url = auth_play_url;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
