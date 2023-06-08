SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "openssl-1_0_0-1.0.2u-15.1.aarch64.rpm"
RPM_HASH = "26e1f27de2b4923a478f166020d15fc11ddcd038b57309984de0f84bf023a3f67f08a4a01b1794ef764fd053a1cdfadc9a654ee1edf819cdf76d88c213459585"

RPROVIDES:${PN} += "config(openssl-1_0_0) openssl(cli) openssl-1_0_0 openssl-1_0_0(aarch-64) ssl"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.1.0.0()(64bit) libcrypto.so.1.0.0(OPENSSL_1.0.0)(64bit) libcrypto.so.1.0.0(OPENSSL_1.0.1_EC)(64bit) libssl.so.1.0.0()(64bit) libssl.so.1.0.0(OPENSSL_1.0.0)(64bit) libssl.so.1.0.0(OPENSSL_1.0.1)(64bit)"

inherit rpm
