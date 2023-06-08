SUMMARY = "Development files for LLVM/SPIR-V Bi-Directional Translator library"
DESCRIPTION = "The LLVM/SPIR-V Bi-Directional Translator, a library and tool for translation \
between LLVM IR and SPIR-V. \
 \
This package provides headers and libraries required for building software using \
the LLVM/SPIR-V Bi-Directional Translator library."
LICENSE = "BSD-3-Clause"

PV = "16.0.0"

RPM_NAME = "libLLVMSPIRVLib-devel-16.0.0-1.1.aarch64.rpm"
RPM_HASH = "a4412c45a4801f29afc287b4e9d9389d071445599f288053fb5613a6772af2d32113bdb53b8cc21a2809fffdff77d7d66335102994b15d735a3301fd32071ce5"

RPROVIDES:${PN} += "libLLVMSPIRVLib-devel libLLVMSPIRVLib-devel(aarch-64) pkgconfig(LLVMSPIRVLib)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.16()(64bit) libLLVM.so.16(LLVM_16)(64bit) libLLVMSPIRVLib.so.16()(64bit) libLLVMSPIRVLib16 libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
