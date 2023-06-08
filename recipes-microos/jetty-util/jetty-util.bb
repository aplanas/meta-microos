SUMMARY = "The util module for Jetty"
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
This package contains The util module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-util-9.4.48-3.1.noarch.rpm"
RPM_HASH = "5ff980c30bfee53ce47eacb3c479c6b72a27e18f3af96b48abf96f39a0b43adff52a919de3e53d16df656a350b25e05190aa02e563e29b8c4d5bf92e104f5d36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-util mvn(org.eclipse.jetty:jetty-util) mvn(org.eclipse.jetty:jetty-util:pom:) osgi(org.eclipse.jetty.util)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
