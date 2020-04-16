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
 * 查询公网 IP 的 endTime 之前 15 分钟内监控流量, 仅支持 ipv4. (已废弃, 建议使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-basic/api/describeipmonitorflow&#39;&gt;describeIpMonitorFlow&lt;/a&gt; 接口)

 */
public class DescribeIpResourceFlowRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询的结束时间, UTC时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ, 为空时查询当前时间之前 15 分钟内监控流量
     */
    private String endTime;

    /**
     * 地域编码. 基础防护已支持华北-北京, 华东-宿迁, 华东-上海, 华南-广州
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 基础防护已防护的公网 IP, 仅支持 ipv4 格式. &lt;br&gt;- 使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-basic/api/describeelasticipresources&#39;&gt;describeElasticIpResources&lt;/a&gt; 接口查询基础防护已防护的私有网络弹性公网 IP&lt;br&gt;- 使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-basic/api/describecpsipresources&#39;&gt;describeCpsIpResources&lt;/a&gt; 接口查询基础防护已防护的云物理服务器公网 IP 和 弹性公网 IP&lt;br&gt;- 使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-basic/api/describeccsipresources&#39;&gt;describeCcsIpResources&lt;/a&gt; 接口查询基础防护已防护的托管区公网 IP
     * Required:true
     */
    @Required
    private String ip;


    /**
     * get 查询的结束时间, UTC时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ, 为空时查询当前时间之前 15 分钟内监控流量
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询的结束时间, UTC时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ, 为空时查询当前时间之前 15 分钟内监控流量
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
     * get 基础防护已防护的公网 IP, 仅支持 ipv4 格式. &lt;br&gt;- 使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-basic/api/describeelasticipresources&#39;&gt;describeElasticIpResources&lt;/a&gt; 接口查询基础防护已防护的私有网络弹性公网 IP&lt;br&gt;- 使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-basic/api/describecpsipresources&#39;&gt;describeCpsIpResources&lt;/a&gt; 接口查询基础防护已防护的云物理服务器公网 IP 和 弹性公网 IP&lt;br&gt;- 使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-basic/api/describeccsipresources&#39;&gt;describeCcsIpResources&lt;/a&gt; 接口查询基础防护已防护的托管区公网 IP
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set 基础防护已防护的公网 IP, 仅支持 ipv4 格式. &lt;br&gt;- 使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-basic/api/describeelasticipresources&#39;&gt;describeElasticIpResources&lt;/a&gt; 接口查询基础防护已防护的私有网络弹性公网 IP&lt;br&gt;- 使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-basic/api/describecpsipresources&#39;&gt;describeCpsIpResources&lt;/a&gt; 接口查询基础防护已防护的云物理服务器公网 IP 和 弹性公网 IP&lt;br&gt;- 使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-basic/api/describeccsipresources&#39;&gt;describeCcsIpResources&lt;/a&gt; 接口查询基础防护已防护的托管区公网 IP
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }


    /**
     * set 查询的结束时间, UTC时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ, 为空时查询当前时间之前 15 分钟内监控流量
     *
     * @param endTime
     */
    public DescribeIpResourceFlowRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 地域编码. 基础防护已支持华北-北京, 华东-宿迁, 华东-上海, 华南-广州
     *
     * @param regionId
     */
    public DescribeIpResourceFlowRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 基础防护已防护的公网 IP, 仅支持 ipv4 格式. &lt;br&gt;- 使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-basic/api/describeelasticipresources&#39;&gt;describeElasticIpResources&lt;/a&gt; 接口查询基础防护已防护的私有网络弹性公网 IP&lt;br&gt;- 使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-basic/api/describecpsipresources&#39;&gt;describeCpsIpResources&lt;/a&gt; 接口查询基础防护已防护的云物理服务器公网 IP 和 弹性公网 IP&lt;br&gt;- 使用 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-basic/api/describeccsipresources&#39;&gt;describeCcsIpResources&lt;/a&gt; 接口查询基础防护已防护的托管区公网 IP
     *
     * @param ip
     */
    public DescribeIpResourceFlowRequest ip(String ip) {
        this.ip = ip;
        return this;
    }


}