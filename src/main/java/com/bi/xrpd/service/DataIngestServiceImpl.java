package com.bi.xrpd.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bi.xrpd.commons.XrpdConstants;
import com.bi.xrpd.entity.DiffractionPattern;
import com.bi.xrpd.entity.SystemEntry;
import com.bi.xrpd.event.AddSysEntryReqEvent;
import com.bi.xrpd.event.AddSysEntryResEvent;
import com.bi.xrpd.repository.DiffractionPatternRepository;
import com.bi.xrpd.repository.PeakListRepository;
import com.bi.xrpd.repository.SystemEntryAuditRepository;
import com.bi.xrpd.repository.SystemEntryRepository;

import utils.CommonUtils;

/**
 * Created by : Sandip Chakraborty Created Date : 06/12/2018
 * 
 * Modified by : Sandip Chakraborty Modified Date : 06/12/2018
 * 
 * Description : This is the Rest Service Implementation for Data Ingest System.
 * This class will take care of the business logics for the corresponding
 * Controller Class.
 */
@Service
@Transactional
public class DataIngestServiceImpl implements DataIngestService {

	
	  /**
	   * Autowiring commonUtils.
	   */
	  @Autowired
	  private CommonUtils commonUtils;
	  
	  /**
	   * Mapper for bean to bean mapping.
	   */
	  @Autowired
	  private DozerBeanMapper mapper;
	  
	  /**
	   * Autowiring SystemEntryRepository.
	   */
	  @Autowired
	  SystemEntryRepository systemEntryRepository;
	  
	  /**
	   * Autowiring SystemEntryRepository.
	   */
	  @Autowired
	  DiffractionPatternRepository diffractionPatternRepository;
	  
	  /**
	   * Autowiring SystemEntryRepository.
	   */
	  @Autowired
	  PeakListRepository peakListRepository;
	  
	  /**
	   * Autowiring SystemEntryRepository.
	   */
	  @Autowired
	  SystemEntryAuditRepository systemEntryAuditRepository;

	@Override
	public AddSysEntryResEvent addSysEntry(AddSysEntryReqEvent addSysEntryReqEvent) {
		
		SystemEntry systemEntry  = new SystemEntry();
		systemEntry = mapper.map(addSysEntryReqEvent, SystemEntry.class);
		systemEntry = systemEntryRepository.save(systemEntry);
		System.out.println(addSysEntryReqEvent.getDiffractionPatternList().get(0));
		List<DiffractionPattern> diffractionPatternList  = new ArrayList<DiffractionPattern>();
		diffractionPatternList = commonUtils.dozerMapperForList(mapper, addSysEntryReqEvent.getDiffractionPatternList(), DiffractionPattern.class);
		
		for(DiffractionPattern diffractionPattern : diffractionPatternList) {
			
			System.out.println(diffractionPattern.toString());
		}
		
		
		return new AddSysEntryResEvent(XrpdConstants.SUCCESS);
	}

	  
}
