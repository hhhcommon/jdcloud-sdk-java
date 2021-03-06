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

package com.jdcloud.sdk.service.jmr.model;

import java.util.List;
import java.util.ArrayList;

/**
 * taskViewListData
 */
public class TaskViewListData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询的列表size
     */
    private Integer totalNum;

    /**
     * taskList
     */
    private List<JmrTaskViewModel> taskList;


    /**
     * get 查询的列表size
     *
     * @return
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    /**
     * set 查询的列表size
     *
     * @param totalNum
     */
    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    /**
     * get taskList
     *
     * @return
     */
    public List<JmrTaskViewModel> getTaskList() {
        return taskList;
    }

    /**
     * set taskList
     *
     * @param taskList
     */
    public void setTaskList(List<JmrTaskViewModel> taskList) {
        this.taskList = taskList;
    }


    /**
     * set 查询的列表size
     *
     * @param totalNum
     */
    public TaskViewListData totalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * set taskList
     *
     * @param taskList
     */
    public TaskViewListData taskList(List<JmrTaskViewModel> taskList) {
        this.taskList = taskList;
        return this;
    }


    /**
     * add item to taskList
     *
     * @param taskList
     */
    public void addTaskList(JmrTaskViewModel taskList) {
        if (this.taskList == null) {
            this.taskList = new ArrayList<>();
        }
        this.taskList.add(taskList);
    }

}