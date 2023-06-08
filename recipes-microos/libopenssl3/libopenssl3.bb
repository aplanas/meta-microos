SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "Apache-2.0"

PV = "3.0.8"

RPM_NAME = "libopenssl3-3.0.8-2.3.aarch64.rpm"
RPM_HASH = "63a74944c4a478f1cefadf50e17d73e7b6822bf6b0bb973d3904df1d11bd6153cd0406fa5a7dbc0189fcc84aaae3426e96ea3539195bf62f0a3a7d8c393d17bf"

RPROVIDES:${PN} += "libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcrypto.so.3(OPENSSL_3.0.3)(64bit) libcrypto.so.3(OPENSSL_3.0.8)(64bit) libopenssl3 libopenssl3(aarch-64) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig crypto-policies ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit)"

inherit rpm
