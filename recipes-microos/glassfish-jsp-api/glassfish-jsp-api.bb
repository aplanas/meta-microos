SUMMARY = "Glassfish J2EE JSP API specification"
DESCRIPTION = "This project provides a container independent specification of JSP \
2.2. Note that this package doesn't contain implementation of this \
specification. See glassfish-jsp for one of implementations"
LICENSE = "Apache-2.0 & (CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0)"

PV = "2.3.3"

RPM_NAME = "glassfish-jsp-api-2.3.3-4.3.noarch.rpm"
RPM_HASH = "e502a356f9c0512681a87b4ca5d998e087f3ce581e96c5785817125eebcfe273e1dcc4c43387a9470fa08ba6e11fe35397fcece0b4534ecbb8793e6e62bc0f49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jsp-api \
mvn(javax.servlet.jsp:javax.servlet.jsp-api) \
mvn(javax.servlet.jsp:javax.servlet.jsp-api:pom:) \
mvn(javax.servlet.jsp:jsp-api) \
mvn(javax.servlet.jsp:jsp-api:pom:) \
mvn(javax.servlet:jsp-api) \
mvn(javax.servlet:jsp-api:pom:) \
osgi(javax.servlet.jsp)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(javax.el:javax.el-api) \
mvn(javax.servlet:javax.servlet-api)"

inherit rpm
