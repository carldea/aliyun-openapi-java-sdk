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

package com.aliyuncs.computenest.model.v20210601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.computenest.transform.v20210601.ListServiceInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServiceInstancesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Long totalCount;

	private String maxResults;

	private List<ServiceInstance> serviceInstances;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public List<ServiceInstance> getServiceInstances() {
		return this.serviceInstances;
	}

	public void setServiceInstances(List<ServiceInstance> serviceInstances) {
		this.serviceInstances = serviceInstances;
	}

	public static class ServiceInstance {

		private String status;

		private String outputs;

		private String updateTime;

		private String parameters;

		private String serviceInstanceId;

		private String createTime;

		private String statusDetail;

		private Long progress;

		private String resources;

		private String templateName;

		private String operatedServiceInstanceId;

		private String operationStartTime;

		private String operationEndTime;

		private Boolean enableInstanceOps;

		private Service service;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getOutputs() {
			return this.outputs;
		}

		public void setOutputs(String outputs) {
			this.outputs = outputs;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getParameters() {
			return this.parameters;
		}

		public void setParameters(String parameters) {
			this.parameters = parameters;
		}

		public String getServiceInstanceId() {
			return this.serviceInstanceId;
		}

		public void setServiceInstanceId(String serviceInstanceId) {
			this.serviceInstanceId = serviceInstanceId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getStatusDetail() {
			return this.statusDetail;
		}

		public void setStatusDetail(String statusDetail) {
			this.statusDetail = statusDetail;
		}

		public Long getProgress() {
			return this.progress;
		}

		public void setProgress(Long progress) {
			this.progress = progress;
		}

		public String getResources() {
			return this.resources;
		}

		public void setResources(String resources) {
			this.resources = resources;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getOperatedServiceInstanceId() {
			return this.operatedServiceInstanceId;
		}

		public void setOperatedServiceInstanceId(String operatedServiceInstanceId) {
			this.operatedServiceInstanceId = operatedServiceInstanceId;
		}

		public String getOperationStartTime() {
			return this.operationStartTime;
		}

		public void setOperationStartTime(String operationStartTime) {
			this.operationStartTime = operationStartTime;
		}

		public String getOperationEndTime() {
			return this.operationEndTime;
		}

		public void setOperationEndTime(String operationEndTime) {
			this.operationEndTime = operationEndTime;
		}

		public Boolean getEnableInstanceOps() {
			return this.enableInstanceOps;
		}

		public void setEnableInstanceOps(Boolean enableInstanceOps) {
			this.enableInstanceOps = enableInstanceOps;
		}

		public Service getService() {
			return this.service;
		}

		public void setService(Service service) {
			this.service = service;
		}

		public static class Service {

			private String status;

			private String publishTime;

			private String version;

			private String deployType;

			private String serviceId;

			private String supplierUrl;

			private String serviceType;

			private String supplierName;

			private List<ServiceInfo> serviceInfos;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getPublishTime() {
				return this.publishTime;
			}

			public void setPublishTime(String publishTime) {
				this.publishTime = publishTime;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getDeployType() {
				return this.deployType;
			}

			public void setDeployType(String deployType) {
				this.deployType = deployType;
			}

			public String getServiceId() {
				return this.serviceId;
			}

			public void setServiceId(String serviceId) {
				this.serviceId = serviceId;
			}

			public String getSupplierUrl() {
				return this.supplierUrl;
			}

			public void setSupplierUrl(String supplierUrl) {
				this.supplierUrl = supplierUrl;
			}

			public String getServiceType() {
				return this.serviceType;
			}

			public void setServiceType(String serviceType) {
				this.serviceType = serviceType;
			}

			public String getSupplierName() {
				return this.supplierName;
			}

			public void setSupplierName(String supplierName) {
				this.supplierName = supplierName;
			}

			public List<ServiceInfo> getServiceInfos() {
				return this.serviceInfos;
			}

			public void setServiceInfos(List<ServiceInfo> serviceInfos) {
				this.serviceInfos = serviceInfos;
			}

			public static class ServiceInfo {

				private String locale;

				private String image;

				private String name;

				private String shortDescription;

				public String getLocale() {
					return this.locale;
				}

				public void setLocale(String locale) {
					this.locale = locale;
				}

				public String getImage() {
					return this.image;
				}

				public void setImage(String image) {
					this.image = image;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getShortDescription() {
					return this.shortDescription;
				}

				public void setShortDescription(String shortDescription) {
					this.shortDescription = shortDescription;
				}
			}
		}
	}

	@Override
	public ListServiceInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListServiceInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
