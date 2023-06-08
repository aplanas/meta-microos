SUMMARY = "An Implementation of PKCS#11 (Cryptoki) v2.11 for IBM Cryptographic Hardware"
DESCRIPTION = "The PKCS#11 version 2.11 API implemented for the IBM cryptographic \
cards. This package includes support for the IBM 4758 cryptographic \
coprocessor (with the PKCS#11 firmware loaded) and the IBM eServer \
Cryptographic Accelerator (FC 4960 on pSeries)."
LICENSE = "CPL-1.0"

PV = "3.20.0"

RPM_NAME = "openCryptoki-3.20.0-1.3.aarch64.rpm"
RPM_HASH = "56892dc9bd71718006260e191fad0993d6d14afa96be98b24f435e4bd6fc1b9208dcbf272b64b37e3fb27dae0010303f790a0997896f12b3f0d392aac9f105f8"

RPROVIDES:${PN} += "config(openCryptoki) openCryptoki openCryptoki(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/sbin/groupadd /usr/sbin/usermod ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) systemd"

inherit rpm
