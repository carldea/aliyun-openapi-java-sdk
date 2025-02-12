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

package com.aliyuncs.waf_openapi.transform.v20180117;

import com.aliyuncs.waf_openapi.model.v20180117.ModifyProtectionRuleCacheStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyProtectionRuleCacheStatusResponseUnmarshaller {

	public static ModifyProtectionRuleCacheStatusResponse unmarshall(ModifyProtectionRuleCacheStatusResponse modifyProtectionRuleCacheStatusResponse, UnmarshallerContext _ctx) {
		
		modifyProtectionRuleCacheStatusResponse.setRequestId(_ctx.stringValue("ModifyProtectionRuleCacheStatusResponse.RequestId"));
		modifyProtectionRuleCacheStatusResponse.setTaskStatus(_ctx.integerValue("ModifyProtectionRuleCacheStatusResponse.TaskStatus"));
		modifyProtectionRuleCacheStatusResponse.setWafTaskId(_ctx.integerValue("ModifyProtectionRuleCacheStatusResponse.WafTaskId"));
	 
	 	return modifyProtectionRuleCacheStatusResponse;
	}
}