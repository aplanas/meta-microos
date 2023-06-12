SUMMARY = "Library to support various HMACs"
DESCRIPTION = "A library to support various Hash-based Message Authentication Codes (HMAC)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230407"

RPM_NAME = "libhmac1-20230407-1.1.aarch64.rpm"
RPM_HASH = "753f1b380e01dd8dd1af5c942b30fd303cd738cca6a2ceefc1ae81c849bc2e4896c7d7180dd14f01d27fa1d862845ed7cda7618140feab78897267fb630a6cf0"

RPROVIDES:${PN} += "libhmac.so.1()(64bit) \
libhmac.so.1(V_20230407)(64bit) \
libhmac1 \
libhmac1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
