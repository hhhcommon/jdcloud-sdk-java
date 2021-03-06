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

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.charge.model.Charge;

/**
 * elasticIp
 */
public class ElasticIp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 弹性IP的Id
     */
    private String elasticIpId;

    /**
     * 弹性IP地址
     */
    private String elasticIpAddress;

    /**
     * 弹性ip的限速（单位：Mbps)
     */
    private Integer bandwidthMbps;

    /**
     * IP服务商，取值为bgp或no_bgp
     */
    private String provider;

    /**
     * 私有IP的IPV4地址
     */
    private String privateIpAddress;

    /**
     * 配置弹性网卡Id
     */
    private String networkInterfaceId;

    /**
     * 实例Id
     */
    private String instanceId;

    /**
     * 实例类型,取值为：compute、lb、container、pod
     */
    private String instanceType;

    /**
     * 计费配置
     */
    private Charge charge;

    /**
     * 弹性ip创建时间
     */
    private String createdTime;

    /**
     * 弹性ip可用区属性，如果为空，表示全可用区
     */
    private String az;

    /**
     * Tag信息
     */
    private List<Tag> tags;


    /**
     * get 弹性IP的Id
     *
     * @return
     */
    public String getElasticIpId() {
        return elasticIpId;
    }

    /**
     * set 弹性IP的Id
     *
     * @param elasticIpId
     */
    public void setElasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
    }

    /**
     * get 弹性IP地址
     *
     * @return
     */
    public String getElasticIpAddress() {
        return elasticIpAddress;
    }

    /**
     * set 弹性IP地址
     *
     * @param elasticIpAddress
     */
    public void setElasticIpAddress(String elasticIpAddress) {
        this.elasticIpAddress = elasticIpAddress;
    }

    /**
     * get 弹性ip的限速（单位：Mbps)
     *
     * @return
     */
    public Integer getBandwidthMbps() {
        return bandwidthMbps;
    }

    /**
     * set 弹性ip的限速（单位：Mbps)
     *
     * @param bandwidthMbps
     */
    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }

    /**
     * get IP服务商，取值为bgp或no_bgp
     *
     * @return
     */
    public String getProvider() {
        return provider;
    }

    /**
     * set IP服务商，取值为bgp或no_bgp
     *
     * @param provider
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * get 私有IP的IPV4地址
     *
     * @return
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * set 私有IP的IPV4地址
     *
     * @param privateIpAddress
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * get 配置弹性网卡Id
     *
     * @return
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * set 配置弹性网卡Id
     *
     * @param networkInterfaceId
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * get 实例Id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例Id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 实例类型,取值为：compute、lb、container、pod
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例类型,取值为：compute、lb、container、pod
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 计费配置
     *
     * @return
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public void setCharge(Charge charge) {
        this.charge = charge;
    }

    /**
     * get 弹性ip创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 弹性ip创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * get 弹性ip可用区属性，如果为空，表示全可用区
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 弹性ip可用区属性，如果为空，表示全可用区
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get Tag信息
     *
     * @return
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * set Tag信息
     *
     * @param tags
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }


    /**
     * set 弹性IP的Id
     *
     * @param elasticIpId
     */
    public ElasticIp elasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
        return this;
    }

    /**
     * set 弹性IP地址
     *
     * @param elasticIpAddress
     */
    public ElasticIp elasticIpAddress(String elasticIpAddress) {
        this.elasticIpAddress = elasticIpAddress;
        return this;
    }

    /**
     * set 弹性ip的限速（单位：Mbps)
     *
     * @param bandwidthMbps
     */
    public ElasticIp bandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
        return this;
    }

    /**
     * set IP服务商，取值为bgp或no_bgp
     *
     * @param provider
     */
    public ElasticIp provider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * set 私有IP的IPV4地址
     *
     * @param privateIpAddress
     */
    public ElasticIp privateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * set 配置弹性网卡Id
     *
     * @param networkInterfaceId
     */
    public ElasticIp networkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * set 实例Id
     *
     * @param instanceId
     */
    public ElasticIp instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 实例类型,取值为：compute、lb、container、pod
     *
     * @param instanceType
     */
    public ElasticIp instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public ElasticIp charge(Charge charge) {
        this.charge = charge;
        return this;
    }

    /**
     * set 弹性ip创建时间
     *
     * @param createdTime
     */
    public ElasticIp createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set 弹性ip可用区属性，如果为空，表示全可用区
     *
     * @param az
     */
    public ElasticIp az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set Tag信息
     *
     * @param tags
     */
    public ElasticIp tags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }


    /**
     * add item to Tag信息
     *
     * @param tag
     */
    public void addTag(Tag tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

}