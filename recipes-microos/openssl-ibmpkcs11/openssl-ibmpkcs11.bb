SUMMARY = "OpenSSL Dynamic PKCS #11 Engine"
DESCRIPTION = "OpenSSL Dynamic PKCS #11 Engine"
LICENSE = "OpenSSL"

PV = "1.0.1"

RPM_NAME = "openssl-ibmpkcs11-1.0.1-1.22.aarch64.rpm"
RPM_HASH = "16ee2cb13f7cb754abd4e9ee0296f7565c0b7cfc9cd16ba536a0ff9388a3db3b9f07affe77ec39aa45f3936182a64b8686af6a8778710dad7a2074346e8a58ab"

RPROVIDES:${PN} += "libibmpkcs11.so.0()(64bit) \
openssl-ibmpkcs11 \
openssl-ibmpkcs11(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
