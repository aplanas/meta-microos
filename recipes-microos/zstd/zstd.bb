SUMMARY = "Zstandard compression tools"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm. Speed \
vs. compression trade-off is configurable in small increments. \
Decompression speed is preserved and remains roughly the same at all \
settings, a property shared by most LZ compression algorithms, such \
as zlib or lzma. \
 \
At roughly the same ratio, zstd (v1.4.0) achieves ~870% faster \
compression than gzip. For roughly the same time, zstd achives a \
~12% better ratio than gzip. LZMA outperforms zstd by ~10% faster \
compression for same ratio, or ~1–4% size reduction for same time."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "zstd-1.5.5-1.1.aarch64.rpm"
RPM_HASH = "9f18e6c1f47bf4bc7a6d3ff71ab3b242d969ea7db5b3e30ae4db282631c9ac65f10e581eaf2f70a3a5aa67a449d3fa65349f7fd4d9aa7304de860da94dfdb2a4"

RPROVIDES:${PN} += "zstd zstd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libz.so.1()(64bit)"

inherit rpm
