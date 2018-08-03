package cn.johnyu.jpa.converter.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
/**
 * UUID做主键
 * @author john
 *
 */
@Entity
//定义id的生成器（与Hibernate引擎藕合）
@GenericGenerator(strategy="uuid",name="uuid")
public class Book {
	@Id
	@GeneratedValue(generator="uuid")
	@Column(length=32)
	private String id;
	private String bname;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
}
