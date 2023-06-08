SUMMARY = "Shared library for SQLCipher"
DESCRIPTION = "SQLCipher is an SQLite extension that provides transparent 256-bit AES \
encryption of database files. Pages are encrypted before being written to \
disk and are decrypted when read back. Due to the small footprint and great \
performance it’s ideal for protecting embedded application databases and is \
well suited for mobile development/ \
 \
This package contains shared library."
LICENSE = "BSD-3-Clause"

PV = "4.5.3"

RPM_NAME = "libsqlcipher-3_39_4-0-4.5.3-2.3.aarch64.rpm"
RPM_HASH = "6ae5c0bdf455fb10d1f1f6b1f7a2424b9f15f5617c803b80f3849dc496607fe426767819e2a0291343b5d109d85260a4450511723a5165b2f1e9d51c0c959f51"

RPROVIDES:${PN} += "libsqlcipher-3.39.4.so.0()(64bit) libsqlcipher-3_39_4-0 libsqlcipher-3_39_4-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
