package com.training.assignments;

import java.util.Objects;

public class School {
	
	private String schoolName;
	private String city;
	private String district;
	private String greatSchoolRanking;
	
	
	public School(String schoolName, String city, String district, String greatSchoolRanking) {
		super();
		this.schoolName = schoolName;
		this.city = city;
		this.district = district;
		this.greatSchoolRanking = greatSchoolRanking;
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getGreatSchoolRanking() {
		return greatSchoolRanking;
	}


	public void setGreatSchoolRanking(String greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}


	@Override
	public int hashCode() {
		return Objects.hash(schoolName,city,district);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (greatSchoolRanking == null) {
			if (other.greatSchoolRanking != null)
				return false;
		} else if (!greatSchoolRanking.equals(other.greatSchoolRanking))
			return true;
		if (schoolName == null) {
			if (other.schoolName != null)
				return false;
		} else if (!schoolName.equals(other.schoolName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", city=" + city + ", district=" + district
				+ ", greatSchoolRanking=" + greatSchoolRanking + "]";
	}
	
	
	

}
