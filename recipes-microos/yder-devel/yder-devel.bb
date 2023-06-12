SUMMARY = "Header files for yder"
DESCRIPTION = "Development and header files for yder."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.19"

RPM_NAME = "yder-devel-1.4.19-1.3.aarch64.rpm"
RPM_HASH = "e2fec071648f05633463b05b320995fb9e5905a0bc78db81e74364d3524236ee5bc3893ff09fd75c8c1956992ce2d4f22e27f7f25c6e2fce2f619abdd07efb76"

RPROVIDES:${PN} += "cmake(Yder) \
pkgconfig(libyder) \
yder-devel \
yder-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyder1_4 \
pkgconfig(liborcania) \
pkgconfig(libsystemd)"

inherit rpm
