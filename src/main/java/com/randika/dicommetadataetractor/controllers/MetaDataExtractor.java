package com.randika.dicommetadataetractor.controllers;

import com.google.gson.JsonObject;
import com.pixelmed.dicom.DicomException;
import com.randika.dicommetadataetractor.services.MetaDataExtractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
public class MetaDataExtractor {

    @Autowired
    MetaDataExtractionService extractor;

    @GetMapping("/extract")
    public Map test(@RequestParam List<String> attr_list) throws IOException, DicomException {

        Map response = extractor.extractMetaData(attr_list);
        return response;
    }
}