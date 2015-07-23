/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.ecs.model.v20140526.DescribeZonesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeZonesResponse.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeZonesResponseUnmarshaller {

	public static DescribeZonesResponse unmarshall(DescribeZonesResponse describeZonesResponse, UnmarshallerContext context) {
		
		describeZonesResponse.setRequestId(context.stringValue("DescribeZonesResponse.RequestId"));

		List<Zone> zones = new ArrayList<Zone>();
		for (int i = 0; i < context.lengthValue("DescribeZonesResponse.Zones.Length"); i++) {
			Zone  zone = new Zone();
			zone.setZoneId(context.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneId"));
			zone.setLocalName(context.stringValue("DescribeZonesResponse.Zones["+ i +"].LocalName"));

			List<String> availableResourceCreation = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeZonesResponse.Zones["+ i +"].AvailableResourceCreation.Length"); j++) {
				availableResourceCreation.add(context.stringValue("DescribeZonesResponse.Zones["+ i +"].AvailableResourceCreation["+ j +"]"));
			}
			zone.setAvailableResourceCreation(availableResourceCreation);

			List<String> availableDiskCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeZonesResponse.Zones["+ i +"].AvailableDiskCategories.Length"); j++) {
				availableDiskCategories.add(context.stringValue("DescribeZonesResponse.Zones["+ i +"].AvailableDiskCategories["+ j +"]"));
			}
			zone.setAvailableDiskCategories(availableDiskCategories);

			zones.add(zone);
		}
		describeZonesResponse.setZones(zones);
	 
	 	return describeZonesResponse;
	}
}