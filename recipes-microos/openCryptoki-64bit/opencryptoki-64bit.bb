SUMMARY = "An Implementation of PKCS#11 (Cryptoki) v2.11 for IBM Cryptographic Hardware"
DESCRIPTION = "This is a re-packaged binary rpm. For the package source, please look \
for the source of the package without the '64bit' ending \
 \
The PKCS#11 version 2.11 API implemented for the IBM cryptographic \
cards. This package includes support for the IBM 4758 cryptographic \
coprocessor (with the PKCS#11 firmware loaded) and the IBM eServer \
Cryptographic Accelerator (FC 4960 on pSeries)."
LICENSE = "CPL-1.0"

PV = "3.20.0"

RPM_NAME = "openCryptoki-64bit-3.20.0-1.3.aarch64.rpm"
RPM_HASH = "84e9e8f2444ee56032c2a92f61f285ea625be6655218964dd146126b82c42f11b6a79dccfff1b335b34c226944845313204d4360ec662afcf0f0d4bf6d990336"

RPROVIDES:${PN} += "libopencryptoki.so.0()(64bit) libopencryptoki.so.0(OPENCRYPTOKI_3.10)(64bit) libpkcs11_icsf.so.0()(64bit) libpkcs11_icsf.so.0(OPENCRYPTOKI_TOK_3.10)(64bit) libpkcs11_sw.so.0()(64bit) libpkcs11_sw.so.0(OPENCRYPTOKI_TOK_3.10)(64bit) libpkcs11_tpm.so.0()(64bit) libpkcs11_tpm.so.0(OPENCRYPTOKI_TOK_3.10)(64bit) openCryptoki-64bit openCryptoki-64bit(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libtspi.so.1()(64bit) openCryptoki"

inherit rpm
