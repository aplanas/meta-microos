SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "Apache-2.0"

PV = "3.0.8"

RPM_NAME = "openssl-3-3.0.8-2.3.aarch64.rpm"
RPM_HASH = "f509abe92096dcada340b58109531d78d89484024c13097047777047eb6ca705f2c1323662e3054e134cdab95bb0b2de87998146c59d2d641b52ac86b75dd278"

RPROVIDES:${PN} += "config(openssl-3) openssl(cli) openssl-3 openssl-3(aarch-64) ssl"
RDEPENDS:${PN} += "/bin/bash /usr/bin/env crypto-policies ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcrypto.so.3(OPENSSL_3.0.3)(64bit) libopenssl3 libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) openssl"

inherit rpm
