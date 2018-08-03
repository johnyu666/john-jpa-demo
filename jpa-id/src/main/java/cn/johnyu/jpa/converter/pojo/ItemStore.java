package cn.johnyu.jpa.converter.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
/**
 * 使用IDClass进行复合主键映射
 * @author john
 *
 */
@Entity
@IdClass(value=ItemStore.Pk.class)
public class ItemStore {
	@Id
	private Integer itemId;
	@Id
	private Integer baseId;
	private int itemNum;
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Integer getBaseId() {
		return baseId;
	}
	public void setBaseId(Integer baseId) {
		this.baseId = baseId;
	}
	public int getItemNum() {
		return itemNum;
	}
	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}
	
	
	public static class Pk implements Serializable{
		private Integer baseId;
		private Integer itemId;
		public Integer getBaseId() {
			return baseId;
		}
		public void setBaseId(Integer baseId) {
			this.baseId = baseId;
		}
		public Integer getItemId() {
			return itemId;
		}

		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((baseId == null) ? 0 : baseId.hashCode());
			result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pk other = (Pk) obj;
			if (baseId == null) {
				if (other.baseId != null)
					return false;
			} else if (!baseId.equals(other.baseId))
				return false;
			if (itemId == null) {
				if (other.itemId != null)
					return false;
			} else if (!itemId.equals(other.itemId))
				return false;
			return true;
		}
		
	}
}
