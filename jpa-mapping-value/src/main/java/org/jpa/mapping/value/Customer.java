package org.jpa.mapping.value;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Basic //是每个字段的默认选项
	//@Transient //不进行映射的字段，与@Basice相反
	@Column(nullable=false,insertable=true
			,updatable=true,length=6
			,unique=true)
	private String cname;
	//不可为空，延迟加载（基本类型无效）
	@Basic(optional=false,fetch=FetchType.EAGER)
	//此配置，不会生成DDL的约束
	@Column(precision=4,scale=2)
	private double salary;
	//实际指定SQL类型，降低了数据库的移植性
	@Column(columnDefinition="char(1)")
	private boolean sex;
	
	//TemporalType.(TIMESTAMP|DATE|TIME)
	@Temporal(TemporalType.TIMESTAMP)
	private Date birth;
	
	
	@Lob
	private byte[] logo;
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public byte[] getLogo() {
		return logo;
	}
	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
}
