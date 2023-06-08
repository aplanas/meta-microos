SUMMARY = "JACK based audio support for QEMU"
DESCRIPTION = "This package contains a module for JACK based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-audio-jack-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "32504ddbfd1cbb1b8e986bef1a81a104e1bb9759e1fa2bd09303813902e7824618cc69d4623b89436daebe0b41ba83213dd3b1c5a856f58eee5b13a50670afe1"

RPROVIDES:${PN} += "qemu-audio-jack qemu-audio-jack(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libjack.so.0()(64bit)"

inherit rpm
