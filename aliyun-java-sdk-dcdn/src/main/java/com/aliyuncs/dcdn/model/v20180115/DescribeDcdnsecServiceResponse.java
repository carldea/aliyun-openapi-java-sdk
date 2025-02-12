/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnsecServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnsecServiceResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String internetChargeType;

	private String startTime;

	private String endTime;

	private String changingChargeType;

	private String changingAffectTime;

	private String version;

	private String flowType;

	private String requestType;

	private String domainNum;

	private List<LockReason> operationLocks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getChangingChargeType() {
		return this.changingChargeType;
	}

	public void setChangingChargeType(String changingChargeType) {
		this.changingChargeType = changingChargeType;
	}

	public String getChangingAffectTime() {
		return this.changingAffectTime;
	}

	public void setChangingAffectTime(String changingAffectTime) {
		this.changingAffectTime = changingAffectTime;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getFlowType() {
		return this.flowType;
	}

	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}

	public String getRequestType() {
		return this.requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getDomainNum() {
		return this.domainNum;
	}

	public void setDomainNum(String domainNum) {
		this.domainNum = domainNum;
	}

	public List<LockReason> getOperationLocks() {
		return this.operationLocks;
	}

	public void setOperationLocks(List<LockReason> operationLocks) {
		this.operationLocks = operationLocks;
	}

	public static class LockReason {

		private String lockReason;

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}
	}

	@Override
	public DescribeDcdnsecServiceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnsecServiceResponseUnmarshaller.unmarshall(this, context);
	}
}
