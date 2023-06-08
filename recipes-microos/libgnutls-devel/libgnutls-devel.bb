SUMMARY = "Development package for the GnuTLS C API"
DESCRIPTION = "Files needed for software development using gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutls-devel-3.8.0-1.1.aarch64.rpm"
RPM_HASH = "2beec4121a28506d34cf216096cd8ec49ebd27546bb854ad5948794b041c898da4bb1bfacdbc104d28a95077cdf7cb314f40cee7ac1b9042bbb415652bff39d1"

RPROVIDES:${PN} += "gnutls-devel libgnutls-devel libgnutls-devel(aarch-64) pkgconfig(gnutls)"
RDEPENDS:${PN} += "/usr/bin/pkg-config crypto-policies glibc-devel gnutls libgnutls30 pkgconfig(hogweed) pkgconfig(libidn2) pkgconfig(libtasn1) pkgconfig(nettle) pkgconfig(p11-kit-1) pkgconfig(zlib)"

inherit rpm
