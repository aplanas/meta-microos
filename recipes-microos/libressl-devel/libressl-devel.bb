SUMMARY = "Development files for LibreSSL, an SSL/TLS protocol implementation"
DESCRIPTION = "LibreSSL is an open-source implementation of the Secure Sockets Layer \
(SSL) and Transport Layer Security (TLS) protocols. It derives from \
OpenSSL, with the aim of refactoring the OpenSSL code so as to \
provide a more secure implementation. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libressl."
LICENSE = "OpenSSL"

PV = "3.7.0"

RPM_NAME = "libressl-devel-3.7.0-1.2.aarch64.rpm"
RPM_HASH = "8dd96391c828bef351a319e67eb7886e807f6444ef5e0fdcc43590acc2f495f835193773a2eb2acb5e6f184da269bf903aface04f9e2178e8264d185b232f7d4"

RPROVIDES:${PN} += "libressl-devel libressl-devel(aarch-64) pkgconfig(libcrypto) pkgconfig(libssl) pkgconfig(libtls) pkgconfig(openssl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcrypto50 libssl53 libtls26 pkgconfig(libcrypto) pkgconfig(libssl)"

inherit rpm
