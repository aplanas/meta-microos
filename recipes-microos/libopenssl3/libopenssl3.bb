SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "libopenssl3-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "9505cc6db23f5e66b9aa9242f5af2ab8545252566f0af26763f43297ece9e3be413220f405d9dc4232e6abe5ca98db2ea0cd054955d2fdcda5e4d92838250faf"

RPROVIDES:${PN} += "libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcrypto.so.3(OPENSSL_3.0.3)(64bit) libcrypto.so.3(OPENSSL_3.0.8)(64bit) libcrypto.so.3(OPENSSL_3.0.9)(64bit) libcrypto.so.3(OPENSSL_3.1.0)(64bit) libopenssl3 libopenssl3(aarch-64) libopenssl3-hmac libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig crypto-policies ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit)"

inherit rpm
