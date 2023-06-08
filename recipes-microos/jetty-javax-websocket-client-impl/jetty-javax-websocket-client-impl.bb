SUMMARY = "The javax-websocket-client-impl module for Jetty"
DESCRIPTION = "%{extdesc} The javax-websocket-client-impl module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-javax-websocket-client-impl-9.4.48-3.1.noarch.rpm"
RPM_HASH = "3ddc2872b2537d1edeeca49e6076eca2bc961eb9a7755673f9c3fe8a735f8d185d3a7a02b2ca502e731585a02129bff2ae41eca4a0926ea9fc279bedbc3b94a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-javax-websocket-client-impl mvn(org.eclipse.jetty.websocket:javax-websocket-client-impl) mvn(org.eclipse.jetty.websocket:javax-websocket-client-impl:pom:) osgi(org.eclipse.jetty.websocket.javax.websocket)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(javax.websocket:javax.websocket-client-api) mvn(org.eclipse.jetty.websocket:websocket-client)"

inherit rpm
