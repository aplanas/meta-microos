SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "libomp14-devel-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "d5674bd6d092c64f456410d1f80f467eb6364d8cb76f8e4bbda068ba8133c01536652cc0b68f842ccb526101a779f4311b474f6156c1131dbe9b1091e4b254b6"

RPROVIDES:${PN} += "libarcher.so()(64bit) libomp-devel libomp.so()(64bit) libomp.so(GOMP_1.0)(64bit) libomp.so(GOMP_2.0)(64bit) libomp.so(GOMP_3.0)(64bit) libomp.so(GOMP_4.0)(64bit) libomp.so(GOMP_4.5)(64bit) libomp.so(GOMP_5.0)(64bit) libomp.so(GOMP_5.0.1)(64bit) libomp.so(OMP_1.0)(64bit) libomp.so(OMP_2.0)(64bit) libomp.so(OMP_3.0)(64bit) libomp.so(OMP_3.1)(64bit) libomp.so(OMP_4.0)(64bit) libomp.so(OMP_4.5)(64bit) libomp.so(OMP_5.0)(64bit) libomp.so(VERSION)(64bit) libomp14-devel libomp14-devel(aarch-64) libompd.so()(64bit) libomptarget.so()(64bit) libomptarget.so(VERS1.0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.36)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
