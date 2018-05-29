package com.dbg.quizback.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbg.quizback.component.mapper.tag.TagMapper;
import com.dbg.quizback.service.TagService;
import com.dbg.quizback.service.UserService;
import com.dbg.quizback.dto.TagDTO;
import com.dbg.quizback.dto.TagPostDTO;
import com.dbg.quizback.model.Tag;


@RestController
@RequestMapping(value = "/tag")
public class TagController {
	
	@Autowired
	TagService tagService;
	
	@Autowired
	TagMapper tagMapper;
	
	@RequestMapping(method = RequestMethod.GET)
	public Set<TagDTO> findAll(@RequestParam(defaultValue = "0", required = false) Integer page,
			@RequestParam(defaultValue = "10", required = false) Integer size) {
		final Set <Tag> tags = tagService.findAll(PageRequest.of(page, size));
		return tagMapper.(tags);
		
	}

	@RequestMapping(method = RequestMethod.POST)
	public TagPostDTO create(@RequestBody TagPostDTO dto) {
		final Tag tag = tagMapper.dtoToModel(dto);
		final Tag createTag = tagService.create(tag);
		return tagMapper.modelToDto(createTag);
		
	}
}
