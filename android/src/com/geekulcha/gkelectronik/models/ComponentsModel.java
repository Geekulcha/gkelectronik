package com.geekulcha.gkelectronik.models;

import android.graphics.Bitmap;

public class ComponentsModel {
	String type;
	String description;
	String wiki_url;
	Bitmap thumb_image;

	public ComponentsModel() {
		super();
	}

	public ComponentsModel(String type, String description, String wiki_url,
			Bitmap thumb_image) {
		super();
		this.type = type;
		this.description = description;
		this.wiki_url = wiki_url;
		this.thumb_image = thumb_image;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the wiki_url
	 */
	public String getWiki_url() {
		return wiki_url;
	}

	/**
	 * @param wiki_url the wiki_url to set
	 */
	public void setWiki_url(String wiki_url) {
		this.wiki_url = wiki_url;
	}

	/**
	 * @return the thumb_image
	 */
	public Bitmap getThumb_image() {
		return thumb_image;
	}

	/**
	 * @param thumb_image the thumb_image to set
	 */
	public void setThumb_image(Bitmap thumb_image) {
		this.thumb_image = thumb_image;
	}
	

}
