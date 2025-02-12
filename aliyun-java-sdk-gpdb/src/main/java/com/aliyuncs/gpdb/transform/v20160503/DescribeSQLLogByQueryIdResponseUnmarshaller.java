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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeSQLLogByQueryIdResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeSQLLogByQueryIdResponse.SQLLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogByQueryIdResponseUnmarshaller {

	public static DescribeSQLLogByQueryIdResponse unmarshall(DescribeSQLLogByQueryIdResponse describeSQLLogByQueryIdResponse, UnmarshallerContext _ctx) {
		
		describeSQLLogByQueryIdResponse.setRequestId(_ctx.stringValue("DescribeSQLLogByQueryIdResponse.RequestId"));

		List<SQLLog> items = new ArrayList<SQLLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLLogByQueryIdResponse.Items.Length"); i++) {
			SQLLog sQLLog = new SQLLog();
			sQLLog.setOperationClass(_ctx.stringValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].OperationClass"));
			sQLLog.setExecuteState(_ctx.stringValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].ExecuteState"));
			sQLLog.setExecuteCost(_ctx.floatValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].ExecuteCost"));
			sQLLog.setSQLText(_ctx.stringValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].SQLText"));
			sQLLog.setSourcePort(_ctx.integerValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].SourcePort"));
			sQLLog.setDBRole(_ctx.stringValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].DBRole"));
			sQLLog.setOperationType(_ctx.stringValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].OperationType"));
			sQLLog.setSourceIP(_ctx.stringValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].SourceIP"));
			sQLLog.setSQLPlan(_ctx.stringValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].SQLPlan"));
			sQLLog.setReturnRowCounts(_ctx.longValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].ReturnRowCounts"));
			sQLLog.setDBName(_ctx.stringValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].DBName"));
			sQLLog.setOperationExecuteTime(_ctx.stringValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].OperationExecuteTime"));
			sQLLog.setScanRowCounts(_ctx.longValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].ScanRowCounts"));
			sQLLog.setAccountName(_ctx.stringValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].AccountName"));
			sQLLog.setQueryId(_ctx.stringValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].QueryId"));

			List<String> sliceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].SliceIds.Length"); j++) {
				sliceIds.add(_ctx.stringValue("DescribeSQLLogByQueryIdResponse.Items["+ i +"].SliceIds["+ j +"]"));
			}
			sQLLog.setSliceIds(sliceIds);

			items.add(sQLLog);
		}
		describeSQLLogByQueryIdResponse.setItems(items);
	 
	 	return describeSQLLogByQueryIdResponse;
	}
}