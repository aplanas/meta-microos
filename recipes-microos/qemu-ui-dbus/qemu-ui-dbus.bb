SUMMARY = "D-Bus based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing D-Bus based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-ui-dbus-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "27cc484a6262d33596b91ac7e0c7b43dcec66bcde28208f6721a2913706ee981bb0c1b6223dfb3508fb371cf027eccc44dd769a5983cb36afa8fecccaa3c6ceb"

RPROVIDES:${PN} += "qemu-ui-dbus qemu-ui-dbus(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libepoxy.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libpixman-1.so.0()(64bit)"

inherit rpm
