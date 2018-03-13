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
package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DownloadClusterNodeCertsRequest extends RoaAcsRequest<DownloadClusterNodeCertsResponse> {
	
	public DownloadClusterNodeCertsRequest() {
		super("CS", "2015-12-15", "DownloadClusterNodeCerts");
		setUriPattern("/token/[Token]/nodes/[NodeId]/certs");
		setMethod(MethodType.GET);
	}

	private String nodeId;

	private String token;

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putPathParameter("NodeId", nodeId);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putPathParameter("Token", token);
		}
	}

	@Override
	public Class<DownloadClusterNodeCertsResponse> getResponseClass() {
		return DownloadClusterNodeCertsResponse.class;
	}

}
