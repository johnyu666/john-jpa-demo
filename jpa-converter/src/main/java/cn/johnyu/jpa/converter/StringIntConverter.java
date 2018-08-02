package cn.johnyu.jpa.converter;

import javax.persistence.AttributeConverter;

public class StringIntConverter implements AttributeConverter<String, Integer>{

	@Override
	public Integer convertToDatabaseColumn(String attribute) {
		int m=0;
		try {
			m=Integer.parseInt(attribute);
		}
		catch (Exception e) {
			System.out.println("警告：类型转换错误");
		}
		return m;
	}

	@Override
	public String convertToEntityAttribute(Integer dbData) {
		return dbData.toString();
	}

	public static void main(String[] args) {
		System.out.println(Integer.parseInt(""));
	}
	

}
