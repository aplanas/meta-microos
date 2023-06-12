SUMMARY = "PLplot csirocsa component"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the shared lib for PLplot's csirocsa."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "libcsirocsa0-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "dd6b5d1231afe8173bf859d04596b403c99f63367928ad02930e5cff28780bef72abd75bbbe396e039a874fa5c2fb429c17c6a4cd4507bbd27c31bf4cae18b74"

RPROVIDES:${PN} += "libcsirocsa.so.0()(64bit) \
libcsirocsa0 \
libcsirocsa0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
