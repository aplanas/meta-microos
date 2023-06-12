SUMMARY = "A X.509 Library"
DESCRIPTION = "KSBA is a library to simplify the task of working with X.509 \
certificates, CMS data, and related data."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later & MIT"

PV = "1.6.3"

RPM_NAME = "libksba8-1.6.3-1.3.aarch64.rpm"
RPM_HASH = "1a3e551de1b25a09a8ed1d7dbe239024491b103b90b3fd473df4247ea50203d8b35c5b6c90ee31a6f40fc3b6596d4bb78b523794470f58a0d1eeac1c6594e44a"

RPROVIDES:${PN} += "libksba \
libksba.so.8()(64bit) \
libksba.so.8(KSBA_0.9)(64bit) \
libksba.so.8(KSBA_PRIVATE_TESTS)(64bit) \
libksba8 \
libksba8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgpg-error.so.0()(64bit) \
libgpg-error.so.0(GPG_ERROR_1.0)(64bit)"

inherit rpm
