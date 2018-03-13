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
package com.aliyuncs.crm.transform.v20150324;

import com.aliyuncs.crm.model.v20150324.FindContacterResponse;
import com.aliyuncs.crm.model.v20150324.FindContacterResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindContacterResponseUnmarshaller {

	public static FindContacterResponse unmarshall(FindContacterResponse findContacterResponse, UnmarshallerContext context) {
		
		findContacterResponse.setSuccess(context.booleanValue("FindContacterResponse.Success"));
		findContacterResponse.setResultCode(context.stringValue("FindContacterResponse.ResultCode"));
		findContacterResponse.setResultMessage(context.stringValue("FindContacterResponse.ResultMessage"));

		Data  data = new Data();
		data.setContacterId(context.longValue("FindContacterResponse.Data.ContacterId"));
		data.setKpId(context.longValue("FindContacterResponse.Data.KpId"));
		data.setCustomerId(context.longValue("FindContacterResponse.Data.CustomerId"));
		data.setContacterName(context.stringValue("FindContacterResponse.Data.ContacterName"));
		data.setContacterEmail(context.stringValue("FindContacterResponse.Data.ContacterEmail"));
		data.setContacterMobile(context.stringValue("FindContacterResponse.Data.ContacterMobile"));
		data.setContacterPosition(context.stringValue("FindContacterResponse.Data.ContacterPosition"));
		findContacterResponse.setData(data);
	 
	 	return findContacterResponse;
	}
}