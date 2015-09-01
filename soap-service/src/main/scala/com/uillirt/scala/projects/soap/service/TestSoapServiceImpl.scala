package com.uillirt.scala.projects.soap.service

import javax.jws.WebService

import com.uillirt.scala.projects.ws.{ListCategoriesResponse, ListCategoriesRequest, TestSoapService}

/**
 * Created by kshekhovtsova on 01.09.2015.
 */
@WebService(portName = "TestSoapServiceSOAP",
  serviceName = "TestSoapService",
  targetNamespace = "http://uillirt.com/scala/projects/ws/",
  wsdlLocation = "/META-INF/wsdl/TestSoapService.wsdl",
  endpointInterface = "com.uillirt.scala.projects.ws.TestSoapService")
class TestSoapServiceImpl extends TestSoapService {
  override def listCategories(listCategoriesRequest: ListCategoriesRequest): ListCategoriesResponse = {
    val response = new ListCategoriesResponse();
    response.getCode.add(listCategoriesRequest.getCode.get(0))
    response
  }
}
