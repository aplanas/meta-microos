SUMMARY = "iSCSI block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over an \
iSCSI network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-block-iscsi-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "e0e0bac647e40226d8fb054d7afae0a27ac365e8e176f71f07199ed19962d8ccf4b93aa41207f22461d3c6e7d08d6af372af1eda49667703077d5ae07816dc20"

RPROVIDES:${PN} += "qemu-block-iscsi qemu-block-iscsi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libiscsi.so.9()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
