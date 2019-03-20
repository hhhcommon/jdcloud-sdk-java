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
 * Anti DDos Pro Instance APIs
 * Anti DDos Pro Instance APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.ipanti.model.CcIpLimitSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置实例 CC 防护每 IP 限速
 */
public class SetCCIpLimitRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * CC 参数
     * Required:true
     */
    @Required
    private CcIpLimitSpec cCSpec;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例 ID
     * Required:true
     */
    @Required
    private Long instanceId;


    /**
     * get CC 参数
     *
     * @return
     */
    public CcIpLimitSpec getCCSpec() {
        return cCSpec;
    }

    /**
     * set CC 参数
     *
     * @param cCSpec
     */
    public void setCCSpec(CcIpLimitSpec cCSpec) {
        this.cCSpec = cCSpec;
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
     * get 实例 ID
     *
     * @return
     */
    public Long getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例 ID
     *
     * @param instanceId
     */
    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set CC 参数
     *
     * @param cCSpec
     */
    public SetCCIpLimitRequest cCSpec(CcIpLimitSpec cCSpec) {
        this.cCSpec = cCSpec;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public SetCCIpLimitRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 实例 ID
     *
     * @param instanceId
     */
    public SetCCIpLimitRequest instanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}