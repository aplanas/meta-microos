SUMMARY = "The websocket-servlet module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-servlet module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-websocket-servlet-9.4.48-3.1.noarch.rpm"
RPM_HASH = "c2c19e243ab0b22cece0e9f517a072465b8fa9ae4365e23c805e586c56bd397de028938f1bcb18d87e73b50879f55fd3204196de0cd63aaeab29d1a7fe965843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-servlet mvn(org.eclipse.jetty.websocket:websocket-servlet) mvn(org.eclipse.jetty.websocket:websocket-servlet:pom:) osgi(org.eclipse.jetty.websocket.servlet)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(javax.servlet:javax.servlet-api) mvn(org.eclipse.jetty.websocket:websocket-api)"

inherit rpm
