SUMMARY = "JSR-356: Java WebSocket 1.0 API"
DESCRIPTION = "The JSR-356: Java WebSocket 1.0 API classes."
LICENSE = "CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "1.0.0"

RPM_NAME = "jboss-websocket-1.0-api-1.0.0-2.10.noarch.rpm"
RPM_HASH = "5eedc7229d0a0106c999620d699a4367c5b14c7585b7fb4f1e3366cc3ea04ad53cfc61cf17928a6df1eb40f44ce8a1a9b7ccd658fb7cbd3659a5e99748957e8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-websocket-1.0-api mvn(javax.websocket:javax.websocket-api) mvn(javax.websocket:javax.websocket-api:pom:) mvn(javax.websocket:javax.websocket-client-api) mvn(javax.websocket:javax.websocket-client-api:pom:) mvn(org.jboss.spec.javax.websocket:jboss-websocket-api_1.0_spec) mvn(org.jboss.spec.javax.websocket:jboss-websocket-api_1.0_spec:pom:) osgi(org.jboss.spec.javax.websocket.jboss-websocket-api_1.0_spec)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
