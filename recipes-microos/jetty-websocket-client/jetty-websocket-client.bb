SUMMARY = "The The websocket-client module for Jetty"
DESCRIPTION = "%{extdesc} The The websocket-client module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-websocket-client-9.4.48-3.1.noarch.rpm"
RPM_HASH = "327a48c52dddd82e3e613df91fd563ef27cf2c8e9a9b4d3344e87d077b95580f1cf58c785902441d76cdd91c977e57e987b48e37a946ed75b977f31aa90450d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-client mvn(org.eclipse.jetty.websocket:websocket-client) mvn(org.eclipse.jetty.websocket:websocket-client:pom:) osgi(org.eclipse.jetty.websocket.client)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty.websocket:websocket-common) mvn(org.eclipse.jetty:jetty-client) mvn(org.eclipse.jetty:jetty-io) mvn(org.eclipse.jetty:jetty-util)"

inherit rpm
