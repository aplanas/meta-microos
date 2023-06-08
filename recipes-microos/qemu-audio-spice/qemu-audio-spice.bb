SUMMARY = "Spice based audio support for QEMU"
DESCRIPTION = "This package contains a module for Spice based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-audio-spice-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "9d15c58040105183d31cfda2db93f37f1c8d419b7fe6c82652c9f4c7e0bdb7d7e14a4ee357935648ab5ef7c9f9af490cd7ed5892caea304bb8065e55434ac4d6"

RPROVIDES:${PN} += "qemu-audio-spice qemu-audio-spice(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libspice-server.so.1()(64bit) libspice-server.so.1(SPICE_SERVER_0.10.0)(64bit) libspice-server.so.1(SPICE_SERVER_0.12.5)(64bit) libspice-server.so.1(SPICE_SERVER_0.6.0)(64bit) qemu-ui-spice-core"

inherit rpm
