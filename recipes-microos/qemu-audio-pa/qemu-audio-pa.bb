SUMMARY = "Pulse Audio based audio support for QEMU"
DESCRIPTION = "This package contains a module for Pulse Audio based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-audio-pa-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "cdf7dcccaceb0a1e5618dabf35073480f04596384d4dee42ed8957e9630324ac505754c5e6c641b85f1ed69cfe5724fdef7907151e6fd9799995a0c09a787f30"

RPROVIDES:${PN} += "qemu-audio-pa qemu-audio-pa(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
