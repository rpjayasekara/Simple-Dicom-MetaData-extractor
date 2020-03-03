package com.randika.dicommetadataetractor.services;

import com.google.gson.JsonObject;
import com.pixelmed.dicom.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import netscape.javascript.JSObject;

@Service
public class MetaDataExtractionService
{
    private AttributeList attrList = new AttributeList();
    private String dicomFile = "dicom_images/ddl_01.dcm";

    public Map extractMetaData(List<String> attr_list) throws IOException, DicomException {
        Map result=new HashMap();
        attrList.read(dicomFile);
        for (String attribute : attr_list) {
            result.put(attribute, getAttributeInformation(attribute));
        }
        return result;
    }

    private String getAttributeInformation(String attrName) throws DicomException {
        return Attribute.getDelimitedStringValuesOrEmptyString(attrList, DicomDictionary.StandardDictionary.getTagFromName(attrName));
    }
}
