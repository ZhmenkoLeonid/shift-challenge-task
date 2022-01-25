package com.zhmenko.shiftchallengetask.controller;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ConvertController {

    @PostMapping(value = "/convert", consumes = "application/json", produces = "text/xml")
    @io.swagger.v3.oas.annotations.Operation(summary = "convert json to xml")
    public String convert(@RequestBody String json) {
        return XML.toString(new JSONObject(json));
    }
}