/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rknowsys.eapp.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the EmpDetails service. Represents a row in the &quot;hrm_EmpDetails&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rknowsys.eapp.hrm.model.impl.EmpDetailsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rknowsys.eapp.hrm.model.impl.EmpDetailsImpl}.
 * </p>
 *
 * @author rknowsys
 * @see EmpDetails
 * @see com.rknowsys.eapp.hrm.model.impl.EmpDetailsImpl
 * @see com.rknowsys.eapp.hrm.model.impl.EmpDetailsModelImpl
 * @generated
 */
public interface EmpDetailsModel extends BaseModel<EmpDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a emp details model instance should use the {@link EmpDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this emp details.
	 *
	 * @return the primary key of this emp details
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this emp details.
	 *
	 * @param primaryKey the primary key of this emp details
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the empdetails ID of this emp details.
	 *
	 * @return the empdetails ID of this emp details
	 */
	public long getEmpdetailsId();

	/**
	 * Sets the empdetails ID of this emp details.
	 *
	 * @param empdetailsId the empdetails ID of this emp details
	 */
	public void setEmpdetailsId(long empdetailsId);

	/**
	 * Returns the employee no of this emp details.
	 *
	 * @return the employee no of this emp details
	 */
	@AutoEscape
	public String getEmployeeNo();

	/**
	 * Sets the employee no of this emp details.
	 *
	 * @param employeeNo the employee no of this emp details
	 */
	public void setEmployeeNo(String employeeNo);

	/**
	 * Returns the company ID of this emp details.
	 *
	 * @return the company ID of this emp details
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this emp details.
	 *
	 * @param companyId the company ID of this emp details
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this emp details.
	 *
	 * @return the user ID of this emp details
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this emp details.
	 *
	 * @param userId the user ID of this emp details
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this emp details.
	 *
	 * @return the user uuid of this emp details
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this emp details.
	 *
	 * @param userUuid the user uuid of this emp details
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this emp details.
	 *
	 * @return the create date of this emp details
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this emp details.
	 *
	 * @param createDate the create date of this emp details
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this emp details.
	 *
	 * @return the modified date of this emp details
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this emp details.
	 *
	 * @param modifiedDate the modified date of this emp details
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the first name of this emp details.
	 *
	 * @return the first name of this emp details
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this emp details.
	 *
	 * @param firstName the first name of this emp details
	 */
	public void setFirstName(String firstName);

	/**
	 * Returns the last name of this emp details.
	 *
	 * @return the last name of this emp details
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this emp details.
	 *
	 * @param lastName the last name of this emp details
	 */
	public void setLastName(String lastName);

	/**
	 * Returns the title of this emp details.
	 *
	 * @return the title of this emp details
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this emp details.
	 *
	 * @param title the title of this emp details
	 */
	public void setTitle(String title);

	/**
	 * Returns the employmentstatus of this emp details.
	 *
	 * @return the employmentstatus of this emp details
	 */
	@AutoEscape
	public String getEmploymentstatus();

	/**
	 * Sets the employmentstatus of this emp details.
	 *
	 * @param employmentstatus the employmentstatus of this emp details
	 */
	public void setEmploymentstatus(String employmentstatus);

	/**
	 * Returns the name of this emp details.
	 *
	 * @return the name of this emp details
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this emp details.
	 *
	 * @param name the name of this emp details
	 */
	public void setName(String name);

	/**
	 * Returns the supervisor of this emp details.
	 *
	 * @return the supervisor of this emp details
	 */
	@AutoEscape
	public String getSupervisor();

	/**
	 * Sets the supervisor of this emp details.
	 *
	 * @param supervisor the supervisor of this emp details
	 */
	public void setSupervisor(String supervisor);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(EmpDetails empDetails);

	@Override
	public int hashCode();

	@Override
	public CacheModel<EmpDetails> toCacheModel();

	@Override
	public EmpDetails toEscapedModel();

	@Override
	public EmpDetails toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}