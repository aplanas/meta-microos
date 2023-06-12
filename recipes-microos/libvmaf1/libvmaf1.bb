SUMMARY = "Perceptual video quality assessment algorithm"
DESCRIPTION = "VMAF is a perceptual video quality assessment algorithm."
LICENSE = "BSD-2-Clause-Patent & BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "libvmaf1-2.3.1-3.2.aarch64.rpm"
RPM_HASH = "c8913baec4ab84faa8648bcd04a59025c1e2aa0a2d92c84a3024c7b9aaf35d59de398404c4ec5ae36737be5534695536f83d004127db17e8fe048840cbbaa261"

RPROVIDES:${PN} += "libvmaf.so.1()(64bit) \
libvmaf1 \
libvmaf1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
