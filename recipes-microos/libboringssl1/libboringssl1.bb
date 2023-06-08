SUMMARY = "An SSL/TLS protocol implementation"
DESCRIPTION = "BoringSSL is an implementation of the Secure Sockets Layer (SSL) and \
Transport Layer Security (TLS) protocols, derived from OpenSSL."
LICENSE = "OpenSSL"

PV = "20200921"

RPM_NAME = "libboringssl1-20200921-2.6.aarch64.rpm"
RPM_HASH = "83b04f2908c0b4d650cdf20ef68f82c8f9d8b584eef8d2b8be31db98e0903a14f7f084fdf2da993e1b3ad02604cc740a8081d543d318e2849e4986ce0697a1b7"

RPROVIDES:${PN} += "libboringssl1 libboringssl1(aarch-64) libboringssl_crypto.so.1()(64bit) libboringssl_ssl.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
