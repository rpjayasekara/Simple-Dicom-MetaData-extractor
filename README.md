# Simple-Dicom-MetaData-extractor

## About

A simple RESTful web service which users are given privilege to extract DICOM image metadata. Here users are given ability to define the what metadata they need instead of extracting all the avialable medatada.

## End point

http://localhost:8080/extract?attr_list=[attribute list]

ex :

  http://localhost:8080/extract?attr_list=AcquisitionDate,TransferSyntaxUID



