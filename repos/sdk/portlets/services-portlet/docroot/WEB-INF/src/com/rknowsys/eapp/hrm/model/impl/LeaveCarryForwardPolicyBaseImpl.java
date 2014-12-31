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

package com.rknowsys.eapp.hrm.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.rknowsys.eapp.hrm.model.LeaveCarryForwardPolicy;
import com.rknowsys.eapp.hrm.service.LeaveCarryForwardPolicyLocalServiceUtil;

/**
 * The extended model base implementation for the LeaveCarryForwardPolicy service. Represents a row in the &quot;leave_carry_forward_policy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LeaveCarryForwardPolicyImpl}.
 * </p>
 *
 * @author rknowsys
 * @see LeaveCarryForwardPolicyImpl
 * @see com.rknowsys.eapp.hrm.model.LeaveCarryForwardPolicy
 * @generated
 */
public abstract class LeaveCarryForwardPolicyBaseImpl
	extends LeaveCarryForwardPolicyModelImpl implements LeaveCarryForwardPolicy {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a leave carry forward policy model instance should use the {@link LeaveCarryForwardPolicy} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LeaveCarryForwardPolicyLocalServiceUtil.addLeaveCarryForwardPolicy(this);
		}
		else {
			LeaveCarryForwardPolicyLocalServiceUtil.updateLeaveCarryForwardPolicy(this);
		}
	}
}