SUMMARY = "QXL display support for QEMU"
DESCRIPTION = "This package contains a module for QXL display support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-hw-display-qxl-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "ecfef1a80893879d76855e1224757ce07872bdb9727583cc7c396de5c70a6084c309d1155f2da735b127414eb61cf137d21a25561caa5087618ad5423b6a7127"

RPROVIDES:${PN} += "qemu-hw-display-qxl qemu-hw-display-qxl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpixman-1.so.0()(64bit) libspice-server.so.1()(64bit) libspice-server.so.1(SPICE_SERVER_0.10.4)(64bit) libspice-server.so.1(SPICE_SERVER_0.12.3)(64bit) libspice-server.so.1(SPICE_SERVER_0.14.2)(64bit) libspice-server.so.1(SPICE_SERVER_0.8.2)(64bit) qemu-ui-spice-core"

inherit rpm
