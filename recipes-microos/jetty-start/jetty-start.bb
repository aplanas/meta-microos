SUMMARY = "The start module for Jetty"
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
This package contains The start module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-start-9.4.48-3.1.noarch.rpm"
RPM_HASH = "cfe2b38c6ed513f032b8c53f6457b375ffb424782a966754404b5957c7ec724d2614425a70baeeccb53f14728bd1225764bf5a3a2f5a65ad81a29b084e869d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-start mvn(org.eclipse.jetty:jetty-start) mvn(org.eclipse.jetty:jetty-start:pom:) osgi(org.eclipse.jetty.start)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty:jetty-util)"

inherit rpm
