SUMMARY = "Developement files for ongres-stringprep"
DESCRIPTION = "This package contains development files for ongres-stringprep"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "ongres-stringprep-parent-1.1-1.10.noarch.rpm"
RPM_HASH = "19d0d0192cfedd4767c3e115fc38ae82c1911c6805809fe7888b91c221feda526b8493b5024aff7660fed64c63b9260aade159555fe88b97a5821e644cb9713b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.ongres.stringprep:parent:pom:) \
ongres-stringprep-parent"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.plugins:maven-compiler-plugin)"

inherit rpm
