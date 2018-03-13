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
package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.CreateTempInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateTempInstanceResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String snapshotId;

	private String tempInstanceId;

	private String status;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}

	public String getTempInstanceId() {
		return this.tempInstanceId;
	}

	public void setTempInstanceId(String tempInstanceId) {
		this.tempInstanceId = tempInstanceId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public CreateTempInstanceResponse getInstance(UnmarshallerContext context) {
		return	CreateTempInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
