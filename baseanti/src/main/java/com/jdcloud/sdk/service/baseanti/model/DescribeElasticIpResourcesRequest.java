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
 * IP Resource APIs
 * Anti DDoS Basic IP Resource APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.baseanti.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询基础防护已防护的私有网络的弹性公网 IP 的安全信息. 包括私有网络的弹性公网 IP(运营商级 NAT 保留地址除外)

 */
public class DescribeElasticIpResourcesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码
     */
    private Integer pageNumber;

    /**
     * 分页大小
     */
    private Integer pageSize;

    /**
     * 地域编码. 基础防护已支持华北-北京, 华东-宿迁, 华东-上海, 华南-广州
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 页码
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 地域编码. 基础防护已支持华北-北京, 华东-宿迁, 华东-上海, 华南-广州
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域编码. 基础防护已支持华北-北京, 华东-宿迁, 华东-上海, 华南-广州
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 页码
     *
     * @param pageNumber
     */
    public DescribeElasticIpResourcesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public DescribeElasticIpResourcesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域编码. 基础防护已支持华北-北京, 华东-宿迁, 华东-上海, 华南-广州
     *
     * @param regionId
     */
    public DescribeElasticIpResourcesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}