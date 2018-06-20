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
 * 镜像
 * 关于主机镜像操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询镜像资源信息列表
 */
public class DescribeImagesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像来源：public、shared、thirdparty、private，如果没有指定ids参数，此参数必传
     */
    private String imageSource;

    /**
     * 操作系统平台: Windows Server、CentOS、Ubuntu
     */
    private String platform;

    /**
     * 镜像ID列表，如果指定了此参数，其它参数可为空
     */
    private List<String> ids;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 镜像来源：public、shared、thirdparty、private，如果没有指定ids参数，此参数必传
     *
     * @return
     */
    public String getImageSource() {
        return imageSource;
    }

    /**
     * set 镜像来源：public、shared、thirdparty、private，如果没有指定ids参数，此参数必传
     *
     * @param imageSource
     */
    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    /**
     * get 操作系统平台: Windows Server、CentOS、Ubuntu
     *
     * @return
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * set 操作系统平台: Windows Server、CentOS、Ubuntu
     *
     * @param platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * get 镜像ID列表，如果指定了此参数，其它参数可为空
     *
     * @return
     */
    public List<String> getIds() {
        return ids;
    }

    /**
     * set 镜像ID列表，如果指定了此参数，其它参数可为空
     *
     * @param ids
     */
    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 镜像来源：public、shared、thirdparty、private，如果没有指定ids参数，此参数必传
     *
     * @param imageSource
     */
    public DescribeImagesRequest imageSource(String imageSource) {
        this.imageSource = imageSource;
        return this;
    }

    /**
     * set 操作系统平台: Windows Server、CentOS、Ubuntu
     *
     * @param platform
     */
    public DescribeImagesRequest platform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * set 镜像ID列表，如果指定了此参数，其它参数可为空
     *
     * @param ids
     */
    public DescribeImagesRequest ids(List<String> ids) {
        this.ids = ids;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public DescribeImagesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 镜像ID列表，如果指定了此参数，其它参数可为空
     *
     * @param id
     */
    public void addId(String id) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(id);
    }

}