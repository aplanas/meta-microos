SUMMARY = "Shared library for LAL Burst"
DESCRIPTION = "This package contains the shared-object libraries needed to run applications \
that use the LAL Burst library."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "liblalburst6-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "aeebac4741b182940d57a199f43159db01a3f89641ea3a32bf3275e0aabc7cff40510198568c066764174d5c44dda1d21ce0bc0174e142a261ee5961a9b408f6"

RPROVIDES:${PN} += "liblalburst.so.6()(64bit) liblalburst6 liblalburst6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgsl.so.25()(64bit) liblal.so.20()(64bit) liblalmetaio.so.10()(64bit) liblalsimulation.so.31()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmetaio.so.1()(64bit)"

inherit rpm
