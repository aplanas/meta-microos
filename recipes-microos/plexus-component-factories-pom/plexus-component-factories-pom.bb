SUMMARY = "Plexus Component Factories POM"
DESCRIPTION = "This package provides Plexus Component Factories parent POM used by different \
Plexus packages."
LICENSE = "Apache-2.0"

PV = "1.0~alpha11"

RPM_NAME = "plexus-component-factories-pom-1.0~alpha11-1.22.noarch.rpm"
RPM_HASH = "5126b887868556fbb74903b12e3dd5f2495235a7ae17b4bb7c605aa26e7189366ab269abf57ded2e7b5db4af3ad34166dc1819a5c5f8b327a18ca7723278282f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-component-factories:pom:) \
mvn(plexus:plexus-component-factories:pom:) \
plexus-component-factories-pom"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.codehaus.plexus:plexus-container-default) \
mvn(org.codehaus.plexus:plexus:pom:)"

inherit rpm
