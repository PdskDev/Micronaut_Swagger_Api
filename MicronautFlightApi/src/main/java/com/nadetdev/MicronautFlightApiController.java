package com.nadetdev;

import io.micronaut.http.annotation.*;

@Controller("/micronautFlightApi")
public class MicronautFlightApiController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}