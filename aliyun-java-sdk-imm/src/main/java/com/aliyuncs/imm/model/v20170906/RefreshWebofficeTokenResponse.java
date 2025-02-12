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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.RefreshWebofficeTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RefreshWebofficeTokenResponse extends AcsResponse {

	private String refreshToken;

	private String requestId;

	private String accessToken;

	private String refreshTokenExpiredTime;

	private String accessTokenExpiredTime;

	public String getRefreshToken() {
		return this.refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshTokenExpiredTime() {
		return this.refreshTokenExpiredTime;
	}

	public void setRefreshTokenExpiredTime(String refreshTokenExpiredTime) {
		this.refreshTokenExpiredTime = refreshTokenExpiredTime;
	}

	public String getAccessTokenExpiredTime() {
		return this.accessTokenExpiredTime;
	}

	public void setAccessTokenExpiredTime(String accessTokenExpiredTime) {
		this.accessTokenExpiredTime = accessTokenExpiredTime;
	}

	@Override
	public RefreshWebofficeTokenResponse getInstance(UnmarshallerContext context) {
		return	RefreshWebofficeTokenResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
