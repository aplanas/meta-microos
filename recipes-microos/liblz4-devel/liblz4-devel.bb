SUMMARY = "Development files for the LZ4 compressor"
DESCRIPTION = "LZ4 is a lossless data compression algorithm that is focused on \
compression and decompression speed. It belongs to the LZ77 \
(Lempel–Ziv) family of byte-oriented compression schemes. It is a \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblz4."
LICENSE = "BSD-2-Clause"

PV = "1.9.4"

RPM_NAME = "liblz4-devel-1.9.4-2.3.aarch64.rpm"
RPM_HASH = "d04c5ebe86ab16673c2c5107fb9b89f1e3843ef471c363424be81c9a225c72c1065aee4018c7024a437a7aec7d30bb5bdc74b0cd1e4dd16c3abf118460e6faad"

RPROVIDES:${PN} += "liblz4-devel liblz4-devel(aarch-64) pkgconfig(liblz4)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblz4-1"

inherit rpm
