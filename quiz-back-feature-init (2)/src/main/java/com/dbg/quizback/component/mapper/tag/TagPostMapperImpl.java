package com.dbg.quizback.component.mapper.tag;




import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.dto.tagDTOs.TagPostDTO;
import com.dbg.quizback.model.Tag;

@Component
public class TagPostMapperImpl extends AbstractMapper<Tag, TagPostDTO> implements TagPostMapper {

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
//		
//	public Class<Tag> dtoToModel(TagDTO dto) {
//		Tag tag = dozer.map(dto, Tag.class);
//		return Tag.class;
//	}
//	
	

	
}
