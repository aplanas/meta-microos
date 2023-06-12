SUMMARY = "The util-ajax module for Jetty"
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
This package contains The util-ajax module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-util-ajax-9.4.51-1.1.noarch.rpm"
RPM_HASH = "55c02bf8ee75805f0fdf3fd22ec746afcdddebe0c52ac6385439194ac9834df03a53800216a6d2d677683f1711e214483b2f495fe46618932cc4a860edff79f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-util-ajax mvn(org.eclipse.jetty:jetty-util-ajax) mvn(org.eclipse.jetty:jetty-util-ajax:pom:) osgi(org.eclipse.jetty.util.ajax)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty:jetty-util)"

inherit rpm
