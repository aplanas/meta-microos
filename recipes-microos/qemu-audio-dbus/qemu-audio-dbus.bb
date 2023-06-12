SUMMARY = "D-Bus based audio support for QEMU"
DESCRIPTION = "This package provides a module for D-Bus based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-audio-dbus-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "02624cf3685a110a72bf0eca8752cece88c001e43423ec45df26dba0f56fe2d2a523adcb965333e0f8292a10a056ad4995c72b7dcc229a8a7b6f0d8cde641c6d"

RPROVIDES:${PN} += "qemu-audio-dbus qemu-audio-dbus(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
