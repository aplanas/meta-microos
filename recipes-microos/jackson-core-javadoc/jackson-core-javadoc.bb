SUMMARY = "Javadoc for jackson-core"
DESCRIPTION = "This package contains API documentation for jackson-core."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-core-javadoc-2.13.3-1.3.noarch.rpm"
RPM_HASH = "e9144fa491fa5e6920fc36e42867f2eadb1d47bd8811ca4191da7df5588b63f200a200cc49ec64b173a21314899bf29967da797693761b04d2318504bf2484e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-core-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
