SUMMARY = "cURL block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over \
a network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-block-curl-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "3e646ee75356677e3a1f3e376e160e33e2938a7e50d7881ca33b81368b1ffc6b220e578ad92bbe7f669d53ec9cc5e2ce1b36f04a51c94bf5131901b0a138b1eb"

RPROVIDES:${PN} += "qemu-block-curl qemu-block-curl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcurl.so.4()(64bit)"

inherit rpm
