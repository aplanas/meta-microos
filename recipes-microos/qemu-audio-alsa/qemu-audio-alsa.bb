SUMMARY = "ALSA based audio support for QEMU"
DESCRIPTION = "This package contains a module for ALSA based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-audio-alsa-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "eb56e02d429bcfe5981dc238a4ef46adff3f8c26fadc9859d09e26fec9d05d166aeb15e24c5941a971cb8cc88672421a9ff4360fe67b1b23089dfd7f793153b0"

RPROVIDES:${PN} += "qemu-audio-alsa qemu-audio-alsa(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
