SUMMARY = "Javadoc for maven-common-artifact-filters"
DESCRIPTION = "This package contains javadoc for maven-common-artifact-filters."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "maven-common-artifact-filters-javadoc-3.0.1-2.12.noarch.rpm"
RPM_HASH = "f76a05a62f06e4bce087c179f9832a30e126904d02ec629d2a468db2dc6b0fe18ed37a138aa9d371a65eed9675b1310deb449ef6281ecddb433c84bfa389fcdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-common-artifact-filters-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
