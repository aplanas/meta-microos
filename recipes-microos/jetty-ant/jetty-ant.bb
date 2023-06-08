SUMMARY = "The ant module for Jetty"
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
This package contains The ant module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-ant-9.4.48-3.1.noarch.rpm"
RPM_HASH = "a9775b23f2a43352d30ea0e15aafd2a57d6deb704eea219fb0af5c6e7b056efd1db5f6cca9ca41059715e5156025ce691776383e0a5bb47c9523cffa7e0b20a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(jetty-ant) jetty-ant mvn(org.eclipse.jetty:jetty-ant) mvn(org.eclipse.jetty:jetty-ant:pom:) osgi(org.eclipse.jetty.ant)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.ant:ant) mvn(org.apache.ant:ant-launcher) mvn(org.eclipse.jetty:jetty-annotations) mvn(org.eclipse.jetty:jetty-plus) mvn(org.eclipse.jetty:jetty-security) mvn(org.eclipse.jetty:jetty-webapp)"

inherit rpm
