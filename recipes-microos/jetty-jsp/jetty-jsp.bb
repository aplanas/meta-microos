SUMMARY = "The jsp module for Jetty"
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
This package contains The jsp module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-jsp-9.4.48-3.1.noarch.rpm"
RPM_HASH = "d15c4f170ab6357c726c9f6a39a9b88089687510a6a0e815db3040cd8271b1f9a8396c7a56439b970cfafd17b7e7d28585d860c7d17332a4d14b3dc153bb9438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jsp mvn(org.eclipse.jetty:apache-jsp) mvn(org.eclipse.jetty:apache-jsp::nolog:) mvn(org.eclipse.jetty:apache-jsp:pom:) mvn(org.eclipse.jetty:jetty-jsp) mvn(org.eclipse.jetty:jetty-jsp::nolog:) mvn(org.eclipse.jetty:jetty-jsp:pom:) osgi(org.eclipse.jetty.apache-jsp)"
RDEPENDS:${PN} += "glassfish-el java-headless javapackages-filesystem mvn(javax.servlet:javax.servlet-api) mvn(org.apache.tomcat:tomcat-jasper) mvn(org.eclipse.jetty.toolchain:jetty-schemas) mvn(org.eclipse.jetty:jetty-annotations) mvn(org.eclipse.jetty:jetty-util)"

inherit rpm
