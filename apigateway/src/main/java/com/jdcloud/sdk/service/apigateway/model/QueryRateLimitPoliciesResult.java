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
 * 流控策略
 * 关于流控策略配置和查看的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.apigateway.model.RateLimitPolicy;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询流控策略列表
 */
public class QueryRateLimitPoliciesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * rateLimitPolicys
     */
    private List<RateLimitPolicy> rateLimitPolicys;

    /**
     * 查询的流控策略数目
     */
    private Integer totalCount;


    /**
     * get rateLimitPolicys
     *
     * @return
     */
    public List<RateLimitPolicy> getRateLimitPolicys() {
        return rateLimitPolicys;
    }

    /**
     * set rateLimitPolicys
     *
     * @param rateLimitPolicys
     */
    public void setRateLimitPolicys(List<RateLimitPolicy> rateLimitPolicys) {
        this.rateLimitPolicys = rateLimitPolicys;
    }

    /**
     * get 查询的流控策略数目
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 查询的流控策略数目
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set rateLimitPolicys
     *
     * @param rateLimitPolicys
     */
    public QueryRateLimitPoliciesResult rateLimitPolicys(List<RateLimitPolicy> rateLimitPolicys) {
        this.rateLimitPolicys = rateLimitPolicys;
        return this;
    }

    /**
     * set 查询的流控策略数目
     *
     * @param totalCount
     */
    public QueryRateLimitPoliciesResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to rateLimitPolicys
     *
     * @param rateLimitPolicy
     */
    public void addRateLimitPolicy(RateLimitPolicy rateLimitPolicy) {
        if (this.rateLimitPolicys == null) {
            this.rateLimitPolicys = new ArrayList<>();
        }
        this.rateLimitPolicys.add(rateLimitPolicy);
    }

}