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
 * Rds-Database
 * 与RDS数据库相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.jdfusion.model.CreateRDSDB;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 根据给定的信息，创建指定RDS实例的数据库
 */
public class CreateRdsDatabaseRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建RDS实例的数据库信息
     * Required:true
     */
    @Required
    private CreateRDSDB database;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RDS实例ID
     * Required:true
     */
    @Required
    private String instId;


    /**
     * get 创建RDS实例的数据库信息
     *
     * @return
     */
    public CreateRDSDB getDatabase() {
        return database;
    }

    /**
     * set 创建RDS实例的数据库信息
     *
     * @param database
     */
    public void setDatabase(CreateRDSDB database) {
        this.database = database;
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
     * get RDS实例ID
     *
     * @return
     */
    public String getInstId() {
        return instId;
    }

    /**
     * set RDS实例ID
     *
     * @param instId
     */
    public void setInstId(String instId) {
        this.instId = instId;
    }


    /**
     * set 创建RDS实例的数据库信息
     *
     * @param database
     */
    public CreateRdsDatabaseRequest database(CreateRDSDB database) {
        this.database = database;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateRdsDatabaseRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set RDS实例ID
     *
     * @param instId
     */
    public CreateRdsDatabaseRequest instId(String instId) {
        this.instId = instId;
        return this;
    }


}