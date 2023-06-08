SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-devel-14.0.6-8.1.aarch64.rpm"
RPM_HASH = "d1b585df75109d4ebbed849da65bc3695d04e5f5198c3ec0c5e1cc5902f770cc3a9649d5403b53c606b33455ef2a27f22b273aec09170d1a5bbc650dff41704f"

RPROVIDES:${PN} += "cmake(LLVM) cmake(LLVM-) libLTO.so llvm-devel-provider llvm14-devel llvm14-devel(aarch-64) rpm_macro(_libclang_sonum) rpm_macro(_libcxx_sonum) rpm_macro(_llvm_minorver) rpm_macro(_llvm_relver) rpm_macro(_llvm_sonum) rpm_macro(_llvm_version) rpm_macro(_llvm_with_ffi) rpm_macro(_llvm_with_libcxx) rpm_macro(_llvm_with_lldb) rpm_macro(_llvm_with_openmp) rpm_macro(_llvm_with_oprofile) rpm_macro(_llvm_with_valgrind)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM14 libLTO14 libc.so.6(GLIBC_2.36)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libomp14-devel libstdc++-devel libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libtool llvm14 llvm14-gold llvm14-polly-devel pkgconfig"

inherit rpm
