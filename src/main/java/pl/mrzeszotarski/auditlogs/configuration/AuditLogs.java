package pl.mrzeszotarski.auditlogs.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("pl.mrzeszotarski.auditlogs")
@SpringBootApplication
public class AuditLogs {

    public static void main(String[] args) {
        SpringApplication.run(AuditLogs.class, args);
    }

}
