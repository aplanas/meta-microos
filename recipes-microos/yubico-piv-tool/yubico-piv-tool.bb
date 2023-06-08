SUMMARY = "Yubico YubiKey NEO CCID Manager"
DESCRIPTION = "This is a command line tool to interact with the PIV applet on a YubiKey NEO. \
Among other functions it supports, generating keys on device, importing keys \
and certificates and creating certificate requests."
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "yubico-piv-tool-2.3.1-1.2.aarch64.rpm"
RPM_HASH = "4bcf8d51fcdd587236eb76583dbd7cef72de954a9b501b4cb99b5b7baf068e9e9d192958a338dfb0512d3e2912ee26121254b5a605650c0b38691e01791d34a4"

RPROVIDES:${PN} += "yubico-piv-tool yubico-piv-tool(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libykcs11-2 libykpiv.so.2()(64bit) libykpiv2"

inherit rpm
