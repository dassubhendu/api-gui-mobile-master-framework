package com.sd.config.factory;

import com.sd.config.APITestDataConfig;
import com.sd.config.FrameworkConfig;
import com.sd.config.WebTestDataConfig;
import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {

    private ConfigFactory(){}

    public static FrameworkConfig getConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }

    public static WebTestDataConfig getWebTestDataConfig(){
      return ConfigCache.getOrCreate(WebTestDataConfig.class, System.getenv(), System.getProperties());}

    public static APITestDataConfig getAPITestDataConfig(){
      return ConfigCache.getOrCreate(APITestDataConfig.class, System.getenv(), System.getProperties());}

}
