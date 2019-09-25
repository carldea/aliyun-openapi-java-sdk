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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.SubmitCustomizationConfigResponse;
import com.aliyuncs.qualitycheck.model.v20190115.SubmitCustomizationConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitCustomizationConfigResponseUnmarshaller {

	public static SubmitCustomizationConfigResponse unmarshall(SubmitCustomizationConfigResponse submitCustomizationConfigResponse, UnmarshallerContext _ctx) {
		
		submitCustomizationConfigResponse.setRequestId(_ctx.stringValue("SubmitCustomizationConfigResponse.RequestId"));
		submitCustomizationConfigResponse.setSuccess(_ctx.booleanValue("SubmitCustomizationConfigResponse.Success"));
		submitCustomizationConfigResponse.setCode(_ctx.stringValue("SubmitCustomizationConfigResponse.Code"));
		submitCustomizationConfigResponse.setMessage(_ctx.stringValue("SubmitCustomizationConfigResponse.Message"));

		Data data = new Data();
		data.setModelId(_ctx.longValue("SubmitCustomizationConfigResponse.Data.ModelId"));
		data.setModeCustomizationId(_ctx.stringValue("SubmitCustomizationConfigResponse.Data.ModeCustomizationId"));
		data.setModelName(_ctx.stringValue("SubmitCustomizationConfigResponse.Data.ModelName"));
		data.setModelStatus(_ctx.integerValue("SubmitCustomizationConfigResponse.Data.ModelStatus"));
		submitCustomizationConfigResponse.setData(data);
	 
	 	return submitCustomizationConfigResponse;
	}
}