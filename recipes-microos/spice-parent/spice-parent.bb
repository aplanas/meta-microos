SUMMARY = "Sonatype Spice Components"
DESCRIPTION = "Spice components and libraries are common components \
used throughout the Sonatype Forge."
LICENSE = "Apache-2.0"

PV = "26"

RPM_NAME = "spice-parent-26-1.11.noarch.rpm"
RPM_HASH = "202cde5724652d4aa7e9ba27dcf76123c7536e91919b4b90a5d6b812f5b90a75c6e6ded96753320823db68347b9770d252b318e54cb9fa9dc561452ae2826641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.sonatype.spice:spice-parent:pom:) \
spice-parent"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.sonatype.forge:forge-parent:pom:)"

inherit rpm
