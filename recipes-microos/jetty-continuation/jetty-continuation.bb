SUMMARY = "The continuation module for Jetty"
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
This package contains The continuation module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-continuation-9.4.51-1.1.noarch.rpm"
RPM_HASH = "61ea98569281e2e034aa49e26b79d5704882e3b53a4e2a19781641bffcae9dbd8818ef0ff755acd6bb0d70fbd4f75f5fad0806a6b5400c90bbb55b07e8f9abb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-continuation mvn(org.eclipse.jetty:jetty-continuation) mvn(org.eclipse.jetty:jetty-continuation:pom:) osgi(org.eclipse.jetty.continuation)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
