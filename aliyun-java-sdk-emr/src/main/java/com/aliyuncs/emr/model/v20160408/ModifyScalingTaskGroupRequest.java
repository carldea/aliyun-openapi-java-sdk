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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyScalingTaskGroupRequest extends RpcAcsRequest<ModifyScalingTaskGroupResponse> {
	   

	private Long resourceOwnerId;

	private Boolean withGrace;

	private String clusterId;

	private Integer minSize;

	private Long timeoutWithGrace;

	private String hostGroupId;

	private String activeRuleCategory;

	private Integer maxSize;

	private Integer defaultCooldown;
	public ModifyScalingTaskGroupRequest() {
		super("Emr", "2016-04-08", "ModifyScalingTaskGroup", "emr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Boolean getWithGrace() {
		return this.withGrace;
	}

	public void setWithGrace(Boolean withGrace) {
		this.withGrace = withGrace;
		if(withGrace != null){
			putQueryParameter("WithGrace", withGrace.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public Integer getMinSize() {
		return this.minSize;
	}

	public void setMinSize(Integer minSize) {
		this.minSize = minSize;
		if(minSize != null){
			putQueryParameter("MinSize", minSize.toString());
		}
	}

	public Long getTimeoutWithGrace() {
		return this.timeoutWithGrace;
	}

	public void setTimeoutWithGrace(Long timeoutWithGrace) {
		this.timeoutWithGrace = timeoutWithGrace;
		if(timeoutWithGrace != null){
			putQueryParameter("TimeoutWithGrace", timeoutWithGrace.toString());
		}
	}

	public String getHostGroupId() {
		return this.hostGroupId;
	}

	public void setHostGroupId(String hostGroupId) {
		this.hostGroupId = hostGroupId;
		if(hostGroupId != null){
			putQueryParameter("HostGroupId", hostGroupId);
		}
	}

	public String getActiveRuleCategory() {
		return this.activeRuleCategory;
	}

	public void setActiveRuleCategory(String activeRuleCategory) {
		this.activeRuleCategory = activeRuleCategory;
		if(activeRuleCategory != null){
			putQueryParameter("ActiveRuleCategory", activeRuleCategory);
		}
	}

	public Integer getMaxSize() {
		return this.maxSize;
	}

	public void setMaxSize(Integer maxSize) {
		this.maxSize = maxSize;
		if(maxSize != null){
			putQueryParameter("MaxSize", maxSize.toString());
		}
	}

	public Integer getDefaultCooldown() {
		return this.defaultCooldown;
	}

	public void setDefaultCooldown(Integer defaultCooldown) {
		this.defaultCooldown = defaultCooldown;
		if(defaultCooldown != null){
			putQueryParameter("DefaultCooldown", defaultCooldown.toString());
		}
	}

	@Override
	public Class<ModifyScalingTaskGroupResponse> getResponseClass() {
		return ModifyScalingTaskGroupResponse.class;
	}

}
