package com.demo.service;

import java.util.List;

import com.demo.model.ApiUsage;

public interface ApiUsageService {

    /**
     * Processes an API request for a user.
     * @return true if request is allowed, false if rate limit exceeded
     */
    boolean isRequestAllowed(int userId, String apiName);
    
    List<ApiUsage> findById(int id);

}
