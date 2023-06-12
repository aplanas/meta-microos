SUMMARY = "Deflate/zlib compatible compression library"
DESCRIPTION = "This package contain the libzopflipng PNG optimizer library."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "libzopflipng1-1.0.3-2.1.aarch64.rpm"
RPM_HASH = "ef1b97fb00c9a0e4d95f16f726b69479e27b511ea1c1324c7507995e9a31481eb6b0e06a19cfddba5dc5124deabccd00a9268a61f82e135921bb94ed1e8a1ead"

RPROVIDES:${PN} += "libzopflipng.so.1()(64bit) \
libzopflipng1 \
libzopflipng1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libzopfli.so.1()(64bit)"

inherit rpm
