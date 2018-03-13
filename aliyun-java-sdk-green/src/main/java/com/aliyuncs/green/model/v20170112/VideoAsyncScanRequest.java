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
package com.aliyuncs.green.model.v20170112;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class VideoAsyncScanRequest extends RoaAcsRequest<VideoAsyncScanResponse> {
	
	public VideoAsyncScanRequest() {
		super("Green", "2017-01-12", "VideoAsyncScan", "green");
		setUriPattern("/green/video/asyncscan");
		setMethod(MethodType.POST);
	}

	private String clientInfo;

	public String getClientInfo() {
		return this.clientInfo;
	}

	public void setClientInfo(String clientInfo) {
		this.clientInfo = clientInfo;
		putQueryParameter("ClientInfo", clientInfo);
	}

	@Override
	public Class<VideoAsyncScanResponse> getResponseClass() {
		return VideoAsyncScanResponse.class;
	}

}
