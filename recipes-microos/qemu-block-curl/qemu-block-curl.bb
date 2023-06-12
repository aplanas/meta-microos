SUMMARY = "cURL block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over \
a network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-block-curl-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "ad9283f63872ee1be04b79459c46f4d4d0c1efa939726219ed9401e7eef3664ba2ad4a828d364b0220870b909193e2519df6099398e5b14b10da0bc519eadbd8"

RPROVIDES:${PN} += "qemu-block-curl \
qemu-block-curl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcurl.so.4()(64bit)"

inherit rpm
