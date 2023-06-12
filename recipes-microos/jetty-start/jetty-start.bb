SUMMARY = "The start module for Jetty"
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
This package contains The start module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-start-9.4.51-1.1.noarch.rpm"
RPM_HASH = "7da0a2fdce2b6b28b51b88a59e40a0afa0dc3a4c4f2dcde33d7f579aecb4b1760880736819394015f6c6677029aaf0072692a3a94af00b50a6beade405c8b9ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-start \
mvn(org.eclipse.jetty:jetty-start) \
mvn(org.eclipse.jetty:jetty-start:pom:) \
osgi(org.eclipse.jetty.start)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.eclipse.jetty:jetty-util)"

inherit rpm
