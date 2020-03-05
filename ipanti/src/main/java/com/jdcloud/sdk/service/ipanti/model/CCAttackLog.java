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

package com.jdcloud.sdk.service.ipanti.model;


/**
 * cCAttackLog
 */
public class CCAttackLog  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * CC 攻击记录Id
     */
    private String attackId;

    /**
     * 攻击流量大小
     */
    private Double attackTraffic;

    /**
     * 是否触发黑洞, 0否 1是
     */
    private Integer blackHole;

    /**
     * 攻击开始时间
     */
    private String startTime;

    /**
     * 攻击结束时间
     */
    private String endTime;

    /**
     * 流量单位, bps、Kbps、Mbps、Gbps
     */
    private String unit;

    /**
     * 高防实例id
     */
    private String instanceId;

    /**
     * 高防实例名称
     */
    private String name;


    /**
     * get CC 攻击记录Id
     *
     * @return
     */
    public String getAttackId() {
        return attackId;
    }

    /**
     * set CC 攻击记录Id
     *
     * @param attackId
     */
    public void setAttackId(String attackId) {
        this.attackId = attackId;
    }

    /**
     * get 攻击流量大小
     *
     * @return
     */
    public Double getAttackTraffic() {
        return attackTraffic;
    }

    /**
     * set 攻击流量大小
     *
     * @param attackTraffic
     */
    public void setAttackTraffic(Double attackTraffic) {
        this.attackTraffic = attackTraffic;
    }

    /**
     * get 是否触发黑洞, 0否 1是
     *
     * @return
     */
    public Integer getBlackHole() {
        return blackHole;
    }

    /**
     * set 是否触发黑洞, 0否 1是
     *
     * @param blackHole
     */
    public void setBlackHole(Integer blackHole) {
        this.blackHole = blackHole;
    }

    /**
     * get 攻击开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 攻击开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 攻击结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 攻击结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 流量单位, bps、Kbps、Mbps、Gbps
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * set 流量单位, bps、Kbps、Mbps、Gbps
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * get 高防实例id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 高防实例id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 高防实例名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 高防实例名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * set CC 攻击记录Id
     *
     * @param attackId
     */
    public CCAttackLog attackId(String attackId) {
        this.attackId = attackId;
        return this;
    }

    /**
     * set 攻击流量大小
     *
     * @param attackTraffic
     */
    public CCAttackLog attackTraffic(Double attackTraffic) {
        this.attackTraffic = attackTraffic;
        return this;
    }

    /**
     * set 是否触发黑洞, 0否 1是
     *
     * @param blackHole
     */
    public CCAttackLog blackHole(Integer blackHole) {
        this.blackHole = blackHole;
        return this;
    }

    /**
     * set 攻击开始时间
     *
     * @param startTime
     */
    public CCAttackLog startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 攻击结束时间
     *
     * @param endTime
     */
    public CCAttackLog endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 流量单位, bps、Kbps、Mbps、Gbps
     *
     * @param unit
     */
    public CCAttackLog unit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * set 高防实例id
     *
     * @param instanceId
     */
    public CCAttackLog instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 高防实例名称
     *
     * @param name
     */
    public CCAttackLog name(String name) {
        this.name = name;
        return this;
    }


}