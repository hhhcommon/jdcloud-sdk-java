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
 * User Group Management
 * User Group Management API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.iam.model.SubUserInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询用户组内的子用户列表 
 */
public class DescribeGroupSubUsersResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户总数
     */
    private Integer total;

    /**
     * subUsers
     */
    private List<SubUserInfo> subUsers;


    /**
     * get 用户总数
     *
     * @return
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * set 用户总数
     *
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * get subUsers
     *
     * @return
     */
    public List<SubUserInfo> getSubUsers() {
        return subUsers;
    }

    /**
     * set subUsers
     *
     * @param subUsers
     */
    public void setSubUsers(List<SubUserInfo> subUsers) {
        this.subUsers = subUsers;
    }


    /**
     * set 用户总数
     *
     * @param total
     */
    public DescribeGroupSubUsersResult total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * set subUsers
     *
     * @param subUsers
     */
    public DescribeGroupSubUsersResult subUsers(List<SubUserInfo> subUsers) {
        this.subUsers = subUsers;
        return this;
    }


    /**
     * add item to subUsers
     *
     * @param subUser
     */
    public void addSubUser(SubUserInfo subUser) {
        if (this.subUsers == null) {
            this.subUsers = new ArrayList<>();
        }
        this.subUsers.add(subUser);
    }

}