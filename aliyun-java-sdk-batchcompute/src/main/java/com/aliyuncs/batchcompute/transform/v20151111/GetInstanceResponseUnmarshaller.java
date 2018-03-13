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
package com.aliyuncs.batchcompute.transform.v20151111;

import com.aliyuncs.batchcompute.model.v20151111.GetInstanceResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.Instance;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.io.UnsupportedEncodingException;


public class GetInstanceResponseUnmarshaller {

	public static GetInstanceResponse unmarshall(GetInstanceResponse getInstanceResponse, UnmarshallerContext context) throws ServerException {
		HttpResponse httpResponse = context.getHttpResponse();
		getInstanceResponse.setHttpResponse(httpResponse);

		try {
			String body = new String(httpResponse.getHttpContent(), httpResponse.getEncoding());

			ObjectMapper mapper = new ObjectMapper();
			Instance instance = mapper.readValue(body, Instance.class);

			getInstanceResponse.setInstance(instance);

		} catch (UnsupportedEncodingException e) {
			throw new ServerException("API.EncodeError", "encode response body error",getInstanceResponse.getRequestId());
		} catch (IOException e) {
			throw new ServerException("API.EncodeError", "encode response body error",getInstanceResponse.getRequestId());
		}
	 
	 	return getInstanceResponse;
	}
}