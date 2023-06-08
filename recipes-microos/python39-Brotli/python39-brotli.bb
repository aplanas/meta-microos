SUMMARY = "Python bindings for the Brotli compression library"
DESCRIPTION = "Brotli is a generic-purpose lossless compression algorithm that compresses data \
using a combination of a modern variant of the LZ77 algorithm, Huffman coding \
and 2nd order context modeling, with a compression ratio comparable to the best \
currently available general-purpose compression methods. It is similar in speed \
with deflate but offers more dense compression. \
 \
The specification of the Brotli Compressed Data Format is defined in RFC 7932."
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python39-Brotli-1.0.9-2.1.aarch64.rpm"
RPM_HASH = "ddd507120d6976a8239f5a8d92dddc5c7969e4bf0c040c1f58f9f3c7ad2d8b50ad0eb3c87b01e77553ad15b9d7200c5c6041ea8dc604a9136ceb303abf1e7e76"

RPROVIDES:${PN} += "python3.9dist(brotli) python39-Brotli python39-Brotli(aarch-64) python3dist(brotli)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi)"

inherit rpm
