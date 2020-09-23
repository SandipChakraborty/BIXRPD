package com.bi.xrpd.controller;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bi.xrpd.domain.AddSysEntryReqDomain;
import com.bi.xrpd.domain.AddSysEntryResDomain;
import com.bi.xrpd.event.AddSysEntryReqEvent;
import com.bi.xrpd.event.AddSysEntryResEvent;
import com.bi.xrpd.service.DataIngestService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import utils.CommonUtils;

/**
 * Created by : Sandip Chakraborty Created Date : 06/12/2018
 * 
 * Modified by : Sandip Chakraborty Modified Date : 06/12/2018
 * 
 * Description : This is the Rest Controller for Data Ingest System. The Data
 * Ingest system is used to read diffraction pattern from an external file.
 */
@RestController
@RequestMapping("/dataIngest")
@Api(value = "Data Ingest Controller")
public class DataIngestController {

	/**
	 * Mapper for bean to bean mapping.
	 */
	@Autowired
	private DozerBeanMapper mapper;

	/**
	 * Autowiring commonUtils.
	 */
	@Autowired
	private CommonUtils commonUtils;

	/**
	 * Autowiring dataIngestService.
	 */
	@Autowired
	private DataIngestService dataIngestService;

	/**
	 * Sample API
	 * 
	 * @param a
	 * @return
	 */
	@GetMapping("/{a}")
	@ApiOperation(value = "Get Mapping Example")
	public String greeting(@PathVariable String a) {

		return "Hi " + a;
	}

	@PostMapping("/addSysEntry")
	public AddSysEntryResDomain addSysEntry(@RequestBody AddSysEntryReqDomain addSysEntryReqDomain){
		
		AddSysEntryResEvent addSysEntryResEvent = dataIngestService.addSysEntry(mapper.map(addSysEntryReqDomain, AddSysEntryReqEvent.class));
		
		
		return mapper.map(addSysEntryResEvent, AddSysEntryResDomain.class);
		
	}

}
