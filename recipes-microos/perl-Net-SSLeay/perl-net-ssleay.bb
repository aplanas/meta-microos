SUMMARY = "Perl bindings for OpenSSL and LibreSSL"
DESCRIPTION = "This module provides Perl bindings for libssl (an SSL/TLS API) and \
libcrypto (a cryptography API)."
LICENSE = "Artistic-2.0"

PV = "1.92"

RPM_NAME = "perl-Net-SSLeay-1.92-1.9.aarch64.rpm"
RPM_HASH = "401a52e835c706ed8cb48806ab57c608226883810dc76de5fdddaf71870d1307a1876bdd29624766076167f501c0fdaba8ffd9eb671deb54cca954b6fa3ba324"

RPROVIDES:${PN} += "perl(Net::SSLeay) perl(Net::SSLeay::Handle) perl-Net-SSLeay perl-Net-SSLeay(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
