package com.ronei.simplespotify.api;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.ronei.simplespotify.util.MappperUtil;


public class BaseAPI {

	public static <S, D> List<D> mapperList(List<S> sourceList, Class<D> destinationType) {

		return MappperUtil.mapperList(sourceList, destinationType);

	}

	public static <S, D> D mapper(S source, Class<D> destinationType) {
		return MappperUtil.mapper(source, destinationType);
	}
	
	public Pageable createPageRequest(int page, int size, List<String> sort, String direction) {

		Direction dir = Sort.Direction.fromString(direction);

		return new PageRequest(page, size, dir, sort.toArray(new String[0]));

	}
	

}
