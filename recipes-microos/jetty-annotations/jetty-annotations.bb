SUMMARY = "The annotations module for Jetty"
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
This package contains The annotations module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-annotations-9.4.48-3.1.noarch.rpm"
RPM_HASH = "eaeb4df8de8abc0c98eff4adce6bb1a0cb7b029c66e11fe3681acb52f29cb6bcb98e5bca9c8377cea175171091aab6d463d710c5dfd42df0aba6cde7787d548c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-annotations mvn(org.eclipse.jetty:jetty-annotations) mvn(org.eclipse.jetty:jetty-annotations:pom:) osgi(org.eclipse.jetty.annotations)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(javax.annotation:javax.annotation-api) mvn(org.eclipse.jetty:jetty-plus) mvn(org.eclipse.jetty:jetty-webapp) mvn(org.ow2.asm:asm) mvn(org.ow2.asm:asm-commons)"

inherit rpm
