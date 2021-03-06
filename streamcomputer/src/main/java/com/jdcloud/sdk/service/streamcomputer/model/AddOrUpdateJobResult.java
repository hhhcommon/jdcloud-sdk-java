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
 * JOB相关API
 * 流计算作业相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.streamcomputer.model;

import com.jdcloud.sdk.service.streamcomputer.model.OkInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 添加或者更新job
 */
public class AddOrUpdateJobResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 成功结果对象
     */
    private OkInfo okInfo;


    /**
     * get 成功结果对象
     *
     * @return
     */
    public OkInfo getOkInfo() {
        return okInfo;
    }

    /**
     * set 成功结果对象
     *
     * @param okInfo
     */
    public void setOkInfo(OkInfo okInfo) {
        this.okInfo = okInfo;
    }


    /**
     * set 成功结果对象
     *
     * @param okInfo
     */
    public AddOrUpdateJobResult okInfo(OkInfo okInfo) {
        this.okInfo = okInfo;
        return this;
    }


}