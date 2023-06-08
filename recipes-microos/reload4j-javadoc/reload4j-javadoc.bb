SUMMARY = "Javadoc for reload4j"
DESCRIPTION = "This package contains the API documentation for reload4j."
LICENSE = "Apache-2.0"

PV = "1.2.20"

RPM_NAME = "reload4j-javadoc-1.2.20-1.5.noarch.rpm"
RPM_HASH = "42c2ddefb4869ae1d4708b742c94b6f59241e7be07d0b4b7adf87a9d8c4e30a569f456bcbf9eae6a3f8e328e054f81fea6c023fff804053384fbacf580b70978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j12-javadoc reload4j-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
