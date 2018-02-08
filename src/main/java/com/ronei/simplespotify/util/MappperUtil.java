package com.ronei.simplespotify.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

public class MappperUtil {

	private static final ModelMapper MAPPER = new ModelMapper();
	
	
	
	public static <S,D> List<D> mapperList(List<S> sourceList, Class<D> destinationType) {
		
		return sourceList.stream()
				.map(item -> mapper(item,destinationType))
				.collect(Collectors.toList());
		
	}
	
	public static <S,D> D mapper(S source, Class<D> destinationType) {
		return MAPPER.map(source, destinationType);
	}
	
	
	

}
