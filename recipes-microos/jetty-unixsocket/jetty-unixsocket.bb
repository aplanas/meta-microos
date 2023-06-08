SUMMARY = "The unixsocket modules for Jetty"
DESCRIPTION = "Jetty is a 100% Java HTTP Server and Servlet Container. This means that you\\ \
do not need to configure and run a separate web server (like Apache) in order\\ \
to use Java, servlets and JSPs to generate dynamic content. Jetty is a fully\\ \
featured web server for static and dynamic content. Unlike separate\\ \
server/container solutions, this means that your web server and web\\ \
application run in the same process, without interconnection overheads\\ \
and complications. Furthermore, as a pure java component, Jetty can be simply\\ \
included in your application for demonstration, distribution or deployment.\\ \
Jetty is available on all Java supported platforms. \
 \
This package contains the unixsocket module for Jetty"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-unixsocket-9.4.48-3.1.noarch.rpm"
RPM_HASH = "89a6f8298c1f9da68102e38df2ed2cde9c8e1735f68f01f42fe575a52ce37df81e10f5ca695d7038d224ff2358fed8150f925022d22d84c293b9036ee6a6cf5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-unixsocket mvn(org.eclipse.jetty:jetty-unixsocket) mvn(org.eclipse.jetty:jetty-unixsocket:pom:) osgi(org.eclipse.jetty.unixsocket)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.github.jnr:jnr-unixsocket) mvn(org.eclipse.jetty:jetty-server)"

inherit rpm
