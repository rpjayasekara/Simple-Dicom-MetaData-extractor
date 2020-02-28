# Simple-Dicom-MetaData-extractor

## About

A simple RESTful web service which users are given privilege to extract DICOM image metadata. Here users are given ability to define the what metadata they need instead of extracting all the avialable medatada.

## Install and Run

To install the dependencies, build the project and run, follow the below steps.

Step 01 - $mvn clean install
Step 02 - $mvn spring-boot:run

## End point

http://localhost:8080/extract?attr_list=[attribute list]

ex :

  http://localhost:8080/extract?attr_list=AcquisitionDate,TransferSyntaxUID

PS : Make sure to send the right attribute name with no space between words and camel case.
