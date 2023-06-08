SUMMARY = "Parallelized Implementation of bzip2"
DESCRIPTION = "PBZIP2 is a parallel implementation of the bzip2 block-sorting file \
compressor that uses pthreads and achieves near-linear speedup on SMP \
machines."
LICENSE = "BSD-4-Clause"

PV = "1.1.13"

RPM_NAME = "pbzip2-1.1.13-3.18.aarch64.rpm"
RPM_HASH = "6fb71d56d4c196e1b4573564d0f97f2496f6fe6d1446f645b62a53da2193b0c94b44fa8acdce31d1380ebbf0228b6d1a251fa22a8c46c1d1de0a0ab75d2980ad"

RPROVIDES:${PN} += "pbzip2 pbzip2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
