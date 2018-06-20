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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.service.disk.model.DiskSpec;

/**
 * instanceDiskAttachmentSpec
 */
public class InstanceDiskAttachmentSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 磁盘分类，local或者cloud；系统盘仅支持local；数据盘仅支持cloud
     */
    private String diskCategory;

    /**
     * 自动删除，删除主机时自动删除此磁盘，默认为true，本地盘不能更改此值
     */
    private Boolean autoDelete;

    /**
     * 云硬盘规格
     */
    private DiskSpec cloudDiskSpec;

    /**
     * 数据盘逻辑挂载点vdb,vdc,vdd,vde,vdf,vdg,vdh
     */
    private String deviceName;

    /**
     * 排除设备，true则排除对应的deviceName
     */
    private Boolean noDevice;


    /**
     * get 磁盘分类，local或者cloud；系统盘仅支持local；数据盘仅支持cloud
     *
     * @return
     */
    public String getDiskCategory() {
        return diskCategory;
    }

    /**
     * set 磁盘分类，local或者cloud；系统盘仅支持local；数据盘仅支持cloud
     *
     * @param diskCategory
     */
    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

    /**
     * get 自动删除，删除主机时自动删除此磁盘，默认为true，本地盘不能更改此值
     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 自动删除，删除主机时自动删除此磁盘，默认为true，本地盘不能更改此值
     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    /**
     * get 云硬盘规格
     *
     * @return
     */
    public DiskSpec getCloudDiskSpec() {
        return cloudDiskSpec;
    }

    /**
     * set 云硬盘规格
     *
     * @param cloudDiskSpec
     */
    public void setCloudDiskSpec(DiskSpec cloudDiskSpec) {
        this.cloudDiskSpec = cloudDiskSpec;
    }

    /**
     * get 数据盘逻辑挂载点vdb,vdc,vdd,vde,vdf,vdg,vdh
     *
     * @return
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * set 数据盘逻辑挂载点vdb,vdc,vdd,vde,vdf,vdg,vdh
     *
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * get 排除设备，true则排除对应的deviceName
     *
     * @return
     */
    public Boolean getNoDevice() {
        return noDevice;
    }

    /**
     * set 排除设备，true则排除对应的deviceName
     *
     * @param noDevice
     */
    public void setNoDevice(Boolean noDevice) {
        this.noDevice = noDevice;
    }


    /**
     * set 磁盘分类，local或者cloud；系统盘仅支持local；数据盘仅支持cloud
     *
     * @param diskCategory
     */
    public InstanceDiskAttachmentSpec diskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }

    /**
     * set 自动删除，删除主机时自动删除此磁盘，默认为true，本地盘不能更改此值
     *
     * @param autoDelete
     */
    public InstanceDiskAttachmentSpec autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     * set 云硬盘规格
     *
     * @param cloudDiskSpec
     */
    public InstanceDiskAttachmentSpec cloudDiskSpec(DiskSpec cloudDiskSpec) {
        this.cloudDiskSpec = cloudDiskSpec;
        return this;
    }

    /**
     * set 数据盘逻辑挂载点vdb,vdc,vdd,vde,vdf,vdg,vdh
     *
     * @param deviceName
     */
    public InstanceDiskAttachmentSpec deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * set 排除设备，true则排除对应的deviceName
     *
     * @param noDevice
     */
    public InstanceDiskAttachmentSpec noDevice(Boolean noDevice) {
        this.noDevice = noDevice;
        return this;
    }


}