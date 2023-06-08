SUMMARY = "Development files for OpenSSL"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the OpenSSL C API."
LICENSE = "Apache-2.0"

PV = "3.0.8"

RPM_NAME = "libopenssl-3-devel-3.0.8-2.3.aarch64.rpm"
RPM_HASH = "b5a6d4239d4d646e6171b960fe68ceb5b554b5bfd18017155919683fae69861cb14d87a9bc3297edd844bdb73aacba2d3d1fdbd542ac03d86660a265daae4fa7"

RPROVIDES:${PN} += "libopenssl-3-devel libopenssl-3-devel(aarch-64) pkgconfig(libcrypto) pkgconfig(libssl) pkgconfig(openssl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libopenssl3 pkgconfig(libcrypto) pkgconfig(libssl) pkgconfig(zlib)"

inherit rpm
