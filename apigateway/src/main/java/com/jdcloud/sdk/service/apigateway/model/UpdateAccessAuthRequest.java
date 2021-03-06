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
 * 访问授权
 * 关于访问授权管理和查看的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import com.jdcloud.sdk.service.apigateway.model.AccessAuthView;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 更新访问授权
 */
public class UpdateAccessAuthRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 访问授权详情
     */
    private AccessAuthView accessAuthView;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 访问授权ID
     * Required:true
     */
    @Required
    private String accessAuthId;


    /**
     * get 访问授权详情
     *
     * @return
     */
    public AccessAuthView getAccessAuthView() {
        return accessAuthView;
    }

    /**
     * set 访问授权详情
     *
     * @param accessAuthView
     */
    public void setAccessAuthView(AccessAuthView accessAuthView) {
        this.accessAuthView = accessAuthView;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 访问授权ID
     *
     * @return
     */
    public String getAccessAuthId() {
        return accessAuthId;
    }

    /**
     * set 访问授权ID
     *
     * @param accessAuthId
     */
    public void setAccessAuthId(String accessAuthId) {
        this.accessAuthId = accessAuthId;
    }


    /**
     * set 访问授权详情
     *
     * @param accessAuthView
     */
    public UpdateAccessAuthRequest accessAuthView(AccessAuthView accessAuthView) {
        this.accessAuthView = accessAuthView;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public UpdateAccessAuthRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 访问授权ID
     *
     * @param accessAuthId
     */
    public UpdateAccessAuthRequest accessAuthId(String accessAuthId) {
        this.accessAuthId = accessAuthId;
        return this;
    }


}