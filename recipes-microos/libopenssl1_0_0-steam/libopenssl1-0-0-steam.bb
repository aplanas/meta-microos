SUMMARY = "Secure Sockets and Transport Layer Security for steam"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols. \
 \
This subpackage is providing special patched edition for steam"
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "libopenssl1_0_0-steam-1.0.2u-15.1.aarch64.rpm"
RPM_HASH = "628429824d648d16238e42d4177ab6c6b7d1d68290fd951b1f52f23b9265094a56985b6fc5bdd7c578a933132a7ae70e6c9b2384d8cf95189de41dbbbc956020"

RPROVIDES:${PN} += "libopenssl1_0_0-steam libopenssl1_0_0-steam(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.1.0.0()(64bit) libcrypto.so.1.0.0(OPENSSL_1.0.0)(64bit) libcrypto.so.1.0.0(OPENSSL_1.0.1_EC)(64bit) libz.so.1()(64bit)"

inherit rpm
