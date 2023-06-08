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

PV = "9.4.48"

RPM_NAME = "jetty-jaas-9.4.48-3.1.noarch.rpm"
RPM_HASH = "5b141bbe517b4422470a58d0ea6c71108cc6c5f158eec67944341eaafdf10757548e8858401f958b103210066ab5c7f071ea4ed6dec0f6f2d2163ea002d54c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jaas mvn(org.eclipse.jetty:jetty-jaas) mvn(org.eclipse.jetty:jetty-jaas:pom:) osgi(org.eclipse.jetty.jaas)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty:jetty-security)"

inherit rpm
