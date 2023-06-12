SUMMARY = "Decompression library for ancient formats"
DESCRIPTION = "This package provides the shared library for the decompression routines \
for ancient formats."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "libancient2-2.0.0-1.3.aarch64.rpm"
RPM_HASH = "43f3bc1a08266635461ff873d76abb1c983bc71880793d236b28acef5a564396121810fd8388884d6de174f6edb29375f743f59c504c46e08ec1cc8c96b0d6aa"

RPROVIDES:${PN} += "libancient.so.2()(64bit) \
libancient2 \
libancient2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
