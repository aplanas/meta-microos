SUMMARY = "The security module for Jetty"
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
This package contains The security module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-security-9.4.48-3.1.noarch.rpm"
RPM_HASH = "490098f9447926ea0be09acd81c7eb2aa6b6bbd9a2468dbebfde8e58a38df9aa7ac9dba2f2e741734911ef73d04fd21fff912a27e84bcde5da9b45d0caed1018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-security mvn(org.eclipse.jetty:jetty-security) mvn(org.eclipse.jetty:jetty-security:pom:) osgi(org.eclipse.jetty.security)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty:jetty-server)"

inherit rpm
