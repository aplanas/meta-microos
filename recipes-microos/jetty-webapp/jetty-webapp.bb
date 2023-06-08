SUMMARY = "The webapp module for Jetty"
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
This package contains The webapp module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-webapp-9.4.48-3.1.noarch.rpm"
RPM_HASH = "5c856fa9ec50a3877977cedc2a1f59b217c82d39f5f13c0dd358961e17de7610e63e170356f7b75bbf9d30223d1a0a79bd9c1e2b9115e4818824529e419e6900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-webapp mvn(org.eclipse.jetty:jetty-webapp) mvn(org.eclipse.jetty:jetty-webapp:pom:) osgi(org.eclipse.jetty.webapp)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty:jetty-servlet) mvn(org.eclipse.jetty:jetty-xml)"

inherit rpm
