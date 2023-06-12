SUMMARY = "API documentation for maven"
DESCRIPTION = "API documentation for maven."
LICENSE = "Apache-2.0 & MIT"

PV = "3.9.1"

RPM_NAME = "maven-javadoc-3.9.1-2.1.noarch.rpm"
RPM_HASH = "a7889f637e7ee34e9f6c953a09f2ee7e186164b75e84c405e7b4c6f4399b9ac2e4b1b665ac66487ceafbe34fa3201cb64f5d8a74de066f3dc5ebe962f5f8f268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
