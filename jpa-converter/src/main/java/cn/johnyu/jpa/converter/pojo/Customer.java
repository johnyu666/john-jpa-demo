package cn.johnyu.jpa.converter.pojo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import cn.johnyu.jpa.converter.StringIntConverter;
import cn.johnyu.jpa.converter.StringListConverter;

@Entity

public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String cname;
	
	@Convert(converter=StringListConverter.class)
	private List<String> tels=new ArrayList<String>();
	@Convert(converter=StringIntConverter.class)
	private String age;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public static void main(String[] args) {
		StringListConverter c=new StringListConverter();
		System.out.println(c);
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public List<String> getTels() {
		return tels;
	}
	public void setTels(List<String> tels) {
		this.tels = tels;
	}
	
	
	
	
}
