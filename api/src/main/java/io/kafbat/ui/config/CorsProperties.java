package io.kafbat.ui.config;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@Component
@ConfigurationProperties(prefix = "cors")

public class CorsProperties {

  private String allowedOrigins;
  private String allowedMethods;
  private String allowedHeaders;
  private String maxAge;

}
