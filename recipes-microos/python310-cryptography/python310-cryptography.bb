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

RPM_NAME = "python310-cryptography-40.0.2-2.1.aarch64.rpm"
RPM_HASH = "b5de6fc41dabd9d8c568be28afa9f197218af93848054bd0a2f56c87dd4c637a4ff2b063c7ecfea34a10330c802c7ee73f979b467e6a30571533045cb40893b2"

RPROVIDES:${PN} += "python3-cryptography python3.10dist(cryptography) python310-cryptography python310-cryptography(aarch-64) python3dist(cryptography)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) python(abi) python310 python310-cffi"

inherit rpm
