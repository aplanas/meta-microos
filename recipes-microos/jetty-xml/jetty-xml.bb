SUMMARY = "The xml module for Jetty"
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
This package contains The xml module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-xml-9.4.51-1.1.noarch.rpm"
RPM_HASH = "007566d3c782149e6d8d832d405da48268a1c9d241d6a56c30fbeddb82895b0cb65c792829dc44a0a294f89652f553802d3769ddc9c797cfd833b8d7009fbad4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-xml mvn(org.eclipse.jetty:jetty-xml) mvn(org.eclipse.jetty:jetty-xml:pom:) osgi(org.eclipse.jetty.xml)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty:jetty-util)"

inherit rpm
