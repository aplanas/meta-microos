SUMMARY = "DMG block support for QEMU"
DESCRIPTION = "This package contains a module for accessing Mac OS X image files from \
qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-block-dmg-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "374d55a5e2fc2a56edd2a4606302d4f5878a6b19bed7fd7ede9bbb217847011fd231fe368f5ff1decd82aa99f4045ba66a3472a0651f263a8bbc5bdecb090dcc"

RPROVIDES:${PN} += "qemu-block-dmg qemu-block-dmg(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) liblzfse.so()(64bit)"

inherit rpm
