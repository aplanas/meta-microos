SUMMARY = "Java implementation of multi-cast DNS"
DESCRIPTION = "JmDNS is a Java implementation of multi-cast DNS \
and can be used for service registration and discovery \
in local area networks. JmDNS is fully compatible \
with Apple's Bonjour."
LICENSE = "Apache-2.0"

PV = "3.5.7"

RPM_NAME = "jmdns-3.5.7-2.10.noarch.rpm"
RPM_HASH = "24b0a0dd7f479adfe680066e10cb1e98d0c5a2f9d5902c7dd3ede5d76957db2cd36b2c25aa3b1200b47949a247d99236d80f3488da1f2996938b03094bdc038f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmdns mvn(javax.jmdns:jmdns) mvn(javax.jmdns:jmdns:pom:) mvn(org.jmdns:jmdns) mvn(org.jmdns:jmdns:pom:) osgi(javax.jmdns)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.slf4j:slf4j-api)"

inherit rpm
