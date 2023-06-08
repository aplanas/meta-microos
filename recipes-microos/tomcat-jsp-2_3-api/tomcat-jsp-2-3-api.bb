SUMMARY = "Apache Tomcat JSP API implementation classes"
DESCRIPTION = "Apache Tomcat JSP API implementation classes version 2.3"
LICENSE = "Apache-2.0"

PV = "9.0.43"

RPM_NAME = "tomcat-jsp-2_3-api-9.0.43-16.1.noarch.rpm"
RPM_HASH = "d2b20bc3c1d5dfd36da6ce8dbc2b204f37652ae94ec138df65421a2481ce1c4271101cda7302a5329032159c8ad366ce9564bbaed19b7ceef2b0e7abc190c9dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsp jsp23 mvn(org.apache.tomcat:tomcat-jsp-api) mvn(org.apache.tomcat:tomcat-jsp-api:pom:) mvn(org.eclipse.jetty.orbit:javax.servlet.jsp) mvn(org.eclipse.jetty.orbit:javax.servlet.jsp:pom:) osgi(org.apache.tomcat-jsp-api) tomcat-jsp-2.3-api tomcat-jsp-2_3-api"
RDEPENDS:${PN} += "/bin/sh java-headless javapackages-filesystem mvn(org.apache.tomcat:tomcat-el-api) mvn(org.apache.tomcat:tomcat-servlet-api) update-alternatives"

inherit rpm
