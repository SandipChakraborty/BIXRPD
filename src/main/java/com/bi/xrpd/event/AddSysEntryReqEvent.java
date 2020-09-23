package com.bi.xrpd.event;

import java.util.List;

public class AddSysEntryReqEvent {

	public AddSysEntryReqEvent() {
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
	
	private List<DiffractionPatternEvent> diffractionPatternList;

	private List<PeakEvent> peakList;

	/**
	 * @param label
	 * @param compoundName
	 * @param form
	 * @param dataSources
	 * @param referenceData
	 * @param batchOrLot
	 * @param notebookNumbe
	 * @param comments
	 * @param user
	 * @param role
	 * @param diffractionPatternList
	 * @param peakList
	 */
	public AddSysEntryReqEvent(String label, String compoundName, String form, String dataSources,
			boolean referenceData, String batchOrLot, int notebookNumbe, String comments, String user, String role,
			List<DiffractionPatternEvent> diffractionPatternList, List<PeakEvent> peakList) {
		super();
		this.label = label;
		this.compoundName = compoundName;
		this.form = form;
		this.dataSources = dataSources;
		this.referenceData = referenceData;
		this.batchOrLot = batchOrLot;
		this.notebookNumbe = notebookNumbe;
		this.comments = comments;
		this.user = user;
		this.role = role;
		this.diffractionPatternList = diffractionPatternList;
		this.peakList = peakList;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the compoundName
	 */
	public String getCompoundName() {
		return compoundName;
	}

	/**
	 * @param compoundName the compoundName to set
	 */
	public void setCompoundName(String compoundName) {
		this.compoundName = compoundName;
	}

	/**
	 * @return the form
	 */
	public String getForm() {
		return form;
	}

	/**
	 * @param form the form to set
	 */
	public void setForm(String form) {
		this.form = form;
	}

	/**
	 * @return the dataSources
	 */
	public String getDataSources() {
		return dataSources;
	}

	/**
	 * @param dataSources the dataSources to set
	 */
	public void setDataSources(String dataSources) {
		this.dataSources = dataSources;
	}

	/**
	 * @return the referenceData
	 */
	public boolean isReferenceData() {
		return referenceData;
	}

	/**
	 * @param referenceData the referenceData to set
	 */
	public void setReferenceData(boolean referenceData) {
		this.referenceData = referenceData;
	}

	/**
	 * @return the batchOrLot
	 */
	public String getBatchOrLot() {
		return batchOrLot;
	}

	/**
	 * @param batchOrLot the batchOrLot to set
	 */
	public void setBatchOrLot(String batchOrLot) {
		this.batchOrLot = batchOrLot;
	}

	/**
	 * @return the notebookNumbe
	 */
	public int getNotebookNumbe() {
		return notebookNumbe;
	}

	/**
	 * @param notebookNumbe the notebookNumbe to set
	 */
	public void setNotebookNumbe(int notebookNumbe) {
		this.notebookNumbe = notebookNumbe;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the diffractionPatternList
	 */
	public List<DiffractionPatternEvent> getDiffractionPatternList() {
		return diffractionPatternList;
	}

	/**
	 * @param diffractionPatternList the diffractionPatternList to set
	 */
	public void setDiffractionPatternList(List<DiffractionPatternEvent> diffractionPatternList) {
		this.diffractionPatternList = diffractionPatternList;
	}

	/**
	 * @return the peakList
	 */
	public List<PeakEvent> getPeakList() {
		return peakList;
	}

	/**
	 * @param peakList the peakList to set
	 */
	public void setPeakList(List<PeakEvent> peakList) {
		this.peakList = peakList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AddSysEntryReqEvent [label=" + label + ", compoundName=" + compoundName + ", form=" + form
				+ ", dataSources=" + dataSources + ", referenceData=" + referenceData + ", batchOrLot=" + batchOrLot
				+ ", notebookNumbe=" + notebookNumbe + ", comments=" + comments + ", user=" + user + ", role=" + role
				+ ", diffractionPatternList=" + diffractionPatternList + ", peakList=" + peakList + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batchOrLot == null) ? 0 : batchOrLot.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((compoundName == null) ? 0 : compoundName.hashCode());
		result = prime * result + ((dataSources == null) ? 0 : dataSources.hashCode());
		result = prime * result + ((diffractionPatternList == null) ? 0 : diffractionPatternList.hashCode());
		result = prime * result + ((form == null) ? 0 : form.hashCode());
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result + notebookNumbe;
		result = prime * result + ((peakList == null) ? 0 : peakList.hashCode());
		result = prime * result + (referenceData ? 1231 : 1237);
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddSysEntryReqEvent other = (AddSysEntryReqEvent) obj;
		if (batchOrLot == null) {
			if (other.batchOrLot != null)
				return false;
		} else if (!batchOrLot.equals(other.batchOrLot))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (compoundName == null) {
			if (other.compoundName != null)
				return false;
		} else if (!compoundName.equals(other.compoundName))
			return false;
		if (dataSources == null) {
			if (other.dataSources != null)
				return false;
		} else if (!dataSources.equals(other.dataSources))
			return false;
		if (diffractionPatternList == null) {
			if (other.diffractionPatternList != null)
				return false;
		} else if (!diffractionPatternList.equals(other.diffractionPatternList))
			return false;
		if (form == null) {
			if (other.form != null)
				return false;
		} else if (!form.equals(other.form))
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (notebookNumbe != other.notebookNumbe)
			return false;
		if (peakList == null) {
			if (other.peakList != null)
				return false;
		} else if (!peakList.equals(other.peakList))
			return false;
		if (referenceData != other.referenceData)
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
}
