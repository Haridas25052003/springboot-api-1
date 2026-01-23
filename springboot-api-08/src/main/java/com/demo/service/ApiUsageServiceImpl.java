package com.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ApiLimitConfigDao;
import com.demo.dao.ApiUsageDao;
import com.demo.dao.UserDao;
import com.demo.model.ApiLimitConfig;
import com.demo.model.ApiUsage;
import com.demo.model.User;

@Service
public class ApiUsageServiceImpl implements ApiUsageService {

    @Autowired
    private ApiUsageDao ad;

    @Autowired
    private UserDao ud;

    @Autowired
    private ApiLimitConfigDao ald;

    @Override
    public boolean isRequestAllowed(int userId, String apiName) {

        String today = LocalDate.now().toString();

        User user = ud.findById(userId).orElse(null);
        if (user == null) {
            return false;
        }

        ApiLimitConfigDao config = ald.findById(user.getRole()).orElse(null);
        int limit = (config != null) ? config.getDailyLimit() : 0;

        ApiUsage usage =
                ad.findByUserIdAndApiNameAndUsageDate(userId, apiName, today);
        if (usage == null) {
            ApiUsage newUsage = new ApiUsage();
            newUsage.setUserId(userId);
            newUsage.setApiName(apiName);
            newUsage.setUsageDate(today);
            newUsage.setRequestCount(1);

            ad.save(newUsage);
            return true;
        }

        if (usage.getRequestCount() >= limit) {
            return false;
        }

        usage.setRequestCount(usage.getRequestCount() + 1);
        ad.save(usage);

        return true;
    }

}
