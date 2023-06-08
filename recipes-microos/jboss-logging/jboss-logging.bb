SUMMARY = "The JBoss Logging Framework"
DESCRIPTION = "This package contains the JBoss Logging Framework."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "jboss-logging-3.4.1-3.10.noarch.rpm"
RPM_HASH = "77f8a27e0381b02bef7b2892a976917176620b6c9ad77d5ec1b3f8b2da455fdfee4c467ee597245e203e1cb25567bf164c1bfba60ad1aaf5fc90d0e65904f250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logging mvn(org.jboss.logging:jboss-logging) mvn(org.jboss.logging:jboss-logging:pom:) osgi(org.jboss.logging.jboss-logging)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
