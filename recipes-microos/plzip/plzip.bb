SUMMARY = "Parallel LZMA Data Compressor"
DESCRIPTION = "Plzip is a parallel version of the lzip data compressor. The files \
produced by plzip are fully compatible with lzip-1.4 or newer. Plzip \
is intended for faster compression/decompression of big files on \
multiprocessor machines. \
 \
Lzip is a lossless data compressor based on the LZMA algorithm, with \
very safe integrity checking and a user interface similar to the one \
of gzip or bzip2. Lzip decompresses almost as fast as gzip and \
compresses better than bzip2, which makes it well suited for software \
distribution and data archiving."
LICENSE = "GPL-2.0-or-later"

PV = "1.10"

RPM_NAME = "plzip-1.10-1.7.aarch64.rpm"
RPM_HASH = "04603859a6c3882acfb728978d462e31e16b9bb2aaf5f12e48652a7b1a761562374161df47cc4b83845b37ccac6961ea2d1833d5732e9720b178d772e82671ba"

RPROVIDES:${PN} += "plzip \
plzip(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblz.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
