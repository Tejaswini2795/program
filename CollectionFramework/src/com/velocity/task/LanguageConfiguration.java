package com.velocity.task;

public class LanguageConfiguration {
	private int id;
	private String languageCode;
	private String language;
	private String country;
	public LanguageConfiguration(int id, String languageCode, String language, String country) {
		super();
		this.id = id;
		this.languageCode = languageCode;
		this.language = language;
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "LanguageConfiguration [id=" + id + ", languageCode=" + languageCode + ", language=" + language
				+ ", country=" + country + "]";
	}

}
