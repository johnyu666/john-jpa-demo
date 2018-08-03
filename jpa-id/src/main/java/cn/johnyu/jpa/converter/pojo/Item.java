package cn.johnyu.jpa.converter.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * Sequence做主键
 * @author john
 *
 */
@Entity
@SequenceGenerator(sequenceName="john_seq01",name="johnSeq01")
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="johnSeq01")
	private Integer id;
	
	private String itemName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
}
