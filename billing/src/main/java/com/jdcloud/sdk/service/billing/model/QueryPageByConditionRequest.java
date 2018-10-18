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
 * JDCLOUD BILLING ResourceOrder Services API
 * 资源单管理API接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.billing.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询资源单列表
 */
public class QueryPageByConditionRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * appCode
     */
    private String appCode;

    /**
     * 产品码列表
     */
    private List<String> serviceCodeList;

    /**
     * 地域
     */
    private String region;

    /**
     * 网络类型 0: non-BGP, 1: BGP
     */
    private Integer networkOperator;

    /**
     * 计费类型 1:按配置 2:按用量 3:包年包月
     */
    private Integer billingType;

    /**
     * resourceIdList
     */
    private List<String> resourceIdList;

    /**
     * &gt;0: 订单还有几天到期; &#x3D;&#x3D;0: 订单已经到期; &lt;0: 不管是否到期
     */
    private Integer expireInDays;

    /**
     * isOnTrial
     */
    private Integer isOnTrial;

    /**
     * 站点信息 0:中国 1:国际
     */
    private Integer site;

    /**
     * 资源状态 1:正常 2:停服 3:删除
     */
    private Integer status;

    /**
     * 计费状态 0:停止计费 1:计费中
     */
    private Integer billingStatus;

    /**
     * 1、内部计算，使用getExpiringOrderCount时使用，不用传值 默认为-1mybatis筛选时不会关注 2、selectResourceOrderForTask定时任务查询列表时使用，停服天数，必须大于0
     */
    private Integer expiringInDays;

    /**
     * billingTypeList
     */
    private List<Number> billingTypeList;

    /**
     * 交易单号列表
     */
    private List<String> transactionNos;

    /**
     * opTypes
     */
    private List<Number> opTypes;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 服务编码
     */
    private String serviceCode;

    /**
     * statusList
     */
    private List<Number> statusList;

    /**
     * excludeResources
     */
    private List<String> excludeResources;

    /**
     * orderByClaus
     */
    private String orderByClaus;

    /**
     * 专有云节点的code（节点云查询使用）
     */
    private String node;

    /**
     * 部门（节点云查询使用）
     */
    private Integer departmentId;

    /**
     * pinList
     */
    private List<String> pinList;

    /**
     * 是否是专有云 1:是  其他不是
     */
    private Integer isSpecial;

    /**
     * 节点信息
     */
    private String nodeCode;

    /**
     * 超时时间，暂时不用
     */
    private Integer timeout;

    /**
     * 当前页序号
     */
    private Integer pageIndex;

    /**
     * 每页结果数量
     */
    private Integer pageSize;

    /**
     * offset
     */
    private Integer offset;

    /**
     * regionId
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 主键id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 主键id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * get appCode
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set appCode
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * get 产品码列表
     *
     * @return
     */
    public List<String> getServiceCodeList() {
        return serviceCodeList;
    }

    /**
     * set 产品码列表
     *
     * @param serviceCodeList
     */
    public void setServiceCodeList(List<String> serviceCodeList) {
        this.serviceCodeList = serviceCodeList;
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
     * get 网络类型 0: non-BGP, 1: BGP
     *
     * @return
     */
    public Integer getNetworkOperator() {
        return networkOperator;
    }

    /**
     * set 网络类型 0: non-BGP, 1: BGP
     *
     * @param networkOperator
     */
    public void setNetworkOperator(Integer networkOperator) {
        this.networkOperator = networkOperator;
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
     * get resourceIdList
     *
     * @return
     */
    public List<String> getResourceIdList() {
        return resourceIdList;
    }

    /**
     * set resourceIdList
     *
     * @param resourceIdList
     */
    public void setResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
    }

    /**
     * get &gt;0: 订单还有几天到期; &#x3D;&#x3D;0: 订单已经到期; &lt;0: 不管是否到期
     *
     * @return
     */
    public Integer getExpireInDays() {
        return expireInDays;
    }

    /**
     * set &gt;0: 订单还有几天到期; &#x3D;&#x3D;0: 订单已经到期; &lt;0: 不管是否到期
     *
     * @param expireInDays
     */
    public void setExpireInDays(Integer expireInDays) {
        this.expireInDays = expireInDays;
    }

    /**
     * get isOnTrial
     *
     * @return
     */
    public Integer getIsOnTrial() {
        return isOnTrial;
    }

    /**
     * set isOnTrial
     *
     * @param isOnTrial
     */
    public void setIsOnTrial(Integer isOnTrial) {
        this.isOnTrial = isOnTrial;
    }

    /**
     * get 站点信息 0:中国 1:国际
     *
     * @return
     */
    public Integer getSite() {
        return site;
    }

    /**
     * set 站点信息 0:中国 1:国际
     *
     * @param site
     */
    public void setSite(Integer site) {
        this.site = site;
    }

    /**
     * get 资源状态 1:正常 2:停服 3:删除
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 资源状态 1:正常 2:停服 3:删除
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 计费状态 0:停止计费 1:计费中
     *
     * @return
     */
    public Integer getBillingStatus() {
        return billingStatus;
    }

    /**
     * set 计费状态 0:停止计费 1:计费中
     *
     * @param billingStatus
     */
    public void setBillingStatus(Integer billingStatus) {
        this.billingStatus = billingStatus;
    }

    /**
     * get 1、内部计算，使用getExpiringOrderCount时使用，不用传值 默认为-1mybatis筛选时不会关注 2、selectResourceOrderForTask定时任务查询列表时使用，停服天数，必须大于0
     *
     * @return
     */
    public Integer getExpiringInDays() {
        return expiringInDays;
    }

    /**
     * set 1、内部计算，使用getExpiringOrderCount时使用，不用传值 默认为-1mybatis筛选时不会关注 2、selectResourceOrderForTask定时任务查询列表时使用，停服天数，必须大于0
     *
     * @param expiringInDays
     */
    public void setExpiringInDays(Integer expiringInDays) {
        this.expiringInDays = expiringInDays;
    }

    /**
     * get billingTypeList
     *
     * @return
     */
    public List<Number> getBillingTypeList() {
        return billingTypeList;
    }

    /**
     * set billingTypeList
     *
     * @param billingTypeList
     */
    public void setBillingTypeList(List<Number> billingTypeList) {
        this.billingTypeList = billingTypeList;
    }

    /**
     * get 交易单号列表
     *
     * @return
     */
    public List<String> getTransactionNos() {
        return transactionNos;
    }

    /**
     * set 交易单号列表
     *
     * @param transactionNos
     */
    public void setTransactionNos(List<String> transactionNos) {
        this.transactionNos = transactionNos;
    }

    /**
     * get opTypes
     *
     * @return
     */
    public List<Number> getOpTypes() {
        return opTypes;
    }

    /**
     * set opTypes
     *
     * @param opTypes
     */
    public void setOpTypes(List<Number> opTypes) {
        this.opTypes = opTypes;
    }

    /**
     * get 开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 服务编码
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 服务编码
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get statusList
     *
     * @return
     */
    public List<Number> getStatusList() {
        return statusList;
    }

    /**
     * set statusList
     *
     * @param statusList
     */
    public void setStatusList(List<Number> statusList) {
        this.statusList = statusList;
    }

    /**
     * get excludeResources
     *
     * @return
     */
    public List<String> getExcludeResources() {
        return excludeResources;
    }

    /**
     * set excludeResources
     *
     * @param excludeResources
     */
    public void setExcludeResources(List<String> excludeResources) {
        this.excludeResources = excludeResources;
    }

    /**
     * get orderByClaus
     *
     * @return
     */
    public String getOrderByClaus() {
        return orderByClaus;
    }

    /**
     * set orderByClaus
     *
     * @param orderByClaus
     */
    public void setOrderByClaus(String orderByClaus) {
        this.orderByClaus = orderByClaus;
    }

    /**
     * get 专有云节点的code（节点云查询使用）
     *
     * @return
     */
    public String getNode() {
        return node;
    }

    /**
     * set 专有云节点的code（节点云查询使用）
     *
     * @param node
     */
    public void setNode(String node) {
        this.node = node;
    }

    /**
     * get 部门（节点云查询使用）
     *
     * @return
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * set 部门（节点云查询使用）
     *
     * @param departmentId
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * get pinList
     *
     * @return
     */
    public List<String> getPinList() {
        return pinList;
    }

    /**
     * set pinList
     *
     * @param pinList
     */
    public void setPinList(List<String> pinList) {
        this.pinList = pinList;
    }

    /**
     * get 是否是专有云 1:是  其他不是
     *
     * @return
     */
    public Integer getIsSpecial() {
        return isSpecial;
    }

    /**
     * set 是否是专有云 1:是  其他不是
     *
     * @param isSpecial
     */
    public void setIsSpecial(Integer isSpecial) {
        this.isSpecial = isSpecial;
    }

    /**
     * get 节点信息
     *
     * @return
     */
    public String getNodeCode() {
        return nodeCode;
    }

    /**
     * set 节点信息
     *
     * @param nodeCode
     */
    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }

    /**
     * get 超时时间，暂时不用
     *
     * @return
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * set 超时时间，暂时不用
     *
     * @param timeout
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * get 当前页序号
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 当前页序号
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * get 每页结果数量
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页结果数量
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get offset
     *
     * @return
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * set offset
     *
     * @param offset
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * get regionId
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 主键id
     *
     * @param id
     */
    public QueryPageByConditionRequest id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public QueryPageByConditionRequest pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public QueryPageByConditionRequest resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set appCode
     *
     * @param appCode
     */
    public QueryPageByConditionRequest appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /**
     * set 产品码列表
     *
     * @param serviceCodeList
     */
    public QueryPageByConditionRequest serviceCodeList(List<String> serviceCodeList) {
        this.serviceCodeList = serviceCodeList;
        return this;
    }

    /**
     * set 地域
     *
     * @param region
     */
    public QueryPageByConditionRequest region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 网络类型 0: non-BGP, 1: BGP
     *
     * @param networkOperator
     */
    public QueryPageByConditionRequest networkOperator(Integer networkOperator) {
        this.networkOperator = networkOperator;
        return this;
    }

    /**
     * set 计费类型 1:按配置 2:按用量 3:包年包月
     *
     * @param billingType
     */
    public QueryPageByConditionRequest billingType(Integer billingType) {
        this.billingType = billingType;
        return this;
    }

    /**
     * set resourceIdList
     *
     * @param resourceIdList
     */
    public QueryPageByConditionRequest resourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
        return this;
    }

    /**
     * set &gt;0: 订单还有几天到期; &#x3D;&#x3D;0: 订单已经到期; &lt;0: 不管是否到期
     *
     * @param expireInDays
     */
    public QueryPageByConditionRequest expireInDays(Integer expireInDays) {
        this.expireInDays = expireInDays;
        return this;
    }

    /**
     * set isOnTrial
     *
     * @param isOnTrial
     */
    public QueryPageByConditionRequest isOnTrial(Integer isOnTrial) {
        this.isOnTrial = isOnTrial;
        return this;
    }

    /**
     * set 站点信息 0:中国 1:国际
     *
     * @param site
     */
    public QueryPageByConditionRequest site(Integer site) {
        this.site = site;
        return this;
    }

    /**
     * set 资源状态 1:正常 2:停服 3:删除
     *
     * @param status
     */
    public QueryPageByConditionRequest status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 计费状态 0:停止计费 1:计费中
     *
     * @param billingStatus
     */
    public QueryPageByConditionRequest billingStatus(Integer billingStatus) {
        this.billingStatus = billingStatus;
        return this;
    }

    /**
     * set 1、内部计算，使用getExpiringOrderCount时使用，不用传值 默认为-1mybatis筛选时不会关注 2、selectResourceOrderForTask定时任务查询列表时使用，停服天数，必须大于0
     *
     * @param expiringInDays
     */
    public QueryPageByConditionRequest expiringInDays(Integer expiringInDays) {
        this.expiringInDays = expiringInDays;
        return this;
    }

    /**
     * set billingTypeList
     *
     * @param billingTypeList
     */
    public QueryPageByConditionRequest billingTypeList(List<Number> billingTypeList) {
        this.billingTypeList = billingTypeList;
        return this;
    }

    /**
     * set 交易单号列表
     *
     * @param transactionNos
     */
    public QueryPageByConditionRequest transactionNos(List<String> transactionNos) {
        this.transactionNos = transactionNos;
        return this;
    }

    /**
     * set opTypes
     *
     * @param opTypes
     */
    public QueryPageByConditionRequest opTypes(List<Number> opTypes) {
        this.opTypes = opTypes;
        return this;
    }

    /**
     * set 开始时间
     *
     * @param startTime
     */
    public QueryPageByConditionRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public QueryPageByConditionRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 服务编码
     *
     * @param serviceCode
     */
    public QueryPageByConditionRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set statusList
     *
     * @param statusList
     */
    public QueryPageByConditionRequest statusList(List<Number> statusList) {
        this.statusList = statusList;
        return this;
    }

    /**
     * set excludeResources
     *
     * @param excludeResources
     */
    public QueryPageByConditionRequest excludeResources(List<String> excludeResources) {
        this.excludeResources = excludeResources;
        return this;
    }

    /**
     * set orderByClaus
     *
     * @param orderByClaus
     */
    public QueryPageByConditionRequest orderByClaus(String orderByClaus) {
        this.orderByClaus = orderByClaus;
        return this;
    }

    /**
     * set 专有云节点的code（节点云查询使用）
     *
     * @param node
     */
    public QueryPageByConditionRequest node(String node) {
        this.node = node;
        return this;
    }

    /**
     * set 部门（节点云查询使用）
     *
     * @param departmentId
     */
    public QueryPageByConditionRequest departmentId(Integer departmentId) {
        this.departmentId = departmentId;
        return this;
    }

    /**
     * set pinList
     *
     * @param pinList
     */
    public QueryPageByConditionRequest pinList(List<String> pinList) {
        this.pinList = pinList;
        return this;
    }

    /**
     * set 是否是专有云 1:是  其他不是
     *
     * @param isSpecial
     */
    public QueryPageByConditionRequest isSpecial(Integer isSpecial) {
        this.isSpecial = isSpecial;
        return this;
    }

    /**
     * set 节点信息
     *
     * @param nodeCode
     */
    public QueryPageByConditionRequest nodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
        return this;
    }

    /**
     * set 超时时间，暂时不用
     *
     * @param timeout
     */
    public QueryPageByConditionRequest timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * set 当前页序号
     *
     * @param pageIndex
     */
    public QueryPageByConditionRequest pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * set 每页结果数量
     *
     * @param pageSize
     */
    public QueryPageByConditionRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set offset
     *
     * @param offset
     */
    public QueryPageByConditionRequest offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public QueryPageByConditionRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 产品码列表
     *
     * @param serviceCodeList
     */
    public void addServiceCodeList(String serviceCodeList) {
        if (this.serviceCodeList == null) {
            this.serviceCodeList = new ArrayList<>();
        }
        this.serviceCodeList.add(serviceCodeList);
    }

    /**
     * add item to resourceIdList
     *
     * @param resourceIdList
     */
    public void addResourceIdList(String resourceIdList) {
        if (this.resourceIdList == null) {
            this.resourceIdList = new ArrayList<>();
        }
        this.resourceIdList.add(resourceIdList);
    }

    /**
     * add item to billingTypeList
     *
     * @param billingTypeList
     */
    public void addBillingTypeList(Number billingTypeList) {
        if (this.billingTypeList == null) {
            this.billingTypeList = new ArrayList<>();
        }
        this.billingTypeList.add(billingTypeList);
    }

    /**
     * add item to 交易单号列表
     *
     * @param transactionNo
     */
    public void addTransactionNo(String transactionNo) {
        if (this.transactionNos == null) {
            this.transactionNos = new ArrayList<>();
        }
        this.transactionNos.add(transactionNo);
    }

    /**
     * add item to opTypes
     *
     * @param opType
     */
    public void addOpType(Number opType) {
        if (this.opTypes == null) {
            this.opTypes = new ArrayList<>();
        }
        this.opTypes.add(opType);
    }

    /**
     * add item to statusList
     *
     * @param statusList
     */
    public void addStatusList(Number statusList) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        this.statusList.add(statusList);
    }

    /**
     * add item to excludeResources
     *
     * @param excludeResource
     */
    public void addExcludeResource(String excludeResource) {
        if (this.excludeResources == null) {
            this.excludeResources = new ArrayList<>();
        }
        this.excludeResources.add(excludeResource);
    }

    /**
     * add item to pinList
     *
     * @param pinList
     */
    public void addPinList(String pinList) {
        if (this.pinList == null) {
            this.pinList = new ArrayList<>();
        }
        this.pinList.add(pinList);
    }

}