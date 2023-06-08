SUMMARY = "JAX-RS 2.0: The Java API for RESTful Web Services"
DESCRIPTION = "JSR 339: JAX-RS 2.0: The Java API for RESTful Web Services."
LICENSE = "Apache-2.0 & (CDDL-1.0 | GPL-2.0-only)"

PV = "1.0.1"

RPM_NAME = "jboss-jaxrs-2.0-api-1.0.1-3.8.noarch.rpm"
RPM_HASH = "51e037cf705a91c32d9732029ddef5b4d8e16aaf1ceadc05f5a33cd5c50febdab5170cf3a43cbf0d2a5df02350156090f504ab7b14dc8c4bad3ec19f28aeaf46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-jaxrs-2.0-api mvn(org.jboss.resteasy:jaxrs-api) mvn(org.jboss.resteasy:jaxrs-api:pom:) mvn(org.jboss.spec.javax.ws.rs:jboss-jaxrs-api_2.0_spec) mvn(org.jboss.spec.javax.ws.rs:jboss-jaxrs-api_2.0_spec:pom:) osgi(org.jboss.spec.javax.ws.rs.jboss-jaxrs-api_2.0_spec)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
