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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.SaveWebRTCStatsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveWebRTCStatsResponseUnmarshaller {

	public static SaveWebRTCStatsResponse unmarshall(SaveWebRTCStatsResponse saveWebRTCStatsResponse, UnmarshallerContext _ctx) {
		
		saveWebRTCStatsResponse.setRequestId(_ctx.stringValue("SaveWebRTCStatsResponse.RequestId"));
		saveWebRTCStatsResponse.setCode(_ctx.stringValue("SaveWebRTCStatsResponse.Code"));
		saveWebRTCStatsResponse.setHttpStatusCode(_ctx.longValue("SaveWebRTCStatsResponse.HttpStatusCode"));
		saveWebRTCStatsResponse.setMessage(_ctx.stringValue("SaveWebRTCStatsResponse.Message"));
		saveWebRTCStatsResponse.setRowCount(_ctx.longValue("SaveWebRTCStatsResponse.RowCount"));
		saveWebRTCStatsResponse.setSuccess(_ctx.booleanValue("SaveWebRTCStatsResponse.Success"));
		saveWebRTCStatsResponse.setTimeStamp(_ctx.longValue("SaveWebRTCStatsResponse.TimeStamp"));
	 
	 	return saveWebRTCStatsResponse;
	}
}