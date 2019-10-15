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

package com.jdcloud.sdk.service.iothub.model;


/**
 * deviceVO
 */
public class DeviceVO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备ID
     */
    private String deviceId;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 父级设备Id
     */
    private String parentId;

    /**
     * 设备类型，同产品类型，0-普通设备，1-网关，2-Edge
     */
    private String deviceType;

    /**
     * 设备状态，0-未激活，1-激活离线，2-激活在线
     */
    private Integer status;

    /**
     * 产品Key
     */
    private String productKey;

    /**
     * 设备标识符
     */
    private String identifier;

    /**
     * 设备秘钥
     */
    private String secret;

    /**
     * 设备描述
     */
    private String description;

    /**
     * 激活时间
     */
    private Long activatedTime;

    /**
     * 最后连接时间
     */
    private Long lastConnectedTime;

    /**
     * 注册时间
     */
    private Long createdTime;

    /**
     * 修改时间
     */
    private Long updatedTime;

    /**
     * 产品秘钥
     */
    private String productSecret;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 设备型号
     */
    private String model;

    /**
     * 设备厂商
     */
    private String manufacturer;

    /**
     * 是否开启动态注册,0:关闭,1:开启，开启动态注册的设备认证类型为一型一密，否则为一机一密
     */
    private Integer dynamicRegister;


    /**
     * get 设备ID
     *
     * @return
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * set 设备ID
     *
     * @param deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * get 设备名称
     *
     * @return
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * set 设备名称
     *
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * get 父级设备Id
     *
     * @return
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * set 父级设备Id
     *
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * get 设备类型，同产品类型，0-普通设备，1-网关，2-Edge
     *
     * @return
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * set 设备类型，同产品类型，0-普通设备，1-网关，2-Edge
     *
     * @param deviceType
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * get 设备状态，0-未激活，1-激活离线，2-激活在线
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 设备状态，0-未激活，1-激活离线，2-激活在线
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 产品Key
     *
     * @return
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * set 产品Key
     *
     * @param productKey
     */
    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    /**
     * get 设备标识符
     *
     * @return
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * set 设备标识符
     *
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * get 设备秘钥
     *
     * @return
     */
    public String getSecret() {
        return secret;
    }

    /**
     * set 设备秘钥
     *
     * @param secret
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * get 设备描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 设备描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 激活时间
     *
     * @return
     */
    public Long getActivatedTime() {
        return activatedTime;
    }

    /**
     * set 激活时间
     *
     * @param activatedTime
     */
    public void setActivatedTime(Long activatedTime) {
        this.activatedTime = activatedTime;
    }

    /**
     * get 最后连接时间
     *
     * @return
     */
    public Long getLastConnectedTime() {
        return lastConnectedTime;
    }

    /**
     * set 最后连接时间
     *
     * @param lastConnectedTime
     */
    public void setLastConnectedTime(Long lastConnectedTime) {
        this.lastConnectedTime = lastConnectedTime;
    }

    /**
     * get 注册时间
     *
     * @return
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    /**
     * set 注册时间
     *
     * @param createdTime
     */
    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * get 修改时间
     *
     * @return
     */
    public Long getUpdatedTime() {
        return updatedTime;
    }

    /**
     * set 修改时间
     *
     * @param updatedTime
     */
    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * get 产品秘钥
     *
     * @return
     */
    public String getProductSecret() {
        return productSecret;
    }

    /**
     * set 产品秘钥
     *
     * @param productSecret
     */
    public void setProductSecret(String productSecret) {
        this.productSecret = productSecret;
    }

    /**
     * get 产品名称
     *
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     * set 产品名称
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * get 设备型号
     *
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     * set 设备型号
     *
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * get 设备厂商
     *
     * @return
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * set 设备厂商
     *
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * get 是否开启动态注册,0:关闭,1:开启，开启动态注册的设备认证类型为一型一密，否则为一机一密
     *
     * @return
     */
    public Integer getDynamicRegister() {
        return dynamicRegister;
    }

    /**
     * set 是否开启动态注册,0:关闭,1:开启，开启动态注册的设备认证类型为一型一密，否则为一机一密
     *
     * @param dynamicRegister
     */
    public void setDynamicRegister(Integer dynamicRegister) {
        this.dynamicRegister = dynamicRegister;
    }


    /**
     * set 设备ID
     *
     * @param deviceId
     */
    public DeviceVO deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * set 设备名称
     *
     * @param deviceName
     */
    public DeviceVO deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * set 父级设备Id
     *
     * @param parentId
     */
    public DeviceVO parentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * set 设备类型，同产品类型，0-普通设备，1-网关，2-Edge
     *
     * @param deviceType
     */
    public DeviceVO deviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * set 设备状态，0-未激活，1-激活离线，2-激活在线
     *
     * @param status
     */
    public DeviceVO status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 产品Key
     *
     * @param productKey
     */
    public DeviceVO productKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * set 设备标识符
     *
     * @param identifier
     */
    public DeviceVO identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * set 设备秘钥
     *
     * @param secret
     */
    public DeviceVO secret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * set 设备描述
     *
     * @param description
     */
    public DeviceVO description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 激活时间
     *
     * @param activatedTime
     */
    public DeviceVO activatedTime(Long activatedTime) {
        this.activatedTime = activatedTime;
        return this;
    }

    /**
     * set 最后连接时间
     *
     * @param lastConnectedTime
     */
    public DeviceVO lastConnectedTime(Long lastConnectedTime) {
        this.lastConnectedTime = lastConnectedTime;
        return this;
    }

    /**
     * set 注册时间
     *
     * @param createdTime
     */
    public DeviceVO createdTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updatedTime
     */
    public DeviceVO updatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * set 产品秘钥
     *
     * @param productSecret
     */
    public DeviceVO productSecret(String productSecret) {
        this.productSecret = productSecret;
        return this;
    }

    /**
     * set 产品名称
     *
     * @param productName
     */
    public DeviceVO productName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * set 设备型号
     *
     * @param model
     */
    public DeviceVO model(String model) {
        this.model = model;
        return this;
    }

    /**
     * set 设备厂商
     *
     * @param manufacturer
     */
    public DeviceVO manufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * set 是否开启动态注册,0:关闭,1:开启，开启动态注册的设备认证类型为一型一密，否则为一机一密
     *
     * @param dynamicRegister
     */
    public DeviceVO dynamicRegister(Integer dynamicRegister) {
        this.dynamicRegister = dynamicRegister;
        return this;
    }


}