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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除用户自定义直播截图模板
- 删除截图模板前,请先删除此模板相关的截图配置,否则将会影响线上业务

 */
public class DeleteCustomLiveStreamSnapshotTemplateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 截图模板
     * Required:true
     */
    @Required
    private String template;


    /**
     * get 截图模板
     *
     * @return
     */
    public String getTemplate() {
        return template;
    }

    /**
     * set 截图模板
     *
     * @param template
     */
    public void setTemplate(String template) {
        this.template = template;
    }


    /**
     * set 截图模板
     *
     * @param template
     */
    public DeleteCustomLiveStreamSnapshotTemplateRequest template(String template) {
        this.template = template;
        return this;
    }


}