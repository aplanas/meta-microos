SUMMARY = "Cryptographic base library for mbedtls"
DESCRIPTION = "This subpackage of mbedtls contains a library that exposes \
cryptographic ciphers, hashes, algorithms and format support such as \
AES, MD5, SHA, Elliptic Curves, BigNum, PKCS, ASN.1, BASE64."
LICENSE = "Apache-2.0"

PV = "3.4.0"

RPM_NAME = "libmbedcrypto14-3.4.0-2.1.aarch64.rpm"
RPM_HASH = "e8da316988f61d676b4713e7a7f4151373f0ed130f4eb3f47dfddf0b2e53adf255421f385d2539f903c603b24f3f11565c72e860830300bebc28a72f4783a17b"

RPROVIDES:${PN} += "libmbedcrypto.so.14()(64bit) libmbedcrypto14 libmbedcrypto14(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.25)(64bit)"

inherit rpm
