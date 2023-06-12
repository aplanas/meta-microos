SUMMARY = "Shared library files for callaudiod"
DESCRIPTION = "A daemon for audio calls. \
This package contains the shared library files for callaudiod."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.7"

RPM_NAME = "libcallaudio0_1-0-0.1.7-1.1.aarch64.rpm"
RPM_HASH = "8a590910a0eb1508b2fd1066c088ac1d0bf976bb92bd1c0e7a8e6083c827ed908d14e7ded2d200d6baf349b9ffddfed3e151972f537800d5d754b89e388d2d89"

RPROVIDES:${PN} += "libcallaudio-0.1.so.0()(64bit) libcallaudio-0.1.so.0(LIBCALLAUDIO_0_0_0)(64bit) libcallaudio0_1-0 libcallaudio0_1-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
