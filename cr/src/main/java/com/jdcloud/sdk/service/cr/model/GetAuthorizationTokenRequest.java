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
 * Authentication
 * 用户认证相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cr.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * &lt;p&gt;申请12小时有效期的令牌。 使用&lt;code&gt;docker&lt;/code&gt; CLI push和pull镜像。&lt;/p&gt;
&lt;p&gt;&lt;code&gt;authorizationToken&lt;/code&gt;为每个registry返回一个base64编码的字符串，解码后&lt;code&gt;docker login&lt;/code&gt;命令
可完成指定registry的鉴权。JCR CLI提供&lt;code&gt;jcr get-login&lt;/code&gt;进行认证处理。&lt;/p&gt;

 */
public class GetAuthorizationTokenRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * issue新token的过期时间, 可选参数为新生成令牌的过期时间，最大值为24小时，最小值为1小时，为空则默认为12小时过期时间。

     */
    private Integer expiredAfterHours;

    /**
     * 地域 ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 注册表名称
     * Required:true
     */
    @Required
    private String registryName;


    /**
     * get issue新token的过期时间, 可选参数为新生成令牌的过期时间，最大值为24小时，最小值为1小时，为空则默认为12小时过期时间。

     *
     * @return
     */
    public Integer getExpiredAfterHours() {
        return expiredAfterHours;
    }

    /**
     * set issue新token的过期时间, 可选参数为新生成令牌的过期时间，最大值为24小时，最小值为1小时，为空则默认为12小时过期时间。

     *
     * @param expiredAfterHours
     */
    public void setExpiredAfterHours(Integer expiredAfterHours) {
        this.expiredAfterHours = expiredAfterHours;
    }

    /**
     * get 地域 ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 注册表名称
     *
     * @return
     */
    public String getRegistryName() {
        return registryName;
    }

    /**
     * set 注册表名称
     *
     * @param registryName
     */
    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }


    /**
     * set issue新token的过期时间, 可选参数为新生成令牌的过期时间，最大值为24小时，最小值为1小时，为空则默认为12小时过期时间。

     *
     * @param expiredAfterHours
     */
    public GetAuthorizationTokenRequest expiredAfterHours(Integer expiredAfterHours) {
        this.expiredAfterHours = expiredAfterHours;
        return this;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public GetAuthorizationTokenRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 注册表名称
     *
     * @param registryName
     */
    public GetAuthorizationTokenRequest registryName(String registryName) {
        this.registryName = registryName;
        return this;
    }


}