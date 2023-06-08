SUMMARY = "Dynamic Pixel Format Translation Library"
DESCRIPTION = "babl is a dynamic, any to any, pixel format translation library. \
 \
It allows converting between different methods of storing pixels known \
as pixel formats that have with different bitdepths and other data \
representations, color models and component permutations. \
 \
A vocabulary to formulate new pixel formats from existing primitives is \
provided as well as the framework to add new color models and data \
types."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.1.102"

RPM_NAME = "libbabl-0_1-0-0.1.102-2.3.aarch64.rpm"
RPM_HASH = "a1bb5be82270e5e28f162f7f3770bf0216f03d97a0ce4a20baa296461d0f97b4e43c176db5cae9c00abb5ac72659231259f588c93f993bc0ba06efebd8c9a51e"

RPROVIDES:${PN} += "libbabl-0.1.so.0()(64bit) libbabl-0.1.so.0(V0_1_0)(64bit) libbabl-0_1-0 libbabl-0_1-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblcms2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
