#Author: Anurag Verma

Here are the changes you need to make in your Web Application which must be using Spring-IOC -
1) Add dependency of wscreator to your pom.xml file - 
		
		<dependency>
			<groupId>com.maximaconsulting</groupId>
			<artifactId>wscreator</artifactId>
			<version>replace_with_latest_version</version>
		</dependency>
		
2) Add @WebService annotation to all the Interfaces you need to expose as a web-service.

3) Add @XmlSeeAlso({types}) annotation below @WebService annotation and add types used in the interface (POJO Types).

4) Add @HiddenMethod annotation to the methods which are not intended to be exposed as web-service.

5) In all annotated interfaces, add @WebParam(name="paramName") with a meaningful name to all parameters of all methods (skip for methods annotated with @HiddenMethod).

6) Add following content to your web.xml file. Change "url-pattern" node as per your need. Also update the scanPackages parameter with the package names to scan for interfaces with @WebService annotation.

	<servlet>
		<servlet-name>WSCreatorWebServices</servlet-name>
		<servlet-class>com.maximaconsulting.webservices.WSServlet</servlet-class>
		<init-param>
			<param-name>scanPackages</param-name>
			<param-value>comma_separated_package_names_to_scan_for_service_interfaces_without_spaces</param-value>
		</init-param>
		<load-on-startup>1</load-on-startup>
	</servlet>

	<servlet-mapping>
		<servlet-name>WSCreatorWebServices</servlet-name>
		<url-pattern>/webservices/*</url-pattern>
	</servlet-mapping>

7) Build your application & deploy it. Your SOAP & REST services should be ready to use. See Service Inventory page at http(s)://server:port/warfile_name/specified_uri  

NOTE: For calling SOAP Services, the "SOAPAction" header is a must
