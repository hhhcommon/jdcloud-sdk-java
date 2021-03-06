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

package com.jdcloud.sdk.service.jdfusion.model;

import java.util.List;
import java.util.ArrayList;

/**
 * RDS实例账号
 */
public class RdsAccountInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 账号名
     */
    private String name;

    /**
     * 账号状态
     */
    private String status;

    /**
     * accountPrivileges
     */
    private List<RdsAccountPrivilege> accountPrivileges;

    /**
     * 所属云提供商ID
     */
    private String cloudID;


    /**
     * get 账号名
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 账号名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 账号状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 账号状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get accountPrivileges
     *
     * @return
     */
    public List<RdsAccountPrivilege> getAccountPrivileges() {
        return accountPrivileges;
    }

    /**
     * set accountPrivileges
     *
     * @param accountPrivileges
     */
    public void setAccountPrivileges(List<RdsAccountPrivilege> accountPrivileges) {
        this.accountPrivileges = accountPrivileges;
    }

    /**
     * get 所属云提供商ID
     *
     * @return
     */
    public String getCloudID() {
        return cloudID;
    }

    /**
     * set 所属云提供商ID
     *
     * @param cloudID
     */
    public void setCloudID(String cloudID) {
        this.cloudID = cloudID;
    }


    /**
     * set 账号名
     *
     * @param name
     */
    public RdsAccountInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 账号状态
     *
     * @param status
     */
    public RdsAccountInfo status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set accountPrivileges
     *
     * @param accountPrivileges
     */
    public RdsAccountInfo accountPrivileges(List<RdsAccountPrivilege> accountPrivileges) {
        this.accountPrivileges = accountPrivileges;
        return this;
    }

    /**
     * set 所属云提供商ID
     *
     * @param cloudID
     */
    public RdsAccountInfo cloudID(String cloudID) {
        this.cloudID = cloudID;
        return this;
    }


    /**
     * add item to accountPrivileges
     *
     * @param accountPrivilege
     */
    public void addAccountPrivilege(RdsAccountPrivilege accountPrivilege) {
        if (this.accountPrivileges == null) {
            this.accountPrivileges = new ArrayList<>();
        }
        this.accountPrivileges.add(accountPrivilege);
    }

}