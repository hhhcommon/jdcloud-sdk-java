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
 * JDCloud Redis API
 * 京东云缓存Redis相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.redis.model.ModifyBackupPolicyRequest;
import com.jdcloud.sdk.service.redis.model.ModifyBackupPolicyResponse;
import com.jdcloud.sdk.service.redis.client.ModifyBackupPolicyExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeIpWhiteListRequest;
import com.jdcloud.sdk.service.redis.model.DescribeIpWhiteListResponse;
import com.jdcloud.sdk.service.redis.client.DescribeIpWhiteListExecutor;
import com.jdcloud.sdk.service.redis.model.ResetCacheInstancePasswordRequest;
import com.jdcloud.sdk.service.redis.model.ResetCacheInstancePasswordResponse;
import com.jdcloud.sdk.service.redis.client.ResetCacheInstancePasswordExecutor;
import com.jdcloud.sdk.service.redis.model.CreateCacheAnalysisRequest;
import com.jdcloud.sdk.service.redis.model.CreateCacheAnalysisResponse;
import com.jdcloud.sdk.service.redis.client.CreateCacheAnalysisExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeDownloadUrlRequest;
import com.jdcloud.sdk.service.redis.model.DescribeDownloadUrlResponse;
import com.jdcloud.sdk.service.redis.client.DescribeDownloadUrlExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeCacheInstancesRequest;
import com.jdcloud.sdk.service.redis.model.DescribeCacheInstancesResponse;
import com.jdcloud.sdk.service.redis.client.DescribeCacheInstancesExecutor;
import com.jdcloud.sdk.service.redis.model.ModifyCacheInstanceAttributeRequest;
import com.jdcloud.sdk.service.redis.model.ModifyCacheInstanceAttributeResponse;
import com.jdcloud.sdk.service.redis.client.ModifyCacheInstanceAttributeExecutor;
import com.jdcloud.sdk.service.redis.model.ModifyAnalysisTimeRequest;
import com.jdcloud.sdk.service.redis.model.ModifyAnalysisTimeResponse;
import com.jdcloud.sdk.service.redis.client.ModifyAnalysisTimeExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeBackupsRequest;
import com.jdcloud.sdk.service.redis.model.DescribeBackupsResponse;
import com.jdcloud.sdk.service.redis.client.DescribeBackupsExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeCacheAnalysisListRequest;
import com.jdcloud.sdk.service.redis.model.DescribeCacheAnalysisListResponse;
import com.jdcloud.sdk.service.redis.client.DescribeCacheAnalysisListExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeAnalysisTimeRequest;
import com.jdcloud.sdk.service.redis.model.DescribeAnalysisTimeResponse;
import com.jdcloud.sdk.service.redis.client.DescribeAnalysisTimeExecutor;
import com.jdcloud.sdk.service.redis.model.ModifyCacheInstanceClassRequest;
import com.jdcloud.sdk.service.redis.model.ModifyCacheInstanceClassResponse;
import com.jdcloud.sdk.service.redis.client.ModifyCacheInstanceClassExecutor;
import com.jdcloud.sdk.service.redis.model.CreateBackupRequest;
import com.jdcloud.sdk.service.redis.model.CreateBackupResponse;
import com.jdcloud.sdk.service.redis.client.CreateBackupExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeInstanceConfigRequest;
import com.jdcloud.sdk.service.redis.model.DescribeInstanceConfigResponse;
import com.jdcloud.sdk.service.redis.client.DescribeInstanceConfigExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeCacheAnalysisResultRequest;
import com.jdcloud.sdk.service.redis.model.DescribeCacheAnalysisResultResponse;
import com.jdcloud.sdk.service.redis.client.DescribeCacheAnalysisResultExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeBackupPolicyRequest;
import com.jdcloud.sdk.service.redis.model.DescribeBackupPolicyResponse;
import com.jdcloud.sdk.service.redis.client.DescribeBackupPolicyExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeSpecConfigRequest;
import com.jdcloud.sdk.service.redis.model.DescribeSpecConfigResponse;
import com.jdcloud.sdk.service.redis.client.DescribeSpecConfigExecutor;
import com.jdcloud.sdk.service.redis.model.DeleteCacheInstanceRequest;
import com.jdcloud.sdk.service.redis.model.DeleteCacheInstanceResponse;
import com.jdcloud.sdk.service.redis.client.DeleteCacheInstanceExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeSlowLogRequest;
import com.jdcloud.sdk.service.redis.model.DescribeSlowLogResponse;
import com.jdcloud.sdk.service.redis.client.DescribeSlowLogExecutor;
import com.jdcloud.sdk.service.redis.model.CreateCacheInstanceRequest;
import com.jdcloud.sdk.service.redis.model.CreateCacheInstanceResponse;
import com.jdcloud.sdk.service.redis.client.CreateCacheInstanceExecutor;
import com.jdcloud.sdk.service.redis.model.RestoreInstanceRequest;
import com.jdcloud.sdk.service.redis.model.RestoreInstanceResponse;
import com.jdcloud.sdk.service.redis.client.RestoreInstanceExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeUserQuotaRequest;
import com.jdcloud.sdk.service.redis.model.DescribeUserQuotaResponse;
import com.jdcloud.sdk.service.redis.client.DescribeUserQuotaExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeClusterInfoRequest;
import com.jdcloud.sdk.service.redis.model.DescribeClusterInfoResponse;
import com.jdcloud.sdk.service.redis.client.DescribeClusterInfoExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeCacheInstanceRequest;
import com.jdcloud.sdk.service.redis.model.DescribeCacheInstanceResponse;
import com.jdcloud.sdk.service.redis.client.DescribeCacheInstanceExecutor;
import com.jdcloud.sdk.service.redis.model.ModifyInstanceConfigRequest;
import com.jdcloud.sdk.service.redis.model.ModifyInstanceConfigResponse;
import com.jdcloud.sdk.service.redis.client.ModifyInstanceConfigExecutor;
import com.jdcloud.sdk.service.redis.model.ModifyIpWhiteListRequest;
import com.jdcloud.sdk.service.redis.model.ModifyIpWhiteListResponse;
import com.jdcloud.sdk.service.redis.client.ModifyIpWhiteListExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeInstanceClassRequest;
import com.jdcloud.sdk.service.redis.model.DescribeInstanceClassResponse;
import com.jdcloud.sdk.service.redis.client.DescribeInstanceClassExecutor;

