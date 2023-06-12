SUMMARY = "Devel package for libtextstyle"
DESCRIPTION = "This package provides headers and static libraries for libtextstyle"
LICENSE = "LGPL-2.1-or-later"

PV = "0.21.1"

RPM_NAME = "libtextstyle-devel-0.21.1-2.1.aarch64.rpm"
RPM_HASH = "2ca26287a8c2be3ab638d2797ad8d4a419ce38066babf3fd8617ee113707a10bbc7f940575e10f8eeb8ac318853805bdc7caef36350cd3e9375ae7ff6bbe1b1c"

RPROVIDES:${PN} += "libtextstyle-devel \
libtextstyle-devel(aarch-64)"
RDEPENDS:${PN} += "libtextstyle0"

inherit rpm
