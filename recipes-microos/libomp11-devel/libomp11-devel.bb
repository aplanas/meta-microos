SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "libomp11-devel-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "326f6171e41acfa14d49b5612fedc8bd3a219b942a563120e6fdebf3ae946035ba956c946af9ecd5f7cadccc81862e5302adedb44613ddda82e8150d848fd3ea"

RPROVIDES:${PN} += "libarcher.so()(64bit) libomp-devel libomp.so()(64bit) libomp.so(GOMP_1.0)(64bit) libomp.so(GOMP_2.0)(64bit) libomp.so(GOMP_3.0)(64bit) libomp.so(GOMP_4.0)(64bit) libomp.so(GOMP_4.5)(64bit) libomp.so(GOMP_5.0)(64bit) libomp.so(OMP_1.0)(64bit) libomp.so(OMP_2.0)(64bit) libomp.so(OMP_3.0)(64bit) libomp.so(OMP_3.1)(64bit) libomp.so(OMP_4.0)(64bit) libomp.so(OMP_4.5)(64bit) libomp.so(VERSION)(64bit) libomp11-devel libomp11-devel(aarch-64) libomptarget.so()(64bit) libomptarget.so(VERS1.0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM11 libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
