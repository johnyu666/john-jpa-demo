package cn.johnyu.jpa.converter.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
/**
 * 使用table做为主键
 * @author john
 *
 */
@Entity
//table中的每一条记录代表着一个generator
@TableGenerator(name="tableGen01",table="seq_table01"
,pkColumnName="id",pkColumnValue="car",valueColumnName="val"
,initialValue=1,allocationSize=1)
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE
	,generator="tableGen01")
	private int id;
	@Column(name="car_name")
	private String carName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
}
