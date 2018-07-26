/*
 * Copyright 2018-2025 JDCLOUD.COM
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
 * 媒体处理相关接口
 * 媒体处理API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * 视频截图目标文件参数
 */
public class ThumbnailTaskTarget  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 输入存放目标文件的 bucket
     * Required:true
     */
    @Required
    private String destBucket;

    /**
     * 目标截图的Key的前缀, &#39;前缀-taskID-%04d(num).(format)&#39;, 默认: sourceKey
     */
    private String destKeyPrefix;

    /**
     * 目标截图的格式 default: jpg
     */
    private String format;

    /**
     * 目标截图的宽, 如果视频实际分辨率低于目标分辨率则按照实际分辨率输出 default: 0 代表源视频高 其他[8, 4096]
     */
    private Integer widthInPixel;

    /**
     * 目标截图的高, 如果视频实际分辨率低于目标分辨率则按照实际分辨率输出 default: 0 代表源视频高 其他[8, 4096]
     */
    private Integer heightInPixel;

    /**
     * 目标截图的Key的集合 (readonly)
     */
    private List<String> keys;


    /**
     * get 输入存放目标文件的 bucket
     *
     * @return
     */
    public String getDestBucket() {
        return destBucket;
    }

    /**
     * set 输入存放目标文件的 bucket
     *
     * @param destBucket
     */
    public void setDestBucket(String destBucket) {
        this.destBucket = destBucket;
    }

    /**
     * get 目标截图的Key的前缀, &#39;前缀-taskID-%04d(num).(format)&#39;, 默认: sourceKey
     *
     * @return
     */
    public String getDestKeyPrefix() {
        return destKeyPrefix;
    }

    /**
     * set 目标截图的Key的前缀, &#39;前缀-taskID-%04d(num).(format)&#39;, 默认: sourceKey
     *
     * @param destKeyPrefix
     */
    public void setDestKeyPrefix(String destKeyPrefix) {
        this.destKeyPrefix = destKeyPrefix;
    }

    /**
     * get 目标截图的格式 default: jpg
     *
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     * set 目标截图的格式 default: jpg
     *
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * get 目标截图的宽, 如果视频实际分辨率低于目标分辨率则按照实际分辨率输出 default: 0 代表源视频高 其他[8, 4096]
     *
     * @return
     */
    public Integer getWidthInPixel() {
        return widthInPixel;
    }

    /**
     * set 目标截图的宽, 如果视频实际分辨率低于目标分辨率则按照实际分辨率输出 default: 0 代表源视频高 其他[8, 4096]
     *
     * @param widthInPixel
     */
    public void setWidthInPixel(Integer widthInPixel) {
        this.widthInPixel = widthInPixel;
    }

    /**
     * get 目标截图的高, 如果视频实际分辨率低于目标分辨率则按照实际分辨率输出 default: 0 代表源视频高 其他[8, 4096]
     *
     * @return
     */
    public Integer getHeightInPixel() {
        return heightInPixel;
    }

    /**
     * set 目标截图的高, 如果视频实际分辨率低于目标分辨率则按照实际分辨率输出 default: 0 代表源视频高 其他[8, 4096]
     *
     * @param heightInPixel
     */
    public void setHeightInPixel(Integer heightInPixel) {
        this.heightInPixel = heightInPixel;
    }

    /**
     * get 目标截图的Key的集合 (readonly)
     *
     * @return
     */
    public List<String> getKeys() {
        return keys;
    }

    /**
     * set 目标截图的Key的集合 (readonly)
     *
     * @param keys
     */
    public void setKeys(List<String> keys) {
        this.keys = keys;
    }


    /**
     * set 输入存放目标文件的 bucket
     *
     * @param destBucket
     */
    public ThumbnailTaskTarget destBucket(String destBucket) {
        this.destBucket = destBucket;
        return this;
    }

    /**
     * set 目标截图的Key的前缀, &#39;前缀-taskID-%04d(num).(format)&#39;, 默认: sourceKey
     *
     * @param destKeyPrefix
     */
    public ThumbnailTaskTarget destKeyPrefix(String destKeyPrefix) {
        this.destKeyPrefix = destKeyPrefix;
        return this;
    }

    /**
     * set 目标截图的格式 default: jpg
     *
     * @param format
     */
    public ThumbnailTaskTarget format(String format) {
        this.format = format;
        return this;
    }

    /**
     * set 目标截图的宽, 如果视频实际分辨率低于目标分辨率则按照实际分辨率输出 default: 0 代表源视频高 其他[8, 4096]
     *
     * @param widthInPixel
     */
    public ThumbnailTaskTarget widthInPixel(Integer widthInPixel) {
        this.widthInPixel = widthInPixel;
        return this;
    }

    /**
     * set 目标截图的高, 如果视频实际分辨率低于目标分辨率则按照实际分辨率输出 default: 0 代表源视频高 其他[8, 4096]
     *
     * @param heightInPixel
     */
    public ThumbnailTaskTarget heightInPixel(Integer heightInPixel) {
        this.heightInPixel = heightInPixel;
        return this;
    }

    /**
     * set 目标截图的Key的集合 (readonly)
     *
     * @param keys
     */
    public ThumbnailTaskTarget keys(List<String> keys) {
        this.keys = keys;
        return this;
    }


    /**
     * add item to 目标截图的Key的集合 (readonly)
     *
     * @param key
     */
    public void addKey(String key) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.add(key);
    }

}