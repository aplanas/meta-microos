SUMMARY = "The servlets module for Jetty"
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
This package contains The servlets module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-servlets-9.4.48-3.1.noarch.rpm"
RPM_HASH = "8c5856f2d84c86b59b8b79731e1125fa1226dee1db775124149154a5b3d3f3bf744b97f630526b8285e782f8834fe4c6a05487f9821d7f72f0c217fde24a3310"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-servlets mvn(org.eclipse.jetty:jetty-servlets) mvn(org.eclipse.jetty:jetty-servlets:pom:) osgi(org.eclipse.jetty.servlets)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty:jetty-continuation) mvn(org.eclipse.jetty:jetty-http) mvn(org.eclipse.jetty:jetty-io) mvn(org.eclipse.jetty:jetty-util)"

inherit rpm
