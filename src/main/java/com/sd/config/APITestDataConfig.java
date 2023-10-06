package com.sd.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
  "classpath:${env}-api.properties",
  "file:${user.dir}/src/test/resources/api/staging-api.properties",
})
public interface APITestDataConfig extends Config{

  @Key("baseurl")
  String getBaseUrl();

}
