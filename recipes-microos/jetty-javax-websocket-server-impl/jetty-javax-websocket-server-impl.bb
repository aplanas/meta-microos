SUMMARY = "The javax-websocket-server-impl module for Jetty"
DESCRIPTION = "%{extdesc} The javax-websocket-server-impl module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-javax-websocket-server-impl-9.4.48-3.1.noarch.rpm"
RPM_HASH = "d6c8b45f1b2a504b2981f4f4364e7daf12a4e6e993ef4d28507a8ad2c4343e3ee5113b1947ceee6e10829e3a55cbca02377515f67c2b5ac43eb06bb5b270d4b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-javax-websocket-server-impl mvn(org.eclipse.jetty.websocket:javax-websocket-server-impl) mvn(org.eclipse.jetty.websocket:javax-websocket-server-impl:pom:) osgi(org.eclipse.jetty.websocket.javax.websocket.server)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(javax.websocket:javax.websocket-api) mvn(org.eclipse.jetty.websocket:javax-websocket-client-impl) mvn(org.eclipse.jetty.websocket:websocket-server) mvn(org.eclipse.jetty:jetty-annotations)"

inherit rpm
