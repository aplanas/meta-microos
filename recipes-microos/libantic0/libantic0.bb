SUMMARY = "Algebraic Number Theory library in C"
DESCRIPTION = "Antic is an algebraic number theory library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.5"

RPM_NAME = "libantic0-0.2.5-2.1.aarch64.rpm"
RPM_HASH = "ae3dd7c8e3ac94d54c32fe3e32517381625d1511dca192538866fed2f8c639781db4bf114f3dff725d64bf7ec2d25202d8ccfc575856e999156bf26fa22e41b5"

RPROVIDES:${PN} += "libantic.so.0()(64bit) libantic0 libantic0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libflint.so.17()(64bit) libgmp.so.10()(64bit) libmpfr.so.6()(64bit)"

inherit rpm
