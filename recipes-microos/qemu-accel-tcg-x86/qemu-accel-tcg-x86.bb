SUMMARY = "TCG accelerator for QEMU"
DESCRIPTION = "TCG is the QEMU binary translator, responsible for converting from target to \
host instruction set. \
 \
This package provides the TCG accelerator for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-accel-tcg-x86-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "de9590d089d441ed2f90ed3f94ba6d214c2e07140f26e2660923a2f6269dfa927820189043f793d025da66839f6aa4db3df3ef048e87881d4b2b85e8ca2c6f4c"

RPROVIDES:${PN} += "qemu-accel-tcg-x86 qemu-accel-tcg-x86(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
