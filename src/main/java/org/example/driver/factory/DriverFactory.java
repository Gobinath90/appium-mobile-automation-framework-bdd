package org.example.driver.factory;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import org.example.enums.MobilePlatformName;

import io.appium.java_client.AppiumDriver;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DriverFactory {

  private static final Map<MobilePlatformName, Supplier<AppiumDriver>> DRIVER_TYPE_MAP =
    new EnumMap<>(MobilePlatformName.class);

 

  public static AppiumDriver getDriver(MobilePlatformName mobilePlatformName) {
    return DRIVER_TYPE_MAP.get(mobilePlatformName).get();
  }
}
