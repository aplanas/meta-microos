SUMMARY = "The websocket-api module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-api module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-websocket-api-9.4.48-3.1.noarch.rpm"
RPM_HASH = "9d2d11c71a5686223c1eaa88e053c2f491f39980124c442c302c7f9c3f77af35bfb77a3dc237958889e373f8ee8e6b664f39844162dbfbecfad712434216b2d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-api mvn(org.eclipse.jetty.websocket:websocket-api) mvn(org.eclipse.jetty.websocket:websocket-api:pom:) osgi(org.eclipse.jetty.websocket.api)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
