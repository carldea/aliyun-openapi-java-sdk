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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.miniapplcdp.model.v20200113.BatchDeleteModelResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.BatchDeleteModelResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.BatchDeleteModelResponse.Data.ModelItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchDeleteModelResponseUnmarshaller {

	public static BatchDeleteModelResponse unmarshall(BatchDeleteModelResponse batchDeleteModelResponse, UnmarshallerContext _ctx) {
		
		batchDeleteModelResponse.setRequestId(_ctx.stringValue("BatchDeleteModelResponse.RequestId"));

		Data data = new Data();

		List<ModelItem> items = new ArrayList<ModelItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchDeleteModelResponse.Data.Items.Length"); i++) {
			ModelItem modelItem = new ModelItem();
			modelItem.setCreateTime(_ctx.stringValue("BatchDeleteModelResponse.Data.Items["+ i +"].CreateTime"));
			modelItem.setModelType(_ctx.stringValue("BatchDeleteModelResponse.Data.Items["+ i +"].ModelType"));
			modelItem.setSubType(_ctx.stringValue("BatchDeleteModelResponse.Data.Items["+ i +"].SubType"));
			modelItem.setRevision(_ctx.integerValue("BatchDeleteModelResponse.Data.Items["+ i +"].Revision"));
			modelItem.setModifiedTime(_ctx.stringValue("BatchDeleteModelResponse.Data.Items["+ i +"].ModifiedTime"));
			modelItem.setDescription(_ctx.stringValue("BatchDeleteModelResponse.Data.Items["+ i +"].Description"));
			modelItem.setSchemaVersion(_ctx.stringValue("BatchDeleteModelResponse.Data.Items["+ i +"].SchemaVersion"));
			modelItem.setAppId(_ctx.stringValue("BatchDeleteModelResponse.Data.Items["+ i +"].AppId"));
			modelItem.setProps(_ctx.mapValue("BatchDeleteModelResponse.Data.Items["+ i +"].Props"));
			modelItem.setModelStatus(_ctx.stringValue("BatchDeleteModelResponse.Data.Items["+ i +"].ModelStatus"));
			modelItem.setModelName(_ctx.stringValue("BatchDeleteModelResponse.Data.Items["+ i +"].ModelName"));
			modelItem.setContent(_ctx.mapValue("BatchDeleteModelResponse.Data.Items["+ i +"].Content"));
			modelItem.setId(_ctx.stringValue("BatchDeleteModelResponse.Data.Items["+ i +"].Id"));
			modelItem.setModelId(_ctx.stringValue("BatchDeleteModelResponse.Data.Items["+ i +"].ModelId"));

			items.add(modelItem);
		}
		data.setItems(items);
		batchDeleteModelResponse.setData(data);
	 
	 	return batchDeleteModelResponse;
	}
}