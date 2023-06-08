SUMMARY = "The io module for Jetty"
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
This package contains The io module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-io-9.4.48-3.1.noarch.rpm"
RPM_HASH = "09fc9bfbc2ceda1de6e20a506baa01101467a1624838cc0541d9ccddf3a1100d57a58eb1bf5127d7054325447072b521269fc3d94a37fdd64b4b1f3aad8a5caf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-io mvn(org.eclipse.jetty:jetty-io) mvn(org.eclipse.jetty:jetty-io:pom:) osgi(org.eclipse.jetty.io)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty:jetty-util)"

inherit rpm
