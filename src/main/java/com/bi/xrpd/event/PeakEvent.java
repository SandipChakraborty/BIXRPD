package com.bi.xrpd.event;

public class PeakEvent {

	public PeakEvent() {
		// TODO Auto-generated constructor stub
	}
	private String xcoValue;

	private String ycoValue;

	/**
	 * @param xcoValue
	 * @param ycoValue
	 */
	public PeakEvent(String xcoValue, String ycoValue) {
		super();
		this.xcoValue = xcoValue;
		this.ycoValue = ycoValue;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PeakEvent [xcoValue=" + xcoValue + ", ycoValue=" + ycoValue + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		PeakEvent other = (PeakEvent) obj;
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
