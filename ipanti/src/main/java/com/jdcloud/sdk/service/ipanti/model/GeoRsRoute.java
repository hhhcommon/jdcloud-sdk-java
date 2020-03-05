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

package com.jdcloud.sdk.service.ipanti.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * geoRsRoute
 */
public class GeoRsRoute  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 要设置的区域编码, 查询 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-pro/api/describeWebRuleRSGeoAreas&#39;&gt;describeWebRuleRSGeoAreas&lt;/a&gt; 接口获取可设置的地域编码
     * Required:true
     */
    @Required
    private String geo;

    /**
     * 对应区域的回源IP的列表
     * Required:true
     */
    @Required
    private List<String> rsAddr;


    /**
     * get 要设置的区域编码, 查询 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-pro/api/describeWebRuleRSGeoAreas&#39;&gt;describeWebRuleRSGeoAreas&lt;/a&gt; 接口获取可设置的地域编码
     *
     * @return
     */
    public String getGeo() {
        return geo;
    }

    /**
     * set 要设置的区域编码, 查询 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-pro/api/describeWebRuleRSGeoAreas&#39;&gt;describeWebRuleRSGeoAreas&lt;/a&gt; 接口获取可设置的地域编码
     *
     * @param geo
     */
    public void setGeo(String geo) {
        this.geo = geo;
    }

    /**
     * get 对应区域的回源IP的列表
     *
     * @return
     */
    public List<String> getRsAddr() {
        return rsAddr;
    }

    /**
     * set 对应区域的回源IP的列表
     *
     * @param rsAddr
     */
    public void setRsAddr(List<String> rsAddr) {
        this.rsAddr = rsAddr;
    }


    /**
     * set 要设置的区域编码, 查询 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-pro/api/describeWebRuleRSGeoAreas&#39;&gt;describeWebRuleRSGeoAreas&lt;/a&gt; 接口获取可设置的地域编码
     *
     * @param geo
     */
    public GeoRsRoute geo(String geo) {
        this.geo = geo;
        return this;
    }

    /**
     * set 对应区域的回源IP的列表
     *
     * @param rsAddr
     */
    public GeoRsRoute rsAddr(List<String> rsAddr) {
        this.rsAddr = rsAddr;
        return this;
    }


    /**
     * add item to 对应区域的回源IP的列表
     *
     * @param rsAddr
     */
    public void addRsAddr(String rsAddr) {
        if (this.rsAddr == null) {
            this.rsAddr = new ArrayList<>();
        }
        this.rsAddr.add(rsAddr);
    }

}