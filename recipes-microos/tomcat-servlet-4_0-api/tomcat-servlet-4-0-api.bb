SUMMARY = "Apache Tomcat Servlet API implementation classes"
DESCRIPTION = "Apache Tomcat Servlet API implementation classes version 3.1"
LICENSE = "Apache-2.0"

PV = "9.0.43"

RPM_NAME = "tomcat-servlet-4_0-api-9.0.43-16.1.noarch.rpm"
RPM_HASH = "8ba368268708ff573ee1183dc04d62e136ac3ba70a27f757139d33134c18f1273fc3dfafa457a177b92b841ed962281c7f1ce7a069d7df19fca771bc1db67ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.apache.tomcat:tomcat-servlet-api) mvn(org.apache.tomcat:tomcat-servlet-api:pom:) mvn(org.mortbay.jetty:servlet-api) mvn(org.mortbay.jetty:servlet-api:pom:) osgi(org.apache.tomcat-servlet-api) servlet servlet31 servlet7 tomcat-servlet-4.0-api tomcat-servlet-4_0-api"
RDEPENDS:${PN} += "/bin/sh java-headless javapackages-filesystem update-alternatives"

inherit rpm
