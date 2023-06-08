SUMMARY = "The http-spi module for Jetty"
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
This package contains The http-spi module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-http-spi-9.4.48-3.1.noarch.rpm"
RPM_HASH = "aeb2ea9d3c715429322c4d37cbd315dc35dc2aa53a12738531fa6e170d0e74cdfc34ce5acc6fc5152c145e55dae167b289bab2f3ed8c0b9d452dd64f59114d69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-http-spi mvn(org.eclipse.jetty:jetty-http-spi) mvn(org.eclipse.jetty:jetty-http-spi:pom:) osgi(org.eclipse.jetty.http.spi)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
