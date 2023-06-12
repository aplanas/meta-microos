SUMMARY = "XMvn API"
DESCRIPTION = "This package provides XMvn API module which contains public interface \
for functionality implemented by XMvn Core."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-api-4.2.0-2.1.noarch.rpm"
RPM_HASH = "efa29773624af5bdd5baf8d65358a8c04eb036f0b39085a44f277d7c6c419d652312e224640990a02aea0f19ff64c866a485ce1e9bb4b4c19c04c206bc8ebbfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.fedoraproject.xmvn:xmvn-api) \
mvn(org.fedoraproject.xmvn:xmvn-api:pom:) \
xmvn-api"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
