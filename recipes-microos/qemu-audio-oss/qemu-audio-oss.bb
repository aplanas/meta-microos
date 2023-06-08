SUMMARY = "OSS based audio support for QEMU"
DESCRIPTION = "This package contains a module for OSS based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-audio-oss-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "01c9e19e47ee218ebdb1c47d02cec2246aba0f49c206ed55e37a2dccf6f583eb765ca505d29cf03f7a8471d6b3dbe0884151d1e7366c46d5364a2f7aa0dc8d36"

RPROVIDES:${PN} += "qemu-audio-oss qemu-audio-oss(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
