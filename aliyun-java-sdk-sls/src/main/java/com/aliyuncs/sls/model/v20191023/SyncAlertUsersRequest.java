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

package com.aliyuncs.sls.model.v20191023;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sls.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SyncAlertUsersRequest extends RpcAcsRequest<SyncAlertUsersResponse> {
	   

	private String app;

	private String users;
	public SyncAlertUsersRequest() {
		super("Sls", "2019-10-23", "SyncAlertUsers", "sls");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putBodyParameter("App", app);
		}
	}

	public String getUsers() {
		return this.users;
	}

	public void setUsers(String users) {
		this.users = users;
		if(users != null){
			putBodyParameter("Users", users);
		}
	}

	@Override
	public Class<SyncAlertUsersResponse> getResponseClass() {
		return SyncAlertUsersResponse.class;
	}

}
