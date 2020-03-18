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

package com.jdcloud.sdk.service.iotedge.model;


/**
 * edgeAppList
 */
public class EdgeAppList  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * App名称
     */
    private String appName;

    /**
     * App类型 0-deviceService，1-app
     */
    private String appType;

    /**
     * App描述
     */
    private String appDesc;

    /**
     * App显示名称
     */
    private String appDisplayName;

    /**
     * APP版本号
     */
    private String appVersion;

    /**
     * 发布日期
     */
    private String releaseTime;

    /**
     * App状态
     */
    private String appStatus;

    /**
     * 发布方 0-iotcore, 1-iothub ，2-第三方
     */
    private String appSource;

    /**
     *  device serivce 的描述
     */
    private String dsDesc;


    /**
     * get App名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set App名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get App类型 0-deviceService，1-app
     *
     * @return
     */
    public String getAppType() {
        return appType;
    }

    /**
     * set App类型 0-deviceService，1-app
     *
     * @param appType
     */
    public void setAppType(String appType) {
        this.appType = appType;
    }

    /**
     * get App描述
     *
     * @return
     */
    public String getAppDesc() {
        return appDesc;
    }

    /**
     * set App描述
     *
     * @param appDesc
     */
    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc;
    }

    /**
     * get App显示名称
     *
     * @return
     */
    public String getAppDisplayName() {
        return appDisplayName;
    }

    /**
     * set App显示名称
     *
     * @param appDisplayName
     */
    public void setAppDisplayName(String appDisplayName) {
        this.appDisplayName = appDisplayName;
    }

    /**
     * get APP版本号
     *
     * @return
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * set APP版本号
     *
     * @param appVersion
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * get 发布日期
     *
     * @return
     */
    public String getReleaseTime() {
        return releaseTime;
    }

    /**
     * set 发布日期
     *
     * @param releaseTime
     */
    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * get App状态
     *
     * @return
     */
    public String getAppStatus() {
        return appStatus;
    }

    /**
     * set App状态
     *
     * @param appStatus
     */
    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    /**
     * get 发布方 0-iotcore, 1-iothub ，2-第三方
     *
     * @return
     */
    public String getAppSource() {
        return appSource;
    }

    /**
     * set 发布方 0-iotcore, 1-iothub ，2-第三方
     *
     * @param appSource
     */
    public void setAppSource(String appSource) {
        this.appSource = appSource;
    }

    /**
     * get  device serivce 的描述
     *
     * @return
     */
    public String getDsDesc() {
        return dsDesc;
    }

    /**
     * set  device serivce 的描述
     *
     * @param dsDesc
     */
    public void setDsDesc(String dsDesc) {
        this.dsDesc = dsDesc;
    }


    /**
     * set App名称
     *
     * @param appName
     */
    public EdgeAppList appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set App类型 0-deviceService，1-app
     *
     * @param appType
     */
    public EdgeAppList appType(String appType) {
        this.appType = appType;
        return this;
    }

    /**
     * set App描述
     *
     * @param appDesc
     */
    public EdgeAppList appDesc(String appDesc) {
        this.appDesc = appDesc;
        return this;
    }

    /**
     * set App显示名称
     *
     * @param appDisplayName
     */
    public EdgeAppList appDisplayName(String appDisplayName) {
        this.appDisplayName = appDisplayName;
        return this;
    }

    /**
     * set APP版本号
     *
     * @param appVersion
     */
    public EdgeAppList appVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * set 发布日期
     *
     * @param releaseTime
     */
    public EdgeAppList releaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }

    /**
     * set App状态
     *
     * @param appStatus
     */
    public EdgeAppList appStatus(String appStatus) {
        this.appStatus = appStatus;
        return this;
    }

    /**
     * set 发布方 0-iotcore, 1-iothub ，2-第三方
     *
     * @param appSource
     */
    public EdgeAppList appSource(String appSource) {
        this.appSource = appSource;
        return this;
    }

    /**
     * set  device serivce 的描述
     *
     * @param dsDesc
     */
    public EdgeAppList dsDesc(String dsDesc) {
        this.dsDesc = dsDesc;
        return this;
    }


}