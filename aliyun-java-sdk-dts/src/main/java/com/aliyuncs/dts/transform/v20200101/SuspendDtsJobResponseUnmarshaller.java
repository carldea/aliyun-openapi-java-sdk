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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.SuspendDtsJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SuspendDtsJobResponseUnmarshaller {

	public static SuspendDtsJobResponse unmarshall(SuspendDtsJobResponse suspendDtsJobResponse, UnmarshallerContext _ctx) {
		
		suspendDtsJobResponse.setRequestId(_ctx.stringValue("SuspendDtsJobResponse.RequestId"));
		suspendDtsJobResponse.setHttpStatusCode(_ctx.integerValue("SuspendDtsJobResponse.HttpStatusCode"));
		suspendDtsJobResponse.setErrCode(_ctx.stringValue("SuspendDtsJobResponse.ErrCode"));
		suspendDtsJobResponse.setSuccess(_ctx.booleanValue("SuspendDtsJobResponse.Success"));
		suspendDtsJobResponse.setErrMessage(_ctx.stringValue("SuspendDtsJobResponse.ErrMessage"));
		suspendDtsJobResponse.setDynamicMessage(_ctx.stringValue("SuspendDtsJobResponse.DynamicMessage"));
		suspendDtsJobResponse.setDynamicCode(_ctx.stringValue("SuspendDtsJobResponse.DynamicCode"));
	 
	 	return suspendDtsJobResponse;
	}
}