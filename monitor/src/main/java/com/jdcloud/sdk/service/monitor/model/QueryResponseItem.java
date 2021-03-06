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

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;

/**
 * queryResponseItem
 */
public class QueryResponseItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 如果结果集中包含多个时间序列，即它们被聚合
则会显示在所有时间序列中共同发现的标记名称列表
     */
    private List<String> aggregateTags;

    /**
     * 如果查询检索到时间序列在所请求的时间范围内的注释, 则它们将在该组中返回
每个时间序列的注释将被合并到一个集合中，并按start_time进行排序
     */
    private List<Annotation> annotations;

    /**
     * 由聚合器处理后检索的数据点
每个数据点由一个时间戳和一个值组成
     */
    private Object dps;

    /**
     * 查询将在时间范围内扫描全局注释，并在该组中返回结果
     */
    private List<Annotation> globalAnnotations;

    /**
     * metric名称
     */
    private String metric;

    /**
     * 仅当结果为单时间序列时才返回标签列表
如果是聚合则返回空
     */
    private Object tags;


    /**
     * get 如果结果集中包含多个时间序列，即它们被聚合
则会显示在所有时间序列中共同发现的标记名称列表
     *
     * @return
     */
    public List<String> getAggregateTags() {
        return aggregateTags;
    }

    /**
     * set 如果结果集中包含多个时间序列，即它们被聚合
则会显示在所有时间序列中共同发现的标记名称列表
     *
     * @param aggregateTags
     */
    public void setAggregateTags(List<String> aggregateTags) {
        this.aggregateTags = aggregateTags;
    }

    /**
     * get 如果查询检索到时间序列在所请求的时间范围内的注释, 则它们将在该组中返回
每个时间序列的注释将被合并到一个集合中，并按start_time进行排序
     *
     * @return
     */
    public List<Annotation> getAnnotations() {
        return annotations;
    }

    /**
     * set 如果查询检索到时间序列在所请求的时间范围内的注释, 则它们将在该组中返回
每个时间序列的注释将被合并到一个集合中，并按start_time进行排序
     *
     * @param annotations
     */
    public void setAnnotations(List<Annotation> annotations) {
        this.annotations = annotations;
    }

    /**
     * get 由聚合器处理后检索的数据点
每个数据点由一个时间戳和一个值组成
     *
     * @return
     */
    public Object getDps() {
        return dps;
    }

    /**
     * set 由聚合器处理后检索的数据点
每个数据点由一个时间戳和一个值组成
     *
     * @param dps
     */
    public void setDps(Object dps) {
        this.dps = dps;
    }

    /**
     * get 查询将在时间范围内扫描全局注释，并在该组中返回结果
     *
     * @return
     */
    public List<Annotation> getGlobalAnnotations() {
        return globalAnnotations;
    }

    /**
     * set 查询将在时间范围内扫描全局注释，并在该组中返回结果
     *
     * @param globalAnnotations
     */
    public void setGlobalAnnotations(List<Annotation> globalAnnotations) {
        this.globalAnnotations = globalAnnotations;
    }

    /**
     * get metric名称
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set metric名称
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * get 仅当结果为单时间序列时才返回标签列表
如果是聚合则返回空
     *
     * @return
     */
    public Object getTags() {
        return tags;
    }

    /**
     * set 仅当结果为单时间序列时才返回标签列表
如果是聚合则返回空
     *
     * @param tags
     */
    public void setTags(Object tags) {
        this.tags = tags;
    }


    /**
     * set 如果结果集中包含多个时间序列，即它们被聚合
则会显示在所有时间序列中共同发现的标记名称列表
     *
     * @param aggregateTags
     */
    public QueryResponseItem aggregateTags(List<String> aggregateTags) {
        this.aggregateTags = aggregateTags;
        return this;
    }

    /**
     * set 如果查询检索到时间序列在所请求的时间范围内的注释, 则它们将在该组中返回
每个时间序列的注释将被合并到一个集合中，并按start_time进行排序
     *
     * @param annotations
     */
    public QueryResponseItem annotations(List<Annotation> annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * set 由聚合器处理后检索的数据点
每个数据点由一个时间戳和一个值组成
     *
     * @param dps
     */
    public QueryResponseItem dps(Object dps) {
        this.dps = dps;
        return this;
    }

    /**
     * set 查询将在时间范围内扫描全局注释，并在该组中返回结果
     *
     * @param globalAnnotations
     */
    public QueryResponseItem globalAnnotations(List<Annotation> globalAnnotations) {
        this.globalAnnotations = globalAnnotations;
        return this;
    }

    /**
     * set metric名称
     *
     * @param metric
     */
    public QueryResponseItem metric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * set 仅当结果为单时间序列时才返回标签列表
如果是聚合则返回空
     *
     * @param tags
     */
    public QueryResponseItem tags(Object tags) {
        this.tags = tags;
        return this;
    }


    /**
     * add item to 如果结果集中包含多个时间序列，即它们被聚合
则会显示在所有时间序列中共同发现的标记名称列表
     *
     * @param aggregateTag
     */
    public void addAggregateTag(String aggregateTag) {
        if (this.aggregateTags == null) {
            this.aggregateTags = new ArrayList<>();
        }
        this.aggregateTags.add(aggregateTag);
    }

    /**
     * add item to 如果查询检索到时间序列在所请求的时间范围内的注释, 则它们将在该组中返回
每个时间序列的注释将被合并到一个集合中，并按start_time进行排序
     *
     * @param annotation
     */
    public void addAnnotation(Annotation annotation) {
        if (this.annotations == null) {
            this.annotations = new ArrayList<>();
        }
        this.annotations.add(annotation);
    }

    /**
     * add item to 查询将在时间范围内扫描全局注释，并在该组中返回结果
     *
     * @param globalAnnotation
     */
    public void addGlobalAnnotation(Annotation globalAnnotation) {
        if (this.globalAnnotations == null) {
            this.globalAnnotations = new ArrayList<>();
        }
        this.globalAnnotations.add(globalAnnotation);
    }

}