SUMMARY = "Development files for OpenSSL"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the OpenSSL C API."
LICENSE = "OpenSSL"

PV = "1.1.1t"

RPM_NAME = "libopenssl-1_1-devel-1.1.1t-3.1.aarch64.rpm"
RPM_HASH = "0e8fde68fee66b8aee2574d6d09b072fb6f580aebf17e6fc21d073d1a39c7bf5015f35fca154a0b3638d99c760f3ea26bbfe70297811b72adfe1f0b61340f8dc"

RPROVIDES:${PN} += "libopenssl-1_1-devel libopenssl-1_1-devel(aarch-64) pkgconfig(libcrypto) pkgconfig(libssl) pkgconfig(openssl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libopenssl1_1 pkgconfig(libcrypto) pkgconfig(libssl) pkgconfig(zlib)"

inherit rpm
