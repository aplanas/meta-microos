SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "llvm16-devel-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "abf905f28fbc9509973455d4d2c36ecd5af3f5f4f9f938b7c0fe8d367b248c98dfc892ac0e1f08a1b6bc51acc1a11cd7aeb30b441d5d6eca8cd7e7793438b6cd"

RPROVIDES:${PN} += "cmake(LLVM) cmake(LLVM-) libLTO.so llvm-devel-provider llvm16-devel llvm16-devel(aarch-64) rpm_macro(_libclang_sonum) rpm_macro(_libcxx_sonum) rpm_macro(_llvm_minorver) rpm_macro(_llvm_relver) rpm_macro(_llvm_sonum) rpm_macro(_llvm_version) rpm_macro(_llvm_with_ffi) rpm_macro(_llvm_with_libcxx) rpm_macro(_llvm_with_lldb) rpm_macro(_llvm_with_openmp) rpm_macro(_llvm_with_oprofile) rpm_macro(_llvm_with_valgrind)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM16 libLTO16 libc.so.6(GLIBC_2.36)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libomp16-devel libstdc++-devel libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtool llvm16 llvm16-gold llvm16-polly-devel pkgconfig"

inherit rpm
