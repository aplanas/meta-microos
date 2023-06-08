SUMMARY = "SQLite database encryption"
DESCRIPTION = "SQLCipher is an SQLite extension that provides transparent 256-bit AES \
encryption of database files. Pages are encrypted before being written to \
disk and are decrypted when read back. Due to the small footprint and great \
performance it’s ideal for protecting embedded application databases and is \
well suited for mobile development."
LICENSE = "BSD-3-Clause"

PV = "4.5.3"

RPM_NAME = "sqlcipher-4.5.3-2.3.aarch64.rpm"
RPM_HASH = "3f488ae4f2519491943d672f1706a8b144296aea1eb96e01f3de891bf258bebb8facee3489e77b2478f4909ed0f31d254674774d27a203bd1a8f84808638eeb5"

RPROVIDES:${PN} += "sqlcipher sqlcipher(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libreadline.so.8()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
