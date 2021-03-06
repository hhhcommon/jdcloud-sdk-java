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
 * JDCLOUD IAS Services API
 * 京东云联合登陆Api
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ias.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 更新应用（只传需要变更的参数，不传的参数不会更新）
 */
public class UpdateAppRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用名
     */
    private String clientName;

    /**
     * 客户端认证方式：&lt;br/&gt; none：不设置客户端密码（不推荐）&lt;br/&gt; client_secret_post：客户端必须设置密码，且该密码需要在OAuth2 Token Endpoint提供于请求的body&lt;br/&gt; client_secret_basic：客户端必须设置密码，且该密码需要在OAuth2 Token Endpoint提供于请求的header&lt;br/&gt;&lt;br/&gt; 支持以下值：&lt;br/&gt; （1）none&lt;br/&gt; （2）client_secret_post&lt;br/&gt; （3）client_secret_basic
     */
    private String tokenEndpointAuthMethod;

    /**
     * 支持的OAuth类型：&lt;br/&gt; authorization_code：OAuth2授权码模式&lt;br/&gt; implicit：OAuth2隐式授权模式&lt;br/&gt; refresh_token：启用刷新令牌&lt;br/&gt;&lt;br/&gt; 支持以下值：&lt;br/&gt; （1）authorization_code&lt;br/&gt; （2）authorization_code,refresh_token&lt;br/&gt; （3）authorization_code,implicit&lt;br/&gt; （4）authorization_code,implicit,refresh_token&lt;br/&gt; （5）implicit&lt;br/&gt;&lt;br/&gt;        注：如果grantTypes指定了refresh_token，应用将可以使用刷新令牌；如果在创建应用时未指定，则应用不能使用刷新令牌；任何时候应用都可以调用“更新应用”接口更改grantTypes设置
     */
    private String grantTypes;

    /**
     * 回调地址，最多4个，多个url之间用逗号,分隔，每个url长度不超过1000，url不支持#符号
     */
    private String redirectUris;

    /**
     * 应用介绍地址，url不支持#符号
     */
    private String clientUri;

    /**
     * 应用logo地址，url不支持#符号
     */
    private String logoUri;

    /**
     * 应用服务协议地址，url不支持#符号
     */
    private String tosUri;

    /**
     * 应用隐私政策地址，url不支持#符号
     */
    private String policyUri;

    /**
     * OAuth scope范围，支持的值为：&lt;br/&gt; （1）openid：用OpenID Connect协议进行身份认证&lt;br/&gt; 指定scope为openid，并在Authorization Endpoint请求该scope，京东云将返回用户的OpenID令牌；如果在创建应用时未指明该值，则应用不能请求OpenID令牌；任何时候应用都可以调用“更新应用”更改该设置
     */
    private String scope;

    /**
     * JWKS地址，url不支持#符号&lt;br/&gt; jwksUri和jwks传一个即可
     */
    private String jwksUri;

    /**
     * JWKS
     */
    private String jwks;

    /**
     * 应用联系信息
     */
    private String contacts;

    /**
     * 应用扩展信息
     */
    private String extension;

    /**
     * 访问令牌有效期，值的范围为 600 秒到 6x3600&#x3D;21,600 秒，即10分钟-6小时
     */
    private Integer accessTokenValiditySeconds;

    /**
     * 刷新令牌有效期，值的范围为 30x24x3600&#x3D;2,592,000 秒到 365x24x3600&#x3D;31,536,000 秒，即30天-365天&lt;br/&gt;&lt;br/&gt; 注：当 GrantTypes 包含 refresh_token 时，refreshTokenValiditySeconds 为必传参数
     */
    private Integer refreshTokenValiditySeconds;

    /**
     * 是否为多租户应用&lt;br/&gt; &quot;false&quot;：该应用仅支持当前创建应用的租户访问，其他京东云租户无法访问&lt;br/&gt;        &quot;true&quot;：该应用支持其他京东云租户访问，但当前创建应用的租户不能访问
     */
    private Boolean multiTenant;

    /**
     * 应用的密码，支持8-255位长度的ASCII可打印字符，建议使用足够复杂的密码策略&lt;br/&gt;&lt;br/&gt; 注：当TokenEndpointAuthMethod不等于none时，secret为必传参数；反之，当指定了secret时，TokenEndpointAuthMethod不能等于none&lt;br/&gt; 京东云将不可逆加密secret，因此您无法再次从京东云查看该密码，但您可以随时通过更新应用重新设置secret
     */
    private String secret;

    /**
     * 能访问应用的账号类型，支持以下值：&lt;br/&gt; （1）root：支持主账号访问，子用户无法访问&lt;br/&gt; （2）sub：子用户账号，使用主账号不能访问&lt;br/&gt;&lt;br/&gt; 注：multiTenant和userType的组合指定了应用的用户人群，典型的应用场景如：&lt;br/&gt; （1）应用向当前租户下的子用户开放（2）应用向京东云其他租户主账号开放
     */
    private String userType;

    /**
     * 地域编码，参考OpenAPI公共说明
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 应用ID，应用创建时由京东云分配的16位数字ID
     * Required:true
     */
    @Required
    private String clientId;


    /**
     * get 应用名
     *
     * @return
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * set 应用名
     *
     * @param clientName
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * get 客户端认证方式：&lt;br/&gt; none：不设置客户端密码（不推荐）&lt;br/&gt; client_secret_post：客户端必须设置密码，且该密码需要在OAuth2 Token Endpoint提供于请求的body&lt;br/&gt; client_secret_basic：客户端必须设置密码，且该密码需要在OAuth2 Token Endpoint提供于请求的header&lt;br/&gt;&lt;br/&gt; 支持以下值：&lt;br/&gt; （1）none&lt;br/&gt; （2）client_secret_post&lt;br/&gt; （3）client_secret_basic
     *
     * @return
     */
    public String getTokenEndpointAuthMethod() {
        return tokenEndpointAuthMethod;
    }

    /**
     * set 客户端认证方式：&lt;br/&gt; none：不设置客户端密码（不推荐）&lt;br/&gt; client_secret_post：客户端必须设置密码，且该密码需要在OAuth2 Token Endpoint提供于请求的body&lt;br/&gt; client_secret_basic：客户端必须设置密码，且该密码需要在OAuth2 Token Endpoint提供于请求的header&lt;br/&gt;&lt;br/&gt; 支持以下值：&lt;br/&gt; （1）none&lt;br/&gt; （2）client_secret_post&lt;br/&gt; （3）client_secret_basic
     *
     * @param tokenEndpointAuthMethod
     */
    public void setTokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
        this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    }

    /**
     * get 支持的OAuth类型：&lt;br/&gt; authorization_code：OAuth2授权码模式&lt;br/&gt; implicit：OAuth2隐式授权模式&lt;br/&gt; refresh_token：启用刷新令牌&lt;br/&gt;&lt;br/&gt; 支持以下值：&lt;br/&gt; （1）authorization_code&lt;br/&gt; （2）authorization_code,refresh_token&lt;br/&gt; （3）authorization_code,implicit&lt;br/&gt; （4）authorization_code,implicit,refresh_token&lt;br/&gt; （5）implicit&lt;br/&gt;&lt;br/&gt;        注：如果grantTypes指定了refresh_token，应用将可以使用刷新令牌；如果在创建应用时未指定，则应用不能使用刷新令牌；任何时候应用都可以调用“更新应用”接口更改grantTypes设置
     *
     * @return
     */
    public String getGrantTypes() {
        return grantTypes;
    }

    /**
     * set 支持的OAuth类型：&lt;br/&gt; authorization_code：OAuth2授权码模式&lt;br/&gt; implicit：OAuth2隐式授权模式&lt;br/&gt; refresh_token：启用刷新令牌&lt;br/&gt;&lt;br/&gt; 支持以下值：&lt;br/&gt; （1）authorization_code&lt;br/&gt; （2）authorization_code,refresh_token&lt;br/&gt; （3）authorization_code,implicit&lt;br/&gt; （4）authorization_code,implicit,refresh_token&lt;br/&gt; （5）implicit&lt;br/&gt;&lt;br/&gt;        注：如果grantTypes指定了refresh_token，应用将可以使用刷新令牌；如果在创建应用时未指定，则应用不能使用刷新令牌；任何时候应用都可以调用“更新应用”接口更改grantTypes设置
     *
     * @param grantTypes
     */
    public void setGrantTypes(String grantTypes) {
        this.grantTypes = grantTypes;
    }

    /**
     * get 回调地址，最多4个，多个url之间用逗号,分隔，每个url长度不超过1000，url不支持#符号
     *
     * @return
     */
    public String getRedirectUris() {
        return redirectUris;
    }

    /**
     * set 回调地址，最多4个，多个url之间用逗号,分隔，每个url长度不超过1000，url不支持#符号
     *
     * @param redirectUris
     */
    public void setRedirectUris(String redirectUris) {
        this.redirectUris = redirectUris;
    }

    /**
     * get 应用介绍地址，url不支持#符号
     *
     * @return
     */
    public String getClientUri() {
        return clientUri;
    }

    /**
     * set 应用介绍地址，url不支持#符号
     *
     * @param clientUri
     */
    public void setClientUri(String clientUri) {
        this.clientUri = clientUri;
    }

    /**
     * get 应用logo地址，url不支持#符号
     *
     * @return
     */
    public String getLogoUri() {
        return logoUri;
    }

    /**
     * set 应用logo地址，url不支持#符号
     *
     * @param logoUri
     */
    public void setLogoUri(String logoUri) {
        this.logoUri = logoUri;
    }

    /**
     * get 应用服务协议地址，url不支持#符号
     *
     * @return
     */
    public String getTosUri() {
        return tosUri;
    }

    /**
     * set 应用服务协议地址，url不支持#符号
     *
     * @param tosUri
     */
    public void setTosUri(String tosUri) {
        this.tosUri = tosUri;
    }

    /**
     * get 应用隐私政策地址，url不支持#符号
     *
     * @return
     */
    public String getPolicyUri() {
        return policyUri;
    }

    /**
     * set 应用隐私政策地址，url不支持#符号
     *
     * @param policyUri
     */
    public void setPolicyUri(String policyUri) {
        this.policyUri = policyUri;
    }

    /**
     * get OAuth scope范围，支持的值为：&lt;br/&gt; （1）openid：用OpenID Connect协议进行身份认证&lt;br/&gt; 指定scope为openid，并在Authorization Endpoint请求该scope，京东云将返回用户的OpenID令牌；如果在创建应用时未指明该值，则应用不能请求OpenID令牌；任何时候应用都可以调用“更新应用”更改该设置
     *
     * @return
     */
    public String getScope() {
        return scope;
    }

    /**
     * set OAuth scope范围，支持的值为：&lt;br/&gt; （1）openid：用OpenID Connect协议进行身份认证&lt;br/&gt; 指定scope为openid，并在Authorization Endpoint请求该scope，京东云将返回用户的OpenID令牌；如果在创建应用时未指明该值，则应用不能请求OpenID令牌；任何时候应用都可以调用“更新应用”更改该设置
     *
     * @param scope
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * get JWKS地址，url不支持#符号&lt;br/&gt; jwksUri和jwks传一个即可
     *
     * @return
     */
    public String getJwksUri() {
        return jwksUri;
    }

    /**
     * set JWKS地址，url不支持#符号&lt;br/&gt; jwksUri和jwks传一个即可
     *
     * @param jwksUri
     */
    public void setJwksUri(String jwksUri) {
        this.jwksUri = jwksUri;
    }

    /**
     * get JWKS
     *
     * @return
     */
    public String getJwks() {
        return jwks;
    }

    /**
     * set JWKS
     *
     * @param jwks
     */
    public void setJwks(String jwks) {
        this.jwks = jwks;
    }

    /**
     * get 应用联系信息
     *
     * @return
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * set 应用联系信息
     *
     * @param contacts
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * get 应用扩展信息
     *
     * @return
     */
    public String getExtension() {
        return extension;
    }

    /**
     * set 应用扩展信息
     *
     * @param extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * get 访问令牌有效期，值的范围为 600 秒到 6x3600&#x3D;21,600 秒，即10分钟-6小时
     *
     * @return
     */
    public Integer getAccessTokenValiditySeconds() {
        return accessTokenValiditySeconds;
    }

    /**
     * set 访问令牌有效期，值的范围为 600 秒到 6x3600&#x3D;21,600 秒，即10分钟-6小时
     *
     * @param accessTokenValiditySeconds
     */
    public void setAccessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    }

    /**
     * get 刷新令牌有效期，值的范围为 30x24x3600&#x3D;2,592,000 秒到 365x24x3600&#x3D;31,536,000 秒，即30天-365天&lt;br/&gt;&lt;br/&gt; 注：当 GrantTypes 包含 refresh_token 时，refreshTokenValiditySeconds 为必传参数
     *
     * @return
     */
    public Integer getRefreshTokenValiditySeconds() {
        return refreshTokenValiditySeconds;
    }

    /**
     * set 刷新令牌有效期，值的范围为 30x24x3600&#x3D;2,592,000 秒到 365x24x3600&#x3D;31,536,000 秒，即30天-365天&lt;br/&gt;&lt;br/&gt; 注：当 GrantTypes 包含 refresh_token 时，refreshTokenValiditySeconds 为必传参数
     *
     * @param refreshTokenValiditySeconds
     */
    public void setRefreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    }

    /**
     * get 是否为多租户应用&lt;br/&gt; &quot;false&quot;：该应用仅支持当前创建应用的租户访问，其他京东云租户无法访问&lt;br/&gt;        &quot;true&quot;：该应用支持其他京东云租户访问，但当前创建应用的租户不能访问
     *
     * @return
     */
    public Boolean getMultiTenant() {
        return multiTenant;
    }

    /**
     * set 是否为多租户应用&lt;br/&gt; &quot;false&quot;：该应用仅支持当前创建应用的租户访问，其他京东云租户无法访问&lt;br/&gt;        &quot;true&quot;：该应用支持其他京东云租户访问，但当前创建应用的租户不能访问
     *
     * @param multiTenant
     */
    public void setMultiTenant(Boolean multiTenant) {
        this.multiTenant = multiTenant;
    }

    /**
     * get 应用的密码，支持8-255位长度的ASCII可打印字符，建议使用足够复杂的密码策略&lt;br/&gt;&lt;br/&gt; 注：当TokenEndpointAuthMethod不等于none时，secret为必传参数；反之，当指定了secret时，TokenEndpointAuthMethod不能等于none&lt;br/&gt; 京东云将不可逆加密secret，因此您无法再次从京东云查看该密码，但您可以随时通过更新应用重新设置secret
     *
     * @return
     */
    public String getSecret() {
        return secret;
    }

    /**
     * set 应用的密码，支持8-255位长度的ASCII可打印字符，建议使用足够复杂的密码策略&lt;br/&gt;&lt;br/&gt; 注：当TokenEndpointAuthMethod不等于none时，secret为必传参数；反之，当指定了secret时，TokenEndpointAuthMethod不能等于none&lt;br/&gt; 京东云将不可逆加密secret，因此您无法再次从京东云查看该密码，但您可以随时通过更新应用重新设置secret
     *
     * @param secret
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * get 能访问应用的账号类型，支持以下值：&lt;br/&gt; （1）root：支持主账号访问，子用户无法访问&lt;br/&gt; （2）sub：子用户账号，使用主账号不能访问&lt;br/&gt;&lt;br/&gt; 注：multiTenant和userType的组合指定了应用的用户人群，典型的应用场景如：&lt;br/&gt; （1）应用向当前租户下的子用户开放（2）应用向京东云其他租户主账号开放
     *
     * @return
     */
    public String getUserType() {
        return userType;
    }

    /**
     * set 能访问应用的账号类型，支持以下值：&lt;br/&gt; （1）root：支持主账号访问，子用户无法访问&lt;br/&gt; （2）sub：子用户账号，使用主账号不能访问&lt;br/&gt;&lt;br/&gt; 注：multiTenant和userType的组合指定了应用的用户人群，典型的应用场景如：&lt;br/&gt; （1）应用向当前租户下的子用户开放（2）应用向京东云其他租户主账号开放
     *
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * get 地域编码，参考OpenAPI公共说明
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域编码，参考OpenAPI公共说明
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 应用ID，应用创建时由京东云分配的16位数字ID
     *
     * @return
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * set 应用ID，应用创建时由京东云分配的16位数字ID
     *
     * @param clientId
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }


    /**
     * set 应用名
     *
     * @param clientName
     */
    public UpdateAppRequest clientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * set 客户端认证方式：&lt;br/&gt; none：不设置客户端密码（不推荐）&lt;br/&gt; client_secret_post：客户端必须设置密码，且该密码需要在OAuth2 Token Endpoint提供于请求的body&lt;br/&gt; client_secret_basic：客户端必须设置密码，且该密码需要在OAuth2 Token Endpoint提供于请求的header&lt;br/&gt;&lt;br/&gt; 支持以下值：&lt;br/&gt; （1）none&lt;br/&gt; （2）client_secret_post&lt;br/&gt; （3）client_secret_basic
     *
     * @param tokenEndpointAuthMethod
     */
    public UpdateAppRequest tokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
        this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
        return this;
    }

    /**
     * set 支持的OAuth类型：&lt;br/&gt; authorization_code：OAuth2授权码模式&lt;br/&gt; implicit：OAuth2隐式授权模式&lt;br/&gt; refresh_token：启用刷新令牌&lt;br/&gt;&lt;br/&gt; 支持以下值：&lt;br/&gt; （1）authorization_code&lt;br/&gt; （2）authorization_code,refresh_token&lt;br/&gt; （3）authorization_code,implicit&lt;br/&gt; （4）authorization_code,implicit,refresh_token&lt;br/&gt; （5）implicit&lt;br/&gt;&lt;br/&gt;        注：如果grantTypes指定了refresh_token，应用将可以使用刷新令牌；如果在创建应用时未指定，则应用不能使用刷新令牌；任何时候应用都可以调用“更新应用”接口更改grantTypes设置
     *
     * @param grantTypes
     */
    public UpdateAppRequest grantTypes(String grantTypes) {
        this.grantTypes = grantTypes;
        return this;
    }

    /**
     * set 回调地址，最多4个，多个url之间用逗号,分隔，每个url长度不超过1000，url不支持#符号
     *
     * @param redirectUris
     */
    public UpdateAppRequest redirectUris(String redirectUris) {
        this.redirectUris = redirectUris;
        return this;
    }

    /**
     * set 应用介绍地址，url不支持#符号
     *
     * @param clientUri
     */
    public UpdateAppRequest clientUri(String clientUri) {
        this.clientUri = clientUri;
        return this;
    }

    /**
     * set 应用logo地址，url不支持#符号
     *
     * @param logoUri
     */
    public UpdateAppRequest logoUri(String logoUri) {
        this.logoUri = logoUri;
        return this;
    }

    /**
     * set 应用服务协议地址，url不支持#符号
     *
     * @param tosUri
     */
    public UpdateAppRequest tosUri(String tosUri) {
        this.tosUri = tosUri;
        return this;
    }

    /**
     * set 应用隐私政策地址，url不支持#符号
     *
     * @param policyUri
     */
    public UpdateAppRequest policyUri(String policyUri) {
        this.policyUri = policyUri;
        return this;
    }

    /**
     * set OAuth scope范围，支持的值为：&lt;br/&gt; （1）openid：用OpenID Connect协议进行身份认证&lt;br/&gt; 指定scope为openid，并在Authorization Endpoint请求该scope，京东云将返回用户的OpenID令牌；如果在创建应用时未指明该值，则应用不能请求OpenID令牌；任何时候应用都可以调用“更新应用”更改该设置
     *
     * @param scope
     */
    public UpdateAppRequest scope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * set JWKS地址，url不支持#符号&lt;br/&gt; jwksUri和jwks传一个即可
     *
     * @param jwksUri
     */
    public UpdateAppRequest jwksUri(String jwksUri) {
        this.jwksUri = jwksUri;
        return this;
    }

    /**
     * set JWKS
     *
     * @param jwks
     */
    public UpdateAppRequest jwks(String jwks) {
        this.jwks = jwks;
        return this;
    }

    /**
     * set 应用联系信息
     *
     * @param contacts
     */
    public UpdateAppRequest contacts(String contacts) {
        this.contacts = contacts;
        return this;
    }

    /**
     * set 应用扩展信息
     *
     * @param extension
     */
    public UpdateAppRequest extension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * set 访问令牌有效期，值的范围为 600 秒到 6x3600&#x3D;21,600 秒，即10分钟-6小时
     *
     * @param accessTokenValiditySeconds
     */
    public UpdateAppRequest accessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
        return this;
    }

    /**
     * set 刷新令牌有效期，值的范围为 30x24x3600&#x3D;2,592,000 秒到 365x24x3600&#x3D;31,536,000 秒，即30天-365天&lt;br/&gt;&lt;br/&gt; 注：当 GrantTypes 包含 refresh_token 时，refreshTokenValiditySeconds 为必传参数
     *
     * @param refreshTokenValiditySeconds
     */
    public UpdateAppRequest refreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
        return this;
    }

    /**
     * set 是否为多租户应用&lt;br/&gt; &quot;false&quot;：该应用仅支持当前创建应用的租户访问，其他京东云租户无法访问&lt;br/&gt;        &quot;true&quot;：该应用支持其他京东云租户访问，但当前创建应用的租户不能访问
     *
     * @param multiTenant
     */
    public UpdateAppRequest multiTenant(Boolean multiTenant) {
        this.multiTenant = multiTenant;
        return this;
    }

    /**
     * set 应用的密码，支持8-255位长度的ASCII可打印字符，建议使用足够复杂的密码策略&lt;br/&gt;&lt;br/&gt; 注：当TokenEndpointAuthMethod不等于none时，secret为必传参数；反之，当指定了secret时，TokenEndpointAuthMethod不能等于none&lt;br/&gt; 京东云将不可逆加密secret，因此您无法再次从京东云查看该密码，但您可以随时通过更新应用重新设置secret
     *
     * @param secret
     */
    public UpdateAppRequest secret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * set 能访问应用的账号类型，支持以下值：&lt;br/&gt; （1）root：支持主账号访问，子用户无法访问&lt;br/&gt; （2）sub：子用户账号，使用主账号不能访问&lt;br/&gt;&lt;br/&gt; 注：multiTenant和userType的组合指定了应用的用户人群，典型的应用场景如：&lt;br/&gt; （1）应用向当前租户下的子用户开放（2）应用向京东云其他租户主账号开放
     *
     * @param userType
     */
    public UpdateAppRequest userType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * set 地域编码，参考OpenAPI公共说明
     *
     * @param regionId
     */
    public UpdateAppRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 应用ID，应用创建时由京东云分配的16位数字ID
     *
     * @param clientId
     */
    public UpdateAppRequest clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }


}