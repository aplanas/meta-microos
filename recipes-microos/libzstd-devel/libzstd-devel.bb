SUMMARY = "Development files for the Zstd compression library"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm, \
targeting faster compression than zlib at comparable ratios. \
 \
Needed for compiling programs that link with the library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "libzstd-devel-1.5.5-1.1.aarch64.rpm"
RPM_HASH = "84e9e32b394f3c3826cbaabddd25380c5baf750f16886ce1a8855639bac519a40660edd71adf4dc1d0a08e7331c038e0017c5d92d2c3203a36d9d3dadb476ee8"

RPROVIDES:${PN} += "libzstd-devel libzstd-devel(aarch-64) pkgconfig(libzstd)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libzstd1"

inherit rpm
