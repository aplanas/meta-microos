SUMMARY = "The cdi module for Jetty"
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
This package contains The cdi module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-cdi-9.4.48-3.1.noarch.rpm"
RPM_HASH = "d48072062c8d9a75175b19ca862165207e1e4d9dc9bc887ec1d1e3cee9cbcaec65ccb598a603dfd39cdd8224df838b553f61540e9cd96f632059ffcac822ac2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-cdi mvn(org.eclipse.jetty:jetty-cdi) mvn(org.eclipse.jetty:jetty-cdi:pom:) osgi(org.eclipse.jetty.cdi)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty:jetty-annotations) mvn(org.eclipse.jetty:jetty-server) mvn(org.eclipse.jetty:jetty-util) mvn(org.eclipse.jetty:jetty-webapp)"

inherit rpm
