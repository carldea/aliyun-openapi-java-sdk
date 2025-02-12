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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeAvailableResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableResourcesResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private List<Resource> resources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public static class Resource {

		private String zoneId;

		private List<SupportedEngine> supportedEngines;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public List<SupportedEngine> getSupportedEngines() {
			return this.supportedEngines;
		}

		public void setSupportedEngines(List<SupportedEngine> supportedEngines) {
			this.supportedEngines = supportedEngines;
		}

		public static class SupportedEngine {

			private String supportedEngineVersion;

			private String mode;

			private List<SupportedInstanceClass> supportedInstanceClasses;

			public String getSupportedEngineVersion() {
				return this.supportedEngineVersion;
			}

			public void setSupportedEngineVersion(String supportedEngineVersion) {
				this.supportedEngineVersion = supportedEngineVersion;
			}

			public String getMode() {
				return this.mode;
			}

			public void setMode(String mode) {
				this.mode = mode;
			}

			public List<SupportedInstanceClass> getSupportedInstanceClasses() {
				return this.supportedInstanceClasses;
			}

			public void setSupportedInstanceClasses(List<SupportedInstanceClass> supportedInstanceClasses) {
				this.supportedInstanceClasses = supportedInstanceClasses;
			}

			public static class SupportedInstanceClass {

				private String description;

				private String displayClass;

				private String instanceClass;

				private String storageType;

				private NodeCount nodeCount;

				private StorageSize storageSize;

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getDisplayClass() {
					return this.displayClass;
				}

				public void setDisplayClass(String displayClass) {
					this.displayClass = displayClass;
				}

				public String getInstanceClass() {
					return this.instanceClass;
				}

				public void setInstanceClass(String instanceClass) {
					this.instanceClass = instanceClass;
				}

				public String getStorageType() {
					return this.storageType;
				}

				public void setStorageType(String storageType) {
					this.storageType = storageType;
				}

				public NodeCount getNodeCount() {
					return this.nodeCount;
				}

				public void setNodeCount(NodeCount nodeCount) {
					this.nodeCount = nodeCount;
				}

				public StorageSize getStorageSize() {
					return this.storageSize;
				}

				public void setStorageSize(StorageSize storageSize) {
					this.storageSize = storageSize;
				}

				public static class NodeCount {

					private String step;

					private String minCount;

					private String maxCount;

					public String getStep() {
						return this.step;
					}

					public void setStep(String step) {
						this.step = step;
					}

					public String getMinCount() {
						return this.minCount;
					}

					public void setMinCount(String minCount) {
						this.minCount = minCount;
					}

					public String getMaxCount() {
						return this.maxCount;
					}

					public void setMaxCount(String maxCount) {
						this.maxCount = maxCount;
					}
				}

				public static class StorageSize {

					private String step;

					private String minCount;

					private String maxCount;

					public String getStep() {
						return this.step;
					}

					public void setStep(String step) {
						this.step = step;
					}

					public String getMinCount() {
						return this.minCount;
					}

					public void setMinCount(String minCount) {
						this.minCount = minCount;
					}

					public String getMaxCount() {
						return this.maxCount;
					}

					public void setMaxCount(String maxCount) {
						this.maxCount = maxCount;
					}
				}
			}
		}
	}

	@Override
	public DescribeAvailableResourcesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAvailableResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
