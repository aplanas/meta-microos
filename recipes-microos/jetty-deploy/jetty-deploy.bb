SUMMARY = "The deploy module for Jetty"
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
This package contains The deploy module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-deploy-9.4.48-3.1.noarch.rpm"
RPM_HASH = "0df781ae3c33766ad112560715f111dd5aacd1e4afd03af7d50ed7b153ea675f1574dc2c69b3c177f41634fc91956f1c20fc62bdc32fcddf011bc343574fdc21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-deploy mvn(org.eclipse.jetty:jetty-deploy) mvn(org.eclipse.jetty:jetty-deploy:pom:) osgi(org.eclipse.jetty.deploy)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty:jetty-webapp) mvn(org.eclipse.jetty:jetty-xml)"

inherit rpm
