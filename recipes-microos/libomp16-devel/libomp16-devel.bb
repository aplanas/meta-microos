SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "libomp16-devel-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "a1caf4b6d2146f9e0e97c1f0ee0713e7e126e71454fc0b8417985cb86a1ae468819e8a500c89a13a6983171ef680511b842c61eadca67b10d89e3f68ec46f67a"

RPROVIDES:${PN} += "libarcher.so()(64bit) libomp-devel libomp.so()(64bit) libomp.so(GOMP_1.0)(64bit) libomp.so(GOMP_2.0)(64bit) libomp.so(GOMP_3.0)(64bit) libomp.so(GOMP_4.0)(64bit) libomp.so(GOMP_4.5)(64bit) libomp.so(GOMP_5.0)(64bit) libomp.so(GOMP_5.0.1)(64bit) libomp.so(OMP_1.0)(64bit) libomp.so(OMP_2.0)(64bit) libomp.so(OMP_3.0)(64bit) libomp.so(OMP_3.1)(64bit) libomp.so(OMP_4.0)(64bit) libomp.so(OMP_4.5)(64bit) libomp.so(OMP_5.0)(64bit) libomp.so(VERSION)(64bit) libomp16-devel libomp16-devel(aarch-64) libompd.so()(64bit) libomptarget.rtl.aarch64.nextgen.so.16()(64bit) libomptarget.rtl.aarch64.nextgen.so.16(VERS1.0)(64bit) libomptarget.rtl.aarch64.so.16()(64bit) libomptarget.rtl.aarch64.so.16(VERS1.0)(64bit) libomptarget.rtl.amdgpu.nextgen.so.16()(64bit) libomptarget.rtl.amdgpu.nextgen.so.16(VERS1.0)(64bit) libomptarget.rtl.amdgpu.so.16()(64bit) libomptarget.rtl.amdgpu.so.16(VERS1.0)(64bit) libomptarget.rtl.cuda.nextgen.so.16()(64bit) libomptarget.rtl.cuda.nextgen.so.16(VERS1.0)(64bit) libomptarget.rtl.cuda.so.16()(64bit) libomptarget.rtl.cuda.so.16(VERS1.0)(64bit) libomptarget.so.16()(64bit) libomptarget.so.16(VERS1.0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.16()(64bit) libLLVM.so.16(LLVM_16)(64bit) libc.so.6(GLIBC_2.36)(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
