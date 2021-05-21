package com.like.code.core.database.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author like
 * @date 2021/5/21 10:49
 */
@ConfigurationProperties(prefix = "databases")
@Component
public class DatabasesProperties {

}
