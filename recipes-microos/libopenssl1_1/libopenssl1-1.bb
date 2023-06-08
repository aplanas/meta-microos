SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.1.1t"

RPM_NAME = "libopenssl1_1-1.1.1t-3.1.aarch64.rpm"
RPM_HASH = "dd92fa743289eb57a0f3f020a91f0535322cd262811e7d0d78bfff464369fdb95e1fb6eac1ae388a24bef3e1190d039c6785477cc61de27a302ffa85e8fb7e5b"

RPROVIDES:${PN} += "libcrypto.so.1.1()(64bit) libcrypto.so.1.1(OPENSSL_1_1_0)(64bit) libcrypto.so.1.1(OPENSSL_1_1_0a)(64bit) libcrypto.so.1.1(OPENSSL_1_1_0c)(64bit) libcrypto.so.1.1(OPENSSL_1_1_0d)(64bit) libcrypto.so.1.1(OPENSSL_1_1_0f)(64bit) libcrypto.so.1.1(OPENSSL_1_1_0g)(64bit) libcrypto.so.1.1(OPENSSL_1_1_0h)(64bit) libcrypto.so.1.1(OPENSSL_1_1_0i)(64bit) libcrypto.so.1.1(OPENSSL_1_1_0j)(64bit) libcrypto.so.1.1(OPENSSL_1_1_1)(64bit) libcrypto.so.1.1(OPENSSL_1_1_1b)(64bit) libcrypto.so.1.1(OPENSSL_1_1_1c)(64bit) libcrypto.so.1.1(OPENSSL_1_1_1d)(64bit) libcrypto.so.1.1(OPENSSL_1_1_1e)(64bit) libcrypto.so.1.1(OPENSSL_1_1_1h)(64bit) libcrypto.so.1.1(OPENSSL_1_1_1t)(64bit) libopenssl1_1 libopenssl1_1(aarch-64) libssl.so.1.1()(64bit) libssl.so.1.1(OPENSSL_1_1_0)(64bit) libssl.so.1.1(OPENSSL_1_1_0d)(64bit) libssl.so.1.1(OPENSSL_1_1_1)(64bit) libssl.so.1.1(OPENSSL_1_1_1a)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig crypto-policies ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit)"

inherit rpm
