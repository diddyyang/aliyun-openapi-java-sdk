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
package com.aliyuncs.ehpc.transform.v20170714;

import com.aliyuncs.ehpc.model.v20170714.ListCurrentClientVersionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCurrentClientVersionResponseUnmarshaller {

	public static ListCurrentClientVersionResponse unmarshall(ListCurrentClientVersionResponse listCurrentClientVersionResponse, UnmarshallerContext context) {
		
		listCurrentClientVersionResponse.setRequestId(context.stringValue("ListCurrentClientVersionResponse.RequestId"));
		listCurrentClientVersionResponse.setClientVersion(context.stringValue("ListCurrentClientVersionResponse.ClientVersion"));
	 
	 	return listCurrentClientVersionResponse;
	}
}