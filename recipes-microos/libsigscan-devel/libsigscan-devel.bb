SUMMARY = "Development files for libigscan"
DESCRIPTION = "libsigscan is a library for binary signature scanning \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libpff."
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "libsigscan-devel-20230109-1.4.aarch64.rpm"
RPM_HASH = "510d261e4c9137ed5967d01c3aab68f1255f469b65dca92086047744de6a44107b5d9deb56550db2ab8cbac9c20467dd61299df03445b6312cebc6bbea47201a"

RPROVIDES:${PN} += "libsigscan-devel \
libsigscan-devel(aarch-64) \
pkgconfig(libsigscan)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libsigscan1"

inherit rpm
