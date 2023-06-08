SUMMARY = "The websocket-common module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-common module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-websocket-common-9.4.48-3.1.noarch.rpm"
RPM_HASH = "9d0d067b79dd5e4555955a41e58cdacb56be8555463b221127337571553dc033c9331f25e139438013e22603f0823efb7798f0aea802b80574f0e6ebce579b74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-common mvn(org.eclipse.jetty.websocket:websocket-common) mvn(org.eclipse.jetty.websocket:websocket-common:pom:) osgi(org.eclipse.jetty.websocket.common)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.eclipse.jetty.websocket:websocket-api) mvn(org.eclipse.jetty:jetty-io) mvn(org.eclipse.jetty:jetty-util)"

inherit rpm
