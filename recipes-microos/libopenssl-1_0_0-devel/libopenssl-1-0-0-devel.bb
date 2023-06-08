SUMMARY = "Development files for OpenSSL"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the OpenSSL C API."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "libopenssl-1_0_0-devel-1.0.2u-15.1.aarch64.rpm"
RPM_HASH = "f98ab984d1edb2e960059ab96463f2cbb22b90ad6bf74ca4397223e7795535f2d76e9d2ab3d0427f2902da7e4cfc4e9d814fd3f2784636fa91a61e1b23981a74"

RPROVIDES:${PN} += "libopenssl-1_0_0-devel libopenssl-1_0_0-devel(aarch-64) pkgconfig(libcrypto) pkgconfig(libssl) pkgconfig(openssl) ssl-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config libopenssl1_0_0 pkgconfig(libcrypto) pkgconfig(libssl) pkgconfig(zlib)"

inherit rpm
