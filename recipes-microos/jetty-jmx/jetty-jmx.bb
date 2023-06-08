SUMMARY = "The jmx module for Jetty"
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
This package contains The jmx module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-jmx-9.4.48-3.1.noarch.rpm"
RPM_HASH = "920995f0a05ed0b207b136a23e58ba08e45fa7d1e6cc7580f2299bb27438bc817a888b183d8c74d47bf00660a2f1fdec8c5da749a8df0cb4ff28a3f139d4a267"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jmx mvn(org.eclipse.jetty:jetty-jmx) mvn(org.eclipse.jetty:jetty-jmx:pom:) osgi(org.eclipse.jetty.jmx)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty:jetty-util)"

inherit rpm
