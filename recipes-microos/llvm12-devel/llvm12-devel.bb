SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "llvm12-devel-12.0.1-11.1.aarch64.rpm"
RPM_HASH = "51bf98413e16a31532c3f5357429e6ea87de0612adb4d24a8df7b6e4619b81f2ed84e77d5840385bc9741268d488763f712db5174d46e604e81b19475ca97e4a"

RPROVIDES:${PN} += "cmake(LLVM) cmake(LLVM-) llvm-devel-provider llvm12-devel llvm12-devel(aarch-64) rpm_macro(_libcxx_sonum) rpm_macro(_llvm_minorver) rpm_macro(_llvm_relver) rpm_macro(_llvm_sonum) rpm_macro(_llvm_version) rpm_macro(_llvm_with_clang_scripts) rpm_macro(_llvm_with_ffi) rpm_macro(_llvm_with_libcxx) rpm_macro(_llvm_with_lldb) rpm_macro(_llvm_with_openmp) rpm_macro(_llvm_with_oprofile) rpm_macro(_llvm_with_valgrind)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.12()(64bit) libLLVM.so.12(LLVM_12)(64bit) libc.so.6(GLIBC_2.34)(64bit) libomp12-devel libstdc++-devel libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libtool llvm12 llvm12-LTO-devel llvm12-gold llvm12-polly-devel pkgconfig"

inherit rpm
