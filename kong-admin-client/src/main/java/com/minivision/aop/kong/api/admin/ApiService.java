package com.minivision.aop.kong.api.admin;

import com.minivision.aop.kong.model.admin.api.Api;
import com.minivision.aop.kong.model.admin.api.ApiList;

/**
 * Created by vaibhav on 13/06/17.
 */
public interface ApiService {
    Api createApi(Api request);
    Api getApi(String nameOrId);
    Api updateApi(String nameOrId, Api request);
    Api createOrUpdateApi(Api request);
    Api deleteApi(String usernameOrId);
    ApiList listApis(String id, String upstreamUrl, String name, Long retries, Long size, String offset);
}
