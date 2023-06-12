SUMMARY = "A port of Macro SNOBOL4"
DESCRIPTION = "This is a free port of the original SIL (SNOBOL4 Implementation \
Language) 'macro' version of SNOBOL4 (developed at Bell Labs) with the \
`C' language as a target. \
 \
SNOBOL4, while known primarily as a string language excels at any task \
involving symbolic manipulations.  It provides dynamic typing, garbage \
collection, user data types, on the fly compilation."
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "snobol4-2.3.1-1.1.aarch64.rpm"
RPM_HASH = "ad841a3ce9bd96e66acfd1252b4951ebf73c8b9f9513ffd899e012c38486c1f70d800f4fcc01bad5b6d7aa1ba24f8c63b3a6a0ba79ff49c111d1f3ca8684a9e9"

RPROVIDES:${PN} += "snobol4 \
snobol4(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgdbm_compat.so.4()(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libreadline.so.8()(64bit) \
libsqlite3.so.0()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libtcl8.6.so()(64bit) \
libz.so.1()(64bit)"

inherit rpm
