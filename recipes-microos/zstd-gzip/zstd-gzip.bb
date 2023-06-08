SUMMARY = "zstd and zlib based gzip drop-in"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm, \
targeting faster compression than zlib at comparable ratios. \
 \
This subpackage provides a compatible alternative to gzip(1) using \
an optimized deflate/zlib handling."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "zstd-gzip-1.5.5-1.1.aarch64.rpm"
RPM_HASH = "e5e5317315f6deed3a010c31d3088914b79fa09cc3cd2fea039211be1af18e16fbc70d98658b82627860953da166774bdc521a56f42b510b68b320c8a761e5ed"

RPROVIDES:${PN} += "alternative(gzip) gzip zstd-gzip zstd-gzip(aarch-64)"
RDEPENDS:${PN} += "zstd"

inherit rpm
