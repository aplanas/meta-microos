SUMMARY = "Glassfish J2EE JSP API implementation"
DESCRIPTION = "This project provides a container independent implementation of JSP \
2.3. The main goals are: \
  * Improves current implementation: bug fixes and performance \
    improvements \
  * Provides API for use by other tools, such as Netbeans \
  * Provides a sandbox for new JSP features; provides a reference \
    implementation of next JSP spec."
LICENSE = "Apache-2.0 & (CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0)"

PV = "2.3.4"

RPM_NAME = "glassfish-jsp-2.3.4-2.10.noarch.rpm"
RPM_HASH = "4beea2c5b108ca1c4b8f3232bb3268b5ddd3e5ff44e7939ef0162567f210e099be41798df165fd73466aae0bb54f6a5e395d0fc1e91e51acf6ca891aafe96388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jsp javax.servlet.jsp jsp jsp2.3 mvn(org.eclipse.jetty.orbit:org.apache.jasper.glassfish) mvn(org.eclipse.jetty.orbit:org.apache.jasper.glassfish:pom:) mvn(org.glassfish.web:javax.servlet.jsp) mvn(org.glassfish.web:javax.servlet.jsp:pom:) osgi(org.glassfish.web.javax.servlet.jsp)"
RDEPENDS:${PN} += "glassfish-jsp-api java-headless javapackages-filesystem mvn(javax.servlet.jsp:javax.servlet.jsp-api) mvn(org.glassfish:javax.el)"

inherit rpm
