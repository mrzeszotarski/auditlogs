package pl.mrzeszotarski.auditlogs.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleWebService {

    @ApiOperation(value = "/example", authorizations = {@Authorization("read_scope")})
    @GetMapping("/example")
    public String exampleService(){
        return "hello";
    }
}
