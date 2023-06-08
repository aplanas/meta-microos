SUMMARY = "Expression Language v3.0 API"
DESCRIPTION = "Expression Language API version 3.0."
LICENSE = "Apache-2.0"

PV = "9.0.43"

RPM_NAME = "tomcat-el-3_0-api-9.0.43-16.1.noarch.rpm"
RPM_HASH = "04fc26c6a33e09ebda761f9ec22dee970bedc4aaa8d062f0acd92ca240661b89e4011999d0017035dcc6edc5058969141ba42d9e897fa9b6b04b8b5f8be3c1c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "el_3_0_api el_api mvn(org.apache.tomcat:tomcat-el-api) mvn(org.apache.tomcat:tomcat-el-api:pom:) mvn(org.eclipse.jetty.orbit:javax.el) mvn(org.eclipse.jetty.orbit:javax.el:pom:) osgi(org.apache.tomcat-el-api) tomcat-el-3.0-api tomcat-el-3_0-api"
RDEPENDS:${PN} += "/bin/sh java-headless javapackages-filesystem update-alternatives"

inherit rpm
