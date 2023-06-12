SUMMARY = "Development files for OpenSSL"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the OpenSSL C API."
LICENSE = "OpenSSL"

PV = "1.1.1u"

RPM_NAME = "libopenssl-1_1-devel-1.1.1u-1.1.aarch64.rpm"
RPM_HASH = "99395851a7ddeaa3594c0861a8648ad47f4242be153ba2f7a8568a8a3d9dff5b1caaacf6b083098bf679fafb9805a7ec863dfaa72f4f3ea950d4c593009a68db"

RPROVIDES:${PN} += "libopenssl-1_1-devel \
libopenssl-1_1-devel(aarch-64) \
pkgconfig(libcrypto) \
pkgconfig(libssl) \
pkgconfig(openssl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenssl1_1 \
pkgconfig(libcrypto) \
pkgconfig(libssl) \
pkgconfig(zlib)"

inherit rpm
