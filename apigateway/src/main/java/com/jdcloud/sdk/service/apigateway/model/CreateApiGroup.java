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

package com.jdcloud.sdk.service.apigateway.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * API分组
 */
public class CreateApiGroup  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 名称
     * Required:true
     */
    @Required
    private String groupName;

    /**
     * 描述
     */
    private String description;

    /**
     * 分组路径前缀，无需添加/
     */
    private String prefix;

    /**
     * 密钥验证方式：check_exist（密钥必须在访问授权中已配置）、no_check_exist（无需事先配置）
     */
    private String keyCheck;

    /**
     * 访问授权方式：None（免鉴权）、jd_cloud（开启访问授权，且必须使用京东云的AK、SK验签）、hufu（虎符用户）
     * Required:true
     */
    @Required
    private String authType;

    /**
     * 是否转发分组路径到后端服务：0（不转发）、1（转发）默认为1
     */
    private Integer prefixStrip;

    /**
     * 分组类型：api_group（api分组）、jdsf_group（微服务分组）默认为 api_group
     */
    private String groupType;

    /**
     * 微服务网关名称
     */
    private String jdsfName;

    /**
     * 微服务注册中心ID
     */
    private String jdsfRegistryName;

    /**
     * 微服务网关ID
     */
    private String jdsfId;


    /**
     * get 名称
     *
     * @return
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * set 名称
     *
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * get 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 分组路径前缀，无需添加/
     *
     * @return
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * set 分组路径前缀，无需添加/
     *
     * @param prefix
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * get 密钥验证方式：check_exist（密钥必须在访问授权中已配置）、no_check_exist（无需事先配置）
     *
     * @return
     */
    public String getKeyCheck() {
        return keyCheck;
    }

    /**
     * set 密钥验证方式：check_exist（密钥必须在访问授权中已配置）、no_check_exist（无需事先配置）
     *
     * @param keyCheck
     */
    public void setKeyCheck(String keyCheck) {
        this.keyCheck = keyCheck;
    }

    /**
     * get 访问授权方式：None（免鉴权）、jd_cloud（开启访问授权，且必须使用京东云的AK、SK验签）、hufu（虎符用户）
     *
     * @return
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * set 访问授权方式：None（免鉴权）、jd_cloud（开启访问授权，且必须使用京东云的AK、SK验签）、hufu（虎符用户）
     *
     * @param authType
     */
    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * get 是否转发分组路径到后端服务：0（不转发）、1（转发）默认为1
     *
     * @return
     */
    public Integer getPrefixStrip() {
        return prefixStrip;
    }

    /**
     * set 是否转发分组路径到后端服务：0（不转发）、1（转发）默认为1
     *
     * @param prefixStrip
     */
    public void setPrefixStrip(Integer prefixStrip) {
        this.prefixStrip = prefixStrip;
    }

    /**
     * get 分组类型：api_group（api分组）、jdsf_group（微服务分组）默认为 api_group
     *
     * @return
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * set 分组类型：api_group（api分组）、jdsf_group（微服务分组）默认为 api_group
     *
     * @param groupType
     */
    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    /**
     * get 微服务网关名称
     *
     * @return
     */
    public String getJdsfName() {
        return jdsfName;
    }

    /**
     * set 微服务网关名称
     *
     * @param jdsfName
     */
    public void setJdsfName(String jdsfName) {
        this.jdsfName = jdsfName;
    }

    /**
     * get 微服务注册中心ID
     *
     * @return
     */
    public String getJdsfRegistryName() {
        return jdsfRegistryName;
    }

    /**
     * set 微服务注册中心ID
     *
     * @param jdsfRegistryName
     */
    public void setJdsfRegistryName(String jdsfRegistryName) {
        this.jdsfRegistryName = jdsfRegistryName;
    }

    /**
     * get 微服务网关ID
     *
     * @return
     */
    public String getJdsfId() {
        return jdsfId;
    }

    /**
     * set 微服务网关ID
     *
     * @param jdsfId
     */
    public void setJdsfId(String jdsfId) {
        this.jdsfId = jdsfId;
    }


    /**
     * set 名称
     *
     * @param groupName
     */
    public CreateApiGroup groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public CreateApiGroup description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 分组路径前缀，无需添加/
     *
     * @param prefix
     */
    public CreateApiGroup prefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * set 密钥验证方式：check_exist（密钥必须在访问授权中已配置）、no_check_exist（无需事先配置）
     *
     * @param keyCheck
     */
    public CreateApiGroup keyCheck(String keyCheck) {
        this.keyCheck = keyCheck;
        return this;
    }

    /**
     * set 访问授权方式：None（免鉴权）、jd_cloud（开启访问授权，且必须使用京东云的AK、SK验签）、hufu（虎符用户）
     *
     * @param authType
     */
    public CreateApiGroup authType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * set 是否转发分组路径到后端服务：0（不转发）、1（转发）默认为1
     *
     * @param prefixStrip
     */
    public CreateApiGroup prefixStrip(Integer prefixStrip) {
        this.prefixStrip = prefixStrip;
        return this;
    }

    /**
     * set 分组类型：api_group（api分组）、jdsf_group（微服务分组）默认为 api_group
     *
     * @param groupType
     */
    public CreateApiGroup groupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * set 微服务网关名称
     *
     * @param jdsfName
     */
    public CreateApiGroup jdsfName(String jdsfName) {
        this.jdsfName = jdsfName;
        return this;
    }

    /**
     * set 微服务注册中心ID
     *
     * @param jdsfRegistryName
     */
    public CreateApiGroup jdsfRegistryName(String jdsfRegistryName) {
        this.jdsfRegistryName = jdsfRegistryName;
        return this;
    }

    /**
     * set 微服务网关ID
     *
     * @param jdsfId
     */
    public CreateApiGroup jdsfId(String jdsfId) {
        this.jdsfId = jdsfId;
        return this;
    }


}