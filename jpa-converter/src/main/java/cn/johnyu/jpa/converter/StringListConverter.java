package cn.johnyu.jpa.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;
//@Convert
public class StringListConverter implements AttributeConverter<List<String>, String> {

	@Override
	public String convertToDatabaseColumn(List<String> attribute) {
		
		StringBuilder sb=new StringBuilder();
		int size=attribute.size();
		for(int i=0;i<size-1;i++) {
			sb.append(attribute.get(i));
			sb.append(",");
		}
		sb.append(attribute.get(size-1));
		return sb.toString();
	}

	@Override
	public List<String> convertToEntityAttribute(String dbData) {
		return Arrays.asList(dbData.split(","));
	}
	
	public static void main(String[] args) {
		StringListConverter conv=new StringListConverter();
//		List<String> list=new ArrayList<>();
//		list.add("abc");
//		list.add("bcd");
//		String rs=conv.convertToDatabaseColumn(list);
//		System.out.println(rs);
		List<String> list1=conv.convertToEntityAttribute("abc,bcd");
		for(String s:list1) {
			System.out.println(s);
		}
	}
	

}