/**
 * redisClient
 */
public class RedisClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.1";
    public final static String DefaultEndpoint = "redis.jdcloud-api.com";
    public final static String ServiceName = "redis";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private RedisClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 修改缓存Redis实例的自动备份策略，可修改备份周期和备份时间
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws JdcloudSdkException {
        return new ModifyBackupPolicyExecutor().client(this).execute(request);
    }

    /**
     * 获取Redis实例的IP白名单（只有白名单内的IP、网络才能访问该实例）
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeIpWhiteListResponse describeIpWhiteList(DescribeIpWhiteListRequest request) throws JdcloudSdkException {
        return new DescribeIpWhiteListExecutor().client(this).execute(request);
    }

    /**
     * 修改缓存Redis实例的密码，可为空
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ResetCacheInstancePasswordResponse resetCacheInstancePassword(ResetCacheInstancePasswordRequest request) throws JdcloudSdkException {
        return new ResetCacheInstancePasswordExecutor().client(this).execute(request);
    }

    /**
     * 创建缓存分析任务，一天最多创建12次分析任务
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateCacheAnalysisResponse createCacheAnalysis(CreateCacheAnalysisRequest request) throws JdcloudSdkException {
        return new CreateCacheAnalysisExecutor().client(this).execute(request);
    }

    /**
     * 获取缓存Redis实例的备份文件临时下载地址（1个小时有效期）
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDownloadUrlResponse describeDownloadUrl(DescribeDownloadUrlRequest request) throws JdcloudSdkException {
        return new DescribeDownloadUrlExecutor().client(this).execute(request);
    }

    /**
     * 查询缓存Redis实例列表，可分页、可排序、可搜索、可过滤
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCacheInstancesResponse describeCacheInstances(DescribeCacheInstancesRequest request) throws JdcloudSdkException {
        return new DescribeCacheInstancesExecutor().client(this).execute(request);
    }

    /**
     * 修改缓存Redis实例的资源名称或描述，二者至少选一
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyCacheInstanceAttributeResponse modifyCacheInstanceAttribute(ModifyCacheInstanceAttributeRequest request) throws JdcloudSdkException {
        return new ModifyCacheInstanceAttributeExecutor().client(this).execute(request);
    }

    /**
     * 设置自动缓存分析时间
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyAnalysisTimeResponse modifyAnalysisTime(ModifyAnalysisTimeRequest request) throws JdcloudSdkException {
        return new ModifyAnalysisTimeExecutor().client(this).execute(request);
    }

    /**
     * 查询缓存Redis实例的备份任务（文件）列表，可分页、可指定起止时间或备份任务ID
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeBackupsResponse describeBackups(DescribeBackupsRequest request) throws JdcloudSdkException {
        return new DescribeBackupsExecutor().client(this).execute(request);
    }

    /**
     * 查询缓存分析任务列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCacheAnalysisListResponse describeCacheAnalysisList(DescribeCacheAnalysisListRequest request) throws JdcloudSdkException {
        return new DescribeCacheAnalysisListExecutor().client(this).execute(request);
    }

    /**
     * 获取自动缓存分析时间
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAnalysisTimeResponse describeAnalysisTime(DescribeAnalysisTimeRequest request) throws JdcloudSdkException {
        return new DescribeAnalysisTimeExecutor().client(this).execute(request);
    }

    /**
     * 变更缓存Redis实例规格（变配），实例运行时可以变配，新规格不能与之前的老规格相同，新规格内存大小不能小于实例的已使用内存

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyCacheInstanceClassResponse modifyCacheInstanceClass(ModifyCacheInstanceClassRequest request) throws JdcloudSdkException {
        return new ModifyCacheInstanceClassExecutor().client(this).execute(request);
    }

    /**
     * 创建并执行缓存Redis实例的备份任务，只能为手动备份，可设置备份文件名称
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateBackupResponse createBackup(CreateBackupRequest request) throws JdcloudSdkException {
        return new CreateBackupExecutor().client(this).execute(request);
    }

    /**
     * 查看缓存Redis实例的当前配置参数
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceConfigResponse describeInstanceConfig(DescribeInstanceConfigRequest request) throws JdcloudSdkException {
        return new DescribeInstanceConfigExecutor().client(this).execute(request);
    }

    /**
     * 查询缓存分析任务详情，最多查询到30天前的数据
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCacheAnalysisResultResponse describeCacheAnalysisResult(DescribeCacheAnalysisResultRequest request) throws JdcloudSdkException {
        return new DescribeCacheAnalysisResultExecutor().client(this).execute(request);
    }

    /**
     * 查询缓存Redis实例的自动备份策略
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws JdcloudSdkException {
        return new DescribeBackupPolicyExecutor().client(this).execute(request);
    }

    /**
     * 查询缓存Redis实例的规格配置信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSpecConfigResponse describeSpecConfig(DescribeSpecConfigRequest request) throws JdcloudSdkException {
        return new DescribeSpecConfigExecutor().client(this).execute(request);
    }

    /**
     * 删除按配置计费、或包年包月已到期的缓存Redis实例，包年包月未到期不可删除。
只有处于运行running或者错误error状态才可以删除，其余状态不可以删除。
白名单用户不能删除包年包月已到期的缓存Redis实例。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteCacheInstanceResponse deleteCacheInstance(DeleteCacheInstanceRequest request) throws JdcloudSdkException {
        return new DeleteCacheInstanceExecutor().client(this).execute(request);
    }

    /**
     * 获取缓存Redis实例的慢查询日志，可分页、可搜索
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSlowLogResponse describeSlowLog(DescribeSlowLogRequest request) throws JdcloudSdkException {
        return new DescribeSlowLogExecutor().client(this).execute(request);
    }

    /**
     * 创建一个指定配置的缓存Redis实例：可选择版本、类型、规格（按CPU核数、内存容量、磁盘容量、带宽等划分），自定义分片规格可通过describeSpecConfig接口获取，老规格代码请参考，https://docs.jdcloud.com/cn/jcs-for-redis/specifications

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateCacheInstanceResponse createCacheInstance(CreateCacheInstanceRequest request) throws JdcloudSdkException {
        return new CreateCacheInstanceExecutor().client(this).execute(request);
    }

    /**
     * 恢复缓存Redis实例的某次备份
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RestoreInstanceResponse restoreInstance(RestoreInstanceRequest request) throws JdcloudSdkException {
        return new RestoreInstanceExecutor().client(this).execute(request);
    }

    /**
     * 查询账户的缓存Redis配额信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeUserQuotaResponse describeUserQuota(DescribeUserQuotaRequest request) throws JdcloudSdkException {
        return new DescribeUserQuotaExecutor().client(this).execute(request);
    }

    /**
     * 查询Redis实例的集群内部信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeClusterInfoResponse describeClusterInfo(DescribeClusterInfoRequest request) throws JdcloudSdkException {
        return new DescribeClusterInfoExecutor().client(this).execute(request);
    }

    /**
     * 查询缓存Redis实例的详细信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCacheInstanceResponse describeCacheInstance(DescribeCacheInstanceRequest request) throws JdcloudSdkException {
        return new DescribeCacheInstanceExecutor().client(this).execute(request);
    }

    /**
     * 修改缓存Redis实例的配置参数，支持部分配置参数修改
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceConfigResponse modifyInstanceConfig(ModifyInstanceConfigRequest request) throws JdcloudSdkException {
        return new ModifyInstanceConfigExecutor().client(this).execute(request);
    }

    /**
     * 修改Redis实例的IP白名单
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyIpWhiteListResponse modifyIpWhiteList(ModifyIpWhiteListRequest request) throws JdcloudSdkException {
        return new ModifyIpWhiteListExecutor().client(this).execute(request);
    }

    /**
     * 查询缓存Redis实例的规格列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceClassResponse describeInstanceClass(DescribeInstanceClassRequest request) throws JdcloudSdkException {
        return new DescribeInstanceClassExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public RedisClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private RedisClient redisClient;

        public DefaultBuilder() {
            redisClient = new RedisClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            redisClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            redisClient.httpRequestConfig = config;
            return this;
        }

        public RedisClient build() throws JdcloudSdkException {

            if (redisClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                redisClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (redisClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("RedisClient build error: jdcloud credentials provider not set");
                }
            }
            if (redisClient.httpRequestConfig == null) {
                redisClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (redisClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("RedisClient build error: http request config not set");
                }
            }
            return redisClient;
        }

        public Builder environment(Environment environment) {
            redisClient.environment = environment;
            return this;
        }
    }
}
