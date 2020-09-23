package com.bi.xrpd.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Diffraction_Pattern")
public class DiffractionPattern implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "Diffraction_Pattern_seq", sequenceName = "Diffraction_Pattern_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Diffraction_Pattern_seq")
	@Column(name = "Diffraction_Pattern_Code")
	private long diffractionPatternCode;

	@Column(name = "X")
	private String xcoValue;

	@Column(name = "Y")
	private String ycoValue;

	@ManyToOne()
	@JoinColumn(name = "System_Entry_Code", nullable = false)
	private SystemEntry systemEntry;

	/**
	 * 
	 */
	public DiffractionPattern() {
		super();
	}

	/**
	 * @param diffractionPatternCode
	 * @param xcoValue
	 * @param ycoValue
	 * @param systemEntry
	 */
	public DiffractionPattern(long diffractionPatternCode, String xcoValue, String ycoValue, SystemEntry systemEntry) {
		super();
		this.diffractionPatternCode = diffractionPatternCode;
		this.xcoValue = xcoValue;
		this.ycoValue = ycoValue;
		this.systemEntry = systemEntry;
	}

	/**
	 * @return the diffractionPatternCode
	 */
	public long getDiffractionPatternCode() {
		return diffractionPatternCode;
	}

	/**
	 * @param diffractionPatternCode the diffractionPatternCode to set
	 */
	public void setDiffractionPatternCode(long diffractionPatternCode) {
		this.diffractionPatternCode = diffractionPatternCode;
	}

	/**
	 * @return the xcoValue
	 */
	public String getXcoValue() {
		return xcoValue;
	}

	/**
	 * @param xcoValue the xcoValue to set
	 */
	public void setXcoValue(String xcoValue) {
		this.xcoValue = xcoValue;
	}

	/**
	 * @return the ycoValue
	 */
	public String getYcoValue() {
		return ycoValue;
	}

	/**
	 * @param ycoValue the ycoValue to set
	 */
	public void setYcoValue(String ycoValue) {
		this.ycoValue = ycoValue;
	}

	/**
	 * @return the systemEntry
	 */
	public SystemEntry getSystemEntry() {
		return systemEntry;
	}

	/**
	 * @param systemEntry the systemEntry to set
	 */
	public void setSystemEntry(SystemEntry systemEntry) {
		this.systemEntry = systemEntry;
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
		return "DiffractionPattern [diffractionPatternCode=" + diffractionPatternCode + ", xcoValue=" + xcoValue
				+ ", ycoValue=" + ycoValue + ", systemEntry=" + systemEntry + "]";
	}

}
