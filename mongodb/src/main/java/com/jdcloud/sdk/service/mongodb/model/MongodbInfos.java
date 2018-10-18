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

package com.jdcloud.sdk.service.mongodb.model;


/**
 * mongodbInfos
 */
public class MongodbInfos  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String spaceId;

    /**
     * 状态描述
     */
    private String status;


    /**
     * get 实例ID
     *
     * @return
     */
    public String getSpaceId() {
        return spaceId;
    }

    /**
     * set 实例ID
     *
     * @param spaceId
     */
    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    /**
     * get 状态描述
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 状态描述
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * set 实例ID
     *
     * @param spaceId
     */
    public MongodbInfos spaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }

    /**
     * set 状态描述
     *
     * @param status
     */
    public MongodbInfos status(String status) {
        this.status = status;
        return this;
    }


}