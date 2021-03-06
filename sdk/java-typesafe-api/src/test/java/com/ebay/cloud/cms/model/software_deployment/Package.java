package com.ebay.cloud.cms.model.software_deployment;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;


import com.ebay.cloud.cms.typsafe.entity.GenericCMSEntity;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * CMS generated entity.
 * This class is generated by CMS type-safe api model exporter, DON'T modify this class.
 * 
 */
public class Package extends GenericCMSEntity {


	public Package() {
		set_type(get_metaclass());
//		set_repo("software-deployment");
	}

	// the getter/setter method
	

	public Date getLastModifiedTime(){
		return (Date) getDateField("lastModifiedTime");
	}

	public void setLastModifiedTime(Date attrVal_lastModifiedTime){
		setDateField("lastModifiedTime", attrVal_lastModifiedTime);
	}
		
	public List<PackageVersion> getVersions(){
		return (List<PackageVersion>) getFieldValue("versions");
	}

	public void setVersions(List<PackageVersion> attrVals_versions){
		setFieldValue("versions", attrVals_versions);
	}
	
	public void addVersions(PackageVersion attrVal_versions){
		addFieldValue("versions", attrVal_versions);
	}

	public String getName(){
		return (String)getFieldValue("name");
	}

	public void setName(String attrVal_name){
		setFieldValue("name", attrVal_name);
	}

	public String getType(){
		return (String)getFieldValue("type");
	}

	public void setType(String attrVal_type){
		setFieldValue("type", attrVal_type);
	}

	@JsonIgnore
	public String get_metaclass(){
		return "Package";
	}
	
}