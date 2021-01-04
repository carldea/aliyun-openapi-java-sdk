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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeDnsGtmInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDnsGtmInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalItems;

	private Integer totalPages;

	private List<GtmInstance> gtmInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public List<GtmInstance> getGtmInstances() {
		return this.gtmInstances;
	}

	public void setGtmInstances(List<GtmInstance> gtmInstances) {
		this.gtmInstances = gtmInstances;
	}

	public static class GtmInstance {

		private String instanceId;

		private String versionCode;

		private Integer smsQuota;

		private String createTime;

		private Long createTimestamp;

		private String expireTime;

		private Long expireTimestamp;

		private Integer taskQuota;

		private String resourceGroupId;

		private String paymentType;

		private Config config;

		private UsedQuota usedQuota;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getVersionCode() {
			return this.versionCode;
		}

		public void setVersionCode(String versionCode) {
			this.versionCode = versionCode;
		}

		public Integer getSmsQuota() {
			return this.smsQuota;
		}

		public void setSmsQuota(Integer smsQuota) {
			this.smsQuota = smsQuota;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Long getExpireTimestamp() {
			return this.expireTimestamp;
		}

		public void setExpireTimestamp(Long expireTimestamp) {
			this.expireTimestamp = expireTimestamp;
		}

		public Integer getTaskQuota() {
			return this.taskQuota;
		}

		public void setTaskQuota(Integer taskQuota) {
			this.taskQuota = taskQuota;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getPaymentType() {
			return this.paymentType;
		}

		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}

		public Config getConfig() {
			return this.config;
		}

		public void setConfig(Config config) {
			this.config = config;
		}

		public UsedQuota getUsedQuota() {
			return this.usedQuota;
		}

		public void setUsedQuota(UsedQuota usedQuota) {
			this.usedQuota = usedQuota;
		}

		public static class Config {

			private String instanceName;

			private String cnameType;

			private String publicUserDomainName;

			private String publicCnameMode;

			private String publicZoneName;

			private Integer ttl;

			private String alertGroup;

			private String strategyMode;

			private List<AlertConfigItem> alertConfig;

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getCnameType() {
				return this.cnameType;
			}

			public void setCnameType(String cnameType) {
				this.cnameType = cnameType;
			}

			public String getPublicUserDomainName() {
				return this.publicUserDomainName;
			}

			public void setPublicUserDomainName(String publicUserDomainName) {
				this.publicUserDomainName = publicUserDomainName;
			}

			public String getPublicCnameMode() {
				return this.publicCnameMode;
			}

			public void setPublicCnameMode(String publicCnameMode) {
				this.publicCnameMode = publicCnameMode;
			}

			public String getPublicZoneName() {
				return this.publicZoneName;
			}

			public void setPublicZoneName(String publicZoneName) {
				this.publicZoneName = publicZoneName;
			}

			public Integer getTtl() {
				return this.ttl;
			}

			public void setTtl(Integer ttl) {
				this.ttl = ttl;
			}

			public String getAlertGroup() {
				return this.alertGroup;
			}

			public void setAlertGroup(String alertGroup) {
				this.alertGroup = alertGroup;
			}

			public String getStrategyMode() {
				return this.strategyMode;
			}

			public void setStrategyMode(String strategyMode) {
				this.strategyMode = strategyMode;
			}

			public List<AlertConfigItem> getAlertConfig() {
				return this.alertConfig;
			}

			public void setAlertConfig(List<AlertConfigItem> alertConfig) {
				this.alertConfig = alertConfig;
			}

			public static class AlertConfigItem {

				private String noticeType;

				private String smsNotice;

				private String emailNotice;

				public String getNoticeType() {
					return this.noticeType;
				}

				public void setNoticeType(String noticeType) {
					this.noticeType = noticeType;
				}

				public String getSmsNotice() {
					return this.smsNotice;
				}

				public void setSmsNotice(String smsNotice) {
					this.smsNotice = smsNotice;
				}

				public String getEmailNotice() {
					return this.emailNotice;
				}

				public void setEmailNotice(String emailNotice) {
					this.emailNotice = emailNotice;
				}
			}
		}

		public static class UsedQuota {

			private Integer taskUsedCount;

			private Integer smsUsedCount;

			private Integer emailUsedCount;

			public Integer getTaskUsedCount() {
				return this.taskUsedCount;
			}

			public void setTaskUsedCount(Integer taskUsedCount) {
				this.taskUsedCount = taskUsedCount;
			}

			public Integer getSmsUsedCount() {
				return this.smsUsedCount;
			}

			public void setSmsUsedCount(Integer smsUsedCount) {
				this.smsUsedCount = smsUsedCount;
			}

			public Integer getEmailUsedCount() {
				return this.emailUsedCount;
			}

			public void setEmailUsedCount(Integer emailUsedCount) {
				this.emailUsedCount = emailUsedCount;
			}
		}
	}

	@Override
	public DescribeDnsGtmInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnsGtmInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
