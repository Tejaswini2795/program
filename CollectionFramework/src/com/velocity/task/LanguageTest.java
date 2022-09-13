package com.velocity.task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LanguageTest {
	
	static Set<LanguageConfiguration> langConfig = new HashSet<>();
	static Map<Integer, String> idCodeMap = new HashMap<>();
	static Map<String, String> langAndCodeMap = new HashMap<>();
	
	public static void setLanguageConfig() {
		langConfig.add(new LanguageConfiguration(1, "it", "Italian", "Italy"));
		langConfig.add(new LanguageConfiguration(2, "ja", "Japanese", "Japan"));
		langConfig.add(new LanguageConfiguration(3, "ra", "Russian", "Russia"));
		langConfig.add(new LanguageConfiguration(4, "sa", "Sanskrit", "India"));
		langConfig.add(new LanguageConfiguration(5, "is", "Icelandic", "Iceland"));
		langConfig.add(new LanguageConfiguration(6, "bg", "Bulgarian", "Bulgaria"));
		langConfig.add(new LanguageConfiguration(7, "bh", "Bihari", "India"));
		langConfig.add(new LanguageConfiguration(8, "mr", "Marathi", "India"));
		langConfig.add(new LanguageConfiguration(9, "zh", "Chinese", "Chin"));
		langConfig.add(new LanguageConfiguration(10, "hi", "Hindi", "India"));
	}
	
	public static void mapOfLanguageConfig() {
		if(langConfig != null && !langConfig.isEmpty()) {
			for(LanguageConfiguration lc :langConfig){
				idCodeMap.put(lc.getId(), lc.getLanguageCode());
			}
		}
	}
	
	public static void mapOfLangCode() {
		if(langConfig != null && !langConfig.isEmpty()) {
			for(LanguageConfiguration lc :langConfig){
				langAndCodeMap.put(lc.getLanguageCode(), lc.getLanguage());
			}
		}
	}
	
	public static void main(String[] args) {
		setLanguageConfig();
		mapOfLanguageConfig();
		mapOfLangCode();
		
		langConfig.forEach(langConfig -> System.out.println(langConfig));
		System.out.println("=========idCodeMap============");
		idCodeMap.forEach((k,v) -> System.out.println("keys: "+k+"  values: "+v));
		System.out.println("=========idCodeMap============");
		langAndCodeMap.forEach((k,v) -> System.out.println("keys: "+k+"  values: "+v));
	}
	

}
