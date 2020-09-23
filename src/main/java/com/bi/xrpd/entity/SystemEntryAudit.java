package com.bi.xrpd.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "System_Entry_Audit")
public class SystemEntryAudit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "System_Entry_Audit_seq", sequenceName = "System_Entry_Audit_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "System_Entry_Audit_seq")
	@Column(name = "System_Entry_Audit_Code")
	private long systemEntryAuditCode;

	@Column(name = "System_Entry_Code")
	private long systemEntryCode;

	/**
	 * Add or Edit
	 */
	@Column(name = "Action")
	private String action;

	@Column(name = "Remarks")
	private String remarks;

	@Column(name = "User")
	private String user;

	@Column(name = "Role")
	private String role;

	@Column(name = "Time_Stamp")
	private Timestamp timeStamp;

	/**
	 * 
	 */
	public SystemEntryAudit() {
		super();
	}

	/**
	 * @param systemEntryAuditCode
	 * @param systemEntryCode
	 * @param action
	 * @param remarks
	 * @param user
	 * @param role
	 * @param timeStamp
	 */
	public SystemEntryAudit(long systemEntryAuditCode, long systemEntryCode, String action, String remarks, String user,
			String role, Timestamp timeStamp) {
		super();
		this.systemEntryAuditCode = systemEntryAuditCode;
		this.systemEntryCode = systemEntryCode;
		this.action = action;
		this.remarks = remarks;
		this.user = user;
		this.role = role;
		this.timeStamp = timeStamp;
	}

	/**
	 * @return the systemEntryAuditCode
	 */
	public long getSystemEntryAuditCode() {
		return systemEntryAuditCode;
	}

	/**
	 * @param systemEntryAuditCode
	 *            the systemEntryAuditCode to set
	 */
	public void setSystemEntryAuditCode(long systemEntryAuditCode) {
		this.systemEntryAuditCode = systemEntryAuditCode;
	}

	/**
	 * @return the systemEntryCode
	 */
	public long getSystemEntryCode() {
		return systemEntryCode;
	}

	/**
	 * @param systemEntryCode
	 *            the systemEntryCode to set
	 */
	public void setSystemEntryCode(long systemEntryCode) {
		this.systemEntryCode = systemEntryCode;
	}

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param action
	 *            the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
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
	 * @param role
	 *            the role to set
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
	 * @param timeStamp
	 *            the timeStamp to set
	 */
	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
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
		return "SystemEntryAudit [systemEntryAuditCode=" + systemEntryAuditCode + ", systemEntryCode=" + systemEntryCode
				+ ", action=" + action + ", remarks=" + remarks + ", user=" + user + ", role=" + role + ", timeStamp="
				+ timeStamp + "]";
	}

}
