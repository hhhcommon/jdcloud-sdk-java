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

package com.jdcloud.sdk.service.disk.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.charge.model.Charge;

/**
 * 云硬盘信息详情
 */
public class Disk  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云硬盘ID
     */
    private String diskId;

    /**
     * 云硬盘所属AZ
     */
    private String az;

    /**
     * 云硬盘名称
     */
    private String name;

    /**
     * 云硬盘描述
     */
    private String description;

    /**
     * 磁盘类型，取值为 ssd 或 premium-hdd
     */
    private String diskType;

    /**
     * 磁盘大小，单位为 GiB
     */
    private Integer diskSizeGB;

    /**
     * 云硬盘状态，取值为 creating、available、in-use、extending、restoring、deleting、deleted、error_create、error_delete、error_restore、error_extend 之一
     */
    private String status;

    /**
     * 挂载信息
     */
    private List<DiskAttachment> attachments;

    /**
     * 创建该云硬盘的快照ID
     */
    private String snapshotId;

    /**
     * 创建云硬盘时间
     */
    private String createTime;

    /**
     * 云硬盘计费配置信息
     */
    private Charge charge;

    /**
     * Tag信息
     */
    private List<Tag> tags;


    /**
     * get 云硬盘ID
     *
     * @return
     */
    public String getDiskId() {
        return diskId;
    }

    /**
     * set 云硬盘ID
     *
     * @param diskId
     */
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    /**
     * get 云硬盘所属AZ
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 云硬盘所属AZ
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 云硬盘名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 云硬盘名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 云硬盘描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 云硬盘描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 磁盘类型，取值为 ssd 或 premium-hdd
     *
     * @return
     */
    public String getDiskType() {
        return diskType;
    }

    /**
     * set 磁盘类型，取值为 ssd 或 premium-hdd
     *
     * @param diskType
     */
    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    /**
     * get 磁盘大小，单位为 GiB
     *
     * @return
     */
    public Integer getDiskSizeGB() {
        return diskSizeGB;
    }

    /**
     * set 磁盘大小，单位为 GiB
     *
     * @param diskSizeGB
     */
    public void setDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
    }

    /**
     * get 云硬盘状态，取值为 creating、available、in-use、extending、restoring、deleting、deleted、error_create、error_delete、error_restore、error_extend 之一
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 云硬盘状态，取值为 creating、available、in-use、extending、restoring、deleting、deleted、error_create、error_delete、error_restore、error_extend 之一
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 挂载信息
     *
     * @return
     */
    public List<DiskAttachment> getAttachments() {
        return attachments;
    }

    /**
     * set 挂载信息
     *
     * @param attachments
     */
    public void setAttachments(List<DiskAttachment> attachments) {
        this.attachments = attachments;
    }

    /**
     * get 创建该云硬盘的快照ID
     *
     * @return
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * set 创建该云硬盘的快照ID
     *
     * @param snapshotId
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * get 创建云硬盘时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建云硬盘时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 云硬盘计费配置信息
     *
     * @return
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * set 云硬盘计费配置信息
     *
     * @param charge
     */
    public void setCharge(Charge charge) {
        this.charge = charge;
    }

    /**
     * get Tag信息
     *
     * @return
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * set Tag信息
     *
     * @param tags
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }


    /**
     * set 云硬盘ID
     *
     * @param diskId
     */
    public Disk diskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * set 云硬盘所属AZ
     *
     * @param az
     */
    public Disk az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 云硬盘名称
     *
     * @param name
     */
    public Disk name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 云硬盘描述
     *
     * @param description
     */
    public Disk description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 磁盘类型，取值为 ssd 或 premium-hdd
     *
     * @param diskType
     */
    public Disk diskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set 磁盘大小，单位为 GiB
     *
     * @param diskSizeGB
     */
    public Disk diskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * set 云硬盘状态，取值为 creating、available、in-use、extending、restoring、deleting、deleted、error_create、error_delete、error_restore、error_extend 之一
     *
     * @param status
     */
    public Disk status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 挂载信息
     *
     * @param attachments
     */
    public Disk attachments(List<DiskAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    /**
     * set 创建该云硬盘的快照ID
     *
     * @param snapshotId
     */
    public Disk snapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * set 创建云硬盘时间
     *
     * @param createTime
     */
    public Disk createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 云硬盘计费配置信息
     *
     * @param charge
     */
    public Disk charge(Charge charge) {
        this.charge = charge;
        return this;
    }

    /**
     * set Tag信息
     *
     * @param tags
     */
    public Disk tags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }


    /**
     * add item to 挂载信息
     *
     * @param attachment
     */
    public void addAttachment(DiskAttachment attachment) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        this.attachments.add(attachment);
    }

    /**
     * add item to Tag信息
     *
     * @param tag
     */
    public void addTag(Tag tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

}