/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 云主机挂载硬盘，主机和云盘没有未完成的任务时才可挂载，一个主机上最多可挂载4块数据盘
 */
public class AttachDiskRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云硬盘ID
     * Required:true
     */
    @Required
    private String diskId;

    /**
     * 逻辑挂载点[vdb,vdc,vdd,vde,vdf,vdg,vdh]
     * Required:true
     */
    @Required
    private String deviceName;

    /**
     * 当删除主机时，是否自动关联删除此硬盘，默认False，只支持按配置计费
     */
    private Boolean autoDelete;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Instance ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 云硬盘ID
     *
     * @return
     */
    public String getDiskId() {
        return diskId;
    }

    /**
     * set 云硬盘ID
     *
     * @param diskId
     */
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    /**
     * get 逻辑挂载点[vdb,vdc,vdd,vde,vdf,vdg,vdh]
     *
     * @return
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * set 逻辑挂载点[vdb,vdc,vdd,vde,vdf,vdg,vdh]
     *
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * get 当删除主机时，是否自动关联删除此硬盘，默认False，只支持按配置计费
     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 当删除主机时，是否自动关联删除此硬盘，默认False，只支持按配置计费
     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get Instance ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set Instance ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 云硬盘ID
     *
     * @param diskId
     */
    public AttachDiskRequest diskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * set 逻辑挂载点[vdb,vdc,vdd,vde,vdf,vdg,vdh]
     *
     * @param deviceName
     */
    public AttachDiskRequest deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * set 当删除主机时，是否自动关联删除此硬盘，默认False，只支持按配置计费
     *
     * @param autoDelete
     */
    public AttachDiskRequest autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public AttachDiskRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set Instance ID
     *
     * @param instanceId
     */
    public AttachDiskRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}