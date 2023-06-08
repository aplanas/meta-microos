SUMMARY = "Spice vmc and port chardev support for QEMU"
DESCRIPTION = "This package contains a module for Spice chardev support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-chardev-spice-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "1cd4834ecbfa5daa3915b0f15d18c8d952f9f502c9054b54911288f3fced74778fa7d45cf27c8e5621007a8b58906393b90af8a0b6b1e13b0b1603f420a6eaca"

RPROVIDES:${PN} += "qemu-chardev-spice qemu-chardev-spice(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libspice-server.so.1()(64bit) libspice-server.so.1(SPICE_SERVER_0.12.2)(64bit) libspice-server.so.1(SPICE_SERVER_0.6.0)(64bit) qemu-ui-spice-core"

inherit rpm
