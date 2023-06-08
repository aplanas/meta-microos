SUMMARY = "Maven Artifact Resolver API"
DESCRIPTION = "The application programming interface for the repository system."
LICENSE = "Apache-2.0"

PV = "1.9.8"

RPM_NAME = "maven-resolver-api-1.9.8-1.1.noarch.rpm"
RPM_HASH = "a0f56f5adfe98559512ec1638a6860922ce2b81b3b143bf86557532bdcefaa907dc7abeefb4ef35a22ecf585d103e579a046a1c47a77e5f8aed3b62f7497cffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-api mvn(org.apache.maven.resolver:maven-resolver-api) mvn(org.apache.maven.resolver:maven-resolver-api:pom:) mvn(org.eclipse.aether:aether-api) mvn(org.eclipse.aether:aether-api:pom:) osgi(org.apache.maven.resolver.api)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
