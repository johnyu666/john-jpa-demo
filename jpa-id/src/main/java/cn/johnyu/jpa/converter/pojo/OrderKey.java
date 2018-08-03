package cn.johnyu.jpa.converter.pojo;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class OrderKey 
implements Serializable
{
	private Integer itemId;
	private Integer providerIde;
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Integer getProviderIde() {
		return providerIde;
	}
	public void setProviderIde(Integer providerIde) {
		this.providerIde = providerIde;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result + ((providerIde == null) ? 0 : providerIde.hashCode());
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
		OrderKey other = (OrderKey) obj;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (providerIde == null) {
			if (other.providerIde != null)
				return false;
		} else if (!providerIde.equals(other.providerIde))
			return false;
		return true;
	}
	
	
}
