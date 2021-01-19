package cn.kgc.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data//上面红色条去pom文件里降低版本  <!-- 实体类上面红条点击进入官方，复制到pom文件中的依赖里面-->
@ConfigurationProperties(prefix = "user")//批量处理
@Component
public class User {
   // @Value("${user.id}")     和ConfigurationPropertiesu不同是每一个属性都得写，单个处理
private Integer id;
private String username;
private Boolean isBoy;
}

