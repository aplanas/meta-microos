SUMMARY = "The jndi module for Jetty"
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
This package contains The jndi module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-jndi-9.4.48-3.1.noarch.rpm"
RPM_HASH = "2aa62d3cf9dfd04005a3b4b8ccd64815300c011e9598ce241423060af254da9050c30ce66311bc52dda2ad84154e391a1365069b544e907f303fb4af43204cfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jndi mvn(org.eclipse.jetty:jetty-jndi) mvn(org.eclipse.jetty:jetty-jndi:pom:) osgi(org.eclipse.jetty.jndi)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty:jetty-util)"

inherit rpm
