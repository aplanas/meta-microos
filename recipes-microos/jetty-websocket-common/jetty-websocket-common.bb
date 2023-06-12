SUMMARY = "The websocket-common module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-common module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-common-9.4.51-1.1.noarch.rpm"
RPM_HASH = "661acecb8efb46290f5f086b6ca898001d226bce63c70c1c773db3c7cdc08b3102af052b613e6330144ce565794c240b5c94ddf2dcc7be91a8453b1e35d001d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-common mvn(org.eclipse.jetty.websocket:websocket-common) mvn(org.eclipse.jetty.websocket:websocket-common:pom:) osgi(org.eclipse.jetty.websocket.common)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty.websocket:websocket-api) mvn(org.eclipse.jetty:jetty-io) mvn(org.eclipse.jetty:jetty-util)"

inherit rpm
