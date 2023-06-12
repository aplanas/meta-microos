SUMMARY = "Pulse Audio based audio support for QEMU"
DESCRIPTION = "This package contains a module for Pulse Audio based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-audio-pa-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "a8b1628920145a0b984f8109f91a645ced39adb14794ac67e5a780ad541d1f9b9539e26126d613bb64c4a9a4da202cbb313483cdcf8a59c702d99e18ec22a16d"

RPROVIDES:${PN} += "qemu-audio-pa qemu-audio-pa(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
