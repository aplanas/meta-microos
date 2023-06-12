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

PV = "9.4.51"

RPM_NAME = "jetty-security-9.4.51-1.1.noarch.rpm"
RPM_HASH = "2078f09efae25f5828f33af7c64a59d5d177f8224938a703215ba326c8b453ce0a5109b5de37709590da89fd3412dd0be75c4b53337bf92d5a48e44ead42baf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-security \
mvn(org.eclipse.jetty:jetty-security) \
mvn(org.eclipse.jetty:jetty-security:pom:) \
osgi(org.eclipse.jetty.security)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.eclipse.jetty:jetty-server)"

inherit rpm
