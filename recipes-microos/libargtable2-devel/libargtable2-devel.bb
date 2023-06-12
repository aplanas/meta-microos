SUMMARY = "Development files for argtable, a command line parsing library"
DESCRIPTION = "The libargtable2-devel package contains libraries and header files for \
developing applications that use libargtable."
LICENSE = "LGPL-2.0+"

PV = "2.13"

RPM_NAME = "libargtable2-devel-2.13-2.23.aarch64.rpm"
RPM_HASH = "49dd01f25d8491a5899ab792d85d87fc1fc47a2066d552cd98d6efba6c6786bce6ef1724dc4db684f2a43fb72d8ff452d77e17370d1a3c129cc02419a2cdba13"

RPROVIDES:${PN} += "libargtable2-devel \
libargtable2-devel(aarch-64) \
pkgconfig(argtable2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libargtable2-0"

inherit rpm
