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

package com.jdcloud.sdk.service.jdro.model;


/**
 * resourceTargetDefinition
 */
public class ResourceTargetDefinition  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * attribute
     */
    private String attribute;

    /**
     * 如果 Attribute 为 Properties，值为属性的名称，否则为空
     */
    private String name;

    /**
     * requiresRecreation
     */
    private String requiresRecreation;


    /**
     * get attribute
     *
     * @return
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * set attribute
     *
     * @param attribute
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * get 如果 Attribute 为 Properties，值为属性的名称，否则为空
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 如果 Attribute 为 Properties，值为属性的名称，否则为空
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get requiresRecreation
     *
     * @return
     */
    public String getRequiresRecreation() {
        return requiresRecreation;
    }

    /**
     * set requiresRecreation
     *
     * @param requiresRecreation
     */
    public void setRequiresRecreation(String requiresRecreation) {
        this.requiresRecreation = requiresRecreation;
    }


    /**
     * set attribute
     *
     * @param attribute
     */
    public ResourceTargetDefinition attribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * set 如果 Attribute 为 Properties，值为属性的名称，否则为空
     *
     * @param name
     */
    public ResourceTargetDefinition name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set requiresRecreation
     *
     * @param requiresRecreation
     */
    public ResourceTargetDefinition requiresRecreation(String requiresRecreation) {
        this.requiresRecreation = requiresRecreation;
        return this;
    }


}