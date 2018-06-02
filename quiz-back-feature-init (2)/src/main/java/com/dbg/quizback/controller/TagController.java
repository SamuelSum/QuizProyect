package com.dbg.quizback.controller;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbg.quizback.component.mapper.tag.TagMapper;
import com.dbg.quizback.component.mapper.tag.TagPostMapper;
import com.dbg.quizback.dto.tagDTOs.TagDTO;
import com.dbg.quizback.dto.tagDTOs.TagPostDTO;
import com.dbg.quizback.service.TagService;
import com.dbg.quizback.model.Tag;

@RestController
@RequestMapping(value = "/tag")
public class TagController {
	
	@Autowired
	TagService tagService;
	
	@Autowired
	TagMapper tagMapper;
	
	@Autowired
	TagPostMapper tagPostMapper;
	
	@RequestMapping(method = RequestMethod.GET)
	public Set<TagDTO> findAll(@RequestParam(defaultValue = "0", required = false) Integer page,
			@RequestParam(defaultValue = "10", required = false) Integer size) {
		
		final Set <Tag> tags = tagService.findAll(PageRequest.of(page, size));
		return tagMapper.modelToDto(tags);
		
	}

	@RequestMapping(method = RequestMethod.POST)
	public TagPostDTO create(@RequestBody TagPostDTO dto) {
		final Tag tag = tagPostMapper.dtoToModel(dto);
		final Tag createTag = tagService.create(tag);
		return tagPostMapper.modelToDto(createTag);
		
	}
	
	@RequestMapping(value = "/{id}", method = { RequestMethod.DELETE })
	public void delete(@PathVariable("id") Integer id) {
		
		if (tagService.findById(id).isPresent()) {
			Optional<Tag> tag;
			tag = tagService.findById(id);
			tagService.delete(tag.get());			
		}
		
	}
}
