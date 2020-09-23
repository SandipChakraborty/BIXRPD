package com.bi.xrpd.controller;

import java.util.List;

import com.bi.xrpd.entity.DiffractionPattern;
import com.bi.xrpd.entity.Peak;

public class AddSysEntryReqDomain {

	public AddSysEntryReqDomain() {
		// TODO Auto-generated constructor stub
	}

	private String label;

	private String compoundName;

	private String form;

	private String dataSources;

	private boolean referenceData;

	private String batchOrLot;

	private int notebookNumbe;

	private String comments;

	private String user;

	private String role;
	
	private List<DiffractionPattern> diffractionPatternList;

	private List<Peak> peakList;
	
	
}
