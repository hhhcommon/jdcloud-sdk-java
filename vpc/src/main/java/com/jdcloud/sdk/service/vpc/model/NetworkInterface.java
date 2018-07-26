/*
 * Copyright 2018-2025 JDCLOUD.COM
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

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;

/**
 * networkInterface
 */
public class NetworkInterface  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 弹性网卡ID
     */
    private String networkInterfaceId;

    /**
     * 可用区名称
     */
    private String az;

    /**
     * 以太网地址
     */
    private String macAddress;

    /**
     * 虚拟网络ID
     */
    private String vpcId;

    /**
     * 子网ID
     */
    private String subnetId;

    /**
     * 安全组ID列表
     */
    private List<String> networkSecurityGroupIds;

    /**
     * 源IP地址校验，取值为0或者1
     */
    private Integer sanityCheck;

    /**
     * 网卡主IP
     */
    private NetworkInterfacePrivateIp primaryIp;

    /**
     * 网卡附属IP列表
     */
    private List<NetworkInterfacePrivateIp> secondaryIps;

    /**
     * 关联实例类型，取值范围：vm
     */
    private String instanceType;

    /**
     * 关联实例ID
     */
    private String instanceId;

    /**
     * 弹性网卡创建时间
     */
    private String createdTime;


    /**
     * get 弹性网卡ID
     *
     * @return
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * set 弹性网卡ID
     *
     * @param networkInterfaceId
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * get 可用区名称
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 可用区名称
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 以太网地址
     *
     * @return
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * set 以太网地址
     *
     * @param macAddress
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * get 虚拟网络ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 虚拟网络ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 子网ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 安全组ID列表
     *
     * @return
     */
    public List<String> getNetworkSecurityGroupIds() {
        return networkSecurityGroupIds;
    }

    /**
     * set 安全组ID列表
     *
     * @param networkSecurityGroupIds
     */
    public void setNetworkSecurityGroupIds(List<String> networkSecurityGroupIds) {
        this.networkSecurityGroupIds = networkSecurityGroupIds;
    }

    /**
     * get 源IP地址校验，取值为0或者1
     *
     * @return
     */
    public Integer getSanityCheck() {
        return sanityCheck;
    }

    /**
     * set 源IP地址校验，取值为0或者1
     *
     * @param sanityCheck
     */
    public void setSanityCheck(Integer sanityCheck) {
        this.sanityCheck = sanityCheck;
    }

    /**
     * get 网卡主IP
     *
     * @return
     */
    public NetworkInterfacePrivateIp getPrimaryIp() {
        return primaryIp;
    }

    /**
     * set 网卡主IP
     *
     * @param primaryIp
     */
    public void setPrimaryIp(NetworkInterfacePrivateIp primaryIp) {
        this.primaryIp = primaryIp;
    }

    /**
     * get 网卡附属IP列表
     *
     * @return
     */
    public List<NetworkInterfacePrivateIp> getSecondaryIps() {
        return secondaryIps;
    }

    /**
     * set 网卡附属IP列表
     *
     * @param secondaryIps
     */
    public void setSecondaryIps(List<NetworkInterfacePrivateIp> secondaryIps) {
        this.secondaryIps = secondaryIps;
    }

    /**
     * get 关联实例类型，取值范围：vm
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 关联实例类型，取值范围：vm
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 关联实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 关联实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 弹性网卡创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 弹性网卡创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * set 弹性网卡ID
     *
     * @param networkInterfaceId
     */
    public NetworkInterface networkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * set 可用区名称
     *
     * @param az
     */
    public NetworkInterface az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 以太网地址
     *
     * @param macAddress
     */
    public NetworkInterface macAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * set 虚拟网络ID
     *
     * @param vpcId
     */
    public NetworkInterface vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public NetworkInterface subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 安全组ID列表
     *
     * @param networkSecurityGroupIds
     */
    public NetworkInterface networkSecurityGroupIds(List<String> networkSecurityGroupIds) {
        this.networkSecurityGroupIds = networkSecurityGroupIds;
        return this;
    }

    /**
     * set 源IP地址校验，取值为0或者1
     *
     * @param sanityCheck
     */
    public NetworkInterface sanityCheck(Integer sanityCheck) {
        this.sanityCheck = sanityCheck;
        return this;
    }

    /**
     * set 网卡主IP
     *
     * @param primaryIp
     */
    public NetworkInterface primaryIp(NetworkInterfacePrivateIp primaryIp) {
        this.primaryIp = primaryIp;
        return this;
    }

    /**
     * set 网卡附属IP列表
     *
     * @param secondaryIps
     */
    public NetworkInterface secondaryIps(List<NetworkInterfacePrivateIp> secondaryIps) {
        this.secondaryIps = secondaryIps;
        return this;
    }

    /**
     * set 关联实例类型，取值范围：vm
     *
     * @param instanceType
     */
    public NetworkInterface instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 关联实例ID
     *
     * @param instanceId
     */
    public NetworkInterface instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 弹性网卡创建时间
     *
     * @param createdTime
     */
    public NetworkInterface createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }


    /**
     * add item to 安全组ID列表
     *
     * @param networkSecurityGroupId
     */
    public void addNetworkSecurityGroupId(String networkSecurityGroupId) {
        if (this.networkSecurityGroupIds == null) {
            this.networkSecurityGroupIds = new ArrayList<>();
        }
        this.networkSecurityGroupIds.add(networkSecurityGroupId);
    }

    /**
     * add item to 网卡附属IP列表
     *
     * @param secondaryIp
     */
    public void addSecondaryIp(NetworkInterfacePrivateIp secondaryIp) {
        if (this.secondaryIps == null) {
            this.secondaryIps = new ArrayList<>();
        }
        this.secondaryIps.add(secondaryIp);
    }

}