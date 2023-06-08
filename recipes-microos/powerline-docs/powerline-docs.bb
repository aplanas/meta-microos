SUMMARY = "Documentation for powerline"
DESCRIPTION = "This package provides the powerline documentation."
LICENSE = "MIT"

PV = "2.8.3"

RPM_NAME = "powerline-docs-2.8.3-2.2.noarch.rpm"
RPM_HASH = "96979bcbce02efce785d2c997c63a61090683725b6d995a5b9e757eba2dcd8b17c01d7f84c08967d714904f3ba40fa6efdf329598e198543d5629e50dc3f0ea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "powerline-docs"
RDEPENDS:${PN} += ""

inherit rpm
