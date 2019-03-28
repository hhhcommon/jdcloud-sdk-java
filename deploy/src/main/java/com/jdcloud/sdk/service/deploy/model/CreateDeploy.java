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

package com.jdcloud.sdk.service.deploy.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * createDeploy
 */
public class CreateDeploy  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部署组ID，部署组的唯一标识
     * Required:true
     */
    @Required
    private String groupId;

    /**
     * 描述
     */
    private String desc;

    /**
     * 部署来源：1url，2云编译，3云存储
     * Required:true
     */
    @Required
    private Integer deploySource;

    /**
     * 部署操作
     */
    private String deployCmd;

    /**
     * 1使用输入的操作，2使用程序自带操作
     */
    private Integer cmdSource;

    /**
     * 部署操作展示格式：1form,2ymal
     */
    private Integer cmdType;

    /**
     * 项目类型 1tomcat,2
     */
    private Integer productType;

    /**
     * 下载url
     */
    private String downloadUrl;

    /**
     * md5
     */
    private String md5;

    /**
     * 云编译项目名
     */
    private String compileProject;

    /**
     * 云编译构建序号
     */
    private String compileSeries;

    /**
     * 云存储空间
     */
    private String ossSpace;

    /**
     * 云存储目录
     */
    private String ossDir;

    /**
     * 文件类型：1.tar，2.zip,3.tar.gz
     */
    private Integer fileType;


    /**
     * get 部署组ID，部署组的唯一标识
     *
     * @return
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * set 部署组ID，部署组的唯一标识
     *
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * get 描述
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * set 描述
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * get 部署来源：1url，2云编译，3云存储
     *
     * @return
     */
    public Integer getDeploySource() {
        return deploySource;
    }

    /**
     * set 部署来源：1url，2云编译，3云存储
     *
     * @param deploySource
     */
    public void setDeploySource(Integer deploySource) {
        this.deploySource = deploySource;
    }

    /**
     * get 部署操作
     *
     * @return
     */
    public String getDeployCmd() {
        return deployCmd;
    }

    /**
     * set 部署操作
     *
     * @param deployCmd
     */
    public void setDeployCmd(String deployCmd) {
        this.deployCmd = deployCmd;
    }

    /**
     * get 1使用输入的操作，2使用程序自带操作
     *
     * @return
     */
    public Integer getCmdSource() {
        return cmdSource;
    }

    /**
     * set 1使用输入的操作，2使用程序自带操作
     *
     * @param cmdSource
     */
    public void setCmdSource(Integer cmdSource) {
        this.cmdSource = cmdSource;
    }

    /**
     * get 部署操作展示格式：1form,2ymal
     *
     * @return
     */
    public Integer getCmdType() {
        return cmdType;
    }

    /**
     * set 部署操作展示格式：1form,2ymal
     *
     * @param cmdType
     */
    public void setCmdType(Integer cmdType) {
        this.cmdType = cmdType;
    }

    /**
     * get 项目类型 1tomcat,2
     *
     * @return
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * set 项目类型 1tomcat,2
     *
     * @param productType
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     * get 下载url
     *
     * @return
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * set 下载url
     *
     * @param downloadUrl
     */
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * get md5
     *
     * @return
     */
    public String getMd5() {
        return md5;
    }

    /**
     * set md5
     *
     * @param md5
     */
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /**
     * get 云编译项目名
     *
     * @return
     */
    public String getCompileProject() {
        return compileProject;
    }

    /**
     * set 云编译项目名
     *
     * @param compileProject
     */
    public void setCompileProject(String compileProject) {
        this.compileProject = compileProject;
    }

    /**
     * get 云编译构建序号
     *
     * @return
     */
    public String getCompileSeries() {
        return compileSeries;
    }

    /**
     * set 云编译构建序号
     *
     * @param compileSeries
     */
    public void setCompileSeries(String compileSeries) {
        this.compileSeries = compileSeries;
    }

    /**
     * get 云存储空间
     *
     * @return
     */
    public String getOssSpace() {
        return ossSpace;
    }

    /**
     * set 云存储空间
     *
     * @param ossSpace
     */
    public void setOssSpace(String ossSpace) {
        this.ossSpace = ossSpace;
    }

    /**
     * get 云存储目录
     *
     * @return
     */
    public String getOssDir() {
        return ossDir;
    }

    /**
     * set 云存储目录
     *
     * @param ossDir
     */
    public void setOssDir(String ossDir) {
        this.ossDir = ossDir;
    }

    /**
     * get 文件类型：1.tar，2.zip,3.tar.gz
     *
     * @return
     */
    public Integer getFileType() {
        return fileType;
    }

    /**
     * set 文件类型：1.tar，2.zip,3.tar.gz
     *
     * @param fileType
     */
    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }


    /**
     * set 部署组ID，部署组的唯一标识
     *
     * @param groupId
     */
    public CreateDeploy groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * set 描述
     *
     * @param desc
     */
    public CreateDeploy desc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * set 部署来源：1url，2云编译，3云存储
     *
     * @param deploySource
     */
    public CreateDeploy deploySource(Integer deploySource) {
        this.deploySource = deploySource;
        return this;
    }

    /**
     * set 部署操作
     *
     * @param deployCmd
     */
    public CreateDeploy deployCmd(String deployCmd) {
        this.deployCmd = deployCmd;
        return this;
    }

    /**
     * set 1使用输入的操作，2使用程序自带操作
     *
     * @param cmdSource
     */
    public CreateDeploy cmdSource(Integer cmdSource) {
        this.cmdSource = cmdSource;
        return this;
    }

    /**
     * set 部署操作展示格式：1form,2ymal
     *
     * @param cmdType
     */
    public CreateDeploy cmdType(Integer cmdType) {
        this.cmdType = cmdType;
        return this;
    }

    /**
     * set 项目类型 1tomcat,2
     *
     * @param productType
     */
    public CreateDeploy productType(Integer productType) {
        this.productType = productType;
        return this;
    }

    /**
     * set 下载url
     *
     * @param downloadUrl
     */
    public CreateDeploy downloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * set md5
     *
     * @param md5
     */
    public CreateDeploy md5(String md5) {
        this.md5 = md5;
        return this;
    }

    /**
     * set 云编译项目名
     *
     * @param compileProject
     */
    public CreateDeploy compileProject(String compileProject) {
        this.compileProject = compileProject;
        return this;
    }

    /**
     * set 云编译构建序号
     *
     * @param compileSeries
     */
    public CreateDeploy compileSeries(String compileSeries) {
        this.compileSeries = compileSeries;
        return this;
    }

    /**
     * set 云存储空间
     *
     * @param ossSpace
     */
    public CreateDeploy ossSpace(String ossSpace) {
        this.ossSpace = ossSpace;
        return this;
    }

    /**
     * set 云存储目录
     *
     * @param ossDir
     */
    public CreateDeploy ossDir(String ossDir) {
        this.ossDir = ossDir;
        return this;
    }

    /**
     * set 文件类型：1.tar，2.zip,3.tar.gz
     *
     * @param fileType
     */
    public CreateDeploy fileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }


}