package com.bi.xrpd.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "System_Entry")
public class SystemEntry implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "System_Entry_seq", sequenceName = "System_Entry_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "System_Entry_seq")
	@Column(name = "System_Entry_Code")
	private long systemEntryCode;

	@Column(name = "Label")
	private String label;

	@Column(name = "Compound_Name")
	private String compoundName;

	@Column(name = "Form")
	private String form;

	@Column(name = "Data_Source")
	private String dataSources;

	@Column(name = "Reference_data")
	private boolean referenceData;

	@Column(name = "Batch_Or_Lot")
	private String batchOrLot;

	@Column(name = "Notebook_Number")
	private int notebookNumbe;

	@Column(name = "Comments")
	private String comments;

	@Column(name = "User")
	private String user;

	@Column(name = "Role")
	private String role;

	@Column(name = "Time_Stamp")
	private Timestamp timeStamp;

	@OneToMany(mappedBy = "systemEntry", fetch = FetchType.EAGER)
	private List<DiffractionPattern> diffractionPatternList;

	@OneToMany(mappedBy = "systemEntry", fetch = FetchType.EAGER)
	private Set<Peak> peakList;

	public SystemEntry() {
		super();
	}

	/**
	 * @param systemEntryCode
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
	 * @param timeStamp
	 * @param diffractionPatternList
	 * @param peakList
	 */
	public SystemEntry(long systemEntryCode, String label, String compoundName, String form, String dataSources,
			boolean referenceData, String batchOrLot, int notebookNumbe, String comments, String user, String role,
			Timestamp timeStamp, List<DiffractionPattern> diffractionPatternList, Set<Peak> peakList) {
		super();
		this.systemEntryCode = systemEntryCode;
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
		this.timeStamp = timeStamp;
		this.diffractionPatternList = diffractionPatternList;
		this.peakList = peakList;
	}

	/**
	 * @return the systemEntryCode
	 */
	public long getSystemEntryCode() {
		return systemEntryCode;
	}

	/**
	 * @param systemEntryCode the systemEntryCode to set
	 */
	public void setSystemEntryCode(long systemEntryCode) {
		this.systemEntryCode = systemEntryCode;
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
	 * @return the timeStamp
	 */
	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	/**
	 * @param timeStamp the timeStamp to set
	 */
	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	/**
	 * @return the diffractionPatternList
	 */
	public List<DiffractionPattern> getDiffractionPatternList() {
		return diffractionPatternList;
	}

	/**
	 * @param diffractionPatternList the diffractionPatternList to set
	 */
	public void setDiffractionPatternList(List<DiffractionPattern> diffractionPatternList) {
		this.diffractionPatternList = diffractionPatternList;
	}

	/**
	 * @return the peakList
	 */
	public Set<Peak> getPeakList() {
		return peakList;
	}

	/**
	 * @param peakList the peakList to set
	 */
	public void setPeakList(Set<Peak> peakList) {
		this.peakList = peakList;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SystemEntry [systemEntryCode=" + systemEntryCode + ", label=" + label + ", compoundName=" + compoundName
				+ ", form=" + form + ", dataSources=" + dataSources + ", referenceData=" + referenceData
				+ ", batchOrLot=" + batchOrLot + ", notebookNumbe=" + notebookNumbe + ", comments=" + comments
				+ ", user=" + user + ", role=" + role + ", timeStamp=" + timeStamp + ", diffractionPatternList="
				+ diffractionPatternList + ", peakList=" + peakList + "]";
	}

}
