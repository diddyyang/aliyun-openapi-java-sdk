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
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppsRequest extends RpcAcsRequest<DescribeAppsResponse> {
	
	public DescribeAppsRequest() {
		super("CloudAPI", "2016-07-14", "DescribeApps", "apigateway");
	}

	private Long appId;

	private String appOwner;

	private Integer pageNumber;

	private Integer pageSize;

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
		putQueryParameter("AppId", appId);
	}

	public String getAppOwner() {
		return this.appOwner;
	}

	public void setAppOwner(String appOwner) {
		this.appOwner = appOwner;
		putQueryParameter("AppOwner", appOwner);
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		putQueryParameter("PageNumber", pageNumber);
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", pageSize);
	}

	@Override
	public Class<DescribeAppsResponse> getResponseClass() {
		return DescribeAppsResponse.class;
	}

}
