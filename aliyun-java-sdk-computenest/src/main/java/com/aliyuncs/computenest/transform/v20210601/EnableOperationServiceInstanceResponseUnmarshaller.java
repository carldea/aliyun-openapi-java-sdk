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

package com.aliyuncs.computenest.transform.v20210601;

import com.aliyuncs.computenest.model.v20210601.EnableOperationServiceInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableOperationServiceInstanceResponseUnmarshaller {

	public static EnableOperationServiceInstanceResponse unmarshall(EnableOperationServiceInstanceResponse enableOperationServiceInstanceResponse, UnmarshallerContext _ctx) {
		
		enableOperationServiceInstanceResponse.setRequestId(_ctx.stringValue("EnableOperationServiceInstanceResponse.RequestId"));
	 
	 	return enableOperationServiceInstanceResponse;
	}
}