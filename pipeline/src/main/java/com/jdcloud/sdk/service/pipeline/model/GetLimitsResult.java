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
 * Limits
 * The api for user limits
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pipeline.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询用户限制
 */
public class GetLimitsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 流水线数量限制
     */
    private Integer numberLimit;

    /**
     * 是否可以创建
     */
    private Boolean canCreate;


    /**
     * get 流水线数量限制
     *
     * @return
     */
    public Integer getNumberLimit() {
        return numberLimit;
    }

    /**
     * set 流水线数量限制
     *
     * @param numberLimit
     */
    public void setNumberLimit(Integer numberLimit) {
        this.numberLimit = numberLimit;
    }

    /**
     * get 是否可以创建
     *
     * @return
     */
    public Boolean getCanCreate() {
        return canCreate;
    }

    /**
     * set 是否可以创建
     *
     * @param canCreate
     */
    public void setCanCreate(Boolean canCreate) {
        this.canCreate = canCreate;
    }


    /**
     * set 流水线数量限制
     *
     * @param numberLimit
     */
    public GetLimitsResult numberLimit(Integer numberLimit) {
        this.numberLimit = numberLimit;
        return this;
    }

    /**
     * set 是否可以创建
     *
     * @param canCreate
     */
    public GetLimitsResult canCreate(Boolean canCreate) {
        this.canCreate = canCreate;
        return this;
    }


}