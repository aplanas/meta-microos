SUMMARY = "Python library which exposes cryptographic recipes and primitives"
DESCRIPTION = "cryptography is a package designed to expose cryptographic \
recipes and primitives to Python developers.  Our goal is \
for it to be your 'cryptographic standard library'. It \
supports Python 2.7, Python 3.4+, and PyPy-5.3+. \
 \
cryptography includes both high level recipes, and low \
level interfaces to common cryptographic algorithms such as \
symmetric ciphers, message digests and key derivation \
functions."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "40.0.2"

RPM_NAME = "python311-cryptography-40.0.2-2.1.aarch64.rpm"
RPM_HASH = "ad81f367dbfd5f261eee80e4b3b646599b18790afb904e536e9438ac46d02400c786a5c09a884511872cbac8b63439a6a0b9e207316898536e85dfc6c596fec2"

RPROVIDES:${PN} += "python3.11dist(cryptography) python311-cryptography python311-cryptography(aarch-64) python3dist(cryptography)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) python(abi) python311 python311-cffi"

inherit rpm
