SUMMARY = "Module atom-provider for resteasy"
DESCRIPTION = " \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification. \
 \
This package contains Module atom-provider for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-atom-provider-3.0.26-3.10.noarch.rpm"
RPM_HASH = "6f5876a86b23682e2d4adea2db9ad86ddf95894bb7d96e9ab205de5c6daf7f2d3ad0e3a4fa6f9ce6245d7a37f75299309182f63025e24f76f337aaadad22f532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.jboss.resteasy:resteasy-atom-provider) \
mvn(org.jboss.resteasy:resteasy-atom-provider:pom:) \
resteasy-atom-provider"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.jboss.logging:jboss-logging-annotations) \
mvn(org.jboss.logging:jboss-logging-processor) \
mvn(org.jboss.resteasy:resteasy-jaxb-provider) \
mvn(org.jboss.resteasy:resteasy-jaxrs)"

inherit rpm
