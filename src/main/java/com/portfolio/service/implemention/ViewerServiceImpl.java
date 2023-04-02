package com.portfolio.service.implemention;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.entity.Viewer;
import com.portfolio.playload.ViewerDto;
import com.portfolio.repository.ViewerRepository;
import com.portfolio.service.ViewerService;

@Service
public class ViewerServiceImpl implements ViewerService{
	
	@Autowired
	private ViewerRepository viewerRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public ViewerDto viewerToDto(Viewer viewer) {
		return this.modelMapper.map(viewer, ViewerDto.class);
	}
	
	public Viewer dtoToViewer(ViewerDto viewerDto) {
		return this.modelMapper.map(viewerDto, Viewer.class);
	}

	@Override
	public ViewerDto createViewer(ViewerDto viewerDto) {
		Viewer viewer = this.dtoToViewer(viewerDto);
		Viewer createdViewer = this.viewerRepository.save(viewer);
		return this.viewerToDto(createdViewer);
	}

}
