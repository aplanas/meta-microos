SUMMARY = "The xml module for Jetty"
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
This package contains The xml module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-xml-9.4.48-3.1.noarch.rpm"
RPM_HASH = "61037171491b1f081303b1265311cca8766093156a91f108d3ffb04cc3bd97453d68ead4117ab0d1d3346f9002aeea946c34ab8da88fad2b81d0620b09cdc3cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-xml mvn(org.eclipse.jetty:jetty-xml) mvn(org.eclipse.jetty:jetty-xml:pom:) osgi(org.eclipse.jetty.xml)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty:jetty-util)"

inherit rpm
