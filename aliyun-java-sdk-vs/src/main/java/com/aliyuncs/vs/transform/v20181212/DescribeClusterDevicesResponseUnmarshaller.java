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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeClusterDevicesResponse;
import com.aliyuncs.vs.model.v20181212.DescribeClusterDevicesResponse.Device;
import com.aliyuncs.vs.model.v20181212.DescribeClusterDevicesResponse.Device.IpInfo;
import com.aliyuncs.vs.model.v20181212.DescribeClusterDevicesResponse.Device.PodInfo;
import com.aliyuncs.vs.model.v20181212.DescribeClusterDevicesResponse.Device.PodInfo.PodInfo1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterDevicesResponseUnmarshaller {

	public static DescribeClusterDevicesResponse unmarshall(DescribeClusterDevicesResponse describeClusterDevicesResponse, UnmarshallerContext _ctx) {
		
		describeClusterDevicesResponse.setRequestId(_ctx.stringValue("DescribeClusterDevicesResponse.RequestId"));
		describeClusterDevicesResponse.setTotal(_ctx.longValue("DescribeClusterDevicesResponse.Total"));

		List<Device> devices = new ArrayList<Device>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterDevicesResponse.Devices.Length"); i++) {
			Device device = new Device();
			device.setInstanceId(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].InstanceId"));
			device.setDescription(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].Description"));
			device.setEdgeNodeName(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].EdgeNodeName"));
			device.setPlatformType(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].PlatformType"));
			device.setStatus(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].Status"));
			device.setImageId(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].ImageId"));
			device.setInstanceName(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].InstanceName"));
			device.setMacAddress(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].MacAddress"));
			device.setServer(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].Server"));
			device.setInstanceChargeType(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].InstanceChargeType"));
			device.setAutoRenew(_ctx.booleanValue("DescribeClusterDevicesResponse.Devices["+ i +"].AutoRenew"));
			device.setAutoRenewPeriod(_ctx.integerValue("DescribeClusterDevicesResponse.Devices["+ i +"].AutoRenewPeriod"));
			device.setPeriod(_ctx.integerValue("DescribeClusterDevicesResponse.Devices["+ i +"].Period"));
			device.setPeriodUnit(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].PeriodUnit"));

			List<IpInfo> ipInfos = new ArrayList<IpInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterDevicesResponse.Devices["+ i +"].IpInfos.Length"); j++) {
				IpInfo ipInfo = new IpInfo();
				ipInfo.setNatType(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].IpInfos["+ j +"].NatType"));
				ipInfo.setExternalIp(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].IpInfos["+ j +"].ExternalIp"));
				ipInfo.setExternalPort(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].IpInfos["+ j +"].ExternalPort"));
				ipInfo.setInternalIp(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].IpInfos["+ j +"].InternalIp"));
				ipInfo.setInternalPort(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].IpInfos["+ j +"].InternalPort"));
				ipInfo.setIpProtocol(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].IpInfos["+ j +"].IpProtocol"));
				ipInfo.setISP(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].IpInfos["+ j +"].ISP"));

				ipInfos.add(ipInfo);
			}
			device.setIpInfos(ipInfos);

			List<PodInfo> podInfos = new ArrayList<PodInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterDevicesResponse.Devices["+ i +"].PodInfos.Length"); j++) {
				PodInfo podInfo = new PodInfo();
				podInfo.setPodId(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].PodInfos["+ j +"].PodId"));
				podInfo.setStatus(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].PodInfos["+ j +"].Status"));

				List<PodInfo1> network = new ArrayList<PodInfo1>();
				for (int k = 0; k < _ctx.lengthValue("DescribeClusterDevicesResponse.Devices["+ i +"].PodInfos["+ j +"].Network.Length"); k++) {
					PodInfo1 podInfo1 = new PodInfo1();
					podInfo1.setExternalIp(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].PodInfos["+ j +"].Network["+ k +"].ExternalIp"));
					podInfo1.setContainerPorts(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].PodInfos["+ j +"].Network["+ k +"].ContainerPorts"));
					podInfo1.setExternalPort(_ctx.stringValue("DescribeClusterDevicesResponse.Devices["+ i +"].PodInfos["+ j +"].Network["+ k +"].ExternalPort"));

					network.add(podInfo1);
				}
				podInfo.setNetwork(network);

				podInfos.add(podInfo);
			}
			device.setPodInfos(podInfos);

			devices.add(device);
		}
		describeClusterDevicesResponse.setDevices(devices);
	 
	 	return describeClusterDevicesResponse;
	}
}