package org.javaboy.vhr;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;

@Slf4j
@SpringBootApplication
@MapperScan(basePackages = "org.javaboy.vhr.mapper")
public class VhrApplication {

    public static void main(String[] args) throws UnknownHostException {
        final HashMap<String, Object> props = new HashMap<>();
        final ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .properties(props)
                .sources(VhrApplication.class)
                .run(args);

        final Environment env = context.getEnvironment();
        VhrApplication.log.info("\n----------------------------------------------------------\n\t" +
                        "Application '{}' is running! ActiveProfiles is '{}', Access URLs:\n\t" +
                        "Local: \t\thttp://127.0.0.1:{}\n\t" +
                        "External: \thttp://{}:{}\n----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                env.getProperty("spring.profiles.active"),
                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"));
    }

}
