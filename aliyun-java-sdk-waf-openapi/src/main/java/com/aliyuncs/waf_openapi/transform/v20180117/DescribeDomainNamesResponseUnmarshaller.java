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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.waf_openapi.model.v20180117.DescribeDomainNamesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainNamesResponseUnmarshaller {

	public static DescribeDomainNamesResponse unmarshall(DescribeDomainNamesResponse describeDomainNamesResponse, UnmarshallerContext _ctx) {
		
		describeDomainNamesResponse.setRequestId(_ctx.stringValue("DescribeDomainNamesResponse.RequestId"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainNamesResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("DescribeDomainNamesResponse.Result["+ i +"]"));
		}
		describeDomainNamesResponse.setResult(result);
	 
	 	return describeDomainNamesResponse;
	}
}