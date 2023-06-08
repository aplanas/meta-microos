SUMMARY = "C-based SPMD programming language compiler"
DESCRIPTION = "A compiler for a variant of the C programming language, with extensions for \
'single program, multiple data' (SPMD) programming."
LICENSE = "BSD-3-Clause"

PV = "1.18.1"

RPM_NAME = "ispc-1.18.1-2.1.aarch64.rpm"
RPM_HASH = "e19d68798bf4d230f451326cbf8986a869fed6ee95eec6907582b8d69d2dfc9fb327900985f26b5d30b687591470f1227e2b0a2a9c3ab812e0d4873502c52999"

RPROVIDES:${PN} += "ispc ispc(aarch-64)"
RDEPENDS:${PN} += "ispc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.14()(64bit) libLLVM.so.14(LLVM_14)(64bit) libc.so.6(GLIBC_2.34)(64bit) libclang-cpp.so.14()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
