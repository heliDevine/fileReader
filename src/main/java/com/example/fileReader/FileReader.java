package com.example.fileReader;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileReader extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:camelPracticeFiles/?fileName=sourceFile.txt&noop=true")
                .log("Source file has been read:${body}")
                .to("file:camelPracticeFilesDestination")
                .log("File has been moved");
    }
}
