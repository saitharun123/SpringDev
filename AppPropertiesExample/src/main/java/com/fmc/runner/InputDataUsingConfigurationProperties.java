package com.fmc.runner;

import java.util.List;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("my.prod")
@Component
public class InputDataUsingConfigurationProperties implements CommandLineRunner {

	private int id;
	private String code;
	private boolean type;
	private char model;
	private List<String> prjnm;
	private Map<String,Integer> mdata;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	public char getModel() {
		return model;
	}
	public void setModel(char model) {
		this.model = model;
	}
	public List<String> getPrjnm() {
		return prjnm;
	}
	public void setPrjnm(List<String> prjnm) {
		this.prjnm = prjnm;
	}
	public Map<String, Integer> getMdata() {
		return mdata;
	}
	public void setMdata(Map<String, Integer> mdata) {
		this.mdata = mdata;
	}
	
	
	@Override
	public String toString() {
		return "InputDataUsingConfigurationProperties [id=" + id + ", code=" + code + ", type=" + type + ", model="
				+ model + ", prjnm=" + prjnm + ", mdata=" + mdata + "]";
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("---------FETCHING PROPERTIES USING @ConfigurationProperties----------");
		System.out.println(this.toString());
	}
	
	
}
