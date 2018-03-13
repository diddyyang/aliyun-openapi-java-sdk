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

import com.aliyuncs.cloudphoto.model.v20170711.RenameAlbumResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenameAlbumResponseUnmarshaller {

	public static RenameAlbumResponse unmarshall(RenameAlbumResponse renameAlbumResponse, UnmarshallerContext context) {
		
		renameAlbumResponse.setRequestId(context.stringValue("RenameAlbumResponse.RequestId"));
		renameAlbumResponse.setCode(context.stringValue("RenameAlbumResponse.Code"));
		renameAlbumResponse.setMessage(context.stringValue("RenameAlbumResponse.Message"));
		renameAlbumResponse.setAction(context.stringValue("RenameAlbumResponse.Action"));
	 
	 	return renameAlbumResponse;
	}
}