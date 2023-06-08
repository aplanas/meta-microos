SUMMARY = "The servlet module for Jetty"
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
This package contains The servlet module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-servlet-9.4.48-3.1.noarch.rpm"
RPM_HASH = "9ebec2296f8402f5b98e0a013832932825219d3ff73aa8736cf324c54541f19ddb60b8176f80740b79236f048a3f3159540a19b11a748297d23333039b710be0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-servlet mvn(org.eclipse.jetty:jetty-servlet) mvn(org.eclipse.jetty:jetty-servlet:pom:) osgi(org.eclipse.jetty.servlet)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty:jetty-security) mvn(org.eclipse.jetty:jetty-util-ajax)"

inherit rpm
