SUMMARY = "Javadoc for javapoet"
DESCRIPTION = "This package contains javadoc for javapoet."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "javapoet-javadoc-1.13.0-1.1.noarch.rpm"
RPM_HASH = "09aea267f38ca268b41cfa3b21c2dd7274aa48477d11d01b2ffda52662c4a09a2749bdf55c88cdeeb9b6e221faf21e4505ab95c8ccb59f57748b24c233451170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javapoet-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
