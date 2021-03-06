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

package com.jdcloud.sdk.service.portal.model;


/**
 * linkVo
 */
public class LinkVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 链接url
     */
    private String linkUrl;

    /**
     * 埋点信息
     */
    private String clstag;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 操作者
     */
    private String operator;

    /**
     * 状态 0显示 1删除
     */
    private String status;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String modifyTime;


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
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 链接url
     *
     * @return
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /**
     * set 链接url
     *
     * @param linkUrl
     */
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    /**
     * get 埋点信息
     *
     * @return
     */
    public String getClstag() {
        return clstag;
    }

    /**
     * set 埋点信息
     *
     * @param clstag
     */
    public void setClstag(String clstag) {
        this.clstag = clstag;
    }

    /**
     * get 排序
     *
     * @return
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * set 排序
     *
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * get 操作者
     *
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     * set 操作者
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * get 状态 0显示 1删除
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 状态 0显示 1删除
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 修改时间
     *
     * @return
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * set 修改时间
     *
     * @param modifyTime
     */
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }


    /**
     * set 主键id
     *
     * @param id
     */
    public LinkVo id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public LinkVo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 链接url
     *
     * @param linkUrl
     */
    public LinkVo linkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
        return this;
    }

    /**
     * set 埋点信息
     *
     * @param clstag
     */
    public LinkVo clstag(String clstag) {
        this.clstag = clstag;
        return this;
    }

    /**
     * set 排序
     *
     * @param sort
     */
    public LinkVo sort(Integer sort) {
        this.sort = sort;
        return this;
    }

    /**
     * set 操作者
     *
     * @param operator
     */
    public LinkVo operator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * set 状态 0显示 1删除
     *
     * @param status
     */
    public LinkVo status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public LinkVo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param modifyTime
     */
    public LinkVo modifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }


}