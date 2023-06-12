SUMMARY = "Development files for OpenSSL"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the OpenSSL C API."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "libopenssl-1_0_0-devel-1.0.2u-16.1.aarch64.rpm"
RPM_HASH = "a59bb42e2313a2cd4abc510626b1a669408a601cb2e0b2046047e2c408fc7e01a592d8d0dd069cb0ddd50560272f4629757a8661cadfb31701741d50ccd1b98a"

RPROVIDES:${PN} += "libopenssl-1_0_0-devel libopenssl-1_0_0-devel(aarch-64) pkgconfig(libcrypto) pkgconfig(libssl) pkgconfig(openssl) ssl-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config libopenssl1_0_0 pkgconfig(libcrypto) pkgconfig(libssl) pkgconfig(zlib)"

inherit rpm
