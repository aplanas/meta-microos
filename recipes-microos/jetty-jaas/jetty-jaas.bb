SUMMARY = "The jaas module for Jetty"
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
This package contains The jaas module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-jaas-9.4.51-1.1.noarch.rpm"
RPM_HASH = "0fe4a71c557fd5979cb83a0acb2531bee61c9a8eb44f13f421b8dfac8d57047562b93024086897b9c74c3db3c822c6ae0372f371e642a032957fa250ac9f3324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jaas mvn(org.eclipse.jetty:jetty-jaas) mvn(org.eclipse.jetty:jetty-jaas:pom:) osgi(org.eclipse.jetty.jaas)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty:jetty-security)"

inherit rpm
