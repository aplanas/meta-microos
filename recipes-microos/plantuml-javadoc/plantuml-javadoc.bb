SUMMARY = "Javadoc for plantuml"
DESCRIPTION = "This package contains the API documentation for plantuml."
LICENSE = "GPL-3.0-or-later"

PV = "1.2023.1"

RPM_NAME = "plantuml-javadoc-1.2023.1-1.3.noarch.rpm"
RPM_HASH = "9fb1469b3d05703bae79f62841d23b5e9e3278e767a7c6d9f869e0546d02a8caa6c51626efc310069b864d3c8fe007d20464c5f696a874642ac1ef1f226f1d9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plantuml-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
