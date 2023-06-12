SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "libomp15-devel-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "2a15abe220884a253082762d47d2b6e1b9636f7458fa95187e112e203b8f0e673c34e11ad1a71d4c89247508a9b4ae851ec3d7198917a4872d95db28f3628cda"

RPROVIDES:${PN} += "libarcher.so()(64bit) \
libomp-devel \
libomp.so()(64bit) \
libomp.so(GOMP_1.0)(64bit) \
libomp.so(GOMP_2.0)(64bit) \
libomp.so(GOMP_3.0)(64bit) \
libomp.so(GOMP_4.0)(64bit) \
libomp.so(GOMP_4.5)(64bit) \
libomp.so(GOMP_5.0)(64bit) \
libomp.so(GOMP_5.0.1)(64bit) \
libomp.so(OMP_1.0)(64bit) \
libomp.so(OMP_2.0)(64bit) \
libomp.so(OMP_3.0)(64bit) \
libomp.so(OMP_3.1)(64bit) \
libomp.so(OMP_4.0)(64bit) \
libomp.so(OMP_4.5)(64bit) \
libomp.so(OMP_5.0)(64bit) \
libomp.so(VERSION)(64bit) \
libomp15-devel \
libomp15-devel(aarch-64) \
libompd.so()(64bit) \
libomptarget.so.15()(64bit) \
libomptarget.so.15(VERS1.0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLLVM.so.15()(64bit) \
libLLVM.so.15(LLVM_15)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
