SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb_2021_3-gnu-openmpi4-hpc-2021.3-1.2.aarch64.rpm"
RPM_HASH = "7204bca734d494ff8b607b0b2daddbfd7c14f1692b4895a92b193e179df66180234cc5a948b36cc3788d45d3c7db369b0b0d85d8c6d4b414296c8de00f752d49"

RPROVIDES:${PN} += "imb_2021_3-gnu-openmpi4-hpc \
imb_2021_3-gnu-openmpi4-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libopenmpi4-gnu-hpc \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
lua-lmod"

inherit rpm
