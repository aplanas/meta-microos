SUMMARY = "Development files for openCryptoki, a PKCS#11 implementation for IBM hardware"
DESCRIPTION = "The PKCS#11 version 2.01 API implemented for the IBM cryptographic \
cards. This package includes support for the IBM 4758 cryptographic \
co-processor (with the PKCS#11 firmware loaded) and the IBM eServer \
Cryptographic Accelerator (FC 4960 on pSeries)."
LICENSE = "CPL-1.0"

PV = "3.21.0"

RPM_NAME = "openCryptoki-devel-3.21.0-1.1.aarch64.rpm"
RPM_HASH = "9a8f636600cd1febe4c84872552c4f8e734928d5fe3952e06581d6c9150d99732e34713bd4b46b11c297769dc80f1326084b548193a3de1449e2ffc1803892f9"

RPROVIDES:${PN} += "openCryptoki-devel openCryptoki-devel(aarch-64) pkgconfig(opencryptoki)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libopenssl-devel openldap2-devel trousers-devel"

inherit rpm
