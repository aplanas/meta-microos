SUMMARY = "XFS Filesystem-specific Shared library"
DESCRIPTION = "libhandle1 contains the shared libraries needed by xfsprogs \
to run xfsprogs programs. \
 \
libhandle1 is always needed by xfsprogs. If you want to use this \
library for your own new xfs tools install xfsprogs-devel."
LICENSE = "GPL-2.0-or-later"

PV = "6.2.0"

RPM_NAME = "libhandle1-6.2.0-1.1.aarch64.rpm"
RPM_HASH = "68d6c4464750019af98403dfc511d4936d4ee1776f14ff54fd8d13933071b0509b68b78208bef8e48e490222e3750bdc9826ac1fdff7709b206b17b1feba2b87"

RPROVIDES:${PN} += "libhandle.so.1()(64bit) libhandle.so.1(LIBHANDLE_1.0.3)(64bit) libhandle1 libhandle1(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
