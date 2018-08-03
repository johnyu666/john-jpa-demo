package cn.johnyu.jpa.converter.pojo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * Composite column as Primary key
 * 复合主键
 * @author john
 *
 */
@Entity
@Table(name="orders")
public class ItemOrder {
	@EmbeddedId
	private OrderKey oid;
	private int itemNum;
	
	public int getItemNum() {
		return itemNum;
	}
	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}
	public OrderKey getOid() {
		return oid;
	}
	public void setOid(OrderKey oid) {
		this.oid = oid;
	}
	
	
}
