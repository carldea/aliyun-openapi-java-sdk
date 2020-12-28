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

package com.aliyuncs.nlp_automl.transform.v20191111;

import com.aliyuncs.nlp_automl.model.v20191111.ListDatasetResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDatasetResponseUnmarshaller {

	public static ListDatasetResponse unmarshall(ListDatasetResponse listDatasetResponse, UnmarshallerContext _ctx) {
		
		listDatasetResponse.setRequestId(_ctx.stringValue("ListDatasetResponse.RequestId"));
		listDatasetResponse.setData(_ctx.mapValue("ListDatasetResponse.Data"));
		listDatasetResponse.setCode(_ctx.integerValue("ListDatasetResponse.Code"));
		listDatasetResponse.setMessage(_ctx.stringValue("ListDatasetResponse.Message"));
		listDatasetResponse.setSuccess(_ctx.booleanValue("ListDatasetResponse.Success"));
	 
	 	return listDatasetResponse;
	}
}