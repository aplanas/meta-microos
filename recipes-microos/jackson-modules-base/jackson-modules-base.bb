SUMMARY = "Jackson modules: Base"
DESCRIPTION = "Jackson 'base' modules: modules that build directly on databind, \
and are not data-type, data format, or JAX-RS provider modules."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-modules-base-2.13.3-1.7.noarch.rpm"
RPM_HASH = "540bb25cfccda8833978a74726b6ee100b9a7c5fc353289793d7fd34b1bcc63c2138f367d9d9700addffcd781afc0e2f9bfb834d2c2f54c4813efb41ff3c7b6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-modules-base \
mvn(com.fasterxml.jackson.module:jackson-modules-base:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson:jackson-base:pom:)"

inherit rpm
