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

PV = "9.4.48"

RPM_NAME = "jetty-continuation-9.4.48-3.1.noarch.rpm"
RPM_HASH = "5c8d7a5788fbbdacc5d168b9fe3fa7a860924ff0ef7d6db593035c0339106ab9ee8e8cb17752fcd91167a9dc973d9fb508a9507a6fb0e579acbbbf992c8660dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-continuation mvn(org.eclipse.jetty:jetty-continuation) mvn(org.eclipse.jetty:jetty-continuation:pom:) osgi(org.eclipse.jetty.continuation)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
