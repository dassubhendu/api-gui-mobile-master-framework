package com.sd.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
  "classpath:${env}-web.properties",
  "file:${user.dir}/src/test/resources/web/staging-web.properties",
})
public interface WebTestDataConfig extends Config {

  /**
   * Login credential details.
   */
  @Key("web.Url")
  String getWebUrl();

  @Key("username")
  String getUserName();

  @Key("password")
  String getPassword();

  @Key("username_wrong")
  String getWrongUserName();

  @Key("password_wrong")
  String getWrongPassword();

}

