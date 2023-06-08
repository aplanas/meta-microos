SUMMARY = "Javadoc for jackson-annotations"
DESCRIPTION = "This package contains API documentation for jackson-annotations."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-annotations-javadoc-2.13.3-1.3.noarch.rpm"
RPM_HASH = "d8475259d99e97ed8480706efa68df80c0dda66d796b84661c2130c80823c21aae449004dbd397fd4c997d09e192dbb1463892b3ddb6b591ff4e6e2510ed28f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-annotations-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
