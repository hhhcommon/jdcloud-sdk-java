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
 * 画像单标签输出接口
 * API related to datastar
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.datastar.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 根据deviceId查询对应用户的画像信息
 */
public class GetProfileRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * deviceId，mobile等,多个id英文逗号分隔
     * Required:true
     */
    @Required
    private String id;

    /**
     * 数据类型
     * Required:true
     */
    @Required
    private String type;

    /**
     * 画像标签编号,多个画像标签英文逗号分隔
     * Required:true
     */
    @Required
    private String labelCode;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get deviceId，mobile等,多个id英文逗号分隔
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set deviceId，mobile等,多个id英文逗号分隔
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 数据类型
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 数据类型
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get 画像标签编号,多个画像标签英文逗号分隔
     *
     * @return
     */
    public String getLabelCode() {
        return labelCode;
    }

    /**
     * set 画像标签编号,多个画像标签英文逗号分隔
     *
     * @param labelCode
     */
    public void setLabelCode(String labelCode) {
        this.labelCode = labelCode;
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
     * set deviceId，mobile等,多个id英文逗号分隔
     *
     * @param id
     */
    public GetProfileRequest id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 数据类型
     *
     * @param type
     */
    public GetProfileRequest type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set 画像标签编号,多个画像标签英文逗号分隔
     *
     * @param labelCode
     */
    public GetProfileRequest labelCode(String labelCode) {
        this.labelCode = labelCode;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public GetProfileRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}