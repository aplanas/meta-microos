SUMMARY = "Documentation for hwloc"
DESCRIPTION = "This package contains the documentation for hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.9.0"

RPM_NAME = "hwloc-doc-2.9.0-2.3.noarch.rpm"
RPM_HASH = "981d260a1aaf1cf5ff6feaee412c7c604652498ec83d99dfacf3c1b0c1bb736dc796e29ff90ead1c365fb635bee87216675405c6d83ab4cb134ae770c637ff66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hwloc-doc"
RDEPENDS:${PN} += ""

inherit rpm
