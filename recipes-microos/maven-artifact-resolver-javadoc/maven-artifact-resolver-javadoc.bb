SUMMARY = "Javadoc for maven-artifact-resolver"
DESCRIPTION = "API documentation for maven-artifact-resolver."
LICENSE = "Apache-2.0"

PV = "1.0"

RPM_NAME = "maven-artifact-resolver-javadoc-1.0-3.10.noarch.rpm"
RPM_HASH = "8e90cc833219b25239af41c15b12c87eba313f4bfd34432a06712751359b029cbf155bceb5d95965c9930ea4cc500daeb73bd7d3e28b5ba9ba4b098a0ffa22be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-artifact-resolver-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
