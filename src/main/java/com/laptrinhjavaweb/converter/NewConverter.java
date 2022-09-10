package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.NewEntity;

@Component
public class NewConverter {
	public NewEntity toEntity(NewDTO dto) {
		NewEntity entity = new NewEntity();
		entity.setTitle(dto.getTitle());
		entity.setContent(dto.getContent());
		entity.setShortDescription(dto.getShortDescripttion());
		entity.setThumnail(dto.getThumbnail());
		return entity;
	}
	
	public NewDTO toDTO(NewEntity entity) {
		NewDTO dto = new NewDTO();
		dto.setTitle(entity.getTitle());
		dto.setContent(entity.getContent());
		dto.setShortDescripttion(entity.getShortDescription());
		dto.setThumbnail(entity.getThumnail());;
		return dto;
	}
}
