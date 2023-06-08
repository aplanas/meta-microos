SUMMARY = "D-Bus based audio support for QEMU"
DESCRIPTION = "This package provides a module for D-Bus based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-audio-dbus-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "7463befa23071f8edc8fdbc0c62f2b9f6934cc73537ca9073c1f3cd9e38a7a51d955ee3185fda1054c0aa71a2004fcb92efcd17b50d36313dcc57bab67304bbd"

RPROVIDES:${PN} += "qemu-audio-dbus qemu-audio-dbus(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
