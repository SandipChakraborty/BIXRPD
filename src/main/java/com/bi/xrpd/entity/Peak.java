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
@Table(name = "Peak_List")
public class Peak implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "Peak_List_seq", sequenceName = "Peak_List_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Peak_List_seq")
	@Column(name = "Peak_List_Code")
	private long peakListCode;

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
	public Peak() {
		super();
	}

	/**
	 * @param peakListCode
	 * @param xcoValue
	 * @param ycoValue
	 * @param systemEntry
	 */
	public Peak(long peakListCode, String xcoValue, String ycoValue, SystemEntry systemEntry) {
		super();
		this.peakListCode = peakListCode;
		this.xcoValue = xcoValue;
		this.ycoValue = ycoValue;
		this.systemEntry = systemEntry;
	}

	/**
	 * @return the peakListCode
	 */
	public long getPeakListCode() {
		return peakListCode;
	}

	/**
	 * @param peakListCode the peakListCode to set
	 */
	public void setPeakListCode(long peakListCode) {
		this.peakListCode = peakListCode;
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
		return "Peak [peakListCode=" + peakListCode + ", xcoValue=" + xcoValue + ", ycoValue=" + ycoValue
				+ ", systemEntry=" + systemEntry + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (peakListCode ^ (peakListCode >>> 32));
		result = prime * result + ((systemEntry == null) ? 0 : systemEntry.hashCode());
		result = prime * result + ((xcoValue == null) ? 0 : xcoValue.hashCode());
		result = prime * result + ((ycoValue == null) ? 0 : ycoValue.hashCode());
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
		Peak other = (Peak) obj;
		if (peakListCode != other.peakListCode)
			return false;
		if (systemEntry == null) {
			if (other.systemEntry != null)
				return false;
		} else if (!systemEntry.equals(other.systemEntry))
			return false;
		if (xcoValue == null) {
			if (other.xcoValue != null)
				return false;
		} else if (!xcoValue.equals(other.xcoValue))
			return false;
		if (ycoValue == null) {
			if (other.ycoValue != null)
				return false;
		} else if (!ycoValue.equals(other.ycoValue))
			return false;
		return true;
	}

}
