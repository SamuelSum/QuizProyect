package com.dbg.quizback.component.mapper.tag;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.dto.TagDTO;
import com.dbg.quizback.dto.TagPostDTO;
import com.dbg.quizback.model.Tag;

@Component
public class TagMapperImpl extends AbstractMapper<Tag, TagPostDTO> implements TagMapper {

	@Override
	public Class<? extends TagPostDTO> dtoClazz() {
		// TODO Auto-generated method stub
		return TagPostDTO.class;
	}

	@Override
	public Class<? extends Tag> modelClazz() {
		// TODO Auto-generated method stub
		return Tag.class;
	}

	@Override
	public Tag dtoToModel(TagDTO dto) {
		Tag tag = dozer.map(dto, Tag.class);
		return tag;
			
	}

	

	
	
	
	
}
