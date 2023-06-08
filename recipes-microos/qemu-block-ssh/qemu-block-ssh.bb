SUMMARY = "SSH (SFTP) block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over an \
SSH network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-block-ssh-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "08861ffdcc3df19f36d79126257ba68807c24252ecc0cbfb0c76d9fcb9a6eb2439daf65937e7551eb928b12e922fae2e54beb92ee8e8c3359b7157993ba6999b"

RPROVIDES:${PN} += "qemu-block-ssh qemu-block-ssh(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libssh.so.4()(64bit) libssh.so.4(LIBSSH_4_5_0)(64bit) libssh.so.4(LIBSSH_4_7_0)(64bit)"

inherit rpm
