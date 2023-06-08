SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.1.1t"

RPM_NAME = "openssl-1_1-1.1.1t-3.1.aarch64.rpm"
RPM_HASH = "09f57aac126e223c1a2a1c27454481dd480d482f427d9d4831d376f9187056c3193a5a41c740a872db7a0ea83ec60733ac3b87665b156d2bbda05b7addc8eaaa"

RPROVIDES:${PN} += "config(openssl-1_1) openssl-1_1 openssl-1_1(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env crypto-policies ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.1.1()(64bit) libcrypto.so.1.1(OPENSSL_1_1_0)(64bit) libcrypto.so.1.1(OPENSSL_1_1_1)(64bit) libopenssl1_1 libssl.so.1.1()(64bit) libssl.so.1.1(OPENSSL_1_1_0)(64bit) libssl.so.1.1(OPENSSL_1_1_1)(64bit)"

inherit rpm
