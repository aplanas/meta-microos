SUMMARY = "Javadocs for jfreechart"
DESCRIPTION = "This package contains the API documentation for jfreechart."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.19"

RPM_NAME = "jfreechart-javadoc-1.0.19-1.18.noarch.rpm"
RPM_HASH = "968e058da8c5ee2d82c14f93abd66a970df3d7d51f2caf641d3875dffb90fafc5c8477cdeffb23feb2e85e2152c94e7d4582f2c9e45899aafb9284e2a23e585f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jfreechart-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem jfreechart jpackage-utils"

inherit rpm
