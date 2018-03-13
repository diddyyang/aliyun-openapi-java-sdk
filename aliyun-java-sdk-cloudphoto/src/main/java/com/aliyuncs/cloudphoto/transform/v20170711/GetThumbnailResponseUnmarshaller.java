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
package com.aliyuncs.cloudphoto.transform.v20170711;

import com.aliyuncs.cloudphoto.model.v20170711.GetThumbnailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetThumbnailResponseUnmarshaller {

	public static GetThumbnailResponse unmarshall(GetThumbnailResponse getThumbnailResponse, UnmarshallerContext context) {
		
		getThumbnailResponse.setRequestId(context.stringValue("GetThumbnailResponse.RequestId"));
		getThumbnailResponse.setCode(context.stringValue("GetThumbnailResponse.Code"));
		getThumbnailResponse.setMessage(context.stringValue("GetThumbnailResponse.Message"));
		getThumbnailResponse.setThumbnailUrl(context.stringValue("GetThumbnailResponse.ThumbnailUrl"));
		getThumbnailResponse.setAction(context.stringValue("GetThumbnailResponse.Action"));
	 
	 	return getThumbnailResponse;
	}
}