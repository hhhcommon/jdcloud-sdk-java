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

package com.jdcloud.sdk.service.billing.model;

import java.util.List;
import java.util.ArrayList;

/**
 * orderPriceProtocol
 */
public class OrderPriceProtocol  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 业务线
     */
    private String appCode;

    /**
     * 产品线
     */
    private String serviceCode;

    /**
     * 站点信息 0：主站  其他：专有云
     */
    private Integer site;

    /**
     * 地域
     */
    private String region;

    /**
     * 计费类型 1:按配置 2:按用量 3:包年包月
     */
    private Integer billingType;

    /**
     * 时长
     */
    private Integer timeSpan;

    /**
     * 时长类型 0:无(非包年包月) 1:小时 2:天 3:月 4:年
     */
    private Integer timeUnit;

    /**
     * 网络类型 0:non 1:非BGP  2:BGP
     */
    private Integer networkOperator;

    /**
     * 计算公式（配置细项）
     */
    private List<Formula> formula;

    /**
     * 配置细项
     */
    private String formulaStr;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 具体商品数量，默认为1
     */
    private Integer count;

    /**
     * 订单开始时间
     */
    private String startTime;

    /**
     * 自然单列表
     */
    private String taskId;

    /**
     * 交易单模块sourceId
     */
    private String sourceId;


    /**
     * get 资源id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 业务线
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set 业务线
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * get 产品线
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 站点信息 0：主站  其他：专有云
     *
     * @return
     */
    public Integer getSite() {
        return site;
    }

    /**
     * set 站点信息 0：主站  其他：专有云
     *
     * @param site
     */
    public void setSite(Integer site) {
        this.site = site;
    }

    /**
     * get 地域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 计费类型 1:按配置 2:按用量 3:包年包月
     *
     * @return
     */
    public Integer getBillingType() {
        return billingType;
    }

    /**
     * set 计费类型 1:按配置 2:按用量 3:包年包月
     *
     * @param billingType
     */
    public void setBillingType(Integer billingType) {
        this.billingType = billingType;
    }

    /**
     * get 时长
     *
     * @return
     */
    public Integer getTimeSpan() {
        return timeSpan;
    }

    /**
     * set 时长
     *
     * @param timeSpan
     */
    public void setTimeSpan(Integer timeSpan) {
        this.timeSpan = timeSpan;
    }

    /**
     * get 时长类型 0:无(非包年包月) 1:小时 2:天 3:月 4:年
     *
     * @return
     */
    public Integer getTimeUnit() {
        return timeUnit;
    }

    /**
     * set 时长类型 0:无(非包年包月) 1:小时 2:天 3:月 4:年
     *
     * @param timeUnit
     */
    public void setTimeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * get 网络类型 0:non 1:非BGP  2:BGP
     *
     * @return
     */
    public Integer getNetworkOperator() {
        return networkOperator;
    }

    /**
     * set 网络类型 0:non 1:非BGP  2:BGP
     *
     * @param networkOperator
     */
    public void setNetworkOperator(Integer networkOperator) {
        this.networkOperator = networkOperator;
    }

    /**
     * get 计算公式（配置细项）
     *
     * @return
     */
    public List<Formula> getFormula() {
        return formula;
    }

    /**
     * set 计算公式（配置细项）
     *
     * @param formula
     */
    public void setFormula(List<Formula> formula) {
        this.formula = formula;
    }

    /**
     * get 配置细项
     *
     * @return
     */
    public String getFormulaStr() {
        return formulaStr;
    }

    /**
     * set 配置细项
     *
     * @param formulaStr
     */
    public void setFormulaStr(String formulaStr) {
        this.formulaStr = formulaStr;
    }

    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 具体商品数量，默认为1
     *
     * @return
     */
    public Integer getCount() {
        return count;
    }

    /**
     * set 具体商品数量，默认为1
     *
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * get 订单开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 订单开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 自然单列表
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 自然单列表
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * get 交易单模块sourceId
     *
     * @return
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * set 交易单模块sourceId
     *
     * @param sourceId
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }


    /**
     * set 资源id
     *
     * @param resourceId
     */
    public OrderPriceProtocol resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 业务线
     *
     * @param appCode
     */
    public OrderPriceProtocol appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public OrderPriceProtocol serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 站点信息 0：主站  其他：专有云
     *
     * @param site
     */
    public OrderPriceProtocol site(Integer site) {
        this.site = site;
        return this;
    }

    /**
     * set 地域
     *
     * @param region
     */
    public OrderPriceProtocol region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 计费类型 1:按配置 2:按用量 3:包年包月
     *
     * @param billingType
     */
    public OrderPriceProtocol billingType(Integer billingType) {
        this.billingType = billingType;
        return this;
    }

    /**
     * set 时长
     *
     * @param timeSpan
     */
    public OrderPriceProtocol timeSpan(Integer timeSpan) {
        this.timeSpan = timeSpan;
        return this;
    }

    /**
     * set 时长类型 0:无(非包年包月) 1:小时 2:天 3:月 4:年
     *
     * @param timeUnit
     */
    public OrderPriceProtocol timeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * set 网络类型 0:non 1:非BGP  2:BGP
     *
     * @param networkOperator
     */
    public OrderPriceProtocol networkOperator(Integer networkOperator) {
        this.networkOperator = networkOperator;
        return this;
    }

    /**
     * set 计算公式（配置细项）
     *
     * @param formula
     */
    public OrderPriceProtocol formula(List<Formula> formula) {
        this.formula = formula;
        return this;
    }

    /**
     * set 配置细项
     *
     * @param formulaStr
     */
    public OrderPriceProtocol formulaStr(String formulaStr) {
        this.formulaStr = formulaStr;
        return this;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public OrderPriceProtocol pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 具体商品数量，默认为1
     *
     * @param count
     */
    public OrderPriceProtocol count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * set 订单开始时间
     *
     * @param startTime
     */
    public OrderPriceProtocol startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 自然单列表
     *
     * @param taskId
     */
    public OrderPriceProtocol taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * set 交易单模块sourceId
     *
     * @param sourceId
     */
    public OrderPriceProtocol sourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }


    /**
     * add item to 计算公式（配置细项）
     *
     * @param formula
     */
    public void addFormula(Formula formula) {
        if (this.formula == null) {
            this.formula = new ArrayList<>();
        }
        this.formula.add(formula);
    }

}