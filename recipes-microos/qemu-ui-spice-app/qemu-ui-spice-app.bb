SUMMARY = "Spice UI support for QEMU"
DESCRIPTION = "This package contains a module for doing Spice based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-ui-spice-app-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "ae4cdcf742514501a6b9c25b50f2a6fdd6660fa9f161be1daf9fba5c129d4b33d1374ca82df290db06b8e7d47135584572c1cfbc60537439ec327fe6dd7f0aa6"

RPROVIDES:${PN} += "qemu-ui-spice-app qemu-ui-spice-app(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) qemu-chardev-spice qemu-ui-spice-core"

inherit rpm
