package com.dbg.quizback.component.mapper.tag;

import com.dbg.quizback.component.mapper.Mapper;
import com.dbg.quizback.dto.TagDTO;
import com.dbg.quizback.dto.TagPostDTO;
import com.dbg.quizback.model.Tag;

public interface TagMapper extends Mapper<Tag, TagPostDTO>{

	public Tag dtoToModel(TagDTO dto);

}
