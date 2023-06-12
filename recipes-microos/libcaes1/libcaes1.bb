SUMMARY = "Library for AES encryption"
DESCRIPTION = "libcaes is a library for AES encryption."
LICENSE = "LGPL-3.0-or-later"

PV = "20230406"

RPM_NAME = "libcaes1-20230406-1.1.aarch64.rpm"
RPM_HASH = "18ff44f843cfee017359b38c08cec177a864c95405cd41f43f0cef7273cbb514b03b867026f21dee3e140ce3f5249799a3ceaea6498fbb85eb6cc4ced345c443"

RPROVIDES:${PN} += "libcaes.so.1()(64bit) \
libcaes.so.1(V_20230406)(64bit) \
libcaes1 \
libcaes1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
