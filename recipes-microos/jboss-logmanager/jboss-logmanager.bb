SUMMARY = "JBoss Log Manager"
DESCRIPTION = "This package contains the JBoss Log Manager"
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "jboss-logmanager-2.0.4-1.20.noarch.rpm"
RPM_HASH = "40721b7b0a4b32b7a0231478aee040306ab1b6faccf25f418730a0e0c11c8b70a3c05baf07b1e0e2f91f7271c6a0d73b4db89c5d0cb2f5ad9c13c56691fd4fcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logmanager mvn(org.jboss.logmanager:jboss-logmanager) mvn(org.jboss.logmanager:jboss-logmanager:pom:) osgi(org.jboss.logmanager.jboss-logmanager)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
