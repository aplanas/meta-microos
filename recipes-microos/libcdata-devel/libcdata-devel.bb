SUMMARY = "Development files for libcdata, a C generic data library"
DESCRIPTION = "A library for C generic data functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcdata."
LICENSE = "LGPL-3.0-or-later"

PV = "20230108"

RPM_NAME = "libcdata-devel-20230108-1.2.aarch64.rpm"
RPM_HASH = "c37c64c33e0f6ac71393111e9604a01c81bd5195dff92a2161ce90131cbc7964c04f402c0b40b8850599b60956057236a5e1bab2544bcdea9c199eb7e1c5eb2a"

RPROVIDES:${PN} += "libcdata-devel \
libcdata-devel(aarch-64) \
pkgconfig(libcdata)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcdata1"

inherit rpm
