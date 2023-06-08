SUMMARY = "C++ wrapper for libpng library"
DESCRIPTION = "PNG++ provides a C++ interface to libpng, the PNG reference implementation library."
LICENSE = "BSD-3-Clause"

PV = "0.2.10"

RPM_NAME = "png++-devel-0.2.10-1.10.noarch.rpm"
RPM_HASH = "5f8323005e20c03d8756921809dc6ee5483fb1cdbbfd8e9d3b12bef59662794beeb47edb59fec0b25269f01c27c0dfb34be4b7744823c06ebe9ec61cac10e200"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "png++-devel"
RDEPENDS:${PN} += "pkgconfig(libpng)"

inherit rpm
