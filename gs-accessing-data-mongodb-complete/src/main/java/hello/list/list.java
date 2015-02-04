package hello.list;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class list {

	@Id private String id;

	private String name;
	private String code;
	private String type;
	
	@Field("sort-index")
	private String sort_index;
	
	@Field("relative-ppvids")
	private String relative_ppvids;
	
	@Field("creat-time")
	private String creat_time;
	
	
	
	
	private String director;
	private String actors;
	private String items;
	
	
	
	@Field("produced-year")
	private String produced_year;
	
	private String duration;
	private String url;
	private String description;
	private String duber;
	private String keywords;
	private String viewpoints;
	private String tags;
	private String lanmu_name;
	

	
	public String getLanmu_name() {
		return lanmu_name;
	}

	public void setLanmu_name(String lanmu_name) {
		this.lanmu_name = lanmu_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public String getProduced_year() {
		return produced_year;
	}

	public void setProduced_year(String produced_year) {
		this.produced_year = produced_year;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuber() {
		return duber;
	}

	public void setDuber(String duber) {
		this.duber = duber;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getViewpoints() {
		return viewpoints;
	}

	public void setViewpoints(String viewpoints) {
		this.viewpoints = viewpoints;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getSort_index() {
		return sort_index;
	}

	public void setSort_index(String sort_index) {
		this.sort_index = sort_index;
	}

	public String getRelative_ppvids() {
		return relative_ppvids;
	}

	public void setRelative_ppvids(String relative_ppvids) {
		this.relative_ppvids = relative_ppvids;
	}

	public String getCreat_time() {
		return creat_time;
	}

	public void setCreat_time(String creat_time) {
		this.creat_time = creat_time;
	}
	
	
	
	



	
}
