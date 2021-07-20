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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateServiceEntryAttributeRequest extends RpcAcsRequest<UpdateServiceEntryAttributeResponse> {
	   

	private String clientToken;

	private String serviceEntryId;

	private String serviceEntryDescription;

	private Boolean dryRun;

	private String serviceEntryName;

	private String ioTCloudConnectorId;

	private String serviceId;
	public UpdateServiceEntryAttributeRequest() {
		super("IoTCC", "2021-05-13", "UpdateServiceEntryAttribute", "cciot");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getServiceEntryId() {
		return this.serviceEntryId;
	}

	public void setServiceEntryId(String serviceEntryId) {
		this.serviceEntryId = serviceEntryId;
		if(serviceEntryId != null){
			putQueryParameter("ServiceEntryId", serviceEntryId);
		}
	}

	public String getServiceEntryDescription() {
		return this.serviceEntryDescription;
	}

	public void setServiceEntryDescription(String serviceEntryDescription) {
		this.serviceEntryDescription = serviceEntryDescription;
		if(serviceEntryDescription != null){
			putQueryParameter("ServiceEntryDescription", serviceEntryDescription);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getServiceEntryName() {
		return this.serviceEntryName;
	}

	public void setServiceEntryName(String serviceEntryName) {
		this.serviceEntryName = serviceEntryName;
		if(serviceEntryName != null){
			putQueryParameter("ServiceEntryName", serviceEntryName);
		}
	}

	public String getIoTCloudConnectorId() {
		return this.ioTCloudConnectorId;
	}

	public void setIoTCloudConnectorId(String ioTCloudConnectorId) {
		this.ioTCloudConnectorId = ioTCloudConnectorId;
		if(ioTCloudConnectorId != null){
			putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
		}
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId);
		}
	}

	@Override
	public Class<UpdateServiceEntryAttributeResponse> getResponseClass() {
		return UpdateServiceEntryAttributeResponse.class;
	}

}
