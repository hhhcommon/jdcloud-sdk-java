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
 * ServiceConfig
 * 查询服务配置信息
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kubernetes.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.kubernetes.model.MasterVersion;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询可升级的控制节点版本
 */
public class DescribeUpgradableMasterVersionsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * masterVersions
     */
    private List<MasterVersion> masterVersions;


    /**
     * get masterVersions
     *
     * @return
     */
    public List<MasterVersion> getMasterVersions() {
        return masterVersions;
    }

    /**
     * set masterVersions
     *
     * @param masterVersions
     */
    public void setMasterVersions(List<MasterVersion> masterVersions) {
        this.masterVersions = masterVersions;
    }


    /**
     * set masterVersions
     *
     * @param masterVersions
     */
    public DescribeUpgradableMasterVersionsResult masterVersions(List<MasterVersion> masterVersions) {
        this.masterVersions = masterVersions;
        return this;
    }


    /**
     * add item to masterVersions
     *
     * @param masterVersion
     */
    public void addMasterVersion(MasterVersion masterVersion) {
        if (this.masterVersions == null) {
            this.masterVersions = new ArrayList<>();
        }
        this.masterVersions.add(masterVersion);
    }

}