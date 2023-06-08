SUMMARY = "The server module for Jetty"
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
This package contains The server module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-server-9.4.48-3.1.noarch.rpm"
RPM_HASH = "5bdfd144de32d64528e92b27ea923ec55b8a8357a7e52aeb61ea947d925df26d9198c8a320ba5630e6ecbce4dcffde1ee9dc408265fb12173255c5e40735f9a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-server mvn(org.eclipse.jetty:jetty-server) mvn(org.eclipse.jetty:jetty-server:pom:) osgi(org.eclipse.jetty.server)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(javax.servlet:javax.servlet-api) mvn(org.eclipse.jetty:jetty-http) mvn(org.eclipse.jetty:jetty-io)"

inherit rpm
