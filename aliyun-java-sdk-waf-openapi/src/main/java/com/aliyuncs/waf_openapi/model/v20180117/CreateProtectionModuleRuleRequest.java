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

package com.aliyuncs.waf_openapi.model.v20180117;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.waf_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateProtectionModuleRuleRequest extends RpcAcsRequest<CreateProtectionModuleRuleResponse> {
	   

	private String rule;

	private String defense;

	private String instanceId;

	private String domain;

	private String region;
	public CreateProtectionModuleRuleRequest() {
		super("waf-openapi", "2018-01-17", "CreateProtectionModuleRule", "waf");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRule() {
		return this.rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
		if(rule != null){
			putQueryParameter("Rule", rule);
		}
	}

	public String getDefense() {
		return this.defense;
	}

	public void setDefense(String defense) {
		this.defense = defense;
		if(defense != null){
			putQueryParameter("Defense", defense);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<CreateProtectionModuleRuleResponse> getResponseClass() {
		return CreateProtectionModuleRuleResponse.class;
	}

}
