package hello;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Xiangqing {

	@Id private String id;

	private String name;
	private String code;
	private String type;
	
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
	private String image_url;
	private String lanmu_name;
	private String pingying;
	
	
	private String document_folder_url;
	private String preview_entity_url;
	private String still_entity_url;
	private String poster_entity_url;
	private String feature_entity_url;
	private String sitcom_entity_url;
	
	
	public String getDocument_folder_url() {
		return document_folder_url;
	}

	public void setDocument_folder_url(String document_folder_url) {
		this.document_folder_url = document_folder_url;
	}

	public String getPreview_entity_url() {
		return preview_entity_url;
	}

	public void setPreview_entity_url(String preview_entity_url) {
		this.preview_entity_url = preview_entity_url;
	}

	public String getStill_entity_url() {
		return still_entity_url;
	}

	public void setStill_entity_url(String still_entity_url) {
		this.still_entity_url = still_entity_url;
	}

	public String getPoster_entity_url() {
		return poster_entity_url;
	}

	public void setPoster_entity_url(String poster_entity_url) {
		this.poster_entity_url = poster_entity_url;
	}

	public String getFeature_entity_url() {
		return feature_entity_url;
	}

	public void setFeature_entity_url(String feature_entity_url) {
		this.feature_entity_url = feature_entity_url;
	}

	public String getSitcom_entity_url() {
		return sitcom_entity_url;
	}

	public void setSitcom_entity_url(String sitcom_entity_url) {
		this.sitcom_entity_url = sitcom_entity_url;
	}

	public String getPingying() {
		return pingying;
	}

	public void setPingying(String pingying) {
		this.pingying = pingying;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

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

	
	
	



	
}
