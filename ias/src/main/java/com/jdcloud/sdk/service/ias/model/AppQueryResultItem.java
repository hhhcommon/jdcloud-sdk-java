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

package com.jdcloud.sdk.service.ias.model;


/**
 * appQueryResultItem
 */
public class AppQueryResultItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用
     */
    private String clientId;

    /**
     * 应用名
     */
    private String clientName;

    /**
     * tokenEndpointAuthMethod
     */
    private String tokenEndpointAuthMethod;

    /**
     * grantTypes
     */
    private String grantTypes;

    /**
     * responseTypes
     */
    private String responseTypes;

    /**
     * redirectUris
     */
    private String redirectUris;

    /**
     * clientUri
     */
    private String clientUri;

    /**
     * logoUri
     */
    private String logoUri;

    /**
     * tosUri
     */
    private String tosUri;

    /**
     * policyUri
     */
    private String policyUri;

    /**
     * scope
     */
    private String scope;

    /**
     * jwksUri
     */
    private String jwksUri;

    /**
     * jwks
     */
    private String jwks;

    /**
     * contacts
     */
    private String contacts;

    /**
     * extension
     */
    private String extension;

    /**
     * accessTokenValiditySeconds
     */
    private Integer accessTokenValiditySeconds;

    /**
     * refreshTokenValiditySeconds
     */
    private Integer refreshTokenValiditySeconds;

    /**
     * multiTenant
     */
    private Boolean multiTenant;

    /**
     * secretUpdateTime
     */
    private Long secretUpdateTime;

    /**
     * updateTime
     */
    private Long updateTime;

    /**
     * createTime
     */
    private Long createTime;

    /**
     * account
     */
    private String account;

    /**
     * userType
     */
    private String userType;

    /**
     * state
     */
    private String state;


    /**
     * get 应用
     *
     * @return
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * set 应用
     *
     * @param clientId
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

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
     * get tokenEndpointAuthMethod
     *
     * @return
     */
    public String getTokenEndpointAuthMethod() {
        return tokenEndpointAuthMethod;
    }

    /**
     * set tokenEndpointAuthMethod
     *
     * @param tokenEndpointAuthMethod
     */
    public void setTokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
        this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    }

    /**
     * get grantTypes
     *
     * @return
     */
    public String getGrantTypes() {
        return grantTypes;
    }

    /**
     * set grantTypes
     *
     * @param grantTypes
     */
    public void setGrantTypes(String grantTypes) {
        this.grantTypes = grantTypes;
    }

    /**
     * get responseTypes
     *
     * @return
     */
    public String getResponseTypes() {
        return responseTypes;
    }

    /**
     * set responseTypes
     *
     * @param responseTypes
     */
    public void setResponseTypes(String responseTypes) {
        this.responseTypes = responseTypes;
    }

    /**
     * get redirectUris
     *
     * @return
     */
    public String getRedirectUris() {
        return redirectUris;
    }

    /**
     * set redirectUris
     *
     * @param redirectUris
     */
    public void setRedirectUris(String redirectUris) {
        this.redirectUris = redirectUris;
    }

    /**
     * get clientUri
     *
     * @return
     */
    public String getClientUri() {
        return clientUri;
    }

    /**
     * set clientUri
     *
     * @param clientUri
     */
    public void setClientUri(String clientUri) {
        this.clientUri = clientUri;
    }

    /**
     * get logoUri
     *
     * @return
     */
    public String getLogoUri() {
        return logoUri;
    }

    /**
     * set logoUri
     *
     * @param logoUri
     */
    public void setLogoUri(String logoUri) {
        this.logoUri = logoUri;
    }

    /**
     * get tosUri
     *
     * @return
     */
    public String getTosUri() {
        return tosUri;
    }

    /**
     * set tosUri
     *
     * @param tosUri
     */
    public void setTosUri(String tosUri) {
        this.tosUri = tosUri;
    }

    /**
     * get policyUri
     *
     * @return
     */
    public String getPolicyUri() {
        return policyUri;
    }

    /**
     * set policyUri
     *
     * @param policyUri
     */
    public void setPolicyUri(String policyUri) {
        this.policyUri = policyUri;
    }

    /**
     * get scope
     *
     * @return
     */
    public String getScope() {
        return scope;
    }

    /**
     * set scope
     *
     * @param scope
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * get jwksUri
     *
     * @return
     */
    public String getJwksUri() {
        return jwksUri;
    }

    /**
     * set jwksUri
     *
     * @param jwksUri
     */
    public void setJwksUri(String jwksUri) {
        this.jwksUri = jwksUri;
    }

    /**
     * get jwks
     *
     * @return
     */
    public String getJwks() {
        return jwks;
    }

    /**
     * set jwks
     *
     * @param jwks
     */
    public void setJwks(String jwks) {
        this.jwks = jwks;
    }

    /**
     * get contacts
     *
     * @return
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * set contacts
     *
     * @param contacts
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * get extension
     *
     * @return
     */
    public String getExtension() {
        return extension;
    }

    /**
     * set extension
     *
     * @param extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * get accessTokenValiditySeconds
     *
     * @return
     */
    public Integer getAccessTokenValiditySeconds() {
        return accessTokenValiditySeconds;
    }

    /**
     * set accessTokenValiditySeconds
     *
     * @param accessTokenValiditySeconds
     */
    public void setAccessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    }

    /**
     * get refreshTokenValiditySeconds
     *
     * @return
     */
    public Integer getRefreshTokenValiditySeconds() {
        return refreshTokenValiditySeconds;
    }

    /**
     * set refreshTokenValiditySeconds
     *
     * @param refreshTokenValiditySeconds
     */
    public void setRefreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    }

    /**
     * get multiTenant
     *
     * @return
     */
    public Boolean getMultiTenant() {
        return multiTenant;
    }

    /**
     * set multiTenant
     *
     * @param multiTenant
     */
    public void setMultiTenant(Boolean multiTenant) {
        this.multiTenant = multiTenant;
    }

    /**
     * get secretUpdateTime
     *
     * @return
     */
    public Long getSecretUpdateTime() {
        return secretUpdateTime;
    }

    /**
     * set secretUpdateTime
     *
     * @param secretUpdateTime
     */
    public void setSecretUpdateTime(Long secretUpdateTime) {
        this.secretUpdateTime = secretUpdateTime;
    }

    /**
     * get updateTime
     *
     * @return
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get createTime
     *
     * @return
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * get account
     *
     * @return
     */
    public String getAccount() {
        return account;
    }

    /**
     * set account
     *
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * get userType
     *
     * @return
     */
    public String getUserType() {
        return userType;
    }

    /**
     * set userType
     *
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * get state
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * set state
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * set 应用
     *
     * @param clientId
     */
    public AppQueryResultItem clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * set 应用名
     *
     * @param clientName
     */
    public AppQueryResultItem clientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * set tokenEndpointAuthMethod
     *
     * @param tokenEndpointAuthMethod
     */
    public AppQueryResultItem tokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
        this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
        return this;
    }

    /**
     * set grantTypes
     *
     * @param grantTypes
     */
    public AppQueryResultItem grantTypes(String grantTypes) {
        this.grantTypes = grantTypes;
        return this;
    }

    /**
     * set responseTypes
     *
     * @param responseTypes
     */
    public AppQueryResultItem responseTypes(String responseTypes) {
        this.responseTypes = responseTypes;
        return this;
    }

    /**
     * set redirectUris
     *
     * @param redirectUris
     */
    public AppQueryResultItem redirectUris(String redirectUris) {
        this.redirectUris = redirectUris;
        return this;
    }

    /**
     * set clientUri
     *
     * @param clientUri
     */
    public AppQueryResultItem clientUri(String clientUri) {
        this.clientUri = clientUri;
        return this;
    }

    /**
     * set logoUri
     *
     * @param logoUri
     */
    public AppQueryResultItem logoUri(String logoUri) {
        this.logoUri = logoUri;
        return this;
    }

    /**
     * set tosUri
     *
     * @param tosUri
     */
    public AppQueryResultItem tosUri(String tosUri) {
        this.tosUri = tosUri;
        return this;
    }

    /**
     * set policyUri
     *
     * @param policyUri
     */
    public AppQueryResultItem policyUri(String policyUri) {
        this.policyUri = policyUri;
        return this;
    }

    /**
     * set scope
     *
     * @param scope
     */
    public AppQueryResultItem scope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * set jwksUri
     *
     * @param jwksUri
     */
    public AppQueryResultItem jwksUri(String jwksUri) {
        this.jwksUri = jwksUri;
        return this;
    }

    /**
     * set jwks
     *
     * @param jwks
     */
    public AppQueryResultItem jwks(String jwks) {
        this.jwks = jwks;
        return this;
    }

    /**
     * set contacts
     *
     * @param contacts
     */
    public AppQueryResultItem contacts(String contacts) {
        this.contacts = contacts;
        return this;
    }

    /**
     * set extension
     *
     * @param extension
     */
    public AppQueryResultItem extension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * set accessTokenValiditySeconds
     *
     * @param accessTokenValiditySeconds
     */
    public AppQueryResultItem accessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
        return this;
    }

    /**
     * set refreshTokenValiditySeconds
     *
     * @param refreshTokenValiditySeconds
     */
    public AppQueryResultItem refreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
        return this;
    }

    /**
     * set multiTenant
     *
     * @param multiTenant
     */
    public AppQueryResultItem multiTenant(Boolean multiTenant) {
        this.multiTenant = multiTenant;
        return this;
    }

    /**
     * set secretUpdateTime
     *
     * @param secretUpdateTime
     */
    public AppQueryResultItem secretUpdateTime(Long secretUpdateTime) {
        this.secretUpdateTime = secretUpdateTime;
        return this;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public AppQueryResultItem updateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public AppQueryResultItem createTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set account
     *
     * @param account
     */
    public AppQueryResultItem account(String account) {
        this.account = account;
        return this;
    }

    /**
     * set userType
     *
     * @param userType
     */
    public AppQueryResultItem userType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * set state
     *
     * @param state
     */
    public AppQueryResultItem state(String state) {
        this.state = state;
        return this;
    }


}