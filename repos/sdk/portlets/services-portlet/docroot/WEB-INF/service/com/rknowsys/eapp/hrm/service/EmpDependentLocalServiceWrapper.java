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

package com.rknowsys.eapp.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmpDependentLocalService}.
 *
 * @author rknowsys
 * @see EmpDependentLocalService
 * @generated
 */
public class EmpDependentLocalServiceWrapper implements EmpDependentLocalService,
	ServiceWrapper<EmpDependentLocalService> {
	public EmpDependentLocalServiceWrapper(
		EmpDependentLocalService empDependentLocalService) {
		_empDependentLocalService = empDependentLocalService;
	}

	/**
	* Adds the emp dependent to the database. Also notifies the appropriate model listeners.
	*
	* @param empDependent the emp dependent
	* @return the emp dependent that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpDependent addEmpDependent(
		com.rknowsys.eapp.hrm.model.EmpDependent empDependent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDependentLocalService.addEmpDependent(empDependent);
	}

	/**
	* Creates a new emp dependent with the primary key. Does not add the emp dependent to the database.
	*
	* @param empDependentId the primary key for the new emp dependent
	* @return the new emp dependent
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpDependent createEmpDependent(
		long empDependentId) {
		return _empDependentLocalService.createEmpDependent(empDependentId);
	}

	/**
	* Deletes the emp dependent with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param empDependentId the primary key of the emp dependent
	* @return the emp dependent that was removed
	* @throws PortalException if a emp dependent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpDependent deleteEmpDependent(
		long empDependentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _empDependentLocalService.deleteEmpDependent(empDependentId);
	}

	/**
	* Deletes the emp dependent from the database. Also notifies the appropriate model listeners.
	*
	* @param empDependent the emp dependent
	* @return the emp dependent that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpDependent deleteEmpDependent(
		com.rknowsys.eapp.hrm.model.EmpDependent empDependent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDependentLocalService.deleteEmpDependent(empDependent);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _empDependentLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDependentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.EmpDependentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _empDependentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.EmpDependentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDependentLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDependentLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDependentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rknowsys.eapp.hrm.model.EmpDependent fetchEmpDependent(
		long empDependentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDependentLocalService.fetchEmpDependent(empDependentId);
	}

	/**
	* Returns the emp dependent with the primary key.
	*
	* @param empDependentId the primary key of the emp dependent
	* @return the emp dependent
	* @throws PortalException if a emp dependent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpDependent getEmpDependent(
		long empDependentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _empDependentLocalService.getEmpDependent(empDependentId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _empDependentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the emp dependents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.EmpDependentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp dependents
	* @param end the upper bound of the range of emp dependents (not inclusive)
	* @return the range of emp dependents
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rknowsys.eapp.hrm.model.EmpDependent> getEmpDependents(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDependentLocalService.getEmpDependents(start, end);
	}

	/**
	* Returns the number of emp dependents.
	*
	* @return the number of emp dependents
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEmpDependentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDependentLocalService.getEmpDependentsCount();
	}

	/**
	* Updates the emp dependent in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param empDependent the emp dependent
	* @return the emp dependent that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpDependent updateEmpDependent(
		com.rknowsys.eapp.hrm.model.EmpDependent empDependent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDependentLocalService.updateEmpDependent(empDependent);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _empDependentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_empDependentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _empDependentLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EmpDependentLocalService getWrappedEmpDependentLocalService() {
		return _empDependentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEmpDependentLocalService(
		EmpDependentLocalService empDependentLocalService) {
		_empDependentLocalService = empDependentLocalService;
	}

	@Override
	public EmpDependentLocalService getWrappedService() {
		return _empDependentLocalService;
	}

	@Override
	public void setWrappedService(
		EmpDependentLocalService empDependentLocalService) {
		_empDependentLocalService = empDependentLocalService;
	}

	private EmpDependentLocalService _empDependentLocalService;
}