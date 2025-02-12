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

package com.aliyuncs.miniapplcdp.model.v20200113;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListModulesRequest extends RpcAcsRequest<ListModulesResponse> {
	   

	private String description;

	private String moduleName;

	private String targetAppSource;
	public ListModulesRequest() {
		super("miniapplcdp", "2020-01-13", "ListModules");
		setMethod(MethodType.POST);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
		if(moduleName != null){
			putQueryParameter("ModuleName", moduleName);
		}
	}

	public String getTargetAppSource() {
		return this.targetAppSource;
	}

	public void setTargetAppSource(String targetAppSource) {
		this.targetAppSource = targetAppSource;
		if(targetAppSource != null){
			putQueryParameter("TargetAppSource", targetAppSource);
		}
	}

	@Override
	public Class<ListModulesResponse> getResponseClass() {
		return ListModulesResponse.class;
	}

}
