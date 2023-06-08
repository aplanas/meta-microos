SUMMARY = "Provides libknet1 openssl support"
DESCRIPTION = "Provides OpenSSL crypto support for libknet1."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.21"

RPM_NAME = "libknet1-crypto-openssl-plugin-1.21-1.10.aarch64.rpm"
RPM_HASH = "e649aa62db38e1b00891b3979099461a2e0a83316e4af1226c93b9060a6801874fd4acce1ecf8e0e13bb4f554a58d80dc011f6e0177d4fc6d1beaebf20aac70c"

RPROVIDES:${PN} += "libknet1-crypto-openssl-plugin libknet1-crypto-openssl-plugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libknet1(aarch-64)"

inherit rpm
