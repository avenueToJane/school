package com.westlife.demo.service;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.westlife.demo.common.RequestDto;
import com.westlife.demo.mapper.SchoolMapper;
import com.westlife.demo.model.School;
import com.westlife.demo.util.ConcurrentDateUtil;
import com.westlife.demo.util.DateDay;

@Service
public class SchoolService {
	
	protected static final Logger logger = LoggerFactory.getLogger(SchoolService.class);
	@Autowired
	private SchoolMapper schoolMapper;
	
	public List<School> selectAll() {
		List<School> schoolList=schoolMapper.selectAll();
		return schoolList;
	}

}
