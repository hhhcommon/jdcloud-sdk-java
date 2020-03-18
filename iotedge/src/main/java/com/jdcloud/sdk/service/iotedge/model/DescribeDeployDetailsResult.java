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
 * DeployApp
 * DeployApp 部署详情
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotedge.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.iotedge.model.DescribeDeployDetailsRespVO;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询APP部署列表
 */
public class DescribeDeployDetailsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * deployDetails
     */
    private List<DescribeDeployDetailsRespVO> deployDetails;

    /**
     * 分页信息
     */
    private Object page;


    /**
     * get deployDetails
     *
     * @return
     */
    public List<DescribeDeployDetailsRespVO> getDeployDetails() {
        return deployDetails;
    }

    /**
     * set deployDetails
     *
     * @param deployDetails
     */
    public void setDeployDetails(List<DescribeDeployDetailsRespVO> deployDetails) {
        this.deployDetails = deployDetails;
    }

    /**
     * get 分页信息
     *
     * @return
     */
    public Object getPage() {
        return page;
    }

    /**
     * set 分页信息
     *
     * @param page
     */
    public void setPage(Object page) {
        this.page = page;
    }


    /**
     * set deployDetails
     *
     * @param deployDetails
     */
    public DescribeDeployDetailsResult deployDetails(List<DescribeDeployDetailsRespVO> deployDetails) {
        this.deployDetails = deployDetails;
        return this;
    }

    /**
     * set 分页信息
     *
     * @param page
     */
    public DescribeDeployDetailsResult page(Object page) {
        this.page = page;
        return this;
    }


    /**
     * add item to deployDetails
     *
     * @param deployDetail
     */
    public void addDeployDetail(DescribeDeployDetailsRespVO deployDetail) {
        if (this.deployDetails == null) {
            this.deployDetails = new ArrayList<>();
        }
        this.deployDetails.add(deployDetail);
    }

}