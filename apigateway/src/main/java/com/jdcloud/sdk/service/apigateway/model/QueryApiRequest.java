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
 * API
 * 关于api操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询单个api
 */
public class QueryApiRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * isApiProduct - 是否API产品，精确匹配，1为是

     */
    private List<Filter> filters;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 分组ID
     * Required:true
     */
    @Required
    private String apiGroupId;

    /**
     * 版本号
     * Required:true
     */
    @Required
    private String revision;

    /**
     * 接口ID
     * Required:true
     */
    @Required
    private String apiId;


    /**
     * get isApiProduct - 是否API产品，精确匹配，1为是

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set isApiProduct - 是否API产品，精确匹配，1为是

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 分组ID
     *
     * @return
     */
    public String getApiGroupId() {
        return apiGroupId;
    }

    /**
     * set 分组ID
     *
     * @param apiGroupId
     */
    public void setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
    }

    /**
     * get 版本号
     *
     * @return
     */
    public String getRevision() {
        return revision;
    }

    /**
     * set 版本号
     *
     * @param revision
     */
    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * get 接口ID
     *
     * @return
     */
    public String getApiId() {
        return apiId;
    }

    /**
     * set 接口ID
     *
     * @param apiId
     */
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }


    /**
     * set isApiProduct - 是否API产品，精确匹配，1为是

     *
     * @param filters
     */
    public QueryApiRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public QueryApiRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 分组ID
     *
     * @param apiGroupId
     */
    public QueryApiRequest apiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }

    /**
     * set 版本号
     *
     * @param revision
     */
    public QueryApiRequest revision(String revision) {
        this.revision = revision;
        return this;
    }

    /**
     * set 接口ID
     *
     * @param apiId
     */
    public QueryApiRequest apiId(String apiId) {
        this.apiId = apiId;
        return this;
    }


    /**
     * add item to isApiProduct - 是否API产品，精确匹配，1为是

     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

}