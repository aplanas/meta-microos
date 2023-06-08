SUMMARY = "The quickstart module for Jetty"
DESCRIPTION = " \
Jetty is a 100% Java HTTP Server and Servlet Container. This means that you \
do not need to configure and run a separate web server (like Apache) in order \
to use Java, servlets and JSPs to generate dynamic content. Jetty is a fully \
featured web server for static and dynamic content. Unlike separate \
server/container solutions, this means that your web server and web \
application run in the same process, without interconnection overheads \
and complications. Furthermore, as a pure java component, Jetty can be simply \
included in your application for demonstration, distribution or deployment. \
Jetty is available on all Java supported platforms. \
 \
This package contains The quickstart module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-quickstart-9.4.48-3.1.noarch.rpm"
RPM_HASH = "c8eb1d0a7988acad118dfee20b12bb675f1b4505c17bc26d251fcbc5c7ce5402b17c2761e2804232cb51c8f67574b77c527ca04f2c5471ebefad91dd75ac700f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-quickstart mvn(org.eclipse.jetty:jetty-quickstart) mvn(org.eclipse.jetty:jetty-quickstart:pom:) osgi(org.eclipse.jetty.quickstart)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(javax.transaction:javax.transaction-api) mvn(org.eclipse.jetty:jetty-annotations) mvn(org.eclipse.jetty:jetty-jmx) mvn(org.eclipse.jetty:jetty-plus) mvn(org.eclipse.jetty:jetty-webapp)"

inherit rpm
