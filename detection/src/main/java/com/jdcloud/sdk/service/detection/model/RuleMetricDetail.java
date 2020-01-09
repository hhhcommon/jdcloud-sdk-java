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

package com.jdcloud.sdk.service.detection.model;


/**
 * 详情
 */
public class RuleMetricDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 指标的计算单位，比如bit/s、%、k等
     */
    private String calculateUnit;

    /**
     * 维度标识
     */
    private String dimension;

    /**
     * 监控项唯一标识，可根据DescribeMetricsForCreateAlarm接口查询各产品线可用的监控项（创建规则时使用Metric字段）。格式：metric:downsample
     */
    private String metric;

    /**
     * 监控项名称
     */
    private String metricName;

    /**
     * 产品标识
     */
    private String product;

    /**
     * 产品线标识
     */
    private String serviceCode;


    /**
     * get 指标的计算单位，比如bit/s、%、k等
     *
     * @return
     */
    public String getCalculateUnit() {
        return calculateUnit;
    }

    /**
     * set 指标的计算单位，比如bit/s、%、k等
     *
     * @param calculateUnit
     */
    public void setCalculateUnit(String calculateUnit) {
        this.calculateUnit = calculateUnit;
    }

    /**
     * get 维度标识
     *
     * @return
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * set 维度标识
     *
     * @param dimension
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * get 监控项唯一标识，可根据DescribeMetricsForCreateAlarm接口查询各产品线可用的监控项（创建规则时使用Metric字段）。格式：metric:downsample
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set 监控项唯一标识，可根据DescribeMetricsForCreateAlarm接口查询各产品线可用的监控项（创建规则时使用Metric字段）。格式：metric:downsample
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * get 监控项名称
     *
     * @return
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * set 监控项名称
     *
     * @param metricName
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * get 产品标识
     *
     * @return
     */
    public String getProduct() {
        return product;
    }

    /**
     * set 产品标识
     *
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * get 产品线标识
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线标识
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * set 指标的计算单位，比如bit/s、%、k等
     *
     * @param calculateUnit
     */
    public RuleMetricDetail calculateUnit(String calculateUnit) {
        this.calculateUnit = calculateUnit;
        return this;
    }

    /**
     * set 维度标识
     *
     * @param dimension
     */
    public RuleMetricDetail dimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * set 监控项唯一标识，可根据DescribeMetricsForCreateAlarm接口查询各产品线可用的监控项（创建规则时使用Metric字段）。格式：metric:downsample
     *
     * @param metric
     */
    public RuleMetricDetail metric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * set 监控项名称
     *
     * @param metricName
     */
    public RuleMetricDetail metricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * set 产品标识
     *
     * @param product
     */
    public RuleMetricDetail product(String product) {
        this.product = product;
        return this;
    }

    /**
     * set 产品线标识
     *
     * @param serviceCode
     */
    public RuleMetricDetail serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


}