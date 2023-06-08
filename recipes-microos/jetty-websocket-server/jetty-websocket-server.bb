SUMMARY = "The websocket-server module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-server module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-websocket-server-9.4.48-3.1.noarch.rpm"
RPM_HASH = "19b11e35aa483c702f1c1c4617431584c29dc71437064bfc5b33935846c6a32a33c88d9852319c583100071919a26b4758d9df9d33c4f3cd1da55d6820114b65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-server mvn(org.eclipse.jetty.websocket:websocket-server) mvn(org.eclipse.jetty.websocket:websocket-server:pom:) osgi(org.eclipse.jetty.websocket.server)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty.websocket:websocket-client) mvn(org.eclipse.jetty.websocket:websocket-common) mvn(org.eclipse.jetty.websocket:websocket-servlet) mvn(org.eclipse.jetty:jetty-http) mvn(org.eclipse.jetty:jetty-servlet)"

inherit rpm
