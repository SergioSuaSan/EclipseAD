package model;

import java.util.List;

public class Lieux{
	private String id;
	private String titre;
    private String description_es;
    private List<Photo> photos;
    public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription_es() {
		return description_es;
	}
	public void setDescription_es(String description_es) {
		this.description_es = description_es;
	}
	public List<Photo> getPhotos() {
		return photos;
	}
	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
	@Override
	public String toString() {
		return "Lieux [titre=" + titre + ", description_es=" + description_es + ", photos=" + photos + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
    
}

