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

package com.aliyuncs.openanalytics.model.v20180301;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.openanalytics.transform.v20180301.DescribeRegionListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRegionListResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private List<RegionListItem> regionList;

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

	public List<RegionListItem> getRegionList() {
		return this.regionList;
	}

	public void setRegionList(List<RegionListItem> regionList) {
		this.regionList = regionList;
	}

	public static class RegionListItem {

		private String regionID;

		public String getRegionID() {
			return this.regionID;
		}

		public void setRegionID(String regionID) {
			this.regionID = regionID;
		}
	}

	@Override
	public DescribeRegionListResponse getInstance(UnmarshallerContext context) {
		return	DescribeRegionListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
