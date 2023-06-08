SUMMARY = "Development files for the Zstd compression library"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm, \
targeting faster compression than zlib at comparable ratios. \
 \
Needed for compiling programs that link with the library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "libzstd-devel-static-1.5.5-1.1.aarch64.rpm"
RPM_HASH = "193131d840d4741f8bd9911539816c15e6c5ccf89fdd1d4240629a0123012764a2b6ad559115cbc04ab1612934114494d4d27f14ac5a1f2c9c40be7594035649"

RPROVIDES:${PN} += "libzstd-devel-static libzstd-devel-static(aarch-64)"
RDEPENDS:${PN} += "libzstd-devel"

inherit rpm
